package EjCollection;
import java.util.*;


public class TestList {
	public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        // add()
        lista.add("A");
        lista.add("B");
        lista.add("C");

        // add(index, element)
        lista.add(1, "X"); // A X B C

        // get()
        System.out.println("Elemento en pos 2: " + lista.get(2));

        // set()
        lista.set(2, "Z"); // cambia B por Z

        // indexOf() / lastIndexOf()
        lista.add("A");
        System.out.println("Primera A: " + lista.indexOf("A"));
        System.out.println("Última A: " + lista.lastIndexOf("A"));

        // remove(index)
        lista.remove(1); // elimina X

        // subList()
        List<String> sub = lista.subList(1, 3);

        System.out.println("Lista completa: " + lista);
        System.out.println("Sublista: " + sub);
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

