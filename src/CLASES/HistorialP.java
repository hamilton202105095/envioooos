
package CLASES;

import java.io.Serializable;
import java.time.Instant;

public class HistorialP implements Serializable{
    private Pedido pedido;
    private double distanciaRecorrida;
    private Instant horaInicio;
    private Instant horaFin;
    

    public HistorialP(Pedido pedido, double distanciaRecorrida, Instant horaInicio, Instant horaFin) {
        this.pedido = pedido;
        this.distanciaRecorrida = distanciaRecorrida;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public Instant getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Instant horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Instant getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Instant horaFin) {
        this.horaFin = horaFin;
    }
}