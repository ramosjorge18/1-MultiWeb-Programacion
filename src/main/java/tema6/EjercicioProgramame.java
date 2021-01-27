/* Ejercicio de programame */
package tema6;

import java.util.Scanner;

public class EjercicioProgramame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aux1, aux2, aux3;
        char a, b, c;
        int num1, num2;
        long v=0, t=0, d=0, cont;
        
        System.out.println("Introduce cuantos problemas quieres que resuelva: ");
        cont = sc.nextLong();
        
        for(long i=0;i<cont;i++){
            System.out.println("Introduce los datos que desees para realizar la operacion: ");
            aux1 = sc.next();
            aux2 = sc.next();
            
            a = aux1.charAt(0);
            b = aux2.charAt(0);
            
            aux1 = aux1.substring(2);
            aux2= aux2.substring(2);
            
            if (a=='V'){
                v = Integer.parseInt(aux1);
                if (b=='D'){
                    d = Integer.parseInt(aux2);                   
                    t = d/v;
                    System.out.println("T="+t);
                    
                }else{
                    t = Integer.parseInt(aux2);
                    d = t*v;
                    System.out.println("D="+d);
                }
                
            }
            else if (a=='T'){
                t = Integer.parseInt(aux1);
                if (b=='D'){
                    d = Integer.parseInt(aux2);
                    v=d/t;
                    System.out.println("V="+v);
                    
                }else{
                    v = Integer.parseInt(aux2);
                    d = v*t;
                    System.out.println("D="+d);
                }
                
            }else{
                d = Integer.parseInt(aux1);
                if (b=='V'){
                    v = Integer.parseInt(aux2);
                    t = d/v;
                    System.out.println("T="+t);
                }else{
                    t = Integer.parseInt(aux2);
                    v=d/t;
                    System.out.println("V="+v);
                }
            }
                
        }
        
        
    }
    
    
}
