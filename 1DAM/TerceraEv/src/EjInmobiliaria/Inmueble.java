package EjInmobiliaria;


abstract class Inmueble {
	private static int contador = 1;
    protected int id;
    protected String ubicacion;
    protected double metrosCuadrados;
    protected double precio;
    
    public Inmueble(String ubicacion, double metrosCuadrados, double precio) {
        this.id = contador++;
        this.ubicacion = ubicacion;
        this.metrosCuadrados = metrosCuadrados;
        this.precio = precio;
    }

    public int getId() { return id; }
    
    public String getUbicacion() { 
    	return ubicacion; 
    }
    
    public double getMetrosCuadrados() { 
    	return metrosCuadrados;
   	}
    
    public double getPrecio() {
    	return precio;
    }

    public abstract String toString();
    
    public abstract boolean seAlquila();
    
    public abstract boolean seVende();
    
}
