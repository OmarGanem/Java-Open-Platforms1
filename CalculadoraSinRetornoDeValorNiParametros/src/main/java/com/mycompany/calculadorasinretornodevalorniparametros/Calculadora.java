/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasinretornodevalorniparametros;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 26/sept/23
 */
public class Calculadora {
    public void sumar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Suma de dos números");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public void restar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Resta de dos números");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public void multiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplicación de dos números");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public void dividir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("División de dos números");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por 0.");
        }
    }

    public void calcularPorcentaje() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo de porcentaje");
        System.out.print("Ingrese el número: ");
        double num = scanner.nextDouble();
        System.out.print("Ingrese el porcentaje: ");
        double porcentaje = scanner.nextDouble();

        double resultado = (num * porcentaje) / 100.0;
        System.out.println("El resultado del porcentaje es: " + resultado);
    }
}
