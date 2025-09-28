package EjFiguras;

public class TestFiguras {
	public static void main(String[] args) {
		Circulo f1 = new Circulo(54);
		Rectangulo f2 = new Rectangulo(39,66);
		Triangulo f3 = new Triangulo(12);
				
		System.out.println(f1.calcularArea());
		System.out.println(f1.calcularPerimetro());
		f1.escalar(3);
		f1.cambiarColor("Naranja");
		
		System.out.println(f2.calcularArea());
		System.out.println(f2.calcularPerimetro());
		
		System.out.println(f3.calcularArea());
		System.out.println(f3.calcularPerimetro());
		
		
	}

}
