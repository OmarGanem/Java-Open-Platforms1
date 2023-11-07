/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconretornodevalor;

import java.util.Scanner;

/**
 *
 * @author ogane
 * 26/sept/23
 */
public class CalculadoraConRetornoDeValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora simple");
        System.out.print("Ingrese el primer número: ");
        double num1 = validarEntrada(scanner);
        System.out.print("Ingrese el segundo número: ");
        double num2 = validarEntrada(scanner);

        double suma = calculadora.sumar(num1, num2);
        double resta = calculadora.restar(num1, num2);
        double multiplicacion = calculadora.multiplicar(num1, num2);
        double division = calculadora.dividir(num1, num2);
        double porcentaje = calculadora.calcularPorcentaje(num1, 20.0);

        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Porcentaje: " + porcentaje);

        scanner.close();
    }

    public static double validarEntrada(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada no válida. Ingrese un número válido: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
        
}
