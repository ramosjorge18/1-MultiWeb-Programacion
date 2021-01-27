/* Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición
[n,m] debe contener n+m. Después se debe mostrar su contenido. */

package tema7;

public class Ejercicio11 {
    public static void main(String[] args) {
        int [][] numeros = new int[5][5];
        
        introduce(numeros);
        muestra(numeros);    
    }
    
    
    public static void introduce(int [][] array) {
        for (int f=0; f<array.length;f++){
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                array[f][c]= f+c;
            }
        }  
    }
    
    public static void muestra(int [][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.print(array[f][c]+" ");
            }
        }   
    }
    
}
