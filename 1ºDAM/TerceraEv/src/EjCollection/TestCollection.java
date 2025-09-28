package EjCollection;
import java.util.*;


public class TestCollection {
	 public static void main(String[] args) {
	        Collection<String> coleccion = new ArrayList<>();

	        // add()
	        coleccion.add("uno");
	        coleccion.add("dos");

	        // addAll()
	        Collection<String> otra = Arrays.asList("tres", "cuatro");
	        coleccion.addAll(otra);

	        // contains()
	        System.out.println("¿Contiene 'dos'? " + coleccion.contains("dos"));

	        // size()
	        System.out.println("Tamaño: " + coleccion.size());

	        // isEmpty()
	        System.out.println("¿Está vacía? " + coleccion.isEmpty());

	        // remove()
	        coleccion.remove("uno");

	        // containsAll()
	        System.out.println("¿Contiene todos? " + coleccion.containsAll(otra));

	        // removeAll()
	        coleccion.removeAll(otra);

	        // retainAll()
	        coleccion.addAll(Arrays.asList("cinco", "seis", "siete"));
	        coleccion.retainAll(Arrays.asList("cinco", "ocho")); // deja solo "cinco"

	        // clear()
	        coleccion.clear();

	        // toArray()
	        coleccion.addAll(Arrays.asList("nueve", "diez"));
	        Object[] array = coleccion.toArray();

	        System.out.println("Elementos: " + coleccion);
	    }
/*
 * La interfaz Collection define las funcionalidades comunes a todas las colecciones,
ya sean listas o conjuntos. Sin embargo, las clases de la API que la implementan son
listas o conjuntos, es decir, implementan la interfaz List o Set, que son extensiones de
Collection. Ninguna implementa Collection directamente. Por ello, para poner ejem-
plos prácticos de ella, tendremos que usar listas o conjuntos. Nosotros usaremos listas,
para 10 cual adelantaremos aquí los conocimientos mínimos para crearlas y manipularlas
como colecciones, aunque eI estudio detallado de la interfaz List se hará más adelante.
 */
}
