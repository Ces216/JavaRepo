package EjCircuitos;
import java.util.ArrayList;
import java.util.Arrays;

public class Placa {
	private ArrayList<Circuito> conjDeCircuitos;

	public Placa(Circuito... circuitos) {
		this.conjDeCircuitos = new ArrayList<>(Arrays.asList(circuitos));
	}
	
	public String añadirCircuitos(Circuito c) {
		conjDeCircuitos.add(c);
		return "Se ha añadido el circuito correctamente";
	}

	public float intensidadTotal() {
		float total = 0;
        for (Circuito c : conjDeCircuitos) {
            if (c instanceof CircuitoEnSerie) {
                total += ((CircuitoEnSerie) c).calcularIntensidad();
            } else if (c instanceof CircuitoEnParalelo) {
                total += ((CircuitoEnParalelo) c).calcularIntensidad();
            }
        }
        return total;
    }

	public ArrayList<Circuito> getConjDeCircuitos() {
		return conjDeCircuitos;
	}

	public void setConjDeCircuitos(ArrayList<Circuito> conjDeCircuitos) {
		this.conjDeCircuitos = conjDeCircuitos;
	}
	
	
	
}