package EjSerializr;
import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre;
	private String pais;
	
	
	public Persona(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}

	

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", pais=" + pais + "]";
	}

	
}
