
package VISTAS;

import CLASES.Moto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;



public class FrmSimulacion extends javax.swing.JFrame {


     private Moto[] motos;
    
    public FrmSimulacion() {
        initComponents();
        motos = new Moto[3];
        motos[0] = new Moto(MOTO1, MOTO1.getX(), getWidth() - MOTO1.getWidth());
        motos[1] = new Moto(MOTO2, MOTO2.getX(), getWidth() - MOTO2.getWidth());
        motos[2] = new Moto(MOTO3, MOTO3.getX(), getWidth() - MOTO3.getWidth());
    }
    
    private void moveMotorcyclesWithThreads() {
        for (Moto moto : motos) {
            moto.start();
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btnenviartodo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MOTO2 = new javax.swing.JLabel();
        MOTO1 = new javax.swing.JLabel();
        MOTO3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Btnenviarm1 = new javax.swing.JButton();
        Btnenviarm2 = new javax.swing.JButton();
        Btnenviarm3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("VISUALIZACION  DE TRAYECTORIAS");

        Btnenviartodo.setText("Enviar Todos");
        Btnenviartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnenviartodoActionPerformed(evt);
            }
        });

        jLabel2.setText("Motocicleta 1");

        jLabel3.setText("Motocicleta 2 ");

        jLabel4.setText("Motocicleta 3");

        MOTO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-motocicleta-100.png"))); // NOI18N

        MOTO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-motocicleta-100.png"))); // NOI18N

        MOTO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-motocicleta-100.png"))); // NOI18N

        jLabel8.setText("Distancia");

        jLabel9.setText("Distancia");

        jLabel10.setText("Distancia");

        Btnenviarm1.setText("Enviar");
        Btnenviarm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnenviarm1ActionPerformed(evt);
            }
        });

        Btnenviarm2.setText("Enviar");
        Btnenviarm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnenviarm2ActionPerformed(evt);
            }
        });

        Btnenviarm3.setText("Enviar");
        Btnenviarm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnenviarm3ActionPerformed(evt);
            }
        });

        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addComponent(Btnenviartodo)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(Btnenviarm1)
                    .addComponent(Btnenviarm3)
                    .addComponent(Btnenviarm2))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MOTO2)
                    .addComponent(MOTO1)
                    .addComponent(MOTO3))
                .addContainerGap(740, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btnenviartodo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(Btnenviarm1))
                    .addComponent(MOTO1))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(Btnenviarm2))
                    .addComponent(MOTO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Btnenviarm3)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(MOTO3)
                        .addGap(55, 55, 55))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnenviartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnenviartodoActionPerformed
moveMotorcyclesWithThreads();
    }//GEN-LAST:event_BtnenviartodoActionPerformed

    private void Btnenviarm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnenviarm1ActionPerformed
      motos[0].start();
    }//GEN-LAST:event_Btnenviarm1ActionPerformed

    private void Btnenviarm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnenviarm2ActionPerformed
      motos[1].start();  
    }//GEN-LAST:event_Btnenviarm2ActionPerformed

    private void Btnenviarm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnenviarm3ActionPerformed
    
    motos[2].start();
    }//GEN-LAST:event_Btnenviarm3ActionPerformed


    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         Menu menu = new Menu(); 
       menu.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSimulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnenviarm1;
    private javax.swing.JButton Btnenviarm2;
    private javax.swing.JButton Btnenviarm3;
    private javax.swing.JButton Btnenviartodo;
    private javax.swing.JLabel MOTO1;
    private javax.swing.JLabel MOTO2;
    private javax.swing.JLabel MOTO3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

   
}
