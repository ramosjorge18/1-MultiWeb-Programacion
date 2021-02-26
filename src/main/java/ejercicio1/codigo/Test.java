/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.codigo;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Figura a = new Figura(5);
        int [][] b = new int[5][5];
        introducirDatosArray(b);
        
        a.setTabla(b);
        muestraArray(b);
        System.out.println(a.esUnAspa());
        
        
      
        //1 0 0 0 1 0 1 0 1 0 0 0 1 0 0 0 1 0 1 0 1 0 0 0 1
        
        
    }
    
    public static void muestraArray(int [][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.print(array[f][c]+" ");
            }
        }   
    }
    public static void introducirDatosArray(int [][] array) {
        Scanner sc = new Scanner (System.in);
        for (int f=0; f<array.length;f++){
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                    array[f][c]= sc.nextInt();
            }
        }  
    }
    
}
