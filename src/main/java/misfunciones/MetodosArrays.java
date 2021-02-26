
package misfunciones;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MetodosArrays {
    static Scanner sc = new Scanner (System.in);
    
    
    // Muestra el contenido del Array
    /**
     * Muestra el contenido de los Arrays de 1D.
     * @param array 
     */
    public static void muestraArray(int[] array) {
        for (int f=0; f<array.length;f++){
            System.out.println(array[f]); 
        }
    }
    
    /**
     * Muestra el contenido de los Arrays de 2D.
     * @param array 
     */
    public static void muestraArray(int [][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.print(array[f][c]+" ");
            }
        }   
    }
    
    /**
     * Muestra el contenido de los Arrays de 3D.
     * @param array 
     */
    public static void muestraArray(int [][][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.println("");
                for(int p=0; array[f][c]!=null && p<array[f][c].length;p++){
                    System.out.print(array[f][c]+" ");
                }
            }  
        }   
    }
    
    
    
    // Introducir Datos Array INT
    
    /**
     * Introducir contenido de los Arrays int de 1D.
     * @param array 
     */
    public static void introducirDatosArray (int [] array){
        int f=0;
        for(;f<array.length;f++){
            array[f] = sc.nextInt();
        }
    }
    
    /**
     * Introducir contenido de los Arrays int de 2D.
     * @param array 
     */
    public static void introducirDatosArray(int [][] array) {
        for (int f=0; f<array.length;f++){
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                    array[f][c]= sc.nextInt();
            }
        }  
    }
    
    // Comprobar si el contenido esta borrado.
    /**
     * Comprueba si dentro del array tenemos algún contenido borrado
     * @param array
     * @param numeroExcepcion
     * @return false si no hay contenido borrado, true si es asi.
     */
    public static boolean contenidoBorrado (int [] array, int numeroExcepcion) {
        for (int i=0; i<array.length;i++){
            if (array[i]!=numeroExcepcion){
                return false;
            } 
        }
        return true;   
    }
    
    /**
     * Modifica el array cambiando el contenido de los datos repetidos al dato introducido
     * @param array
     * @param contenidoRepetido 
     */
    public static void sinRepetidos(int [] array, int contenidoRepetido){
        for (int f=0; f<array.length;f++){
            for (int i=0;i<array.length;i++){
                if (array[f]==array[i] && f!=i && array[f]!=contenidoRepetido){
                    array[i]=contenidoRepetido;
                }
            }
        }   
    }
    
    
    /**
     * Mostrar el contenido de una coleccion de Integer
     * @param numeros 
     */
    public static void mostrarSet (Set numeros){
        Iterator it = numeros.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());   
        }
    }
    /**
     * Muestra el contenido de un ArrayList de Strings
     * @param palabras 
     */
    public static void muestraList(List palabras) {
        String palabra;
        
        for(int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i));
        }
    }
    
    /**
     * Muestra el contenido de un HashSet de Integers
     * @param numeros 
     */
    public static void muestraHash(HashSet<Integer> numeros) {
        Iterator<Integer> punt;
        punt = numeros.iterator();

        while (punt.hasNext()) {
            System.out.println(punt.next());
        }
    }
    
    public static void mostrarArraydeQue(ArrayDeque cola){
        while(cola.peek() != null){
            System.out.println(cola.poll());
        }
    }
    public static void mostrarStack(Stack pila){
        while(pila.peek() != null){
            System.out.println(pila.pop());
        }
    }
  
}
