/*13. Implementar la función sinRepetidos() con el prototipo siguiente:
int[] sinRepetidos(int t[])
que construye y devuelve un vector del tamaño apropiado, con los elementos de t donde se
han eliminado los datos repetidos. */
package tema7;

public class Ejercicio13 {
    public static void main(String[] args) {
        int t=-99;
        int [] sinRepetido = {5,2,6,2,5};
        
        sinRepetidos(sinRepetido, t);
        misfunciones.MetodosArrays.muestraArray(sinRepetido);
        
    }
    
    public static void sinRepetidos(int [] array, int contenidoRepetido){
        for (int f=0; f<array.length;f++){
            for (int i=0;i<array.length;i++){
                if (array[f]==array[i] && f!=i && array[f]!=contenidoRepetido){
                    array[i]=contenidoRepetido;
                }
            }
        }   
    }   
}
