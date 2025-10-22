package EjInmobiliaria;

public class LocalComercial extends Construccion{
	 private double precioPorM2;

	    public LocalComercial(String ubicacion, double metrosCuadrados, boolean esNueva, double precioPorM2) {
	        super(ubicacion, metrosCuadrados, esNueva, metrosCuadrados * precioPorM2);
	        this.precioPorM2 = precioPorM2;
	    }

	    
	    public boolean seAlquila() { 
	    	return true; 
	   	}
	    
	    public boolean seVende() {
	    	return false; 
	   	}

	    public boolean isSegundaMano() {
	    	return !esNueva; 
	    }

	    
	    public String toString() {
	        return "Local [ID: " + id + ", " + ubicacion + ", " + metrosCuadrados + " m2, Segunda Mano: " + !esNueva + ", Precio: " + precio + "]";
	    }
	}
