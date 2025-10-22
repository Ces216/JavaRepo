package EjFinal;

public class Profesor extends Persona{
    private String departamento;

    public Profesor(String nombre, String dni, String departamento) {
        super(nombre, dni);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " - Departamento: " + departamento;
    }
}

