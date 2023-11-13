/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciamultipleejemplo;

/**
 *
 * @author ogane
 * Date 12/11/23
 */
// Definición de la primera interfaz
interface PrimeraInterfaz {
    void metodoPrimero();
}

// Definición de la segunda interfaz
interface SegundaInterfaz {
    void metodoSegundo();
}

// Clase que implementa ambas interfaces, simulando herencia múltiple
class ClaseDerivada implements PrimeraInterfaz, SegundaInterfaz {
    @Override
    public void metodoPrimero() {
        System.out.println("Implementación del método de la primera interfaz");
    }

    @Override
    public void metodoSegundo() {
        System.out.println("Implementación del método de la segunda interfaz");
    }

    // Puedes agregar métodos propios de esta clase
    void metodoPropio() {
        System.out.println("Método propio de la clase derivada");
    }
}