/* Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
Realizar la media de los números positivos, la media de los negativos y contar el número de
ceros introducidos. */
package tema7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cont;
        float  totalposi=0, totalnega=0, cero=0, contnega=0, contposi=0;
        float [] numeros;
        
        System.out.print("Introduce la cantidad de Nº que vas a meter: ");
        cont = sc.nextInt();
        
        numeros = new float[cont];
        
        for(int i=0;i<cont;i++){
            System.out.print("Introduce un Nº: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i=0;i<cont;i++){
            if (numeros[i] >0){
                totalposi = totalposi + numeros[i];
                contposi++;
            }
            else if (numeros[i]<0){
                totalnega = totalnega + numeros[i];
                contnega++;
            }
            else {
                cero++; 
            }
            
        }
        System.out.println("La media de positivos es: "+ (totalposi = totalposi / contposi));
        System.out.println("La media de negativos es: "+ (totalnega = totalnega / contnega ));
        System.out.println("La cantidad de 0 introducidos son: "+cero);
    }
    
}
