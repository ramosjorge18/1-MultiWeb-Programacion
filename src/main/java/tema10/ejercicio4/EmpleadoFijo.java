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
public class EmpleadoFijo extends Empleado {
    private int complemeto;
    private GregorianCalendar fechaAlta;

    public EmpleadoFijo(GregorianCalendar fechaAlta, Nif nif, String nombre, byte edad) {
        super(nif, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.complemeto = 50;
    }

    public void setComplemeto(int complemeto) {
        this.complemeto = complemeto;
    }

    
    @Override
    public double calculaSueldo() {
        int años = 1;
        return sueldoInter+(complemeto*años);
    }

    @Override
    public String toString() {
        return super.toString()+"\tSueldo: "+calculaSueldo();
    }
    
    
    
    
}
