package inventarioJackson;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Main {
    static void main(String[] args) {
        try {
            //Crear productos
            Producto p1 = new Producto("P001", "Teclado mecánico", 59.99, 10);
            Producto p2 = new Producto("P002", "Ratón inalámbrico", 29.50, 20);
            Producto p3 = new Producto("P003", "Monitor 24\"", 149.90, 5);

            //Crear lista de productos y el inventario
            List<Producto> listaProductos = new ArrayList<>();
            listaProductos.add(p1);
            listaProductos.add(p2);
            listaProductos.add(p3);

            Inventario inventario = new Inventario("TechZone", listaProductos);

            //Crear ObjectMapper de Jackson
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT); // pretty print

            //Serializar a JSON y guardar en archivo
            File archivo = new File("C:\\Users\\cesar\\ReposGitHub\\JavaRepo\\2ºDAM\\AccADatos\\XML_JSON\\src\\main\\java\\inventarioJackson\\"+"inventario.json");
            mapper.writeValue(archivo, inventario);
            System.out.println("Inventario guardado en " + archivo.getAbsolutePath());

            //Deserializar desde el archivo
            Inventario inventarioLeido = mapper.readValue(archivo, Inventario.class);

            //Mostrar verificación
            System.out.println("\nInventario deserializado:");
            System.out.println("Tienda: " + inventarioLeido.getNombreTienda());
            for (Producto p : inventarioLeido.getProductos()) {
                System.out.println(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
