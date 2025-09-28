package EjFinal;
import java.io.Serializable;

public class Libro implements Prestable, Comparable<Libro>, Serializable {
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible = true;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void prestar() throws LibroNoDisponibleException {
        if (!disponible) throw new LibroNoDisponibleException("El libro no está disponible.");
        disponible = false;
    }

    @Override
    public void devolver() {
        disponible = true;
    }

    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ") - Disponible: " + disponible;
    }
}
