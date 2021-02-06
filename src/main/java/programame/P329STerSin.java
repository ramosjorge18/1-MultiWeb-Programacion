/* Primera linea de playa */
package programame;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P329STerSin {

    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int casos, lineas;
        int ini, fin;

        casos = sc.nextInt();

        Set[] edificios = new Set[casos];

        if (casos == 0) { // CASO DE SALIDA
            return false;
        }
        for (int i = 0; i < casos; i++) {
            ini = sc.nextInt();
            fin = sc.nextInt();
            edificios[i] = rellenaSet(ini, fin);
        }

        lineas = comparaEdificios(edificios);
        System.out.println(lineas);

        // Calculamos la entrada y mostramos salida
        return true;
    }

    public static TreeSet<Integer> rellenaSet(int a, int b) {
        TreeSet<Integer> numerosEntre = new TreeSet();
        int numeros = (b - a) - 1;

        for (int i = 0; i < numeros; i++) {
            a = a + 1;
            numerosEntre.add(a);
        }
        return numerosEntre;

    }

    public static int comparaEdificios(Set[] edificios) {
        int lineas = edificios.length;
        Integer numero1, numero2;
        Iterator<Integer> punt;
        Iterator<Integer> punt2;

        for (int cont = 0; cont < edificios.length; cont++) {
            if(edificios[cont]!=null){
                punt=edificios[cont].iterator();
                while(punt.hasNext()){
                    numero1=punt.next();
                    for(int i = 0;i<edificios.length;i++){
                        if(cont!=i && edificios[i]!=null){
                            punt2=edificios[i].iterator();
                            while(punt2.hasNext()){
                                numero2 = punt2.next();
                                if(numero1==numero2 || numero1==(numero2-1)|| numero1 == (numero2+1)){
                                    lineas=lineas-1;
                                    edificios[i]=null;
                                }

                            }


                        }
                    }
                }
            }
        }
        return lineas;
    }

}
