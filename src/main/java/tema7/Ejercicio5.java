/*Leer y almacenar n números enteros en un array. A partir de este se construirán otros dos
vectores con los elementos pares e impares del primer vector. Una vez finalizada la operación
mostraremos los dos arrays por pantalla. */
package tema7;

import java.util.Scanner;
import misfunciones.MetodosArrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cont, contPar=0, contImpar=0;
        int [] numeros;
        int [] par;
        int [] impar;
        
        System.out.print("¿Cuantos Nºs vas a introducir?: ");
        cont = sc.nextInt();
        
        numeros = new int [cont];
        MetodosArrays.introducirDatosArray(numeros);
        
        //Miramos el contenido y contamos los numeros pares e impares para inicializar el Array
        par = new int [intParesArray(numeros)];
        impar = new int [intImparesArray(numeros)];
        
        //Bucle para meter los datos pares e impares
        for (int i=0; i<numeros.length;i++){
            if (numeros[i]%2==0){
                par[contPar]=numeros[i];
                contPar++;
            }else {
                impar[contImpar]=numeros[i];
                contImpar++;
            }
        }
        System.out.println("Los Nºs pares son: ");
        MetodosArrays.muestraArray(par);
        System.out.println("Los Nºs impares son: ");
        MetodosArrays.muestraArray(impar);   
    }
    
    public static int intParesArray (int [] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                cont++;
            }  
        }
        return cont;
    }
    
    public static int intImparesArray (int [] array){
        int cont=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                cont++;
            }  
        }
        return cont;
    }
    
}
