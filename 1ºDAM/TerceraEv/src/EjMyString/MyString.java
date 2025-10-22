package EjMyString;
import java.util.ArrayList;


public class MyString {
	private char[] cadena;

	public MyString(String cadena) {
		this.cadena = cadena.toCharArray();
	}
	
	public MyString(char[] cadena) {
		this.cadena = new char[cadena.length];
		System.arraycopy(cadena, 0, this.cadena, 0, cadena.length);
	}

    public MyString(ArrayList<Character> cadena) {
    	this.cadena = new char[cadena.size()];
    	for (int i = 0; i < cadena.size(); i++) {
    			this.cadena[i] = cadena.get(i);
		}
    }

    public char[] getCadena() {
        return this.cadena;
    }

    public char myCharAt(int i) throws Exception {
    	if (i < 0 || i >= cadena.length) {
    		throw new Exception("Índice fuera de rango.");
	    }
    	return cadena[i];
    }

	public int myLength() {
		return cadena.length;
	}

	public void myConcat(MyString cadena2) {
		char[] nuevaCadena = new char[this.cadena.length + cadena2.myLength()];
		System.arraycopy(this.cadena, 0, nuevaCadena, 0, this.cadena.length);
		System.arraycopy(cadena2.getCadena(), 0, nuevaCadena, this.cadena.length, cadena2.myLength());
		this.cadena = nuevaCadena;
	}

	public String myToString() {
		return new String(cadena);
	}

	public void imprimir() {
		System.out.println(myToString());
	}
}
