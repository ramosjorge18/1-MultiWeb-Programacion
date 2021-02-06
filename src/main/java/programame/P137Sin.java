/*Hundir la flota */
package programame;

public class P137Sin {

    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int barcos, tamañoBarco, tamañoTablero, sumaBarcos = 0, cantidadTablero, sumaTablero = 0;

        barcos = sc.nextInt();

        if (barcos == 0) { // CASO DE SALIDA
            return false;
        }

        for (int i = 0; i < barcos; i++) {
            tamañoBarco = sc.nextInt();
            sumaBarcos = sumaBarcos + tamañoBarco;
        }
        tamañoTablero = sc.nextInt();
        for (int i = 0; i < tamañoTablero; i++) {
            for (int cont = 0; cont < tamañoTablero; cont++) {
                tamañoBarco = sc.nextInt();
                sumaTablero = sumaTablero + tamañoBarco;
            }
        }
        if (sumaTablero != sumaBarcos) {
            System.out.println("NO");
        }
        return true;
    }

}
