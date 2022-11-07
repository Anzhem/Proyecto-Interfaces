package gui;

import LogicaNegocio.Logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Inicio extends javax.swing.JFrame {

    //Variables globales
    String user = "admin";
    String pswrd = "contraseña";
    Logica log = new Logica();

    ImagenFondo imagen = new ImagenFondo();

    public Inicio() {
        /*Al iniciar el programa cargará la imagen,su posición se centrará,colocará
          El Icono y por último se iniciará
        */
        this.setContentPane(imagen);
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonEnviar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        Texto3 = new javax.swing.JLabel();
        CampoContrasenia = new javax.swing.JPasswordField();
        Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonEnviar.setBackground(new java.awt.Color(153, 153, 153));
        BotonEnviar.setForeground(new java.awt.Color(60, 63, 65));
        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(153, 153, 153));
        BotonSalir.setForeground(new java.awt.Color(60, 63, 65));
        BotonSalir.setText("Salir Programa");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        Texto1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        Texto1.setForeground(new java.awt.Color(204, 204, 204));
        Texto1.setText("¡Bienvenido al Programa!");

        Texto2.setForeground(new java.awt.Color(204, 204, 204));
        Texto2.setText("Introduzca su usuario:");

        CampoUsuario.setBackground(new java.awt.Color(204, 204, 204));

        Texto3.setForeground(new java.awt.Color(204, 204, 204));
        Texto3.setText("Introduzca contraseña:");

        CampoContrasenia.setBackground(new java.awt.Color(204, 204, 204));

        Registro.setBackground(new java.awt.Color(153, 153, 153));
        Registro.setForeground(new java.awt.Color(60, 63, 65));
        Registro.setText("Registrarse");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(190, 190, 190)
                        .addComponent(BotonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Texto1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(126, 126, 126))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Texto3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoUsuario)
                                    .addComponent(CampoContrasenia))))))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(Texto1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto2)
                    .addComponent(CampoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto3)
                    .addComponent(CampoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(Registro)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed

        //Inicio de sesión
        //Cogemos el texto introducido en las variables Usuario y Contrasenia
        String Usuario = CampoUsuario.getText();
        var userPWord = CampoContrasenia.getPassword();
        String Contrasenia = String.valueOf(userPWord);
        
        //Si el usuario y contraseña coinciden se abre el menu principal con la posición null
        if (Usuario.equals(user) && Contrasenia.equals(pswrd)) {
            MenuPrincipal mp = new MenuPrincipal(this, true);
            mp.setVisible(true);
            mp.setLocationRelativeTo(null);
        } else {
            //Si no, Mensaje de error.
            JOptionPane.showMessageDialog(null, "Si aún no tiene una cuenta registrese.");

        }


    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        //Llamamos al metodo SaliendoPrograma de Logica
        log.SaliendoPrograma(); //Salimos del programa
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        CreacionUsuario();

    }//GEN-LAST:event_RegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JPasswordField CampoContrasenia;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JButton Registro;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    // End of variables declaration//GEN-END:variables

    public void CreacionUsuario() {
        //Para el  registro con dos inputs para crear tu cuenta y contraseña

        user = JOptionPane.showInputDialog(null, "Introduzca el Usuario");
        pswrd = JOptionPane.showInputDialog(null, "Introduzca la contraseña");
    }

    public class ImagenFondo extends JPanel {// IMAGEN

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            //Con ImageIcon introducimos la imagen pasandole la ruta de la imagen con .getResource y con .getImage()
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoPantalla.jpg")).getImage();
            //Introducimos con drawImage la imagen dandole la ruta,altura,anchura, etc como será introducida.
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            //Si no ponemos el setOpaque a false la imagen no aparecerá
            setOpaque(false);
            //por ultimo la dibujamos
            super.paint(g);
        }
    }
}
