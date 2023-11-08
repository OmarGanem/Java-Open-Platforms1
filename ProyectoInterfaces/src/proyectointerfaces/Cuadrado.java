/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointerfaces;

/**
 *
 * @author ogane
 * 08/11/2023
 */
public class Cuadrado implements Figura {
    private float lado;
    public Cuadrado(float lado) {
        this.lado=lado;
    }
    
    @Override
    public float area() {
        return lado*lado;
    }
}
