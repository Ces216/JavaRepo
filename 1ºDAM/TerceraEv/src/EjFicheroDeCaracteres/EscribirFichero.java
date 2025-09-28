package EjFicheroDeCaracteres;
import java.io.*;


public class EscribirFichero {
	public static void main(String[] args)throws IOException {
	//	try {
            FileWriter fw = new FileWriter("miFichero.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Primera línea");
            bw.newLine();
            bw.write("Segunda línea");
            bw.newLine();
            bw.write("Tercera línea");

            bw.close();
            System.out.println("Archivo escrito correctamente.");
   //     } catch (IOException e) {
  //          System.out.println("Error escribiendo el archivo: " + e.getMessage());
 //     }
	}
}
