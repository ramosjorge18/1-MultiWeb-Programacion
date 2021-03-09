/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo3;

/**
 *
 * @author Vespertino
 */
public class Cubo {
    private int lineas;
    private int [][][] cubo;

    public Cubo(int lineas) {
        this.lineas = lineas;
        this.cubo = new int [lineas][lineas][lineas];
    }
    
    public void rellenar(int n){
        int i = 1;
        
        for (int f=0; f<cubo.length;f++){
            for(int c=0; cubo[f]!=null && c<cubo[f].length;c++){
                for(int g=0;cubo[f][c]!=null && g<cubo[f][c].length;g++){
                    cubo[f][c][g]= i;
                    i++;
                    if(i==n+1){
                        i=1;
                    }
                }    
            }
            i=1;
        }
        
    }
    
    public void mostrar(){
        int i=0;
        do{
            for (int f=0; f<cubo.length;f++){
                System.out.println("");
                for(int c=0; cubo[f]!=null && c<cubo[f].length;c++){
                System.out.print(cubo[i][f][c]+" ");
                }
            }
            i++;
            System.out.println("");
        }while(i!=cubo.length);
    }
    
}
