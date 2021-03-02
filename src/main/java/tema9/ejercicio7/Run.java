/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio7;

/**
 *
 * @author pcbox
 */
public class Run {
    public static void main(String[] args) {
        Reloj a = new Reloj((byte)24,(byte) 59,(byte) 59);
        Reloj b = a.copia();
        System.out.println(a.aSegundos());
        System.out.println(a.equals(b));
       // b.anterior(1900);
        System.out.println(a.equals(b));
        System.out.println(a.mayorQue(b));
        System.out.println(a);
        a.anterior(15000);
        System.out.println(a);
        a.siguiente(150);
        System.out.println(a);
    }
}
