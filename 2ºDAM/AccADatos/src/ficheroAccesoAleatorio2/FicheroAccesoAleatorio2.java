package ficheroAccesoAleatorio2;
import javafx.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FicheroAccesoAleatorio2 {

    private File f;
    private List<Pair<String, Integer>> campos;
    private long longReg;
    private long numReg = 0;

    FicheroAccesoAleatorio2(String nomFich, List<Pair<String, Integer>> campos)
            throws IOException {
        this.campos = campos;
        this.f = new File(nomFich);
        longReg = 0;
        for (Pair<String, Integer> campo : campos) {
            this.longReg += campo.getValue();
        }
        if (f.exists()) {
            this.numReg = f.length() / this.longReg;
        }
    }

    public long getNumReg() {
        return numReg;
    }

    public void insertar(Map<String, String> reg) throws IOException {
        insertar(reg, this.numReg++);
    }

    public void insertar(Map<String, String> reg, long pos) throws IOException {
        try (RandomAccessFile faa = new RandomAccessFile(f, "rws")) {
            faa.seek(pos * this.longReg);
            for (Pair<String, Integer> campo : this.campos) {
                String nomCampo = campo.getKey();
                Integer longCampo = campo.getValue();
                String valorCampo = reg.get(nomCampo);
                if (valorCampo == null) {
                    valorCampo = "";
                }
                String valorCampoForm = String.format("%1$-" + longCampo + "s", valorCampo);
                faa.write(valorCampoForm.getBytes(StandardCharsets.UTF_8), 0, longCampo);
            }
        }
    }

    /**
     * Obtiene el valor de un campo de un registro dado.
     * @param pos posición del registro (empezando desde 0)
     * @param nomCampo nombre del campo a obtener
     * @return valor del campo como String
     * @throws IOException si ocurre un error de E/S
     */
    public String obtenValorCampo(long pos, String nomCampo) throws IOException {
        try (RandomAccessFile faa = new RandomAccessFile(f, "r")) {
            // Calcula el inicio del registro
            long inicioRegistro = pos * this.longReg;
            faa.seek(inicioRegistro);

            // Recorremos los campos uno a uno
            for (Pair<String, Integer> campo : this.campos) {
                String nombre = campo.getKey();
                int longitud = campo.getValue();

                byte[] bytesCampo = new byte[longitud];
                faa.read(bytesCampo); // leemos los bytes que ocupa el campo

                if (nombre.equalsIgnoreCase(nomCampo)) {
                    // Convertimos los bytes en texto UTF-8
                    String valor = new String(bytesCampo, StandardCharsets.UTF_8);
                    // Quitamos espacios al final y devolvemos
                    return valor.trim();
                }
            }
            // Si no se encuentra el campo
            throw new IllegalArgumentException("Campo no encontrado: " + nomCampo);
        }
    }

    static void main(String[] args) {
        List<Pair<String, Integer>> campos = new ArrayList<>();
        campos.add(new Pair<>("DNI", 9));
        campos.add(new Pair<>("NOMBRE", 32));
        campos.add(new Pair<>("CP", 5));

        try {
            FicheroAccesoAleatorio2 faa = new FicheroAccesoAleatorio2("fic_acceso_aleat.dat", campos);

            Map<String, String> reg = new HashMap<>();
            reg.put("DNI", "56789012B");
            reg.put("NOMBRE", "SAMPER");
            reg.put("CP", "29730");
            faa.insertar(reg);

            reg.clear();
            reg.put("DNI", "89012345E");
            reg.put("NOMBRE", "ROJAS");
            faa.insertar(reg);

            reg.clear();
            reg.put("DNI", "23456789D");
            reg.put("NOMBRE", "DORCE");
            reg.put("CP", "13700");
            faa.insertar(reg);

            // Probamos a obtener el nombre del registro 2
            String nombre = faa.obtenValorCampo(2, "NOMBRE");
            System.out.println("El nombre del registro 2 es: " + nombre);

            //y el dni del reg 0
            String DNI = faa.obtenValorCampo(0, "DNI");
            System.out.println("El DNI del registro 0 es: " + DNI);

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}