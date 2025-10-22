package EjCircuitos;

public class CircuitoEnParalelo extends Circuito {
	
	public CircuitoEnParalelo(int voltaje, Integer... resistencia) {
		super(voltaje, resistencia);
	}

	public float calcularIntensidad() {
		float Intensidad = 0;
			for(int resistencia : super.getConjuntoDeResistencias()) {
				if(resistencia > 0) {
					Intensidad += super.getVoltaje()/resistencia;	
				}
			}	
		return Intensidad;		
	}

}
