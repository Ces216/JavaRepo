package comparador;

import java.util.Comparator;

public class CompararInteligente implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return Boolean.compare(o1.isInteligente(), o2.isInteligente());
	}

}
