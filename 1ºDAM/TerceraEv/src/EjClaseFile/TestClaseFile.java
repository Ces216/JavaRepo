package EjClaseFile;
import java.io.File;
import java.io.IOException;

public class TestClaseFile {
	public static void main(String[] args) {
        try {
            File archivo = new File("ejemplo.txt");

            // Crear un archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Mostrar información del archivo
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("¿Es archivo? " + archivo.isFile());
            System.out.println("¿Es directorio? " + archivo.isDirectory());
            System.out.println("¿Se puede leer? " + archivo.canRead());
            System.out.println("¿Se puede escribir? " + archivo.canWrite());
            System.out.println("Tamaño en bytes: " + archivo.length());

            // Renombrar el archivo
            File nuevoArchivo = new File("renombrado.txt");
            if (archivo.renameTo(nuevoArchivo)) {
                System.out.println("Archivo renombrado a: " + nuevoArchivo.getName());
            } else {
                System.out.println("No se pudo renombrar el archivo.");
            }

            // Eliminar el archivo
            if (nuevoArchivo.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}

