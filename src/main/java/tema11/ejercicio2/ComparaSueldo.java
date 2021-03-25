/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio2;

import java.util.Comparator;

/**
 *
 * @author Vespertino
 */
public class ComparaSueldo implements Comparator {

    @Override
    public int compare(Object arg0, Object arg1) {
        Cliente aux = (Cliente) arg0;
        Cliente aux2 = (Cliente) arg1;
        return (int) (aux.getSaldo()- aux2.getSaldo());
    }
    
    
    
}
