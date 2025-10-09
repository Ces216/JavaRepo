package ficherosAccesoAleatorio;

import javafx.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase que permite almacenar registros de longitud fija
 * en un fichero de acceso aleatorio.
 */
public class FicherosAccesoAleatorio {

    private File f;
    private List<Pair<String, Integer>> campos;
    private long longReg;
    private long numReg = 0;

    public FicherosAccesoAleatorio(String nomFich, List<Pair<String, Integer>> campos)
            throws IOException {
        this.campos = campos;
        this.f = new File(nomFich);
        this.longReg = 0;

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
        try (RandomAccessFile raf = new RandomAccessFile(f, "rws")) {
            raf.seek(pos * this.longReg);

            for (Pair<String, Integer> campo : this.campos) {
                String nomCampo = campo.getKey();
                Integer longCampo = campo.getValue();
                String valorCampo = reg.getOrDefault(nomCampo, "");
                String valorCampoForm = String.format("%1$-" + longCampo + "s", valorCampo);
                raf.write(valorCampoForm.getBytes("UTF-8"), 0, longCampo);
            }
        }
    }
    static void main(String[] args) {

        // Define la estructura de los campos
        List<Pair<String, Integer>> campos = new ArrayList<>();
        campos.add(new Pair<>("DNI", 9));
        campos.add(new Pair<>("NOMBRE", 32));
        campos.add(new Pair<>("CP", 5));

        try {
            // Instancia la clase para trabajar con el archivo
            FicherosAccesoAleatorio faa = new FicherosAccesoAleatorio("fic_acceso_aleat.dat", campos);

            // Crea un mapa para almacenar los registros
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

            // Insertar fuera de rango (posición 10)
            reg.clear();
            reg.put("DNI", "99999999Z");
            reg.put("NOMBRE", "FUERA_DE_RANGO");
            reg.put("CP", "99999");

            System.out.println("Número de registros actuales: " + faa.getNumReg());
            System.out.println("Intentando insertar en la posición 10...");
            faa.insertar(reg, 10);

            System.out.println("✅ Inserción completada correctamente.");
            System.out.println("Revisa el tamaño del archivo generado: fic_acceso_aleat.dat");

        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

