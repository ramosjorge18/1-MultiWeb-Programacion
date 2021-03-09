/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo1;

import tema9.ejercicio2.Nif;

/**
 *
 * @author Vespertino
 */
public class Usuario {
    private String nombreCompleto;
    private Nif dni;
    private int telefono;
    private Item [] pretamos;
    private boolean sancion;
    
    //Constructor
    public Usuario(String nombreCompleto, Nif dni, int telefono) {
        this.nombreCompleto = nombreCompleto;
        this.dni=dni;
        this.telefono=telefono;
        this.pretamos = new Item[3];
        pretamos[0]= new Item();
        pretamos[1]=new Item();
        pretamos[2]=new Item();
        setSancion(false);
    }
    
    //Setters
    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }
    
    //Getters
    public boolean isSancion() {
        return sancion;
    }
    
    //Metodos Necesarios
    public boolean tomarItem(Item objetoPrestado){
        for (int i = 0; i < pretamos.length; i++) {
            if(pretamos[i].equals(new Item())){
                pretamos[i]=objetoPrestado;
                return true;
            }else{
                if(i+1==pretamos.length){
                    return false;
                }
            }
            
        }
        return false;
    }
    
    public boolean devolverItem(Item objetoPrestado){
        for(int i = 0; i < pretamos.length; i++){
            if(objetoPrestado.equals(pretamos[i])){
                pretamos[i]=new Item();
                return true;
            }else{
                if(i+1==pretamos.length){
                    return false;
                }
            }
        }
        return false;   
    }
    
    public String muestraPrestamo(){
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < pretamos.length; i++) {
            if(pretamos[i].equals(new Item())){
                continue;
            }else{
                sb.append(pretamos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
}
