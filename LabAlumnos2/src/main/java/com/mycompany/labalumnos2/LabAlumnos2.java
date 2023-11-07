/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labalumnos2;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 18/sept/2023
 */
public class LabAlumnos2 {

    public static void main(String[] args) {
        
        
        Scanner entrada=new Scanner (System.in);
        String nom;
        int ed, opc;
        float prom;
        do{
        System.out.println("Deme su informacion");
        System.out.println("Introduzca su nombre");
        nom=entrada.nextLine();
        System.out.println("Introduzca su edad");
        ed=entrada.nextInt();
        System.out.println("introduce tu promedio");
        prom=entrada.nextFloat();
        Alumno1 alu=new Alumno1(nom, ed, prom);
        //Asignarle datos al objeto
        alu.setNombre(nom);
        alu.setEdad(ed);
        alu.setPromedio(prom);
        //Verificar la informacion
        System.out.println("verifica tus datos");
        System.out.println("Nombre: "+alu.getNombre());
        System.out.println("Edad: "+alu.getEdad());
        System.out.println("Promedio: "+alu.getPromedio());
        
        System.out.println("Si desea realizar otra vez la operacion presione 1");
        opc=entrada.nextInt();
        
        entrada.nextLine();
        
        }while (opc==1);
        
    }
}
