package buscadorDeTexto;
import java.io.*;

public class BuscadorDeTexto {
    static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String linea;
            String BusqFrase = " a "; // frase a buscar
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;  //contador de lineas porque el indexOf solo cuenta las columnas

                int index = linea.indexOf(BusqFrase);

                if (index != -1) { // si aparece la frase
                    System.out.println("Encontrado en línea " + numeroLinea + ", columna " + (index + 1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
