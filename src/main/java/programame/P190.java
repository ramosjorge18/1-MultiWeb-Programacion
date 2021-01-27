/* Dividir Factorial */
package programame;

public class P190 {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }
    
    private static boolean casoDePrueba() {
        long resultado=1;
        int num1, num2;
        
        num1 = Integer.parseInt(sc.next());
        num2 = Integer.parseInt(sc.next());
        
        if (num1 < num2) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        for (;num1>num2;num1--){
            resultado = resultado * num1;
        }
        System.out.println(resultado);
        return true;
    }
    
}
    
