/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio4;

/**
 *
 * @author pcbox
 */
public class Run {
    public static void main(String[] args) {
        Instituto pep = new Instituto();
        System.out.println(pep.toString());
        System.out.println(pep.consultaAlumno(12));
    }
    
}
