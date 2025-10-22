package EjCircuitos;
import java.util.ArrayList;
import java.util.Arrays;

public class Circuito implements Comparable <Circuito>{
	private int voltaje;
	private ArrayList<Integer> conjuntoDeResistencias;
	
	public Circuito(int voltaje) {
		this.voltaje = voltaje;
        this.conjuntoDeResistencias = new ArrayList<>();
	}

	public Circuito(int voltaje, Integer... resistencia) {
		this.voltaje = voltaje;
		this.conjuntoDeResistencias = new ArrayList<>(Arrays.asList(resistencia));
	}
	
	public void añadirResistencias(int resistencia) {
		conjuntoDeResistencias.add(resistencia);
	}
	
	public int sumaDeResistencias() {
		int sumaDeResistencias = 0;
		for(int resistencia : conjuntoDeResistencias) {
			sumaDeResistencias += resistencia;
		}
		return sumaDeResistencias;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public ArrayList<Integer> getConjuntoDeResistencias() {
		return conjuntoDeResistencias;
	}

	public void setConjuntoDeResistencias(ArrayList<Integer> conjuntoDeResistencias) {
		this.conjuntoDeResistencias = conjuntoDeResistencias;
	}
	
	//ordenado en orden descendente
	public int compareTo(Circuito c) {
        return -(Integer.compare(this.voltaje, c.voltaje));
    }

	
}
