/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 13/sept/23
 */
public class Arrays {

    public static void main(String[] args) {
        int[] num=new int[10];
        Scanner dato=new Scanner(System.in);
        //llenado del arreglo
        System.out.println("Proporcione los datos ");
        for(int i=0;i<10;i++)
        {
            System.out.println("Elemento ["+(i+1)+"]=");
            num[i]=dato.nextInt();
        }
        
        //verificar que el arreglo esta lleno
        for(int i=0;i<10;i++)
        {
            System.out.println("Elemento["+(i+1+"]=")+num[i]);
        }
    }
}
