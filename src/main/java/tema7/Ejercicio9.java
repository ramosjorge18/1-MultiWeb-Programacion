/* Inicializar un cubo con numeros aleatorios definidos por el programador de tamaño 3*2*3 */
package tema7;

public class Ejercicio9 {
    public static void main(String[] args) {
        int [][][] cubo = {{{1,5,3},{2,6,7}},{{1,5,3},{2,6,7}},{{1,5,3},{2,6,7}}};
        
        muestra(cubo);
    }
    public static void muestra(int [][][] array) {
        for (int f=0; f<array.length;f++){
            System.out.println("---------------");
            for(int c=0; array[f]!=null && c<array[f].length;c++){
                System.out.println("*******");
                for(int p=0;p<array[f][c].length;p++){
                    System.out.println(array[f][c][p]+" ");
                    
                    
                }
            }
        }
        
    }
}
