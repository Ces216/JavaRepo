package EjInmobiliaria;

public class Garaje extends Superficie{
	 private boolean esPublico;

	    public Garaje(String ubicacion, double metrosCuadrados, double precioPorM2, boolean esPublico) {
	        super(ubicacion, metrosCuadrados, precioPorM2);
	        this.esPublico = esPublico;
	    }

	    public boolean seAlquila() { 
	    	return true;
	    }
	  
	    public boolean seVende() {
	    	return false; 
	    }

	    public boolean isPublico() {
	    	return esPublico; 
	    }

	    public String toString() {
	        return "Garaje [ID: " + id + ", Público: " + esPublico + ", " + ubicacion + ", " + metrosCuadrados + " m2, Precio: " + precio + "]";
	    }
	}
