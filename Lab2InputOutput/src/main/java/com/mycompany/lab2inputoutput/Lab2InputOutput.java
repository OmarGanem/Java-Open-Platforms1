/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2inputoutput;
import java.util.Scanner;

/**
 *
 * @author ogane
 * Aug/28/2023
 */
public class Lab2InputOutput {   

    public static void main(String[] args) {
    int num1, num2, add, sub, mult;
    float devide;
    Scanner scanner = new Scanner(System.in);//para leer los numeros

    System.out.print("ingresa 2 numeros : "); //lee los numeros
    num1 = scanner.nextInt();
    num2 = scanner.nextInt();

    add = num1 + num2; //aqui se suma resta divide y multiplica
    sub = num1 - num2;
    mult = num1 * num2;
    devide = (float) num1 / num2;

    System.out.println("Suma = " + add);
    System.out.println("resta = " + sub);
    System.out.println("multiplicacion = " + mult);
    System.out.println("division = " + devide);
    }
}
