/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcula;

import java.util.Scanner;

/**
 *
 * @author ogane
 * 11/sept/23
 */
public class Calcula {

    public static void main(String[] args) {
        double num1=0, num2=0, resultado=0;
        int opcion;
        Scanner dato = new Scanner(System.in);
            System.out.println("t\t==== MINICALCULADORA =====");
            System.out.println("Teclee el primer numero: ");
            num1= dato.nextDouble();
            System.out.println("Teclee el segundo numero:");
            num2= dato.nextDouble();
            System.out.println("******************");
            System.out.println("1. \tSuma");
            System.out.println("2. \tResta");
            System.out.println("3. \tMultiplicacion");
            System.out.println("4. \tDivision");
            System.out.println("******************");
            System.out.println("\tSeleccione su opcion");
        opcion=dato.nextInt();
        switch(opcion){
            case 1:resultado=num1+num2;
                    System.out.println("La suma es: "+resultado);
                break;
            case 2:resultado=num1-num2;
                    System.out.println("La resta es: "+resultado);
                break;
            case 3:resultado=num1+num2;
                    System.out.println("La multiplicacion es "+resultado);
                break;
            case 4:if(num2==0){
                    System.out.println("No se puede dividir entre 0");
                }
                else {
                    resultado=num1/num2;
                    System.out.println("La division es: "+resultado);
                }
                break;
                    default:System.out.println("Opcion no valida");
                break;
            }
            
        
    }
}
