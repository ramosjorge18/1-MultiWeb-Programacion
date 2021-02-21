/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio5;

/**
 *
 * @author pcbox
 */
public class Run {
    public static void main(String[] args) {
        Garaje p = new Garaje();
        Motor x = new Motor(150);
        Coche z = new Coche("BMW", "320i");
        Motor x2 = new Motor(120);
        Coche z2 = new Coche("Audi", "A3");
        
        z.setMotor(x);
        z2.setMotor(x2);
        
        p.aceptaCoche(z, "aceite");
        p.devuelveCoche();
        p.aceptaCoche(z2, "Ruedas");
        p.aceptaCoche(z2, "aceite");
        p.devuelveCoche();
        p.aceptaCoche(z, "luces");
        p.devuelveCoche();
        System.out.println(p.toString());
        
        System.out.println(z.toString());
        System.out.println(z2.toString());
        
    }
    
}
