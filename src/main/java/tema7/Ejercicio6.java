/* Leer una serie de 6 enteros que se almacenarán en un vector que hay que ordenar y
mostrarlos por pantalla, a continuación, leer otra serie de 6 enteros, que también se guardarán
en un vector y se mostrarán ordenados (Para estas operaciones podéis utilizar los métodos de
la clase Arrays). Finalmente, fusionar los dos vectores en un tercero, de forma que los 12
números sigan ordenados (prohibido usar la clase Arrays para esto último). */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int menor=99999999;
        int [] array1;
        int [] array2;
        int [] array3= new int [12];
        int [] array4= new int [12];
        
        array1=arrayss(6);
        array2=arrayss(6);
        
        // Copiamos los dos arrays en uno y luego lo ordenamos de menor a mayor
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        for(int i=0; i<12;i++){
            menor=9999999;
            for(int h=0; h<12;h++){
                if (array3[h]<menor){
                    menor = array3[h];
                }
            }
            for(int x=0; x<12;x++){
                if (menor==array3[x]){
                    array3[x]=9999999;
                    break;
                }
            }
            array4[i]=menor;
        }
        // Mostramos el ultimo array
        System.out.println(Arrays.toString(array4));     
    }
    public static int [] arrayss(int num) {
        Scanner sc = new Scanner (System.in);
        int numero;
        int [] array2= new int [num];
        for(int i=0; i<6;i++){
            numero = sc.nextInt();
            array2[i]=numero;
        }
        // Ordenadomos el contenido del array
        Arrays.sort(array2);
        // Mostramos el contenido
        System.out.println(Arrays.toString(array2));
        return array2;
        
    }
    
}

/* package tema7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int grupos;
        
        
        System.out.print("¿Cuantos grupos tienes?: ");
        grupos = sc.nextInt();
        double [] [] [] grupo=new double[grupos][5][3];
        for(int i=0; i<grupos;i++){
            grupo[i]=notasTrimes();
        }
        
        System.out.println(grupo[0][0][0]);   
    }
    
    
    public static double [][] notasTrimes() {
        Scanner sc = new Scanner (System.in);
        double alumno, nota1, nota2, nota3;
        double media;
        double [] [] mediaAlumno=new double[5][3];
        
        for(int i=0;i<5;i++){
            System.out.println("Las notas del alumno "+(i+1)+":");
            mediaAlumno[i]=notas();
        }
        return mediaAlumno;  
    }
    
    
    
    public static double [] notas() {
        Scanner sc = new Scanner (System.in);
        double nota1, nota2, nota3;
        double media;
        double [] mediaAlumnoTris=new double[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Trimestre "+(i+1)+"");           
            nota1=sc.nextDouble();
            nota2=sc.nextDouble();
            nota3=sc.nextDouble();
            media = (nota1+nota2+nota3)/3;
            mediaAlumnoTris[i]=media;
        }
        return mediaAlumnoTris;  
    }
} */