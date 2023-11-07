/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglodeobjetos;

/**
 *
 * @author ogane
 * dato 11/oct/23
 */
public class Alumno {
    private String nombre;
    private String carrera;
    private int semestre;
    private float promedio;

    public Alumno(String nombre, String carrera, int semestre, float promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public float getPromedio() {
        return promedio;
    }
}
