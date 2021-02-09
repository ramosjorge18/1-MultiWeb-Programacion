/* 13. Realiza un pequeño ejemplo en java que haga uso, de cada uno de los métodos-algoritmo
siguiente de la clase Collections, como mínimo los métodos a probar serán los siguientes: */
package tema8;

import java.util.Collections;
import java.util.LinkedList;

public class Ejercicio13 {
    
    private static  LinkedList<Integer> numeros = new LinkedList();
    
    public static void main(String[] args) {
        
        
        Collections.addAll(numeros, 1, 2, 8, 9, 12, 56, 6, 99, 9);
        
        for(Integer srt : numeros){
            System.out.println("Numero: "+srt);
        }System.out.println("");
        
        Collections.sort(numeros);
        // Para el BinarySearch tiene que estar ordenado
        System.out.println(Collections.binarySearch(numeros, 8));
        for(Integer srt : numeros){
            System.out.println("Numero: "+srt);
        }System.out.println("");
        
        Collections.shuffle(numeros);
        for(Integer srt : numeros){
            System.out.println("Numero: "+srt);
        }System.out.println("");
        
        System.out.println(Collections.max(numeros));
        System.out.println(Collections.min(numeros));
        
        System.out.println(Collections.binarySearch(numeros, 8));
        
        
        
        
        
        
        
        
        
        
    }
    
}
