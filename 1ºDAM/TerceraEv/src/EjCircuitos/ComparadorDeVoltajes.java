package EjCircuitos;
import java.util.Comparator;

public class ComparadorDeVoltajes implements Comparator<Circuito>{
	public int compare(Circuito c1, Circuito c2) {
		return Integer.compare(c1.getVoltaje(), c2.getVoltaje());
	}
}
