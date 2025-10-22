package EjFiguras;

public class Triangulo extends Figura implements Transformable,Coloreable{
	private double lado;
	private double altura = Math.sqrt((lado*lado)-((lado/2)*(lado/2)));
	private String color;
	
	public Triangulo(double lado) {
		super();
		this.lado = lado;
	}

	double calcularPerimetro() {
		return 3*lado;
	}
	
	double calcularArea() {
		return lado*altura;
	}
	
	public void escalar(double factor) {
		factor *= lado;
	}
	
	public void cambiarColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
}
