/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciamultipleejemplo;

/**
 *
 * @author ogane
 * Date 12/11/23
 */
public class HerenciaMultipleEjemplo {
    public static void main(String[] args) {
        // Crear una instancia de la clase derivada
        ClaseDerivada instancia = new ClaseDerivada();

        // Llamar a los métodos de las interfaces
        instancia.metodoPrimero();
        instancia.metodoSegundo();

        // Llamar al método propio de la clase derivada
        instancia.metodoPropio();
    }
}
