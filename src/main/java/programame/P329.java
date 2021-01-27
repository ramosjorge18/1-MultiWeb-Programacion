/* Primera linea de playa */
package programame;

public class P329 {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba(){
        int casos;
        int ini,fin;
 
        casos = sc.nextInt();

        if (casos==0) { // CASO DE SALIDA
            return false;
        }
        
        for(int cont=0;cont<casos;cont++){
            ini = sc.nextInt();
            fin = sc.nextInt();
            numerosEntre(ini, fin);
        }
        
        // Calculamos la entrada y mostramos salida

        return true;
    }
    
    public static int [] numerosEntre (int ini, int fin){
        int numeros = ini-fin;
        int [] numerosEntre;
        numerosEntre = new int [numeros];
            
        for(int cont=0;cont<numeros;cont++ ){
            numerosEntre[cont]= ini++;     
        }
        
        return numerosEntre;    
    }
    
    
}
