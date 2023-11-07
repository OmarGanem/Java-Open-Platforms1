/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.marisqueria;

import java.util.Scanner;

/**
 *
 * @author ogane
 * date 1/oct/23
 */
public class Marisqueria {

    public static void main(String[] args) {
          // Creación de un arreglo de platillos
        try (Scanner scanner = new Scanner(System.in)) {
            // Creación de un arreglo de platillos
            Platillo[] menu = new Platillo[3];
            menu[0] = new Platillo("Ceviche de camarones", "Delicioso ceviche de camarones frescos directos del golfo de Mazatlan", 250.99);
            menu[1] = new Platillo("Paella de mariscos", "Paella tradicional con una variedad gran variedad de mariscos", 150.99);
            menu[2] = new Platillo("Salmón a la parrilla", "Salmón fresco a la parrilla con verduras", 180.99);
            
            
            // Mostrar el menú
            System.out.println("Marisquería EL CAPITAN:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println("\nPlatillo " + (i + 1) + ":");
                menu[i].mostrarInformacion();
            }
            
        // Solicitar al usuario que seleccione un platillo
            System.out.print("\nSeleccione el número de un platillo (1-" + menu.length + "): ");
            int seleccion = scanner.nextInt();
            

        // Verificar la selección del usuario y calcular el precio con descuento
            if (seleccion >= 1 && seleccion <= menu.length) {
                System.out.print("Ingrese el descuento (%) que desea aplicar: ");
                double descuento = scanner.nextDouble();
                
                if (descuento >= 0 && descuento <= 100) {
                    double precioConDescuento = menu[seleccion - 1].calcularPrecioConDescuento(descuento);
                    System.out.println("Precio con " + descuento + "% de descuento: $" + precioConDescuento);
                } else {
                    System.out.println("Descuento no válido.");
                }
            } else {
                System.out.println("Selección no válida.");
            }
            // Cerrar el scanner
        }
    }
}
