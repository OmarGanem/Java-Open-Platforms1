/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglodeobjetos;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date oct/11/23
 */
public class ArregloDeObjetos {

    public static void main(String[] args) {
    Scanner dato = new Scanner (System.in);
    String nombre, carrera;
    int semestre;
    float promedio;
        Alumno arreglo[] = new Alumno[3];

        System.out.println("=== Registro de Alumnos ===");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("REGISTRO #" + (i + 1));
            System.out.print("Nombre: ");
            nombre = dato.nextLine();
            System.out.print("Carrera: ");
            carrera = dato.nextLine();
            System.out.print("Semestre: ");
            semestre = dato.nextInt();
            System.out.print("Promedio: ");
            promedio = dato.nextFloat();
            dato.nextLine();

            arreglo[i] = new Alumno(nombre, carrera, semestre, promedio);
        }
    }
}
