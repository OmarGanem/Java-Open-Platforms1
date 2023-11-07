/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringslab;

/**
 *
 * @author ogane
 * date 9/oct/23
 */
public class StringsLab {

    public static void main(String[] args) {
        //metodos que manipulan cadenas
        
        //longitud de una cadena
        String nombre="Edgar Omar Ganem";
        int longitud;
        longitud= nombre.length();
        System.out.println("Mi nombre es: "+ nombre +" y tiene "+longitud+" caracteres");
        
        
        //posicion de un caracter dentro de una cadena
        String cadena= "Programacion orientada a objetos";
        char letra = cadena.charAt(0);
        System.out.println("El primer caracter de la cadena es: "+letra);
        
        
        //extrae una subcadena dentro de una cadena
        String subCadena = nombre.substring(0, 16);
        System.out.println("La subcadena es: "+subCadena);
        
        //compara dos cadenas 
        String nombre1 = "Edgar Omar Ganem";
        boolean esIgual = nombre.equals(nombre1);
        if (esIgual = true)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");
        
        //compara dos cadenas sin distinguir mayusculas de minusculas
        String nombre2 = "Edgar omar ganem";
        boolean compra = nombre.equalsIgnoreCase(nombre2);
        if (compra == true)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("Las cadenas son diferentes");
    }
}
