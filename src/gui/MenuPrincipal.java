/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class MenuPrincipal extends javax.swing.JDialog {

   
    ImagenFondo imagen1 = new ImagenFondo();
    public MenuPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setContentPane(imagen1);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonEditarProductos = new javax.swing.JButton();
        CabeceraMenu = new javax.swing.JLabel();
        BotonMostrarProductos = new javax.swing.JButton();
        BotonVolverInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonEditarProductos.setBackground(new java.awt.Color(153, 153, 153));
        BotonEditarProductos.setText("Editar Productos");
        BotonEditarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarProductosActionPerformed(evt);
            }
        });

        CabeceraMenu.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        CabeceraMenu.setForeground(new java.awt.Color(204, 204, 204));
        CabeceraMenu.setText("¿Qué acción desea realizar?");

        BotonMostrarProductos.setBackground(new java.awt.Color(153, 153, 153));
        BotonMostrarProductos.setText("Mostrar Productos");
        BotonMostrarProductos.setBorderPainted(false);
        BotonMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarProductosActionPerformed(evt);
            }
        });

        BotonVolverInicio.setText("Volver al Inicio");
        BotonVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonEditarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonMostrarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CabeceraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonVolverInicio)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(CabeceraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEditarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(BotonMostrarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addComponent(BotonVolverInicio)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarProductosActionPerformed
        // Codigo para visualizar el gui de MostrarProducots
        MostrarProductos mp = new MostrarProductos(new javax.swing.JDialog(),true);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_BotonMostrarProductosActionPerformed

    private void BotonEditarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarProductosActionPerformed
        // Codigo para visualizar el gui de IntroducirProductos
        IntroducirProductos ip = new IntroducirProductos(new javax.swing.JDialog(), true);
        ip.setVisible(true);
        ip.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonEditarProductosActionPerformed

    private void BotonVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverInicioActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonVolverInicioActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEditarProductos;
    private javax.swing.JButton BotonMostrarProductos;
    private javax.swing.JButton BotonVolverInicio;
    private javax.swing.JLabel CabeceraMenu;
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
