package EjPalindroma;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindroma {
	private ArrayList<Character> frase;
	
	
	//Dos formas de meter la frase:
	//1º
	public Palindroma(Character... espacio) {
		this.frase = new ArrayList<>(Arrays.asList(espacio));
	}
	
	//2º
	public Palindroma(String cadena) {
		this.frase = new ArrayList<>();
		for (char c : cadena.toCharArray())
			this.frase.add(c);
	}


	public boolean esPalindroma() {
		int inicio = 0;
		int fin = frase.size() - 1;
		
		while(inicio < fin) {
			if(!frase.get(inicio).equals(frase.get(fin))) {
				return false;
			}
			inicio++;
			fin--;
		}
		return true;
	}
	
	
}
