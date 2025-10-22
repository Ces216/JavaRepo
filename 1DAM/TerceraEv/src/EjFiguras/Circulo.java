package EjFiguras;

public class Circulo extends Figura implements Transformable,Coloreable{
	private int radio;
	private String color;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public Circulo(int radio, String color) {
		super();
		this.radio = radio;
		this.color = color;
	}

	double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
	
	double calcularArea() {
		return Math.PI*(radio*radio);
	}
	
	public void escalar(double factor) {
		factor *= radio;
	}
	
	public void cambiarColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
