package codificadorDeFicheros;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CodificadorDeFicheros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el charset al que pasar el siguiente fichero en UTF-8, 1:UTF-16, 2:ISO-8859-1");
        int r = sc.nextInt();

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream("C:\\Users\\cesar\\ReposGitHub\\JavaRepo\\2ºDAM\\AccADatos\\src\\codificadorDeFicheros\\ficheroUTF-8"), StandardCharsets.UTF_8))) {

            // seleccionamos el charset de salida
            String pathSalida;
            String nombreSalida;
            java.nio.charset.Charset charsetSalida;

            if (r == 1) {
                pathSalida = "C:\\Users\\cesar\\ReposGitHub\\JavaRepo\\2ºDAM\\AccADatos\\src\\codificadorDeFicheros\\ficheroUTF-16";
                nombreSalida = "ficheroUTF-16";
                charsetSalida = StandardCharsets.UTF_16;
            } else if (r == 2) {
                pathSalida = "C:\\Users\\cesar\\ReposGitHub\\JavaRepo\\2ºDAM\\AccADatos\\src\\codificadorDeFicheros\\ficheroISO-8859-1";
                nombreSalida = "ficheroISO-8859-1";
                charsetSalida = StandardCharsets.ISO_8859_1;
            } else {
                System.out.println("Opción no válida");
                return;
            }

            // abrimos el escritor
            try (BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(pathSalida), charsetSalida))) {

                String linea;
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine(); // para conservar los saltos de línea
                }

                System.out.println("Conversión completada. Archivo creado: " + nombreSalida);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
