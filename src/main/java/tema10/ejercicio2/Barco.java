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
public class Barco {
    private String matricula;
    private short metrosEslora;
    private short añoFabricacion;

    public Barco(String matricula, short metrosEslora, short añoFabricacion) {
        setMatricula(matricula);
        setMetrosEslora(metrosEslora);
        setAñoFabricacion(añoFabricacion);
    }

    public short getMetrosEslora() {
        return metrosEslora;
    }
    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMetrosEslora(short metrosEslora) {
        if(metrosEslora<0){
            this.metrosEslora=0;
        }else{
            this.metrosEslora = metrosEslora;
        }
        
    }

    public void setAñoFabricacion(short añoFabricacion) {
        if(añoFabricacion<0){
            this.añoFabricacion=0;
        }else{
            this.añoFabricacion = añoFabricacion;
        }
        
    }
    
    public double precioAlquiler(){
        double precio;
        precio= metrosEslora%10;
        return precio;
    }
    
}
