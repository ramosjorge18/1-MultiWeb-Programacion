/*4. Implementa un método llamado limpiaRepetidos a la que se le pase una lista de nombres y
devuelva una copia sin elementos repetidos. Realizaremos dos versiones, una que retorne una
colección nueva sin repetidos y otra que modifique la recibida como parámetro. */

package tema8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> nombres = new ArrayList();
        HashSet<String> sinRepetir = new HashSet();
        ArrayList<String> modificado = new ArrayList();
        int contador1, contador2=0;
        
        String nombre;
        
        do{
            nombre = sc.next();
            nombres.add(nombre);
        }while (!nombre.equals("fin"));
        
        sinRepetir.addAll(nombres);
        
        /*do{
            contador1=1;
            for(;contador1<nombres.size();contador1++){
                if(nombres.get(contador2).equals(nombres.get(contador1))){
                    nombres.remove(contador2);
                    break;
                }
            }
            
            
        }*/
        

        System.out.println(" ");
        for(Object p: nombres){
            System.out.print(p+" , ");
        }
        
        
        
        
        
        
    }
    
}
