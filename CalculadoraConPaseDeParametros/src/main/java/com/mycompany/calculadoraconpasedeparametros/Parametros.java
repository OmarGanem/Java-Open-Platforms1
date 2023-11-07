/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraconpasedeparametros;

/**
 *
 * @author ogane
 * date 25/sept/23
 */
public class Parametros {
    float suma, resta, multiplicacion, division, modulo;
    public void sumar(float num1, float num2) {
        suma=num1+num2;
    }
    public void restar(float num1, float num2){
        resta=num1-num2;
    }
    public void multiplicar(float num1, float num2){
        multiplicacion=num1+num2;
    }
    public void dividir(float num1, float num2){
        division=num1/num2;
    }
    public void modulo(float num1, float num2){
        modulo=num1%num2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El porcentaje es: "+modulo);
    }
}
