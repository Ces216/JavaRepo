package pruebaDeTiempo;
import java.time.*;

public class EjemploDateTime {
    static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2025, 9, 29, 20, 0); // 29 sep 2025 20:00
        ZonedDateTime zdt = ldt.atZone(ZoneId.of("Europe/Madrid")); //Zone id para el ldt

        Instant fecha = zdt.toInstant();
        ZonedDateTime zdt2 = fecha.atZone(ZoneId.of("Europe/Madrid")); //Opción 1

        java.time.format.DateTimeFormatter dtf = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");//(Opc.2).withZone(ZoneId.systemDefault());
                                                                                  //(Opc.2)Zone id para formatear(el instant en este caso)


        //System.out.println(dtf.format(ldt));
        //System.out.println(dtf.format(zdt));
        System.out.println(dtf.format(zdt2));//Opción 1
        //System.out.println(dtf.format(fecha)); //Opción 2
    }
}
