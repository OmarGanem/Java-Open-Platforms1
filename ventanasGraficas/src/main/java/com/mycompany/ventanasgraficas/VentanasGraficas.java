/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventanasgraficas;

import javax.swing.JOptionPane;

/**
 *
 * @author ogane
 * August/28/2023
 */
public class VentanasGraficas {

    public static void main(String[] args) {
        String nombre;
        int edad;
        char sexo;
        float estatura;
        
               
        edad=Integer.parseInt(JOptionPane.showInputDialog("teclee su edad"));
        sexo=JOptionPane.showInputDialog("teclee su sexo").charAt(0);
        estatura=Float.parseFloat(JOptionPane.showInputDialog("teclee su estatura"));
        nombre =JOptionPane.showInputDialog("Teclee su nombre");
        JOptionPane.showMessageDialog(null,"Su nombre es :" +nombre);
        JOptionPane.showMessageDialog(null,"Su edad es :" +edad);
        JOptionPane.showMessageDialog(null,"Su sexo es :" +sexo);
        JOptionPane.showMessageDialog(null,"Su estatura es :" +estatura);
    }
}
