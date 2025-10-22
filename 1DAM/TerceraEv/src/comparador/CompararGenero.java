package comparador;

import java.util.Comparator;

public class CompararGenero implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return Character.compare(o1.getGenero(), o2.getGenero());
	}

}
