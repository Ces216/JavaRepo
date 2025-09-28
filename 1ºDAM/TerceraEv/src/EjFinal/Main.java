package EjFinal;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Prestamo> prestamos = new ArrayList<>();

        libros.add(new Libro("Java Básico", "Ana Ruiz", 2015));
        libros.add(new Libro("POO Avanzada", "Luis Pérez", 2020));
        libros.add(new Libro("Estructuras de Datos", "Carlos Díaz", 2018));

        Persona p1 = new Estudiante("Laura", "12345678A", "Informática");

        try {
            libros.get(0).prestar();
            prestamos.add(new Prestamo(p1, libros.get(0)));
        } catch (LibroNoDisponibleException e) {
            System.out.println(e.getMessage());
        }

        // Ordenar por título (Comparable)
        Collections.sort(libros);
        System.out.println("\nLibros ordenados por título:");
        libros.forEach(System.out::println);

        // Ordenar por año (Comparator)
        libros.sort(new ComparadorPorAnio());
        System.out.println("\nLibros ordenados por año:");
        libros.forEach(System.out::println);

        // Serialización
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prestamos.dat"))) {
            oos.writeObject(prestamos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prestamos.dat"))) {
            ArrayList<Prestamo> prestamosLeidos = (ArrayList<Prestamo>) ois.readObject();
            System.out.println("\nPrestamos leídos del archivo:");
            prestamosLeidos.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

