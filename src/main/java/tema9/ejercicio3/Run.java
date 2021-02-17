/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio3;

import tema9.ejercicio1.PruebasSucursal;

/**
 *
 * @author pcbox
 */
public class Run {
    public static void main(String[] args) {
        Racional prueba = new Racional(2, 4);
        Racional prueba2;
        Racional resultado;
        
        
        prueba.muestraFraccion();
        prueba2 = prueba.copiaFraccion();
        System.out.println(prueba.equals(prueba2));
        resultado = prueba.multiplicaFracciones(prueba2);
        resultado.muestraFraccion();
        resultado = prueba.divideFracciones(resultado);
        resultado.muestraFraccion();
        resultado = resultado.restaFracciones(prueba);
        resultado.muestraFraccion();
    }
    
}
