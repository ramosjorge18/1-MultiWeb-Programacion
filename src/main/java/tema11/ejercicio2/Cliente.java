/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio2;

import tema10.ejercicio4.Nif;

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

    public Cliente(String nombre, String apellido1, Nif dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.edad = 0;
        this.saldo=0;
        this.apellido2 ="";
    }

    public Nif getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Nombre Completo= " + nombre +" " + apellido1 + "\t" + dni;
    }
    
    @Override
    public int compareTo(Object arg0) {
        Cliente aux = (Cliente) arg0;
        return (int) (this.getDni().getNif()-aux.getDni().getNif());
    }
    
    
}
