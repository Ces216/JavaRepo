#Apuntes java#



##DateTimeFormatter(para dar formato a fechas)##

 

 	importar:	import java.time.format.DateTimeFormatter;

 		 	import java.time.\*;

 

 	1º:		obtenemos un tiempo en milisegundos desde 1970(long) > ej: f.lastModified()



 	2.1º:		Definir el formato de salida > DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:")\*

 			// para escribir texto dentro usar comillas simples



 	2.2º:		Indica en que zona horaria quieres mostrar la fecha > \*.withZone(ZoneId.systemDefault());

 										//predeterminada

 									    > \*.withZone(ZoneId.of("UTC"));

 										//hora universal

 

 	3º:		Convierte el long en Instant(más largo que long) y al Instant se le da

 			el formato especificado con fmt.format > fmt.format(Instant.ofEpochMilli(f.lastModified())));

 								 //todo esto se asigna a una variable para printearlo o se pone el sout fuera directamente)

 								 //Instant.EpochMilli(Long Milli) > convierte en Instant un Epoch en milisegundos como es el f.lastModified

\*\*El Epoch es el 1 de enero de 1970 a las 00:00:00 UTC)\*\*

 

Para definir el formato de salida:

| Símbolo | Significado                | Ejemplo      |

| ------- | -------------------------- | ------------ |

| `y`     | Año                        | `2025`       |

| `M`     | Mes (número)               | `09`         |

| `MMM`   | Mes (abreviado)            | `Sep`        |

| `MMMM`  | Mes completo               | `septiembre` |

| `d`     | Día del mes                | `29`         |

| `E`     | Día de la semana abreviado | `lun`        |

| `EEEE`  | Día de la semana completo  | `lunes`      |

| `H`     | Hora en 24h                | `18`         |

| `h`     | Hora en 12h                | `6`          |

| `m`     | Minutos                    | `45`         |

| `s`     | Segundos                   | `12`         |





##Recordatorio de BufferedReader//Writter con OutputStreamWitter##

import java.io.*;
	
try (BufferedWriter bw = new BufferedWriter(
         new OutputStreamWriter(new FileOutputStream("archivo.txt"), "UTF-16"))) {
    
	bw.write("Texto con buffer y codificación UTF-16");
} catch (IOException e) {
	e.printStackTrace();
}




##Input Stream Reader##
puente entre bytes streams y characters streams
	ej: InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Escribe tu nombre: ");
            String nombre = br.readLine();  // Lee una línea completa
            System.out.println("Hola, " + nombre);

##Output Stream writer##
hace lo contrario, de caracteres a bytes antes de enviarlos a una salida(como la consola)

##Hashmap##
Un HashMap es una colección que almacena pares clave–>valor.
ej: 	HashMap<String, Integer> edades = new HashMap<>();

	edades.put("Ana", 20);
	edades.put("Luis", 25);
	edades.put("Marta", 22);

	System.out.println(edades.get("Luis")); // 25


como iterar hashmap con valor y clave a la vez:
for (Map.Entry<String, Integer> e : puntuaciones.entrySet()) {
    System.out.println(e.getKey() + " → " + e.getValue());
}





	







