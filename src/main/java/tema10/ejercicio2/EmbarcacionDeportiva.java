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
public class EmbarcacionDeportiva extends Barco{
    private int cv;

    public EmbarcacionDeportiva(int cv, String matricula, short metrosEslora, short añoFabricacion) {
        super(matricula, metrosEslora, añoFabricacion);
        this.cv = cv;
    }
    
    @Override
    public double precioAlquiler(){
        double precio;
        precio= super.getMetrosEslora()%10 + (cv*1);
        return precio;
    }
}
