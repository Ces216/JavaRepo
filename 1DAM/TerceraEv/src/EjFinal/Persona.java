package EjFinal;
import java.io.Serializable;


public abstract class Persona implements Identificable, Serializable {
	/*
				    +--------------------+
				    |     Persona        |
				    +--------------------+
				    | -nombre : String   |
				    | -dni : String      |
				    +--------------------+
				    | +getNombre()       |
				    | +getDni()          |
				    +--------------------+
           		   			   ▲
				+--------------+---------------+
				|                              |
		+------------------+        +---------------------+
		|   Estudiante     |        |     Profesor        |
		+------------------+        +---------------------+
		| -carrera : String|        | -departamento : String |
		+------------------+        +---------------------+

					+----------------------+
					|      Libro           |
					+----------------------+
					| -titulo : String     |
					| -autor : String      |
					| -anio : int          |
					| -disponible : boolean|
					+----------------------+
					| +prestar()           |
					| +devolver()          |
					+----------------------+
					
					+----------------------+
					|      Prestamo        |
					+----------------------+
					| -persona : Persona   |
					| -libro : Libro       |
					| -fecha : LocalDate   |
					+----------------------+

Interfaces:
+----------------------+           +----------------------+
| Prestable            |           | Identificable        |
+----------------------+           +----------------------+
| +prestar()           |           | +getId() : String     |
| +devolver()          |           +----------------------+

* `Libro` implementa `Prestable` y `Comparable<Libro>`
* Se usa `Comparator` para ordenar libros por año.

*/

protected String nombre;
protected String dni;

	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public String getId() {
		return dni;
	}

@Override
	public String toString() {
		return nombre + " (" + dni + ")";
	}
}


