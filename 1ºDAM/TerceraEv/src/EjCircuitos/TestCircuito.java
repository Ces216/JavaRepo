package EjCircuitos;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class TestCircuito extends ComparadorDeVoltajes{

	public static void main(String[] args) {
		CircuitoEnSerie c1 = new CircuitoEnSerie(34, 200, 400, 500);
		CircuitoEnSerie c2 = new CircuitoEnSerie(45, 50, 700);
		CircuitoEnParalelo c3 = new CircuitoEnParalelo(100, 100);
		
		Placa p1 = new Placa(c1, c2, c3);
		System.out.println(p1.intensidadTotal());
		
		System.out.println("\n");
		
		List<Circuito> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		
		//comparable de listas(el resto esta en circuitos) orden descendente
		Collections.sort(lista);
		for (Circuito c : lista) {
			System.out.println(c.getVoltaje());
		}
		
		System.out.println("\n");
		c2.setVoltaje(423);
		
		//implementación de interfaz de comparator (orden ascendente)
		Collections.sort(lista, new ComparadorDeVoltajes());
		for (Circuito c : lista) {
			System.out.println(c.getVoltaje());
		}
		
		System.out.println("\n");
		c1.setVoltaje(102425);
		
		//comparator con lambda ordenandolo por voltaje (orden ascendente)
		lista.sort((l1, l2) -> Integer.compare(l1.getVoltaje(), l2.getVoltaje()));
		for (Circuito c : lista) {
			System.out.println(c.getVoltaje());
		}
		

	}

}
