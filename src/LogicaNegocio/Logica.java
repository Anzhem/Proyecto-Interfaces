/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import dto.Productos;
import gui.IntroducirProductos;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author diort
 */
public class Logica {

    private static List<Productos> listaProductos = new ArrayList<>();

    public static void aniadirProducto(Productos Producto) {
        listaProductos.add(Producto);
    }

    public static List<Productos> getListaProductos() {
        return listaProductos;
    }

    public static boolean esNumero(String s) {
        try {
            Float.parseFloat(s);
        } catch (NumberFormatException ex) {
            
            return false;
        }
        return true;
    }

    public void SaliendoPrograma() {
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea Salir del programa?");

        if (JOptionPane.OK_OPTION == confirmado) {
            System.exit(0);
        } else {

        }
    }

}
