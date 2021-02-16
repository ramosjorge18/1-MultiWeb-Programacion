/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio2;

/**
 *
 * @author Vespertino
 */

public class Run {
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setNombre("Jorge");
        p.setApellido1("Ramos");
        p.setApellido2("Carol");
        p.setEdad((byte)25);
        p.setNumero(16639231);
        
        p.datosPersona();
        
    }
    
}
