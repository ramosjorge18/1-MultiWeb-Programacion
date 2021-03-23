/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio2;

import misobjetos.*;
import tema10.ejercicio4.Nif;

/**
 *
 * @author ramosjorge18
 */
public class Persona implements Comparable<Object> {
    // Atributos de la persona
    private byte edad;
    private short altura;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Nif dni;
    
    
    //Constructores 
    public Persona(Nif dni, String nombre, String apellido1, String apellido2, byte edad, short altura){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.altura=altura;
    }
    
    public Persona(Nif dni, String nombre, String apellido1, String apellido2){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
    }
    
    public Persona(Nif dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    
    
    //Metodos
    public Nif getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public byte getEdad(){
        return edad;
    }
    
    public short getAltura(){
        return altura;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }
    
    public String getnombreCompleto(){
        return nombre+" "+apellido1+" "+apellido2;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", altura=" + altura + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + '}';
    }

    @Override
    public int compareTo(Object arg0) {
        Persona aux = (Persona) arg0;
        return (int) (this.dni.getNif()-aux.dni.getNif());
    }
    
}
