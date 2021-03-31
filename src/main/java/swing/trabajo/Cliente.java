/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

import java.util.Comparator;

/**
 *
 * @author Vespertino
 */
public class Cliente implements Comparable<Object>{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Nif dni;
    private byte edad;
    private float saldo;

    public Cliente(String nombre, String apellido1, Nif dni, byte edad, float saldo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.edad = edad;
        this.saldo=saldo;
        this.apellido2 ="";
    }

    public Nif getDni() {
        return dni;
    }

    public byte getEdad() {
        return edad;
    }

    public float getSaldo() {
        return saldo;
    }
    

    @Override
    public String toString() {
        return "Nombre Completo= " + nombre +" " + apellido1 + "\t" + dni + "\t edad: "+getEdad()+ " Saldo: "+getSaldo();
    }
    
    @Override
    public int compareTo(Object arg0) {
        Cliente aux = (Cliente) arg0;
        return (int) (this.getDni().getNif()-aux.getDni().getNif());
    }

    
    
}
