/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio4;

import javax.swing.JOptionPane;

/**
 *
 * @author ogane
 * 30/August/2023
 */
public class Laboratorio4 {

    public static void main(String[] args) 
    {
    String[] options = { "brownie", "pay", "pastel" };
    var dessert = JOptionPane.showOptionDialog(null, "Que postre?", "Elige uno:", 
                                                      0, 3, null, options, options[0]);
    if (dessert == 0) 
    {
      JOptionPane.showMessageDialog(null, "Elegiste el brownie!");
    }
    if (dessert == 1) 
    { 
      JOptionPane.showMessageDialog(null, "Elegiste el pay.");
    }
    if (dessert == 2) 
    { 
      JOptionPane.showMessageDialog(null, "Elegiste pastel!");
        
    }  
    }
}
