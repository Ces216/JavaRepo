package comparador;

import java.util.Comparator;

public class CompararAltura implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return Double.compare(o1.getAltura(), o2.getAltura());
	}

}
