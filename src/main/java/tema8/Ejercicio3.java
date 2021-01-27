/* 3. Introducir por teclado, hasta que se introduzca “fin”, una serie de nombres que se insertarán
en una colección, de forma que se conserve el orden de inserción pudiendo repetirse. Mostrar
la lista por pantalla. */
package tema8;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    static java.util.Scanner sc;
    
    public static void main(String args[]) {
        ArrayList<String> nombres = nombres = new ArrayList();
        sc = new java.util.Scanner(System.in);
        
        while (casoDePrueba(nombres)) {
        }
        muestraList(nombres);
        
    }

    private static boolean casoDePrueba(List nombres) {
        String nombre;
        
        nombre=sc.next();
        if (nombre.equals("fin")) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        nombres.add(nombre);
        return true;
    }
    
    private static void muestraList(List nombre) {
        for(int i=0;i<nombre.size();i++){
            System.out.println("String es: "+nombre.get(i));
        }
    }
}
