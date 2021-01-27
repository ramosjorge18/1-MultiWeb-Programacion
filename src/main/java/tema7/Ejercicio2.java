/* Escribir una aplicación que solicite al usuario cuantos numeros desea introducir. A
continuación, se introducirá por teclado esa cantidad de números enteros, y por ultimo, los
mostrará en el orden inverso al introducido. */
package tema7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in); 
        int cont, i=0, b;
        int [] numeros;
        
        System.out.print("Cuantos números vas a introducir: ");
        cont = sc.nextInt();
        
        numeros = new int [cont];
        
        for(;i<cont;i++){
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }
        
        i=cont;
        
        do{
            i=i-1;
            System.out.println(numeros[i]);   
        }while (i!=0);  
    }
    
}
