package EjSerializr;
import java.util.ArrayList;
import java.io.*;

public class TestSerializacion{
	
	public static void main(String[] args) throws IOException {
		ArrayList <Persona> P1 = new ArrayList<>();
	      ArrayList<Persona> P2 = null;
	try {	
	
		Persona p1 = new Persona("Josefo", "Argentina");
		Persona p2 = new Persona("Florencio", "Peru");
		Persona p3 = new Persona(null, "España");	//Nombre no valido
	
		P1.add(p1);
		P1.add(p2);
		P1.add(p3);

		for(Persona p : P1) {
			if(p.getNombre() == null) {
				throw new PersonaNoValidaException("La persona debe tener nombre");
			}
		}
		
	} catch (PersonaNoValidaException e) {
		System.out.println("Persona inválida: " + e.getMessage());
	}
		
	try {
		//Serializar objeto (guardarlo)
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/cesar/eclipse-workspace/TerceraEv/src/persona.dat")); 
		oos.writeObject(P1);
		oos.close();
	} catch (FileNotFoundException e) {
		System.out.println("Archivo no encontrado: " + e.getMessage());
	}
	try {
		//Deserializar objeto (sacarlo/leerlo)
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/cesar/eclipse-workspace/TerceraEv/src/persona.dat"));
        P2 = (ArrayList<Persona>) ois.readObject();
		ois.close();
	
	} catch (ClassNotFoundException e) {
		System.out.println("Clase no encontrada el deserializar: " + e.getMessage());
	}	
		
	try {
		System.out.println("Persona fuera de rango: " + P2.get(10).getNombre());
	} catch (IndexOutOfBoundsException e) {
        System.out.println("Índice fuera de rango en la lista: " + e.getMessage());
    } 	
	
	try {
		Persona personaNula = null;
		System.out.println(personaNula.getNombre());
	} catch (NullPointerException e) {
        System.out.println("Objeto nulo: " + e.getMessage());
	}
 
	}
}


