/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class MueveCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        CuentaCorriente cjorge = new CuentaCorriente("Jorge", "16639235-L");
        
        System.out.println("Tu saldo es: "+cjorge.getSaldo());
        System.out.print("cuento dinero deseas ingresar: ");
        cjorge.ingreso(sc.nextDouble());
        System.out.println("Tu saldo es: "+cjorge.getSaldo());
        System.out.print("cuento dinero deseas retirar: ");
        if(!cjorge.reintegro(sc.nextDouble())){
            System.out.println("No puedes realizar esta operacion");
        }
        System.out.println("Tu saldo es: "+cjorge.getSaldo());
        
        
    }
    
}
