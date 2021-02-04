/* */
package tema8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ejercicio10 {
        
    static java.util.Scanner sc;

    public static void main(String args[]) {
        HashMap<String,Double> lista = new HashMap();
        sc = new java.util.Scanner(System.in);
        
        meteDatos(lista);
        
        System.out.println("Lista de la Compra");
        System.out.println("Articulo\t"+"Precio");
        muestraDatos(lista);
        
        System.out.println("Total Compra\t"+totalCompra(lista)+"€");
    }
    
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
   
    public static void muestraDatos(Map<String,Double> tabla){
        Set numero = tabla.keySet();
        Iterator<String> it = numero.iterator();
        while(it.hasNext()){
            String aux = (String)it.next();
            System.out.println(aux+ "\t" +"\t"+ tabla.get(aux));
        }
    }

    public static Double totalCompra(Map<String,Double> tabla) {
        Set numero = tabla.keySet();
        Iterator<String> it = numero.iterator();
        Double total=0.0;
        
        while(it.hasNext()){
            String aux = (String)it.next();
            total = total + tabla.get(aux);
        }
        return total;
        
    }
}
