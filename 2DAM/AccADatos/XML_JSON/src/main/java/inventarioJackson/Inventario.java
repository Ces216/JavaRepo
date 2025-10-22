package inventarioJackson;
import java.util.List;

public class Inventario {
    private String nombreTienda;
    private List<Producto> productos;

    // Constructor vacío
    public Inventario() {}

    public Inventario(String nombreTienda, List<Producto> productos) {
        this.nombreTienda = nombreTienda;
        this.productos = productos;
    }

    public String getNombreTienda() { return nombreTienda; }
    public void setNombreTienda(String nombreTienda) { this.nombreTienda = nombreTienda; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }
}

