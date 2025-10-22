package EjFinal;
import java.io.Serializable;
import java.time.LocalDate;

public class Prestamo implements Serializable {
    private Persona persona;
    private Libro libro;
    private LocalDate fecha;

    public Prestamo(Persona persona, Libro libro) {
        this.persona = persona;
        this.libro = libro;
        this.fecha = LocalDate.now();
    }

    @Override
    public String toString() {
        return persona + " prestó '" + libro.getTitulo() + "' el día " + fecha;
    }
}
