/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacion.de.cadenas;

/**
 *
 * @author ogane
 * date 11/oct/2023
 */
public class ManipulacionDeCadenas {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        String cadena = "Ejemplo de cadena para manipular";

        System.out.println("Longitud de la cadena: " + obtenerLongitudCadena(cadena));
        System.out.println("Cadena invertida: " + invertirCadena(cadena));
        System.out.println("Número de vocales: " + contarVocales(cadena));
        System.out.println("Cadena en mayúsculas: " + convertirMayusculas(cadena));
        System.out.println("Cadena sin espacios: " + eliminarEspacios(cadena));
    }

    // Método para obtener la longitud de la cadena
    public static int obtenerLongitudCadena(String cadena) {
        return cadena.length();
    }

    // Método para invertir una cadena
    public static String invertirCadena(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    // Método para contar vocales en una cadena
    public static int contarVocales(String cadena) {
        int count = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Método para convertir la cadena a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método para eliminar espacios en blanco de una cadena
    public static String eliminarEspacios(String cadena) {
        return cadena.replace(" ", "");
    }
    }
    
