/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointerfaces;

/**
 *
 * @author ogane
 * date 08/11/2023
 */
public class Circulo implements Figura {
    private float diametro;
    public Circulo(float diametro) {
        this.diametro=diametro;
    }
    
    @Override
    public float area() {
        return (PI*diametro*diametro/4f);
    }
}
