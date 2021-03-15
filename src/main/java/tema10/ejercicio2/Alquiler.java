/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio2;

import java.util.GregorianCalendar;

/**
 *
 * @author Vespertino
 */
public class Alquiler {
    private int precioDia;
    private Persona cliente;
    private Barco barco;
    private short posicionAmarre;
    private GregorianCalendar fechaIni;
    private GregorianCalendar fechaFin;

    public Alquiler(Persona cliente, Barco barco, short posicionAmarre, GregorianCalendar fechaIni, GregorianCalendar fechaFin) {
        this.cliente = cliente;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precioDia=2;
    }
    
    public double precioAlquiler(){
        double precio;
        long dias;
        dias = fechaFin.getTimeInMillis()-fechaIni.getTimeInMillis();
        dias = dias/(1000*60*60*24);        
        precio=dias*(barco.precioAlquiler()*precioDia); 
        return precio;
    }
    
}
