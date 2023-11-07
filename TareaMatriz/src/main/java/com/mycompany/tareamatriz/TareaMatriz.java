/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamatriz;

import java.util.Scanner;

/**
 *
 * @author ogane
 */
public class TareaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el número de filas y columnas
        System.out.print("Ingrese el número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = sc.nextInt();

        // Declarar la matriz
        int[][] matriz = new int[filas][columnas];

        // Solicitar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el elemento en la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz ingresada:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // Cerrar el scanner
        sc.close();
    }   
}
