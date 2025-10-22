package comparador;

/**
 * Clase que representa a una Persona con varios atributos como edad, altura, nombre, inteligencia, género, y un identificador único.
 */
public class Persona implements Comparable<Persona> {

    private static int cont = 1; // Contador utilizado para asignar identificadores únicos a las personas
    private int edad; // Edad de la persona
    private int id; // Identificador único de la persona
    private double altura; // Altura de la persona
    private String nombre; // Nombre de la persona
    private boolean inteligente; // Indicador de si la persona es inteligente o no
    private char genero; // Género de la persona

    /**
     * Constructor de la clase Persona.
     * @param edad La edad de la persona.
     * @param altura La altura de la persona.
     * @param nombre El nombre de la persona.
     * @param esEstudiante Un booleano que indica si la persona es inteligente.
     * @param genero El género de la persona.
     */
    public Persona(int edad, double altura, String nombre, boolean esEstudiante, char genero) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.inteligente = esEstudiante;
        this.genero = genero;
        this.id = cont++; // Asignación de un identificador único
    }

    /**
     * Método de comparación implementado de la interfaz Comparable para ordenar objetos Persona por su identificador único.
     * @param o La otra persona con la que se compara.
     * @return Un valor negativo, cero o un valor positivo si esta persona es menor, igual o mayor que la otra persona en términos de su identificador único, respectivamente.
     */
    @Override
    public int compareTo(Persona o) {
        return Integer.compare(this.id, o.id);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isInteligente() {
        return inteligente;
    }
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInteligente(boolean inteligente) {
		this.inteligente = inteligente;
	}

	@Override
	public String toString() {
		return "Persona " + id + " [edad=" + edad + ", altura=" + altura + ", "
				+ (nombre != null ? "nombre=" + nombre + ", " : "") + "inteligente=" + inteligente + ", genero="
				+ genero + "]";
	}
    
}