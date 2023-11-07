/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author ogane
 */
    public class Estudiante extends Persona 
{
    private int clave; 
    private float promedio;

    public Estudiante( String nombre, String apellido, int edad, int clave, float promedio ) {
        super(nombre, apellido, edad);
        this.clave = clave;
        this.promedio = promedio;
    }
    
    public void mostrarDatos()
    {
        System.out.println("nombre: " +getNombre() + "\n Apellido: " +getApellido() +"\n Edad:" + getEdad() +"\n Clave:" +clave + "\n Promedio:" +promedio);
    }

}
