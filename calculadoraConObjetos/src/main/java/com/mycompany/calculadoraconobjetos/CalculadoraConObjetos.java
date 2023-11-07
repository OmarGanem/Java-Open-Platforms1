/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconobjetos;

import java.util.Scanner;


/**
 *
 * @author ogane
 * 26/sept/23
 */
public class CalculadoraConObjetos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        double suma = calculadora.sumar(num1, num2);
        double resta = calculadora.restar(num1, num2);
        double multiplicacion = calculadora.multiplicar(num1, num2);
        double division = calculadora.dividir(num1, num2);
        double porcentaje = calculadora.porcentaje(num1, num2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Porcentaje: " + porcentaje);

        scanner.close();
    }
}
    
