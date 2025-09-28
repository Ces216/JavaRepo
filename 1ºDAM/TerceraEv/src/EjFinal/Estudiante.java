package EjFinal;

public class Estudiante extends Persona{
    private String carrera;

	public Estudiante(String nombre, String dni, String carrera) {
    	super(nombre, dni);
    	this.carrera = carrera;
	}
	
	    @Override
    public String toString() {
	    return super.toString() + " - Carrera: " + carrera;
    }
}
