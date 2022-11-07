/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.TableModel;

import dto.Productos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

//Modelo de la tabla
public class ProductosTableModel extends AbstractTableModel{
    //Creamos una lista llamada listaProductos y un array de String
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
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                //En el index 0 meterá el nombre
                return listaProducto.get(rowIndex).getNombre();
            case 1:
                //En el index 1 meterá el ID
                return listaProducto.get(rowIndex).getID();
            case 2:
                //En el index 2 meterá el precio
                return listaProducto.get(rowIndex).getPrecio();
            case 3:
                //En el index 3 meterá el Stock
                return listaProducto.get(rowIndex).getStock();
            case 4:
                //En el index 4 meterá la Fecha
                return listaProducto.get(rowIndex).getFecha();
                        
                
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
}
