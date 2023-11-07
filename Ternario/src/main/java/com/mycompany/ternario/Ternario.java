/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ternario;

import java.util.Scanner;

/**
 *
 * @author ogane
 * 11/sept/23
 */
public class Ternario {

    public static void main(String[] args) {
        int num1, num2, mayor;
        Scanner dato =new Scanner(System.in);
        System.out.println("t=== Comparacion de dos numeros ======");
        System.out.println("Dame el primero");
        num1=dato.nextInt();
        System.out.println("Dame el segundo numero");
        num2=dato.nextInt();
       /** if(num1>num2){    
        mayor=num1;
        }
        else{
        mayor=num2;
        } */
       mayor = (num1 > num2)? num1:num2;
       System.out.println("EL numero mayor es:" +mayor);
       
    }
}
