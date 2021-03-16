/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio2;

import java.util.GregorianCalendar;

/**
 *
 * @author Vespertino
 */
public class Run {
    public static void main(String[] args) {
        GregorianCalendar date1 = new GregorianCalendar(2020, 3, 17);
        GregorianCalendar date2 = new GregorianCalendar(2020, 3, 18);       
        Nif a = new Nif(16639231);
        Persona jorge = new Persona(a, "Jorge", "Ramos", "Carol");
        Velero v = new Velero((byte)5, "La Santa", (short) 12, (short) 2012);
        EmbarcacionDeportiva e = new EmbarcacionDeportiva(120, "La Pinta",(short) 26,(short) 2018);
        Yate y = new Yate(400, 19, "Bormabon",(short) 530,(short) 2020);
        Alquiler x1 = new Alquiler(jorge, v, (short)1, date1, date2);
        Alquiler x2 = new Alquiler(jorge, e, (short)1, date1, date2);
        Alquiler x3 = new Alquiler(jorge, y, (short)1, date1, date2);
        
        System.out.println(x1.precioAlquiler());
        System.out.println(x2.precioAlquiler());
        System.out.println(x3.precioAlquiler());
    }
    
}
