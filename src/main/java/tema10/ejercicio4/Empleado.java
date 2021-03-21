/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio4;

/**
 *
 * @author J.Ramos
 */
public abstract class Empleado {
    static final double sueldoInter = 950;
    private Nif nif;
    private String nombre;
    private byte edad;

    public Empleado(Nif nif, String nombre, byte edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    @Override
    public String toString() {
        return "Empleado: "+nombre+" \t DNI: "+nif+ "\t Años: "+edad;
    }
    public abstract double calculaSueldo();
}
