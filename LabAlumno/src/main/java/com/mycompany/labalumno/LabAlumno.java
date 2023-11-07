/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labalumno;

/**
 *
 * @author ogane
 * date 18/sept/2023
 */
public class LabAlumno {
    //Miembros de la clase
    //Atributos 
    private String nombre;
    private int edad;
    private float promedio;
    
    //Metodos
    /*Aqui utilizamos constructor por defecto
    porque no lo definimos*/
    
    public static void main(String[] args) {
        //Instanciando la clase
        LabAlumno alu= new LabAlumno();
        LabAlumno alu2= new LabAlumno();
            alu.nombre="Omar";
            alu.edad=19;
            alu.promedio=8.4f;
            alu2.nombre="Sergio";
            alu2.edad=20;
            alu2.promedio=5.4f;
            
            
            System.out.println("Tu nombre es ; " +alu.nombre);
            System.out.println("Tu edad es ; " +alu.edad);
            System.out.println("Tu promedio es de ; " +alu.promedio);
            System.out.println("Tu nombre es ; " +alu2.nombre);
            System.out.println("Tu edad es ; " +alu2.edad);
            System.out.println("Tu promedio es de ; " +alu2.promedio);
                    
    }
}
