/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Productos {

    private String Nombre;
    private String ID;
    private String Precio;
    private Integer Stock;
    private Date Fecha;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Productos(String Nombre, String ID, String Precio, Integer Stock, Date Fecha) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(Integer Stock) {
        this.Stock = Stock;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String[] toArrayString() {
        String[] s = new String[5];

        s[0] = Nombre;
        s[1] = ID;
        s[2] = Precio.toString();
        s[3] = Stock.toString();
        s[4] = sdf.format(Fecha);
        return s;
    }

}
