package EjInmobiliaria;

abstract class Superficie extends Inmueble {
	 
	public Superficie(String ubicacion, double metrosCuadrados, double precioPorM2) {
		 super(ubicacion, metrosCuadrados, metrosCuadrados * precioPorM2);
	 }
	 
    public double precio() {
        return this.precio;
    }
    
}

