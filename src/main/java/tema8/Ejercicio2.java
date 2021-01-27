/*Crea una colección de 20 números enteros aleatorios menores de 25 pudiendo haber
repetidos. Recorre dicha colección mostrando aquellos números que sean menores de 10.*/
package tema8;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        
        rellenaArrayList(numeros);
        muestraArrayList(numeros);   
    }
    public static void rellenaArrayList(ArrayList<Integer> numeros) {
        int aleatorio;
        
        for(int cont=0;cont<20;cont++){
            aleatorio = (int) (Math.random()*25);
            numeros.add(aleatorio);
        }
        
    }
    
    public static void muestraArrayList(ArrayList<Integer> numeros) {
        Iterator<Integer> i = numeros.iterator();
        int num;
        
        while(i.hasNext()){
            num =i.next().intValue();
            if(num<10){
                System.out.println("Numero: "+ num);
            }            
        }
    }
    
}
