/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio1;

/**
 *
 * @author Vespertino
 */
public class Run {
    public static void main(String[] args) {
        Titular jorge = new Titular("Jorge", "Ramos Carol", (byte)25);
        NumeroDeCuenta a = new NumeroDeCuenta(2500, 0052, 02, 1569823540);
        NumeroDeCuenta b = new NumeroDeCuenta(2500, 0052, 02, 1569823540);
        CuentaAhorro primera = new CuentaAhorro(jorge, a);
        CuentaAhorro segunda = new CuentaAhorro(jorge, b);
        
        System.out.println(primera.toString());
        primera.ingresar(200);
        System.out.println(primera.toString());
        System.out.println(primera);
        System.out.println("Son iguales la primera cuenta y las segunda :     "+primera.equals(segunda));
        primera.reintegro(100);
        System.out.println(primera);
        primera.setInteres(2.5);
        primera.calcularInteres();
        System.out.println(primera);
    }
    
}
