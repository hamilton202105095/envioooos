
package CLASES;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Moto extends Thread {
    private JLabel motorcycleLabel;
    private int initialX;
    private int maxX;
    private int direction;
    private Pedido pedidoAsignado;
    private Instant startTime; // Hora de inicio
    private Instant endTime;   // Hora de finalización
   

    private String nombre; // Añade el nombre del vehículo
    
   public Moto(JLabel label, int initialX, int maxX, String nombre) {
    this.motorcycleLabel = label;
    this.initialX = initialX;
    this.maxX = maxX;
    this.direction = 1;
    this.nombre = nombre;
   
}

    public Moto() {
    }

     public String getNombre() {
        return nombre;
    }
     
    public Pedido getPedidoAsignado() {
        return pedidoAsignado;
    }

    public void setPedidoAsignado(Pedido pedidoAsignado) {
        this.pedidoAsignado = pedidoAsignado;
    }

  public void run() {
    try {
        startTime = Instant.now(); // Registra la hora de inicio

        int currentPosition = initialX;
        double distanciaPedido = pedidoAsignado.getDistancia();
        double distanciaRecorrida = 0; // Inicializa la distancia recorrida

        while (distanciaRecorrida < distanciaPedido) {
            currentPosition += direction * 4;
            motorcycleLabel.setLocation(currentPosition, motorcycleLabel.getY());
            distanciaRecorrida += 4; // Aumenta la distancia recorrida en función de la velocidad

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Invierte la dirección para que la moto regrese
        direction = -1;

        while (currentPosition > initialX) {
            currentPosition += direction * 4;
            motorcycleLabel.setLocation(currentPosition, motorcycleLabel.getY());
            distanciaRecorrida += 4; // Aumenta la distancia recorrida durante el regreso

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    endTime = Instant.now(); // Registra la hora de finalización
    // Aquí puedes hacer lo que necesites con startTime y endTime
    // Muestra la hora de inicio y hora de finalización en la consola
    System.out.println("Hora de inicio: " + startTime);
        System.out.println("Hora de finalización: " + endTime);
    
        // Mostrar la distancia recorrida
        System.out.println("Distancia Recorrida: " + distanciaRecorrida);
        System.out.println("hola que hace");
    
        HistorialP historialPedido = new HistorialP(pedidoAsignado, distanciaRecorrida, startTime, endTime);
        Tienda.getHistorialPedidos().add(historialPedido);
        
        JOptionPane.showMessageDialog(null, "EL PEDIDO SE ENTREGO CORRECTAMENTE");
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\PRAACTICAA2\\Historal.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Tienda.getHistorialPedidos());
        fos.close();
        oos.close();
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
}

   
}