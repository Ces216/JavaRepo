package EjInmobiliaria;
import java.util.*;

public class Agencia {
	private ArrayList<Inmueble> inmuebles;

    public Agencia() {
        this.inmuebles = new ArrayList<>();
    }

    public void addInmueble(Inmueble i) {
        inmuebles.add(i);
    }

    public void verTodasVentaInmueble() {
        for (Inmueble i : inmuebles) if (i.seVende()) System.out.println(i);
    }

    public void verTodosAlquilerInmueble() {
        for (Inmueble i : inmuebles) if (i.seAlquila()) System.out.println(i);
    }

    public void inmueblesVenta(double p) {
        for (Inmueble i : inmuebles)
            if (i.seVende() && i.getPrecio() < p)
                System.out.println(i);
    }

    public void localesSegundaMano(double m2) {
        for (Inmueble i : inmuebles)
            if (i instanceof LocalComercial l && l.isSegundaMano() && l.getMetrosCuadrados() > m2)
                System.out.println(l);
    }

    public void solaresRusticos() {
        int contador = 0;
        for (Inmueble i : inmuebles)
            if (i instanceof Solar s && s.isRustico())
                contador++;
        System.out.println("Solares rústicos en venta: " + contador);
    }

    public void viviendasAlquilerMasDe2Hab() {
        for (Inmueble i : inmuebles)
            if (i instanceof Vivienda v && v.getHabitaciones() > 2 && v.seAlquila())
                System.out.println(v);
    }

    public void viviendasCompraMasDe1Hab() {
        for (Inmueble i : inmuebles)
            if (i instanceof Vivienda v && v.getHabitaciones() > 1 && v.seVende())
                System.out.println(v);
    }

    public void verGarajesPublicos() {
        for (Inmueble i : inmuebles)
            if (i instanceof Garaje g && g.isPublico())
                System.out.println(g);
    }

    public Agencia fusion(Agencia otra) {
        Agencia fusionada = new Agencia();
        fusionada.inmuebles.addAll(this.inmuebles);
        fusionada.inmuebles.addAll(otra.inmuebles);
        return fusionada;
    }
}
