package volcadoBinario;
import java.io.*;

public class VolcadoBinario {

    // Método que realiza el volcado de un archivo binario hacia un PrintStream
    public static void volcar(String nombreArchivo, PrintStream destino) throws IOException {
        try (FileInputStream fis = new FileInputStream(nombreArchivo)) {
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                destino.printf("%02X ", byteLeido); // muestra el byte en formato hexadecimal
            }
            destino.println(); // salto de línea al final
        }
    }

    static void main(String[] args) {
        String archivoOrigen = "entrada.bin";  // archivo de entrada (puedes cambiarlo)
        String archivoDestino = "salida.txt";  // archivo donde se guardará el volcado

        try (PrintStream ps = new PrintStream(new FileOutputStream(archivoDestino))) {
            volcar(archivoOrigen, ps);  // volcamos al fichero
            System.out.println("Volcado completado en: " + archivoDestino);
        } catch (IOException e) {
            System.err.println("Error durante el volcado: " + e.getMessage());
        }
    }
}
