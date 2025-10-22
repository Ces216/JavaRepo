package EjCircuitos;

public class CircuitoEnSerie extends Circuito {
	public CircuitoEnSerie(int voltaje, Integer... resistencia) {
		super(voltaje, resistencia);
	}

	public float calcularIntensidad() {
		float Intensidad = super.getVoltaje()/super.sumaDeResistencias();
		return Intensidad; 
	}
}
