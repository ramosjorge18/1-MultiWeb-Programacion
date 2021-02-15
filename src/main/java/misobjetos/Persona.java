/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misobjetos;

/**
 *
 * @author ramosjorge18
 */
public class Persona {
    // Atributos de la persona
    private byte edad;
    private short altura;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    
    
    //Constructores 
    public Persona(String dni, String nombre, String apellido1, String apellido2, byte edad, short altura){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.edad=edad;
        this.altura=altura;
    }
    
    public Persona(String dni, String nombre, String apellido1, String apellido2){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
    }
    
    public Persona(String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    
    
    //Metodos
    public String getDni(){
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
    
}
