package insertarClientesDOM;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class InsertarClientesDOM {
    private static void eliminarNodosTextoVacios(Node nodo) {
        NodeList hijos = nodo.getChildNodes();
        for (int i = 0; i < hijos.getLength(); i++) {
            Node hijo = hijos.item(i);
            if (hijo.getNodeType() == Node.TEXT_NODE && hijo.getNodeValue().trim().isEmpty()) {
                nodo.removeChild(hijo);
                i--; // Ajustar índice tras eliminar
            } else {
                eliminarNodosTextoVacios(hijo);
            }
        }
    }

    static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Error: Debes indicar el nombre del fichero XML como argumento.");
            return;
        }

        String nomFich = args[0];

        try {
            //Crear el parser DOM
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setIgnoringComments(true);
            dbf.setIgnoringElementContentWhitespace(true);

            DocumentBuilder db = dbf.newDocumentBuilder();

            //Parsear el XML
            Document doc = db.parse(new File(nomFich));

            // Limpia nodos de texto vacíos (saltos de línea, espacios)
            doc.normalizeDocument();
            eliminarNodosTextoVacios(doc.getDocumentElement());


            //Obtener el elemento raíz
            Element raiz = doc.getDocumentElement();
            if (!raiz.getNodeName().equals("clientes")) {
                System.err.println("Error: El elemento raíz debe llamarse <clientes>.");
                return;
            }

            //Crear un nuevo elemento <cliente> con sus hijos
            Element nuevoCliente = doc.createElement("cliente");

            Element dni = doc.createElement("dni");
            dni.setTextContent("11223344C");
            nuevoCliente.appendChild(dni);

            Element apellidos = doc.createElement("apellidos");
            apellidos.setTextContent("Crespo Dominguez");
            nuevoCliente.appendChild(apellidos);

            Element cp = doc.createElement("cp");
            cp.setTextContent("28009");
            nuevoCliente.appendChild(cp);

            //Insertar el nuevo cliente al principio
            Node primerCliente = raiz.getFirstChild();
            raiz.insertBefore(nuevoCliente, primerCliente);

            //Mostrar el resultado en formato XML
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            transformer.transform(new DOMSource(doc), new StreamResult(System.out));

        } catch (Exception e) {
            System.err.println("Error procesando el XML: " + e.getMessage());
        }
    }
}
