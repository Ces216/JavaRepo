package EjFinal;
import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
        return Integer.compare(l1.getAnio(), l2.getAnio());
    }
}
