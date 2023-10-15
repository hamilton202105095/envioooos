
package VISTAS;

import CLASES.*;
import VISTAS.FrmSimulacion;
import CLASES.Tienda;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Menu extends javax.swing.JFrame {

   private FrmSimulacion frmSimulacion;
   public ArrayList<Pedido> listaDePedidos = new ArrayList<>();
    public Menu() {
        initComponents();
        this.recuperarProductos();
        
          this.mostrarProductos(); 
          this.configurarCabecerasTabla(); 
          
           frmSimulacion = new FrmSimulacion();
        frmSimulacion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tblproductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tblpedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Btnaggapedido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Txtdistancia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Btnconfirmarp = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Lbltotal = new javax.swing.JLabel();
        Btnirasimulacion = new javax.swing.JButton();
        Btnabrirhistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tblproductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tblproductos);

        Tblpedido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Tblpedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tblpedido);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("PEDIDO");

        Btnaggapedido.setText("AGREGAR PRODUCTO SELECCIONADO AL PEDIDO");
        Btnaggapedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnaggapedidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("VEHICULO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOTO1 ", "MOTO2 ", "MOTO3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("DISTANCIA A RECORRER");

        jLabel5.setText("KMS");

        Btnconfirmarp.setText("CONFIRMAR PEDIDO");
        Btnconfirmarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnconfirmarpActionPerformed(evt);
            }
        });

        jButton3.setText("REGRESAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Btnirasimulacion.setText("Visualizar Pedidos");
        Btnirasimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnirasimulacionActionPerformed(evt);
            }
        });

        Btnabrirhistorial.setText("Historial");
        Btnabrirhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnabrirhistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)
                        .addGap(360, 360, 360)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btnaggapedido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtdistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btnabrirhistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Btnconfirmarp)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btnirasimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Btnaggapedido)
                .addGap(9, 9, 9)
                .addComponent(Btnconfirmarp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Txtdistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Btnirasimulacion)))
                .addGap(18, 18, 18)
                .addComponent(Btnabrirhistorial)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
       public void recuperarProductos() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\PRAACTICAA2\\productos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Producto> productos = (ArrayList<Producto>) ois.readObject();
            Tienda.setProductos(productos);
            fis.close();
            ois.close();
            System.out.println("Productos recuperados: " + productos.size());
        } catch (Exception e) {
            System.out.println("Error al recuperar productos: " + e.getMessage());
        }
    }
    
    private void mostrarProductos(){
       String[] columnNames = {"PRODUCTO","PRECIO"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
     for (Producto  producto : Tienda.getProductos()) {
            Object[] rowData = {producto.getNombre(),producto.getPrecio()};
            model.addRow(rowData);
        }
        Tblproductos.setModel(model);
        }
    
    private void configurarCabecerasTabla() {
   String[] columnNames = {"PRODUCTO", "PRECIO"};

    // Configura las cabeceras para la tabla de pedidos
    DefaultTableModel modelPedido = (DefaultTableModel) Tblpedido.getModel();
    
    // Limpia todas las filas existentes en la tabla de pedidos
    modelPedido.setRowCount(0);
    
    modelPedido.setColumnIdentifiers(columnNames);
}
    private void agregarProductoATablaPedido(Producto producto) {
    DefaultTableModel modelPedido = (DefaultTableModel) Tblpedido.getModel();
    Object[] rowData = {producto.getNombre(), producto.getPrecio()};
    modelPedido.addRow(rowData);
}
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         VistaPrincipal vistap = new VistaPrincipal();
        vistap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
   
    
    private double totalPedido = 0.0;
    private void BtnaggapedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnaggapedidoActionPerformed
    
        int filaSeleccionada = Tblproductos.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas agregar este producto?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Obtiene el producto seleccionado en la fila
            Producto producto = Tienda.getProductos().get(filaSeleccionada);

            // Obtiene el pedido actual (o crea uno nuevo si no existe)
            Pedido pedidoActual;
            if (Pedido.getPedidos().isEmpty()) {
                pedidoActual = new Pedido();
                Pedido.getPedidos().add(pedidoActual);
            } else {
                pedidoActual = Pedido.getPedidos().get(Pedido.getPedidos().size() - 1);
            }

            // Agrega el producto al pedido actual
            pedidoActual.agregarProducto(producto); // Utiliza el método agregarProducto en lugar de agregarPedido
            agregarProductoATablaPedido(producto);

            // Suma el precio del producto al total del pedido
            totalPedido += producto.getPrecio();

            // Actualiza el JLabel Lbltotal con el nuevo total
            Lbltotal.setText("Total: " + totalPedido);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un producto para agregar.");
    }
    }//GEN-LAST:event_BtnaggapedidoActionPerformed

    private int pedidosRealizados = 0; // Variable para rastrear la cantidad de pedidos realizados
