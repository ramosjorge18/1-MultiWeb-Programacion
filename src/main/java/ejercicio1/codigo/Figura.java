/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.codigo;

import java.util.Arrays;

/**
 *
 * @author Vespertino
 */
public class Figura {
    private int [] [] tabla;

    public Figura(int numero) {
        if(numero%2==0){
            numero=numero++;
        }else if(numero<3){
            numero = 3;
        }
        tabla = new int[numero][numero];
        for (int f=0; f<tabla.length;f++){
            for(int c=0; tabla[f]!=null && c<tabla[f].length;c++){
                    tabla[f][c]= 0;
            }
        }
    }

    public void setTabla(int[][] tabla) {
        this.tabla = tabla;
    }
    
    public void setFigura(int [][]b){
        tabla = Arrays.copyOf(tabla, b.length);
    }

    public int[][] getTabla() {
        return tabla;
    }
    
    public boolean esUnAspa(){
        boolean a = false;
        int x, y;
        
        
        for (int f=0; f<tabla.length;f++){
            for(int c=0; tabla[f]!=null && c<tabla[f].length;c++){
                x = tabla[f][c];
                y = tabla[f][(tabla[f].length-1)-c];
                if(x==1 && y==1){
                    a = true;
                }else 
                    a=false;
            }
        }
        return a;
    }
    
    public boolean esUnaCruz(){
        boolean a = false;
        int x, y;
        
        
        for (int f=0; f<tabla.length;f++){
            for(int c=0; tabla[f]!=null && c<tabla[f].length;c++){
                x = tabla[f][c];
                y = tabla[(tabla.length-1)-f][c];
                if(x==1 && y==1){
                    a = true;
                }
            }
        }
        return a;
        
    }
    
    
    

    
    
    
}
