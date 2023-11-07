/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formasgeometricas;

/**
 *
 * @author ogane
 * date 22/oct/2023
 */
abstract class FormasGeometricas {
        public abstract double calcularArea();
}

// Clase para representar un cuadrado
class Cuadrado extends FormasGeometricas {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

// Clase para representar un círculo
class Circulo extends FormasGeometricas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5.0);
        Circulo circulo = new Circulo(3.0);

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}
