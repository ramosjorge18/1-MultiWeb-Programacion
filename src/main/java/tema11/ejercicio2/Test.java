/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio2;

import java.util.Iterator;
import java.util.TreeSet;
import tema10.ejercicio4.Nif;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Nif a1 = new Nif(11111);
        Nif b1 = new Nif(22222);
        Nif b2 = new Nif(33333);
        Persona a = new Persona(a1, "Jorge");
        Persona b = new Persona(b1, "Pepe");
        Persona c = new Persona(b2, "Lolo");
        TreeSet<Persona> d = new TreeSet();
        d.add(a);
        d.add(b);
        d.add(c);
        
        Iterator it;
        it = d.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
