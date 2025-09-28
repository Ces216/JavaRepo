package listadoDircetorio;
import java.io.File;

public class ListadoDirectorio {
    public static void main(String[] args){
        // inicializa la variable ruta con un punto,
        // que representa el dir actual
        String ruta= ".";
        if(args.length >= 1 ) ruta = args(0);
        // creación del objeto file. crea una instancia de la clase FIle
        File fich = new File(ruta);

        if(!fich.exists()) { //verificación de la existencia del fichero o dir
            System.out.println("No existe el fichero o directorio:" + ruta);
        } else {
            if (fich.isFile()) { //comprobamos si es un fichero o dir
                System.out.println(ruta+ " es un fichero");
            } else {
            System.out.println(ruta + "es un directorio. Contenidos: ");
            //Creamos un array con los objetos file
            File[] ficheros = fich.listFiles(); // Ojo, ficheros o directorios
            // Recorremos el array y añadimos un prefijo para mostrar
            // si el objeto es un fichero o un directorio
            for (File f: ficheros) {
                String textoDescr = f.isDirectory() ? "/" : f.isFile() ?  "_" : "?";
                System.out.println("("+ textoDescr +")" + f.getName()) +
                if(f.isFile()) { f.length(); } + if(f.canRead()) {"tiene permisos de lectura"} +
                if(f.canWrite()) {"tiene permisos de escritura"}

                //ACABAR
            }
        }
    }
}
