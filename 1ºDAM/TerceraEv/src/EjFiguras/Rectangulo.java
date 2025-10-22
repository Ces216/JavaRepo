package EjFiguras;

public class Rectangulo extends Figura implements Transformable,Coloreable{
	private double base;
	private double altura;
	private String color;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	double calcularPerimetro() {
		return 2*base+2*altura;
	}
	
	double calcularArea() {
		return base*altura;
	}
	
	public void escalar(double factor) {
		factor *= base;
		factor *= altura;
		
	}
	
	public void cambiarColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
}
