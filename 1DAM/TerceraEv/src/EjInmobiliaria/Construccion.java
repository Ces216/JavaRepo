package EjInmobiliaria;

abstract class Construccion extends Inmueble{
	protected boolean esNueva;

    public Construccion(String ubicacion, double metrosCuadrados, boolean esNueva, double precio) {
        super(ubicacion, metrosCuadrados, precio);
        this.esNueva = esNueva;
    }
}
