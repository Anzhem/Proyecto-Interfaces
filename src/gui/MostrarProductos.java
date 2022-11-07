
package gui;

import LogicaNegocio.Logica;
import dto.Productos;
import gui.TableModel.ProductosTableModel;
import java.awt.Graphics;
import java.awt.Image;
import java.util.*;
import javax.swing.*;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class MostrarProductos extends javax.swing.JDialog {

    //Colocamos imagen el estilo de la tabla el posicionamiento del gui y el icono
    ImagenFondo imagen = new ImagenFondo();
    private TableRowSorter<ProductosTableModel> sorter;
    public MostrarProductos(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        this.setContentPane(imagen);
        initComponents();
        this.setLocationRelativeTo(null);
        TablaMostrarProductos.setModel(new ProductosTableModel(Logica.getListaProductos()));
        filtro();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Overwatch.png")).getImage());
    }
    private void filtro(){
        //Creamos el filtro
        ProductosTableModel ptm = new ProductosTableModel(Logica.getListaProductos());
        TablaMostrarProductos.setModel(ptm);
        
        sorter = new TableRowSorter<>(ptm);
        TablaMostrarProductos.setRowSorter(sorter);
        
        List<SortKey>sortKeys=new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }
    
   
// Otra forma de realizar la tabla    
//    private void llamartabla(){
//        
//        DefaultTableModel modelo = new DefaultTableModel();
//        modelo.setColumnIdentifiers(new String[]{"Nombre","ID","Precio","Stock","Fecha"});
//        
//        List<Productos> listaProductos = Logica.getListaProductos();
//        for (Productos vuelta : listaProductos){
//            modelo.addRow(vuelta.toArrayString());
//        }
//        TablaMostrarProductos.setModel(modelo);
//        
//                
//        
//    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMostrarProductos = new javax.swing.JTable();
        BotonCerrar = new javax.swing.JButton();
        TextFiltro = new javax.swing.JTextField();
        BotonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaMostrarProductos.setBackground(new java.awt.Color(153, 153, 153));
        TablaMostrarProductos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        TablaMostrarProductos.setForeground(new java.awt.Color(60, 63, 65));
        TablaMostrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "ID", "Precio", "Stock", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaMostrarProductos);

        BotonCerrar.setBackground(new java.awt.Color(153, 153, 153));
        BotonCerrar.setForeground(new java.awt.Color(60, 63, 65));
        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonFiltrar.setText("Filtrar");
        BotonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonFiltrar)
                .addGap(18, 18, 18)
                .addComponent(TextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFiltrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BotonCerrar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        //Se cierra el panel
        this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFiltrarActionPerformed
        //Al darle realiza el filtro
        RowFilter<ProductosTableModel,Integer> rf = RowFilter.regexFilter(TextFiltro.getText(), 0);
        sorter.setRowFilter(rf);
        
    }//GEN-LAST:event_BotonFiltrarActionPerformed


    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarProductos dialog = new MostrarProductos(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonFiltrar;
    private javax.swing.JTable TablaMostrarProductos;
    private javax.swing.JTextField TextFiltro;
    private javax.swing.JScrollPane jScrollPane1;
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
