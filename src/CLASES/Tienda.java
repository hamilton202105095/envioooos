
package CLASES;

import java.io.Serializable;
import java.util.ArrayList;

public class Tienda implements Serializable {
    
    private static ArrayList<Producto> productos = new ArrayList<>();


    public static ArrayList<Producto> getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList<Producto> productos) {
        Tienda.productos = productos;
    }
}
