package EjCollection;
import java.util.*;


public class TestSet {
	public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // add()
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        // add() duplicado
        conjunto.add("Java"); // no se añade

        // contains()
        System.out.println("¿Contiene 'Python'? " + conjunto.contains("Python"));

        // remove()
        conjunto.remove("C++");

        // size()
        System.out.println("Tamaño: " + conjunto.size());

        // isEmpty()
        System.out.println("¿Vacío? " + conjunto.isEmpty());

        // iteration
        for (String lang : conjunto) {
            System.out.println(lang);
        }

        // clear()
        conjunto.clear();
        System.out.println("Conjunto limpio: " + conjunto);
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

