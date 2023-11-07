/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraconretornodevalor;

/**
 *
 * @author ogane
 * date 26/sept/2023
 */
public class Calculadora {
 public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por 0.");
            return Double.NaN; // Retorna NaN (Not-a-Number) en caso de división por 0
        }
    }

    public double calcularPorcentaje(double num1, double porcentaje) {
        return (num1 * porcentaje) / 100.0;
    }
}