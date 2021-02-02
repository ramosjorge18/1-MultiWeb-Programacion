/*Implementar el método de unión de dos conjuntos, que devuelva un nuevo conjunto con
todos los elementos que pertenezcan, al menos, a uno de los dos conjuntos. */
package tema8;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio7 {

    public static void main(String[] args) {
        HashSet<Integer> numeros1 = new HashSet();
        HashSet<Integer> numeros2 = new HashSet();;

        rellenaHash(numeros1);
        System.out.println("Primeros Numeros");
        muestraHash(numeros1);
        rellenaHash(numeros2);
        System.out.println("Segundos Numeros");
        muestraHash(numeros2);
        numeros1.addAll(numeros2);
        System.out.println("Todos los numeros");
        muestraHash(numeros1);

    }

    public static void rellenaHash(HashSet<Integer> numeros) {
        int num;
        for (int cont = 0; cont < 5; cont++) {
            num = (int) (Math.random() * 100);
            numeros.add(num);
        }
    }

    public static void muestraHash(HashSet<Integer> numeros) {
        Iterator<Integer> punt;
        punt = numeros.iterator();

        while (punt.hasNext()) {
            System.out.println(punt.next());
        }

    }

}
