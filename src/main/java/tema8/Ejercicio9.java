/*Para ir a ver la película &quot;Dolor y Gloria&quot; hay dos filas de espectadores. Un acomodador es el
encargado de dejar entrar a la gente. Sus instrucciones son simples: &quot;Tiene que dejar entrar
siempre al espectador que es mayor de entre las dos colas, si tienen la misma edad, las
personas de la fila 1 tiene preferencia&quot;. Ten en cuenta, que si acomodas a un espectador el NO
elegido sigue estando en la otra cola esperando para volver a ser comparado nuevamente.
Almacena previamente en las dos colas 5 enteros en cada una que representen las edades de
dichos espectadores. */
package tema8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayDeque<Integer> fila1 = new ArrayDeque();
        ArrayDeque<Integer> fila2 = new ArrayDeque();
        rellenaListAleatorios(fila1);
        rellenaListAleatorios(fila2);
        comparaYRellena(fila1, fila2);
        
    }
    
    public static void rellenaListAleatorios(ArrayDeque<Integer> numeros) {
        int num;
        for (int cont = 0; cont < 5; cont++) {
            num = (int) (Math.random() * 80);
            numeros.add(num);
        }
    }
    
    public static void comparaYRellena (ArrayDeque<Integer> fila1, ArrayDeque<Integer> fila2){
        ArrayList<Integer> total = new ArrayList();
        Integer edad1, edad2, edad;
        while(fila1.isEmpty()==false && fila2.isEmpty()==false){
            edad1 = fila1.peek();
            edad2 = fila2.peek();
            if(edad1.equals(edad2)){
                edad = fila1.pop();
                total.add(edad);
            } else if(edad1>edad2){
                edad = fila1.pop();
                total.add(edad);
            }else if(edad1<edad2){
                edad = fila2.pop();
                total.add(edad);
            }
        }
        while(fila1.isEmpty()==false || fila2.isEmpty()==false){
            if(fila1.isEmpty()){
                edad = fila2.pop();
                total.add(edad);
            }else{
                edad = fila1.pop();
                total.add(edad);
            }
        }
        muestraArrayList(total);
    }
    
    public static void muestraArrayList(ArrayList<Integer> palabras) {
        String palabra;
        
        for(int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i));
        }
    }
    
}
