/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labalumnos2;

/**
 *
 * @author ogane
 * date 18/sept/2023
 */
public class Alumno1 {
    //Atributos
    private String nombre;
    private int edad;
    private float promedio;
    
    //usamos contructor por defecto
    
    //metodos getter y setters(siempre son publicos)

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Alumno1(String nombre, int edad, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }
    

    
}
