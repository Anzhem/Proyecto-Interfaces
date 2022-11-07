/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.TableModel;

import dto.Productos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author diort
 */
public class ProductosTableModel extends AbstractTableModel{
    private List <Productos> listaProducto;
    private String[] columnas= {"Nombre","ID","Precio","Stock","Fecha"};
    
    public ProductosTableModel(List<Productos>listaProducto){
        this.listaProducto = listaProducto;
    }
    @Override
    public int getRowCount() {
        return listaProducto.size();
        
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }
    /*private String Nombre;
    private String ID;
    private String Precio;
    private Integer Stock;
    private Date Fecha;*/
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listaProducto.get(rowIndex).getNombre();
            case 1:
                return listaProducto.get(rowIndex).getID();
            case 2:
                return listaProducto.get(rowIndex).getPrecio();
            case 3:
                return listaProducto.get(rowIndex).getStock();
            case 4:
                return listaProducto.get(rowIndex).getFecha();
                        
                
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
}
