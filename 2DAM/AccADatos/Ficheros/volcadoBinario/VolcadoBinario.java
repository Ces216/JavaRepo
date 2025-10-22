package volcadoBinario;
// Volcado hexadecimal de un fichero con FileInputStream
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Clase que permite realizar un volcado binario (en formato hexadecimal) de un fichero.
 */
public class VolcadoBinario {
    static int TAM_FILA = 32;      // bytes por fila
    static int MAX_BYTES = 2048;   // máximo a mostrar
    InputStream is = null;         // flujo de entrada
    PrintStream salida = null;     // flujo de salida (antes era siempre System.out)

    /**
     * Constructor de la clase.
     * @param is El InputStream desde el que se leerán los datos.
     * @param salida El PrintStream donde se escribirá el volcado (puede ser System.out o un fichero).
     */
    public VolcadoBinario(InputStream is, PrintStream salida) {
        this.is = is;
        this.salida = salida;
    }

    /**
     * Realiza el volcado de los bytes del fichero.
     */
    public void volcar() throws IOException {
        byte buffer[] = new byte[TAM_FILA];
        int bytesLeidos;
        int offset = 0;

        do {
            bytesLeidos = is.read(buffer);
            if (bytesLeidos == -1) break;

            salida.format("[%5d] ", offset);
            for (int i = 0; i < bytesLeidos; i++) {
                salida.format("%02x ", buffer[i]); // dos dígitos por byte
            }
            salida.println();
            offset += bytesLeidos;

        } while (bytesLeidos == TAM_FILA && offset < MAX_BYTES);
    }

    /**
     * Método principal (main) para la ejecución del programa.
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Uso: java accesosecuencial.VolcadoBinario <ficheroOrigen>");
            return;
        }

        String nomFich = args[0];
        String nomSalida = "volcado.txt"; // nombre del archivo de salida

        try (FileInputStream fis = new FileInputStream(nomFich);
             PrintStream ps = new PrintStream(nomSalida)) {

            VolcadoBinario vb = new VolcadoBinario(fis, ps);
            vb.volcar();
            System.out.println("Volcado completado. Resultado guardado en " + nomSalida);

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: no existe fichero " + nomFich);
        } catch (IOException e) {
            System.err.println("ERROR de E/S: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
