package EjGestorVuelos;
import java.time.LocalTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


class Vuelo {
    String idVuelo;
    String ciudadOrigen;
    String ciudadDestino;
    LocalTime horaSalida;
    int tiempoVuelo;

    public Vuelo(String idVuelo, String ciudadOrigen, String ciudadDestino, LocalTime horaSalida, int tiempoVuelo) {
        this.idVuelo = idVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.horaSalida = horaSalida;
        this.tiempoVuelo = tiempoVuelo;
    }

    @Override
    public String toString() {
        return "Vuelo {" +
                "Número: '" + idVuelo + '\'' +
                ", Origen: '" + ciudadOrigen + '\'' +
                ", Destino: '" + ciudadDestino + '\'' +
                ", Salida: " + horaSalida +
                ", Duración: " + tiempoVuelo + " min}";
    }
}

class CompararPorNumero implements Comparator<Vuelo> {
    public int compare(Vuelo v1, Vuelo v2) {
        return v1.idVuelo.compareTo(v2.idVuelo);
    }
}

class CompararPorOrigen implements Comparator<Vuelo> {
    public int compare(Vuelo v1, Vuelo v2) {
        return v1.ciudadOrigen.compareTo(v2.ciudadOrigen);
    }
}

class CompararPorDestino implements Comparator<Vuelo> {
    public int compare(Vuelo v1, Vuelo v2) {
        return v1.ciudadDestino.compareTo(v2.ciudadDestino);
    }
}

class CompararPorHoraSalida implements Comparator<Vuelo> {
    public int compare(Vuelo v1, Vuelo v2) {
        return v1.horaSalida.compareTo(v2.horaSalida);
    }
}

class CompararPorDuracion implements Comparator<Vuelo> {
    public int compare(Vuelo v1, Vuelo v2) {
        return Integer.compare(v1.tiempoVuelo, v2.tiempoVuelo);
    }
}

public class GestorVuelos {

    public static void main(String[] args) {
        LinkedList<Vuelo> listaVuelos = new LinkedList<>();

        // Datos de ejemplo
        listaVuelos.add(new Vuelo("UX101", "Madrid", "París", LocalTime.of(6, 30), 120));
        listaVuelos.add(new Vuelo("IB202", "Barcelona", "Roma", LocalTime.of(9, 15), 135));
        listaVuelos.add(new Vuelo("AF333", "París", "Nueva York", LocalTime.of(13, 45), 480));
        listaVuelos.add(new Vuelo("DL404", "Atlanta", "Londres", LocalTime.of(17, 0), 420));
        listaVuelos.add(new Vuelo("LH505", "Fráncfort", "Tokio", LocalTime.of(10, 0), 720));

        Scanner entrada = new Scanner(System.in);
        int seleccion;

        do {
            System.out.println("\n================== MENU ==================");
            System.out.println("Seleccione el criterio de ordenación:");
            System.out.println("1. Número de vuelo");
            System.out.println("2. Ciudad de origen");
            System.out.println("3. Ciudad de destino");
            System.out.println("4. Hora de salida");
            System.out.println("5. Duración del vuelo");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1:
                    Collections.sort(listaVuelos, new CompararPorNumero());
                    break;
                case 2:
                    Collections.sort(listaVuelos, new CompararPorOrigen());
                    break;
                case 3:
                    Collections.sort(listaVuelos, new CompararPorDestino());
                    break;
                case 4:
                    Collections.sort(listaVuelos, new CompararPorHoraSalida());
                    break;
                case 5:
                    Collections.sort(listaVuelos, new CompararPorDuracion());
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida.");
                    continue;
            }

            System.out.println("\nVuelos ordenados:");
            for (Vuelo v : listaVuelos) {
                System.out.println(v);
            }

        } while (seleccion != 6);

        entrada.close();
    }
}
