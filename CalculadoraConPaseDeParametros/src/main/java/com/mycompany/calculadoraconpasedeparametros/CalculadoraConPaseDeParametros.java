/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraconpasedeparametros;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 25/sept/2023
 */
public class CalculadoraConPaseDeParametros {

    public static void main(String[] args) {
        float n1, n2;
        Scanner dato=new Scanner(System.in);
        System.out.println("\nTeclea un numero: ");
        n1= dato.nextInt();
        System.out.println("Teclea el segundo numero: ");
        n2= dato.nextInt();
        
        Parametros obj1=new Parametros();
        obj1.sumar(n1, n2);
        obj1.restar(n1, n2);
        obj1.multiplicar(n1, n2);
        obj1.dividir(n1, n2);
        obj1.modulo(n1, n2);
        
        obj1.mostrarResultados();
    }
}
