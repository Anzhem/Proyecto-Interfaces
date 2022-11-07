package gui;

import LogicaNegocio.Logica;
import dto.Productos;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IntroducirProductos extends javax.swing.JDialog {

    Logica log = new Logica();
    ImagenFondo imagen = new ImagenFondo();

    public IntroducirProductos(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        this.setContentPane(imagen);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Overwatch.png")).getImage());
    }

    public void Introducir() {
        String precio = FieldprecioProducto.getText();
        String nombre = FieldNProducto.getText();
        String ID = FieldIDProducto.getText();

        Integer Stock = (Integer) FieldStockProducto.getValue();
        Date Fecha = (Date) SpinnerFecha.getValue();
        if (Logica.esNumero(precio) == true) {
            precio = precio + " €";
            Productos producto = new Productos(nombre, ID, precio, Stock, Fecha);
            Logica.aniadirProducto(producto);
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Panel Producto", JOptionPane.YES_NO_OPTION);
            if (pregunta == 0) {
                
            } else {
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "El valor de 'Precio' debe ser un número ", "Error Precio", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cabecera_IProducto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FieldNProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldIDProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldprecioProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldStockProducto = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        SpinnerFecha = new javax.swing.JSpinner();
        IProducto_Enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cabecera_IProducto.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        Cabecera_IProducto.setForeground(new java.awt.Color(204, 204, 204));
        Cabecera_IProducto.setText("Introduce el producto");

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nombre producto");

        FieldNProducto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ID producto");

        FieldIDProducto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Precio producto");

        FieldprecioProducto.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Stock");

        FieldStockProducto.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Fecha");

        SpinnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1666945293477L), null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));
        SpinnerFecha.setRequestFocusEnabled(false);

        IProducto_Enviar.setText("Enviar");
        IProducto_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IProducto_EnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cabecera_IProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(FieldprecioProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldNProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldIDProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpinnerFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldStockProducto))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(290, Short.MAX_VALUE)
                        .addComponent(IProducto_Enviar)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Cabecera_IProducto)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FieldNProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FieldIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FieldprecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FieldStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IProducto_Enviar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IProducto_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IProducto_EnviarActionPerformed
        Introducir();


    }//GEN-LAST:event_IProducto_EnviarActionPerformed

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
            java.util.logging.Logger.getLogger(IntroducirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroducirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroducirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroducirProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntroducirProductos dialog = new IntroducirProductos(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cabecera_IProducto;
    private javax.swing.JTextField FieldIDProducto;
    private javax.swing.JTextField FieldNProducto;
    private javax.swing.JSpinner FieldStockProducto;
    private javax.swing.JTextField FieldprecioProducto;
    private javax.swing.JButton IProducto_Enviar;
    private javax.swing.JSpinner SpinnerFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    class ImagenFondo extends JPanel {// IMAGEN

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPantalla.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
