/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio1;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        PilaArray a = new PilaArray(4);
        a.crear();
        a.apilar(12);
        a.apilar(16);
        a.apilar(21);
        a.apilar(18);
        System.out.println(a.cima());
        System.out.println(a.desapilar());
        System.out.println(a.cima());
        System.out.println(a.vacia());
        a.borra();
        System.out.println(a.vacia());
    }
    
}
