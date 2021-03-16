/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio2;

/**
 *
 * @author Vespertino
 */
public class Velero extends Barco {
    private byte numeroMastiles;

    public Velero(byte numeroMastiles, String matricula, short metrosEslora, short añoFabricacion) {
        super(matricula, metrosEslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }
    
    @Override
    public double precioAlquiler(){
        double precio;
        precio= (super.getMetrosEslora()%10*2) + (numeroMastiles*5);
        return precio;
    }

    
    
}
