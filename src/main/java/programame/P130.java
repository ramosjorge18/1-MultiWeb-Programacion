/* Mejor... Imposible */
package programame;

public class P130 {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        long baldosas, x1, x2, y1,y2, posicion1, posicion2, numero1, numero2;
        
        baldosas = sc.nextLong();

        if (baldosas==0) { // CASO DE SALIDA
            return false;
        }
        
        x1 =sc.nextLong();
        y1 =sc.nextLong();
        x2 =sc.nextLong();
        y2 =sc.nextLong();
        
        posicion1 = x1+y1;
        posicion2 = x2 +y2;
        numero1 = x1-x2;
        numero2 = x2-x1;
        
        if (posicion1%2 != posicion2%2){
            System.out.println("IMPOSIBLE");
        }
        else if (x1==x2 && y1==y2){
            System.out.println("0");
        }
        else if(posicion1==posicion2){
            System.out.println("1");
        }
        else if ((x1+numero1==x2 && y1+numero1==y2) || (x1+numero2==x2 && y1+numero2==y2)){
            System.out.println("1");
        }
        else{
            System.out.println("2");
        }
        return true;
    }
}
