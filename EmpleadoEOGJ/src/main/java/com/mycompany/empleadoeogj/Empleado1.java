/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadoeogj;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 20/sept/23
 */
public class Empleado1 {
    
    // Atributos
    private String nombre, apellido, cargo;
    private int edad;
    private float salario;
    
    // Constructor por defecto
    public Empleado1() {
        // Inicializa los atributos en blanco o en cero
        this.nombre = "";
        this.apellido = "";
        this.cargo = "";
        this.edad = 0;
        this.salario = 0.0f;
    }

    // Métodos getter y setter (siempre son públicos)
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void registrar() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame tu información");
        System.out.println("Introduce tu nombre");
        nombre = entrada.nextLine();
        setNombre(nombre);
        System.out.println("Introduce tus apellidos");
        apellido = entrada.nextLine();
        setApellido(apellido);
        System.out.println("Introduce tu cargo");
        cargo = entrada.nextLine();
        setCargo(cargo);
        System.out.println("Introduce tu edad");
        edad = entrada.nextInt();
        setEdad(edad);
        System.out.println("Introduce tu salario");
        salario = entrada.nextFloat();
        setSalario(salario);
    }
    
    public void mostrar() {
        System.out.println("Verifica tus datos");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellido());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
    }
}
