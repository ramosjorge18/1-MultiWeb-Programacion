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
public class EmpleadoHoras extends Empleado{
    private double precioHora;
    private double horasMes;

    public EmpleadoHoras(double precioHora, double horasMes, Nif nif, String nombre, byte edad) {
        super(nif, nombre, edad);
        this.precioHora = precioHora;
        this.horasMes = horasMes;
    }

    public void setHorasMes(double horasMes) {
        this.horasMes = horasMes;
    }
    
    
    
    @Override
    public double calculaSueldo() {
        return sueldoInter+(horasMes*precioHora);
    }
    
    @Override
    public String toString() {
        return super.toString()+"\tSueldo: "+calculaSueldo();
    }
    
}
