package EjMyString;

public class TestMyString {

	public static void main(String[] args) {
		MyString s1 = new MyString("Hola");

		try {            
			System.out.println(s1.myCharAt(1)); // Salida: 'o'
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}