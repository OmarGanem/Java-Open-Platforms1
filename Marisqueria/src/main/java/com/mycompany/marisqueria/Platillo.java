/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marisqueria;

/**
 *
 * @author ogane
 * date 1/oct/23
 */
public class Platillo {
        private final String nombre;
    private final String descripcion;
    private double precio;

    // Constructor
    public Platillo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Método sin parámetros y sin retorno
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: $" + precio);
    }

    // Método con parámetros
    public void modificarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // Método con parámetros y retorno de valor
    public double calcularPrecioConDescuento(double descuento) {
        return precio - (precio * (descuento / 100.0));
    }

    // Sobrecarga de método
    public void modificarPrecio(int nuevoPrecio) {
        this.precio = (double) nuevoPrecio;
    }
}
