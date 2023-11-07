/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareavotacion;
import java.util.Scanner;
/**
 *
 * @author ogane
 * date 12/sept/23
 */
public class TareaVotacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        String mensaje = (edad >= 18) ? "Puedes votar en las próximas elecciones." : "No puedes votar en las próximas elecciones.";

        System.out.println(mensaje);

        scanner.close();
    }
}

