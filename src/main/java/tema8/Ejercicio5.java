/* Realiza un programa en Java que recoja las edades de los alumnos de los grupos de
1MULTIWEB, 2MULTIWEB y 1DAW. Para ello se deberá almacenar en una colección (a definir
por el alumno) que a su vez tenga 3 colecciones internamente. Posteriomente mostrar el
listado de las edades con un encabezado */
package tema8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<ArrayList> colecciones = new ArrayList();
        ArrayList<Integer> edad1= new ArrayList();
        ArrayList<Integer> edad2= new ArrayList();
        ArrayList<Integer> edad3= new ArrayList();
        Iterator<Integer> punt;
        double suma;
        
        rellenaArrayList(edad1);
        rellenaArrayList(edad2);
        rellenaArrayList(edad3);
        
        colecciones.add(edad1);
        colecciones.add(edad2);
        colecciones.add(edad3);
        
        for(int i=0;i<colecciones.size();i++){
            if(colecciones.size()==0){
                punt = edad1.iterator();
                suma=0;
                System.out.println("Alumnos de 1ºMulti");
                for(int cont=0;cont<edad1.size();cont++){
                    System.out.print(colecciones.get(i).get(cont));
                    System.out.print(" ");
                }
                while(punt.hasNext()){
                    suma = suma+punt.next().intValue();
                }
                suma = suma/edad1.size();
                System.out.println("Media Edad: "+suma);
                
            }else if(colecciones.size()==0){
                punt = edad2.iterator();
                suma=0;
                System.out.println("Alumnos de 2ªMulti");
                for(int cont=0;cont<edad2.size();cont++){
                    System.out.print(colecciones.get(i).get(cont));
                    System.out.print(" ");
                }
                while(punt.hasNext()){
                    suma = suma+punt.next().intValue();
                }
                suma = suma/edad2.size();
                System.out.println("Media Edad: "+suma);
                
            }else{
                punt = edad3.iterator();
                suma=0;
                System.out.println("Alumnos de 1ºDAM");
                for(int cont=0;cont<edad3.size();cont++){
                    System.out.print(colecciones.get(i).get(cont));
                    System.out.print(" ");
                }
                while(punt.hasNext()){
                    suma = suma+punt.next().intValue();
                }
                suma = suma/edad3.size();
                System.out.println("Media Edad: "+suma);
            }            
        }
                   
    }
    
    public static void rellenaArrayList(ArrayList<Integer> numeros) {
        int aleatorio;
        
        for(int cont=0;cont<20;cont++){
            aleatorio = (int) (Math.random()*25);
            numeros.add(aleatorio);
        }
        
    }
    
}
