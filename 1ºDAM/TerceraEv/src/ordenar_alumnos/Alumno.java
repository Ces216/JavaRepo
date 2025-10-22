package ordenar_alumnos;

/**
 * Clase que representa a un alumno.
 * Esta clase implementa la interfaz Comparable para permitir la comparación entre alumnos por edad.
 */
public class Alumno implements Comparable<Alumno> {

    private int edad;
    private String nombre;

    /**
     * Constructor para crear un nuevo alumno.
     * @param edad La edad del alumno.
     * @param nombre El nombre del alumno.
     */
    public Alumno(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad del alumno.
     * @return La edad del alumno.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del alumno.
     * @param edad La nueva edad del alumno.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del alumno.
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del alumno.
     * @param nombre El nuevo nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve una representación en cadena del alumno.
     * @return Una cadena que representa al alumno.
     */
    @Override
    public String toString() {
        return "Alumno [edad=" + edad + ", " + (nombre != null ? "nombre=" + nombre : "") + "]";
    }

    /**
     * Método para comparar este alumno con otro alumno basado en la edad.
     * @param otroAlumno El otro alumno con el que se compara.
     * @return Un valor negativo si este alumno es menor que el otro,
     *         un valor positivo si este alumno es mayor que el otro,
     *         y 0 si ambos alumnos tienen la misma edad.
     */
    @Override
    public int compareTo(Alumno otroAlumno) {
    	return Integer.compare(this.edad, otroAlumno.edad);
    }
}
