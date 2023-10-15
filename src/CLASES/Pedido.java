
package CLASES;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();
    private String vehiculo;
    private double distancia;
    private double total;
    private String vehiculoAsignado;
    

 private boolean entregado = false;

    public Pedido(String vehiculo, double distancia, double total, String vehiculoAsignado) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.total = total;
        this.vehiculoAsignado = vehiculoAsignado;
    }

    
  public Pedido(String vehiculo, double distancia, double total) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.total = total;

    }

    public Pedido(double distancia) {
        this.distancia = distancia;
    }

    public Pedido(String vehiculo, double distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
    }
 
    public Pedido() {
    }
    @Override
    public String toString() {
     
        StringBuilder sb = new StringBuilder();
        sb.append("Vehículo: ").append(this.vehiculo).append("\n");
        sb.append("Distancia: ").append(this.distancia).append(" kms\n");
        sb.append("Productos en el pedido:\n");
        for (Producto producto : productos) {
            sb.append("- ").append(producto.getNombre()).append(" - ").append(producto.getPrecio()).append("\n");
        }
        sb.append("Total del pedido: ").append(this.total).append("\n");
        return sb.toString();
    }
  
    public void marcarEntregado() {
        entregado = true;
    }

    public boolean estaEntregado() {
        return entregado;
    }

    public String getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(String vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }
    
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }
 
    public List<Producto> getProductos() {
        return productos;
    }


    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public static void setPedidos(ArrayList<Pedido> pedidos) {
        Pedido.pedidos = pedidos;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   public double getTotalp() {
    double total = 0;
    for (Producto producto : productos) {
        total += producto.getPrecio();
    }
    return total;
}
 

}

