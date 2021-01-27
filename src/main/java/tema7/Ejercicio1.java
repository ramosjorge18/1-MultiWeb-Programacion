/*Diseñar un programa que solicite al usuario que introduzca por teclado cinco numeros
decimales a continuación, debe mostrar los numeros en el mismo orden que se han
introducido.*/
package tema7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        byte i=0;
        float [] numeros = new float [5];
        
        for(;i<numeros.length;i++){
            System.out.print("Introduce un número decimal: ");
            numeros[i] = sc.nextFloat();
        }
        i=0;
        for(;i<numeros.length;i++){
            System.out.println("Los números escrito son: "+numeros[i]);
        }  
    }   
}
