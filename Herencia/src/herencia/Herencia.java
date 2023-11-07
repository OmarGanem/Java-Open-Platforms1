/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author ogane
 */
public class Herencia {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes que desea capturar: ");
        int numEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Estudiante[] estudiantes = new Estudiante[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Capturando información del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Clave: ");
            int clave = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Promedio: ");
            float promedio = scanner.nextFloat();
            scanner.nextLine(); // Consumir el salto de línea

            estudiantes[i] = new Estudiante(nombre, apellido, edad, clave, promedio);
        }

        System.out.println("V E R I F I C A N D O   D A T O S");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarDatos();
        }
    }

    }
    

