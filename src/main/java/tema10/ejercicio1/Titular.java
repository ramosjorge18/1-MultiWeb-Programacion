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
public class Titular {
    private String nombre;
    private String apellidos;
    private byte edad;

    public Titular(String nombre, String apellidos, byte edad) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
    }

    public Titular() {
        this("Desconocido", "Sin Apellidos", (byte)0);
    }

    @Override
    public String toString() {
        return "Nombre Completo: " + nombre +" "+ apellidos + "\t Edad:" + edad;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public byte getEdad() {
        return edad;
    }
    
    
    
}
