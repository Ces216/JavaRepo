package EjPalindroma;

public class TestPalindroma {

	public static void main(String[] args) {
		//1º
		Palindroma p1 = new Palindroma('r','a','d','a','r');
		
		//2º
		Palindroma p2 = new Palindroma("0ojo0");
		
		Palindroma p3 = new Palindroma("No");
		
		System.out.println(p1.esPalindroma());
		System.out.println(p2.esPalindroma());
		System.out.println(p3.esPalindroma());
	}

}
