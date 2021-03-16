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
public class Yate extends Barco{
    private int cv;
    private int camarotes;

    public Yate(int cv, int camarotes, String matricula, short metrosEslora, short añoFabricacion) {
        super(matricula, metrosEslora, añoFabricacion);
        this.cv = cv;
        this.camarotes = camarotes;
    }
    
    @Override
    public double precioAlquiler(){
        double precio;
        precio= (super.getMetrosEslora()%10*2) + (cv*1) + (camarotes*20);
        return precio;
    }
}
