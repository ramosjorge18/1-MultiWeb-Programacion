/*Implementar un programa que inicialice un array con nuestros números favoritos. A
continuación, pedir al usuario el índice de un elemento que será eliminado de la tabla.
Continuaremos eliminando elementos hasta que el índice introducido sea negativo o hasta que
no existan más elementos que borrar. Es imprescindible controlar que el índice corresponde a
un dato válido. Mostraremos los números que no han sido borrados al final. */
package tema7;

import java.util.Scanner;
import misfunciones.MetodosArrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int borrar;
        int [] fav = {9, 14, 18, 23};
        
        do{
            System.out.print("Que indice deseas borrar: ");
            borrar = sc.nextInt();
            // Si el Nº es menor que 0 salimos y si es mayor del index continuamos para que no rompa
            if (borrar < 0 ){
                break;
            }
            else if (borrar >= fav.length){
                continue;
            }
            fav[borrar]=0;
            if (MetodosArrays.contenidoBorrado(fav, 0)){
                break;
            }   
        }while (borrar >-1);
        
        System.out.println("Los números que no borraste fueron: ");
        MetodosArrays.muestraArray(fav);  
    }
    
}
