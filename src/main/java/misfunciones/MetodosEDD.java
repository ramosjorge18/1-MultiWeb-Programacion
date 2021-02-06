/*Metodos EDD*/
package misfunciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MetodosEDD {
    static Scanner sc = new Scanner (System.in);
    
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
    
    /**
     * Mostrar el contenido de una coleccion de Integer
     * @param numeros 
     */
    public static void mostrarColeccion (Set<Integer> numeros){
        Iterator<Integer> it = numeros.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());   
        }
    }
    
    /**
     * Mete datos hata que pongas un parametro(En este caso String)
     * @param tabla 
     */
    public static void meteDatos(Map<String,Double> tabla) {
        String articulo;
        Double precio;
        boolean s = true;
        
        do {
            articulo= sc.next();
            if(articulo.equals("fin")){
                break;
            }
            precio = sc.nextDouble();
            tabla.put(articulo, precio);
        }while (s);
        
    }
    
    /**
     * Muestra la clave y datos del Mapa
     * @param tabla 
     */
    public static void muestraDatos(Map<String,Double> tabla){
        Set numero = tabla.keySet();
        Iterator<String> it = numero.iterator();
        while(it.hasNext()){
            String clave = (String)it.next();
            System.out.println(clave+ "\t" +"\t"+ tabla.get(clave));
        }
    }
    
    /**
     * Suma todos los valores del contenido del Mapa
     * @param tabla
     * @return 
     */
    public static Double totalCompra(Map<String,Double> tabla) {
        Set numero = tabla.keySet();
        Iterator<String> it = numero.iterator();
        Double total=0.0;
        
        while(it.hasNext()){
            String clave = (String)it.next();
            total = total + tabla.get(clave);
        }
        return total;
        
    }
    
}
