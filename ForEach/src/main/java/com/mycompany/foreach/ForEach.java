/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foreach;

import java.util.Scanner;

/**
 *
 * @author ogane
 */
public class ForEach {

    public static void main(String[] args) {
        int ele;
        Scanner dato=new Scanner(System.in);
        System.out.println("Teclee el numero de elementos: ");
        ele=dato.nextInt();
        int[] num=new int [ele];
        //llenado de arreglo
        System.out.println("Proporcione los datos ");
        for(int i=0;i<ele;i++)
        {
            System.out.println("Elemento["+(i+1)+"]= ");
            num[i]=dato.nextInt();
        }
        //verificar que el arreglo esta lleno
        System.out.println("Datos almacenados en el arreglo");
        for(int i:num)
        {
            System.out.println(i);
        }
    }
}
