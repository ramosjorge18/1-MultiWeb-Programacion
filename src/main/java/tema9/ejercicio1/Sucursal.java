/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio1;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Vespertino
 */
public class Sucursal {
    
    private int nSucursal;
    private String direccion;
    private HashSet<CuentaCorriente> cuentas;
    
    public Sucursal(int numero, String calle){
        nSucursal = numero;
        direccion = calle;
        cuentas = new HashSet();
    }
    public void añadeCuenta(CuentaCorriente cuenta){
        cuentas.add(cuenta);
    }
    
    public void listado (){
        Iterator punt = cuentas.iterator();
        CuentaCorriente p;
        while(punt.hasNext()){
            p = (CuentaCorriente) punt.next();
            System.out.println("El DNI es: "+p.getDni());
            System.out.println("El Usuario es: "+p.getUsuario());
            System.out.println("El Saldo es: "+p.getSaldo()); 
            System.out.println("");
            
        }
        
    }
    
    
}
