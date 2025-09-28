package EjInmobiliaria;

public class Vivienda extends Construccion{
	private int habitaciones;
    private int piso;
    private double precioAlquiler;

    public Vivienda(String ubicacion, double metrosCuadrados, boolean esNueva, int habitaciones, int piso, double precioVenta, double precioAlquiler) {
        super(ubicacion, metrosCuadrados, esNueva, precioVenta);
        this.habitaciones = habitaciones;
        this.piso = piso;
        this.precioAlquiler = precioAlquiler;
    }

    public boolean seAlquila() {
    	return true; 
    }
    
    public boolean seVende() { 
    	return true; 
    }

    public int getHabitaciones() { 
    	return habitaciones; 
    }
    
    public double getPrecioAlquiler() { 
    	return precioAlquiler; 
    }

    
    public String toString() {
        return "Vivienda [ID: " + id + ", " + ubicacion + ", " + metrosCuadrados + " m2, Habitaciones: " + habitaciones + ", Piso: " + piso + ", Precio venta: " + precio + ", Alquiler: " + precioAlquiler + "]";
    }
}

