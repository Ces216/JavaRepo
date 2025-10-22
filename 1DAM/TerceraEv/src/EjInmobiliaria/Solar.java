package EjInmobiliaria;

class Solar extends Superficie{
	private boolean esRustico;

    public Solar(String ubicacion, double metrosCuadrados, double precioPorM2, boolean esRustico) {
        super(ubicacion, metrosCuadrados, precioPorM2);
        this.esRustico = esRustico;
    }

    @Override
    public boolean seAlquila() { return false; }
    @Override
    public boolean seVende() { return true; }

    public boolean isRustico() { return esRustico; }

    @Override
    public String toString() {
        return "Solar [ID: " + id + ", Rústico: " + esRustico + ", " + ubicacion + ", " + metrosCuadrados + " m2, Precio: " + precio + "]";
    }
}

