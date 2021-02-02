/*6. Introducir por consola una frase que conste exclusivamente de palabras separadas por
espacios. Almacenar en una lista las palabras de la frase, una en cada nodo y mostrar por
pantalla las palabras que estén repetidas. A continuación, mostrar las que no estén. */
package tema8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {        
        ArrayList<String> palabras = new ArrayList();
        ArrayList<String> repes = new ArrayList();
        
        rellenaArrayList(palabras);
        muestraArrayList(palabras);
        
        //Creamos las palabras repes y las mostramos
        copiaRepesArrayList(palabras, repes);
        System.out.println("Las palabras repetidas son:");
        muestraArrayList(repes);
        
        // Eliminamos las repes de palabras y mostramos las no repes
        palabras.removeAll(repes);
        System.out.println("Las palabras no repetidas son:");
        muestraArrayList(palabras);
        
    }
    
    public static void rellenaArrayList(ArrayList<String> palabras) {
        Scanner sc = new Scanner (System.in);
        String palabra;
        
        do{
            palabra = sc.next();
            palabras.add(palabra);
        }while (!palabra.equals("."));   
    }
    public static void muestraArrayList(List<String> palabras) {
        String palabra;
        
        for(int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i));
        }
    }
    public static void copiaRepesArrayList(List<String> palabras,List<String> repes) {
        String palabra;
        
        for(int i=0;i<palabras.size();i++){
            for(int cont=0;cont<palabras.size();cont++){
                if((palabras.get(i).equals(palabras.get(cont))) && i!=cont){
                    repes.add(palabras.get(i));
                    palabras.remove(i);
                }
            }
        }
    }
    
}
