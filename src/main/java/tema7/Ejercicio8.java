/* Realizar un programa en Java que cree una tabla con 4 filas variables de
numeros enteros, que la rellene con numeros aleatorios y que la muestre por
pantalla sin que se rompa */

package tema7;

public class Ejercicio8 {
    public static void main(String[] args) {
        int [][] numeros= new int[5][];       
        numeros[0]=new int [1];
        numeros[1]=new int [2];
        numeros[2]=new int [3];
        numeros[4]=new int [4]; 
        
        introduce(numeros);
        muestra(numeros);  
    }
    
    public static void muestra(int [][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.print(array[f][c]+" ");
            }
        }
        
    }
    public static void introduce(int [][] array) {
        for (int f=0; f<array.length;f++){
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                array[f][c]=(int) (Math.random()*10);
            }
        }  
    }
    
}
