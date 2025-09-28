package ordenar_alumnos;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase principal que contiene el método main para probar la funcionalidad de la clase Alumno.
 */
public class OrdenarAlumnosMain {

    /**
     * Método principal que crea un arreglo de alumnos, los inicializa con edades aleatorias y nombres aleatorios,
     * imprime las edades antes y después de ordenar los alumnos por edad, y luego los imprime nuevamente.
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Random random = new Random();

        String cadena = "";

        Alumno alumnos[] = new Alumno[5];
        
        // Crear y asignar valores aleatorios a los alumnos
        for (int i = 0; i < 5; i++) {
            cadena = "";
            // Generar un nombre aleatorio con longitud entre 4 y 10 caracteres
            for (int j = 0; j < random.nextInt(7) + 4; j++) {
                cadena += (char) (random.nextInt(26) + 97);
            }
            // Crear un nuevo alumno con una edad aleatoria entre 18 y 27 años y asignarle el nombre aleatorio generado
            alumnos[i] = new Alumno(random.nextInt(10) + 18, cadena);
        }
        
        // Imprimir las edades de los alumnos antes de ordenarlos
        System.out.println("Edades de los alumnos antes de ordenar:");
        for (Alumno alum : alumnos)
            System.out.println(alum.getEdad());
        
        // Ordenar los alumnos por edad utilizando el método sort de la clase Arrays
        Arrays.sort(alumnos);
        
        // Imprimir las edades de los alumnos después de ordenarlos
        System.out.println("\nEdades de los alumnos después de ordenar:");
        for (Alumno alum : alumnos)
            System.out.println(alum.getEdad());
    }
}
