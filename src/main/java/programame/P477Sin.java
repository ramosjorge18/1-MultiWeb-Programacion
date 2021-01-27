/* Doctor Muerte */
package programame;

public class P477Sin {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        
        int vidaEnemigo, armasDisponibles, sumaVida=0;
        int [] danoInocentes;
        int [] danoEnemigo;
        
        vidaEnemigo = sc.nextInt();

        if (vidaEnemigo==0) { // CASO DE SALIDA
            return false;
        }
        
        armasDisponibles = sc.nextInt();
        danoEnemigo = new int [armasDisponibles];
        danoInocentes = new int [armasDisponibles];
        
        for (int i=0;i<armasDisponibles;i++){
            danoInocentes [i]=sc.nextInt();
            danoEnemigo [i]=sc.nextInt();
            sumaVida= sumaVida + danoEnemigo[i];
        }
        
        if (sumaVida<vidaEnemigo){
            System.out.println("Muerte Escapa");
        }
        return true;
    }
    
}
