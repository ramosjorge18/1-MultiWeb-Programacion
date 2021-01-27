/*Crea una colección de 20 números enteros aleatorios menores de 100 y guárdalos en el orden
en que se vayan generando; mostrar por pantalla dicha lista una vez creada. Ordenarla en
sentido creciente y volverla a mostrar por pantalla. */
package tema8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        HashSet<Integer> numeros = new HashSet();
        TreeSet<Integer> ordenados = new TreeSet();
        
        rellenaColeccion(numeros, ordenados);
        muestraColeccion(numeros, ordenados);
        
    }
    public static void rellenaColeccion(HashSet<Integer> numeros, TreeSet<Integer> ordenados) {
        int num;     
        for(int cont=0;cont<20;cont++){
            num = (int) (Math.random()*100);
            numeros.add(num);
            ordenados.add(num);
        }
        
    }
    
    public static void muestraColeccion(HashSet<Integer> numeros, TreeSet<Integer> ordenados) {
        
        Iterator i = numeros.iterator();
        Iterator d = ordenados.iterator();
     
        while(i.hasNext()){
            System.out.println("Numero: "+ i.next());
        }
        while(d.hasNext()){
            System.out.println("Numero Ordenado: "+d.next());
        }
        
    }
    
}
