package EjFicheroDeCaracteres;
import java.io.*;

public class LeerFichero {
	 public static void main(String[] args) {
	        try {
	            FileReader fr = new FileReader("miFichero.txt");
	            BufferedReader br = new BufferedReader(fr);
	            String linea;

	            System.out.println("Contenido del fichero:");
	            while ((linea = br.readLine()) != null) {
	                System.out.println(linea);
	            }

	            br.close();
	        } catch (IOException e) {
	            System.out.println("Error leyendo el archivo: " + e.getMessage());
	        }
	    }
	}