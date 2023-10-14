package CLASES;

import javax.swing.JLabel;

public class Moto extends Thread {
    private JLabel motorcycleLabel;
    private int initialX;
    private int maxX;
    private int direction;

    public Moto(JLabel label, int initialX, int maxX) {
        this.motorcycleLabel = label;
        this.initialX = initialX;
        this.maxX = maxX;
        this.direction = 1; // Inicialmente, mueve hacia la derecha
    }

    @Override
    public void run() {
        int currentPosition = initialX;

        while (currentPosition < maxX) {
            currentPosition += direction * 4; // Ajusta la velocidad según sea necesario
            motorcycleLabel.setLocation(currentPosition, motorcycleLabel.getY());

            try {
                Thread.sleep(20); // Controla la velocidad de la animación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (currentPosition > initialX) {
            currentPosition -= direction * 2; // Mueve hacia la izquierda para volver a la posición inicial
            motorcycleLabel.setLocation(currentPosition, motorcycleLabel.getY());

            try {
                Thread.sleep(20); // Controla la velocidad de la animación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
