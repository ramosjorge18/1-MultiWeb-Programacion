/* */
package tema7;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int [][] numeros = new int [4][4];
        int a,b,c,d,aa,bb,cc,dd;
        boolean magica;
        
        introduce(numeros);
        
        a=sumaFila(numeros, 0);
        b=sumaFila(numeros, 1);
        c=sumaFila(numeros, 2);
        d=sumaFila(numeros, 3);
        aa=sumaFila(numeros, 0);
        bb=sumaFila(numeros, 1);
        cc=sumaFila(numeros, 2);
        dd=sumaFila(numeros, 3);
        
        magica = a==b && b==c && c==d && d==aa && aa==bb && bb==cc && cc==dd;
        System.out.println(magica);
        
        
    }
    public static int sumaColumna(int [][] array, int columna) {
        int totalSuma = 0;
        for (int f=0;f<4;f++){
            totalSuma = totalSuma+array[f][columna];   
        }
        return totalSuma;
        
    }
    public static int sumaFila(int [][] array, int fila) {
        int totalSuma = 0;
        for (int f=0;f<4;f++){
            totalSuma = totalSuma+array[fila][f];   
        }
        return totalSuma;
        
    }
    public static void introduce(int [][] array) {
        Scanner sc = new Scanner(System.in);
        for (int f=0; f<array.length;f++){
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                array[f][c]=sc.nextInt();
            }
        }  
    }
    
    
}
