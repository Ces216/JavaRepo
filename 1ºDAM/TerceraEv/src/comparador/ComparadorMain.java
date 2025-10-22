package comparador;

import java.util.Arrays;
import java.util.Scanner;

public class ComparadorMain {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		CompararAltura ca = new CompararAltura();
		CompararEdad ce = new CompararEdad();
		CompararGenero cg = new CompararGenero();
		CompararInteligente ci = new CompararInteligente();
		CompararNombre cn = new CompararNombre();

		Persona p1 = new Persona(21, 1.70, "Paco", true, 'H');
		Persona p2 = new Persona(23, 1.75, "Manolo", true, 'H');
		Persona p3 = new Persona(25, 1.83, "María", false, 'M');
		Persona p4 = new Persona(24, 1.79, "Alba", false, 'M');
		Persona p5 = new Persona(22, 1.65, "Juan", true, 'H');

		Persona personas[] = { p1, p2, p3, p4, p5 };
		int eleccion;

		for (Persona p : personas)
			System.out.printf("%s\n", p.toString());

		do {
			System.out.println(
					"\n\n1. Id\n2. Nombre\n3. Edad\n4. Inteligente o no\n5. Género\n6. Estatura\n7. Salir\nOrdenar por: ");
			eleccion = kb.nextInt();
			switch (eleccion) {
			case 1:
				Arrays.sort(personas);
				break;
			case 2:
				Arrays.sort(personas, cn);
				break;
			case 3:
				Arrays.sort(personas, ce);
				break;
			case 4:
				Arrays.sort(personas, ci);
				break;
			case 5:
				Arrays.sort(personas, cg);
				break;
			case 6:
				Arrays.sort(personas, ca);
				break;
			case 7:
				System.out.println("\n\nFin del programa");
				break;
			}
			if (eleccion != 7)
				for (Persona p : personas)
					System.out.printf("\n%s", p.toString());

		} while (eleccion != 7);
		kb.close();
	}

}
