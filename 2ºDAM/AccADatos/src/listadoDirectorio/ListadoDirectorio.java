package listadoDirectorio;
import java.io.File;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class ListadoDirectorio {
    static void main(String[] args) {
        String ruta = "."; /*inicializa la variable ruta, que representa el dir actual*/
        if (args.length >= 1) ruta = args[0];
        // creación del objeto file. crea una instancia de la clase File
        File fich = new File(ruta);

        if (!fich.exists()) { //verificación de la existencia del fichero o dir
            System.out.println("No existe el fichero o directorio:" + ruta);
        } else {
            if (fich.isFile()) { //comprobamos si es un fichero o dir
                System.out.println(ruta + " es un fichero");
                mostrarInfo(fich);
            } else {
                System.out.println(ruta + " es un directorio. Contenidos: ");
                //Creamos un array con los objetos file
                File[] ficheros = fich.listFiles(); // Ojo, ficheros o directorios
                // Recorremos el array y añadimos un prefijo para mostrar
                // si el objeto es un fichero o un directorio
                if(ficheros != null) {
                    for (File f : ficheros) {
                        String textoDescr = f.isDirectory() ? "/" : f.isFile() ? "_" : "?";
                        System.out.println("(" + textoDescr + ")" + f.getName() + ":");
                        mostrarInfo(f);

                    }
                }
            }
        }
    }
    private static void mostrarInfo(File f) {
        if(f.isFile()) {
            System.out.println(" Tamaño" + f.length() + "bytes");   //tamaño

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
            System.out.println(" Última modificación: " + fmt.format(Instant.ofEpochMilli(f.lastModified())));
        }
    }
}