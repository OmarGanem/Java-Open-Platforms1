/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointerfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ogane
 * date 08/11/2023
 */
public class ProyectoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura cuad1 = new Cuadrado (3.5f);
        Figura cuad2 = new Cuadrado (2.2f);
        Figura cuad3 = new Cuadrado (8.9f);
        
        Figura circ1 = new Circulo (3.5f);
        Figura circ2 = new Circulo (4f);
        
        Figura rec1 = new Rectangulo (5.2f);
        Figura rec2 = new Rectangulo (1.6f);
        
        List <Figura> serieDeFiguras = new ArrayList <Figura> ();
        serieDeFiguras.add (cuad1);
        serieDeFiguras.add (cuad2);
        serieDeFiguras.add (cuad3);
        
        serieDeFiguras.add (circ1);
        serieDeFiguras.add (circ2);
        float areaTotal = 0;
        
        for (Figura tmp: serieDeFiguras) {
            areaTotal = areaTotal + tmp.area();
        }
        System.out.println ("Tenemos un total de " + serieDeFiguras.size() + " figuras y su area total es de " + areaTotal + "unidades cuadradas" );
    }
    
}
