/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio4;

import java.util.GregorianCalendar;

/**
 *
 * @author J.Ramos
 */
public class EmpleadoTemporal extends Empleado {
    private GregorianCalendar fechaAlta;
    private GregorianCalendar fechaBaja;

    public EmpleadoTemporal(GregorianCalendar fechaAlta, GregorianCalendar fechaBaja, Nif nif, String nombre, byte edad) {
        super(nif, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }
    
    @Override
    public double calculaSueldo() {
        return Empleado.sueldoInter;
    }

    @Override
    public String toString() {
        return super.toString()+"\tSueldo: "+calculaSueldo();
    }
    
    
    
    
    
}
