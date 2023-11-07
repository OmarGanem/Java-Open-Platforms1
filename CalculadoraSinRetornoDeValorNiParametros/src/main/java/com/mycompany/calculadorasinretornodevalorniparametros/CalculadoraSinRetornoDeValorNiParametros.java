/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorasinretornodevalorniparametros;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 26/sept/232
 */
public class CalculadoraSinRetornoDeValorNiParametros {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Calcular porcentaje");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calculadora.sumar();
                    break;
                case 2:
                    calculadora.restar();
                    break;
                case 3:
                    calculadora.multiplicar();
                    break;
                case 4:
                    calculadora.dividir();
                    break;
                case 5:
                    calculadora.calcularPorcentaje();
                    break;
                case 6:
                    System.out.println("Adios");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
