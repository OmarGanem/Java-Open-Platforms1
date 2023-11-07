/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author ogane
 * date 23/oct/2023
 */
public class Principal {
    public static void main(String[] args) {
        Planta plan = new Planta();
        AnimalCarnivoro ac=new AnimalCarnivoro();
        AnimalHerbivoro ah=new AnimalHerbivoro();
        
        plan.alimentarse();
        ac.alimentarse();
        ah.alimentarse();
    }
}
