/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobreescritura;

/**
 *
 * @author ogane
 * date 18/oct/23
 */
public class Sobreescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona();
        Perro per = new Perro();
        Pajaro paj = new Pajaro();
        
        perso.comer();
        per.comer();
        paj.comer();
    }
    
}