private ArrayList<String> motosUtilizadas = new ArrayList<>(); // Lista para rastrear las motos utilizadas
    private void BtnconfirmarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnconfirmarpActionPerformed
      if (jComboBox1.getSelectedItem() == null || Txtdistancia.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }
    // Verificar si ya se han realizado 3 pedidos
    if (pedidosRealizados >= 3) {
        JOptionPane.showMessageDialog(null, "Ya se han realizado 3 pedidos, no se pueden hacer más.");
        return;
    }
    // Obtén los datos del pedido actual de la tabla de pedidos
    DefaultTableModel modelPedido = (DefaultTableModel) Tblpedido.getModel();
    int rowCount = modelPedido.getRowCount();
    ArrayList<Producto> productosPedido = new ArrayList<>();

    for (int i = 0; i < rowCount; i++) {
        String nombre = modelPedido.getValueAt(i, 0).toString();
        double precio = Double.parseDouble(modelPedido.getValueAt(i, 1).toString());
        Producto producto = new Producto(nombre, precio);
        productosPedido.add(producto);
    }
    // Crea una instancia de Pedido para representar el pedido actual
    String vehiculo = jComboBox1.getSelectedItem().toString();
    double distancia = Double.parseDouble(Txtdistancia.getText());
    // Verificar si la distancia está dentro del rango válido (0 a 10 kms)
    if (distancia < 0 || distancia > 1000) {
        JOptionPane.showMessageDialog(null, "La distancia debe estar entre 0 y 10 kms.");
        return;
    }
    // Verificar si la moto seleccionada ya está en un pedido
    if (motosUtilizadas.contains(vehiculo)) {
        JOptionPane.showMessageDialog(null, "Esta moto ya está en uso en otro pedido.");
        return;
    }
    // Crear una nueva instancia de Pedido con un total inicial de 0
    Pedido pedidoActual = new Pedido(vehiculo, distancia, 0);
    // Agrega los productos del pedido actual a la instancia de Pedido
    for (Producto producto : productosPedido) {
        pedidoActual.agregarProducto(producto);
    }
    // Calcular el total del pedido actual
    double totalPedidoActual = pedidoActual.getTotalp();
    Lbltotal.setText("Total: " + totalPedidoActual);
    // Guarda la instancia de Pedido en la lista de pedidos
    Pedido.getPedidos().add(pedidoActual);
    
    // Asignar la moto utilizada a este pedido
pedidoActual.setVehiculoAsignado(vehiculo);  
     // Agrega el pedido actual a la lista de pedidos
    listaDePedidos.add(pedidoActual);
    // Aumenta el contador de pedidos realizados
    pedidosRealizados++;
    // Agrega la moto utilizada a la lista
    motosUtilizadas.add(vehiculo);
    // Limpiar la tabla de pedidos
    modelPedido.setRowCount(0);
    
  for (Moto moto : frmSimulacion.getMotos()) {
        if (moto.getPedidoAsignado() == null) {
            moto.setPedidoAsignado(pedidoActual);
            pedidoActual.setVehiculoAsignado(moto.getNombre());
            break; // Asigna la primera motocicleta disponible y rompe el bucle.
        }
    }

    // Mensaje de confirmación
    JOptionPane.showMessageDialog(null, "Pedido confirmado y guardado.");
    
    }//GEN-LAST:event_BtnconfirmarpActionPerformed

    
    public void mostrarTodosLosPedidos() {
    int numPedidos = listaDePedidos.size();
    System.out.println("Hay " + numPedidos + " pedidos registrados.");
    if (listaDePedidos.isEmpty()) {
        System.out.println("No hay pedidos registrados.");
        return;
    }
    for (Pedido pedido : listaDePedidos) {
        System.out.println(pedido.toString());
        System.out.println("---------------------------");
    }
}
    private void BtnirasimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnirasimulacionActionPerformed
        
      this.mostrarTodosLosPedidos();
          if (!frmSimulacion.isVisible()) {
            frmSimulacion.setVisible(true);
        }
        this.dispose();    
    }//GEN-LAST:event_BtnirasimulacionActionPerformed

    private void BtnabrirhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnabrirhistorialActionPerformed
        // Crear una instancia de Frmhistorial y pasar el historial de pedidos
    Frmhistorial frmHistorial = new Frmhistorial();

    // Hacer que la ventana Frmhistorial sea visible
    frmHistorial.setVisible(true);
    this.dispose(); 
    }//GEN-LAST:event_BtnabrirhistorialActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnabrirhistorial;
    private javax.swing.JButton Btnaggapedido;
    private javax.swing.JButton Btnconfirmarp;
    private javax.swing.JButton Btnirasimulacion;
    private javax.swing.JLabel Lbltotal;
    private javax.swing.JTable Tblpedido;
    private javax.swing.JTable Tblproductos;
    private javax.swing.JTextField Txtdistancia;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
