/* Limpiaparabrisas  */
package programame;

import java.util.ArrayList;
import java.util.Iterator;

public class P447Sin {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);
        

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {        
        ArrayList<Integer> numeros = new ArrayList();
        int litrosMotor, cantidad, botella, i=1, cont=0, con=0, divisor=0, numerosDivisor;
        int [] recipientes;
        int [] divisores;
        boolean puede=false;
        
        litrosMotor = sc.nextInt();

        if (litrosMotor==0) { // CASO DE SALIDA
            return false;
        }
        
        // Contamos cuantos divisores tiene la capacidad
        do{
            if(litrosMotor%i==0){
                cont++;
            }
            i++;
        }while (i<litrosMotor);
        
        
        divisores = new int[cont];
        cantidad = sc.nextInt();
        recipientes = new int[cantidad];
        i=1; 
        
        // Sacamos los divisores en un Array para comprobarlos luego
        do{
            if(litrosMotor%i==0){
                divisores[con]=i;
                con++;
            }
            i++;
        }while (i<litrosMotor);
        
        //Metemos la cantidad de litros de las botellas introducidas y comprobamos que si una botella es igual a los litros se puede
        for(con=0;con<cantidad;con++){
            botella = sc.nextInt();
            recipientes[con]=botella;
            if(botella==litrosMotor){
                puede=true;
            }
        }
        // Sacamos los litros con la mezcla de todos los recipientes
        for(con=0;con<cantidad;con++){
            for(i=0;i<cantidad;i++){
                divisor=recipientes[con]-recipientes[i];
                numeros.add(divisor);
            }
        }
        
        // Comparamos que uno de la mezcla es un divisor
        Iterator<Integer> puntero=numeros.iterator();
        for(i=0;i<numeros.size();i++){
            numerosDivisor = puntero.next().intValue();
            for(con=0;con<divisores.length;con++){
                if(numerosDivisor==divisores[con]){
                    puede=true;
                }  
            }
        }     
        if(puede){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        return true;
    }
}


/*
        for(con=0;con<cantidad;con++){
            divisor = divisoresLitros(divisor, recipientes[con]);
            //Comprobamos que el divisor que nos da esta en los litros
            for(i=0;i<divisores.length;i++){
                if(divisor==divisores[i]){
                puede = true;
                }
            }
        }
        */
/* // Sacamos los divisores de los recipientes
    public static int divisoresLitros (int a, int b){
        if(b==0){
            return a;
        }else{
            return divisoresLitros(b, a%b);
        }
    }*/