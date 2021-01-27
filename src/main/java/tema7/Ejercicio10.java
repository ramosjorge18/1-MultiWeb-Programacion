/*Realizar un programa que lea por teclado una lista de los tus hobbies preferidos, separados por
comas, y calcule y muestre por pantalla de esa lista cuantos hobbies están en mayúscula y
cuántos están en minúsculas (además de mostrar los nombres de esos hobbies), también
mostrará cuántos de hobbies de los introducidos están formados por más de una palabra y
cuantos tienen más 10 letras (además de mostrar los nombres de esos hobbies). El ejercicio
deberá hacer uso de la clase StringTokenizer explicada en clase. */

package tema7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String hobbies = sc.nextLine();
        
        cuentaMayusYMinus(hobbies);
        tieneEspacios(hobbies);
        muestra(hobbies);
    }
    
    public static void cuentaMayusYMinus(String nombre) {
        StringTokenizer hobbie = new StringTokenizer(nombre, ",");
        String aux;
        
        int mayusculas=0, minusculas=0;
        while(hobbie.hasMoreTokens()){
            aux = hobbie.nextToken();
            aux = aux.trim();
            if(Character.isUpperCase(aux.charAt(0))){
                mayusculas++;                
            }else{
                minusculas++;
            }
        }
        System.out.println("Hobbies en mayuscula tenemos: "+mayusculas);
        System.out.println("Hobbies en mayuscula tenemos: "+minusculas);
    }
    
    public static void tieneEspacios(String nombre) {
        StringTokenizer hobbie = new StringTokenizer(nombre,",");
        String aux;
        int espacios=0, caracteres=0;
        
        while(hobbie.hasMoreTokens()){
            aux = hobbie.nextToken();
            aux = aux.trim();
            StringTokenizer espacio = new StringTokenizer(aux);
            if(espacio.countTokens()>1){
                espacios++;
                
            }
            if(aux.length()>10){
                caracteres++;
            }
        }
        System.out.println("Palabras con espacios: "+espacios);
        System.out.println("Palabras +10 caracteres: "+caracteres);
        
            
        
    }
    
    public static void muestra(String nombre) {
        StringTokenizer hobbie = new StringTokenizer(nombre,",");
        String aux;
        
         while(hobbie.hasMoreTokens()){
            aux = hobbie.nextToken();
            aux = aux.trim();
             System.out.println(aux);
         }
        
    }
}
