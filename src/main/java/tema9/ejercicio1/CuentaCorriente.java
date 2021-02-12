/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio1;

import com.github.javafaker.IdNumber;

/**
 *
 * @author Vespertino
 */
public class CuentaCorriente {
    
    private double saldo;
    private double limiteDescubierto;
    private String nombre;
    private String dni;
    
    public CuentaCorriente(String usuario, String nif){
        saldo= 0;
        limiteDescubierto = -50;
        dni = nif;
        nombre = usuario;
    }
    public CuentaCorriente(Double dinero){
        saldo= dinero;
        limiteDescubierto = 0;
        dni = "";
        nombre = "";
    }
    public CuentaCorriente(String nif, double dinero, double limite){
        saldo= dinero;
        limiteDescubierto = limite;
        dni = nif;
        nombre = "SIN NOMBRE";
    }
    public CuentaCorriente(String usuario, String nif, double dinero){
        saldo= dinero;
        limiteDescubierto = -100;
        dni = nif;
        nombre = usuario;
    }
    
    
    public double getSaldo(){
        return saldo;
    }
    
    public boolean reintegro(double dinero){
        while(saldo-dinero>-50){
            saldo = saldo - dinero;
            return true;
        }
        return false;    
    }
    
    public void ingreso(double dinero){
        saldo = saldo + dinero;
    }
    
    public String getDni (){
        return dni;
    }
    
    public String getUsuario (){
        return nombre;
    }
    
}
