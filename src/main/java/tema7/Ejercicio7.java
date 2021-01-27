/* Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas
(números enteros) del primer, segundo y tercer trimestre de un grupo (leer todas las notas de
cada trimestre a la vez y luego splitear). Debemos mostrar al final la nota media del grupo por
cada trimestre (con decimales), y la media del alumno (con decimales) que se encuentra en la
posición pos (dicha posición se leerá por teclado). Se deben validar todas las entradas. */
package tema7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grupos, mediaGrupo, mediaAlumno, mediaTrimess;

        System.out.print("¿Cuantos grupos tienes?: ");
        grupos = sc.nextInt();

        double[][] grupo = new double[grupos][5];

        for (int i = 0; i < grupos; i++) {
            grupo[i] = notas();
        }
        
        System.out.println(mediaTrimestre(grupos, grupo));
        System.out.println("¿De que alumno deseas la media? grupo + alumno");
        mediaGrupo = sc.nextInt();
        mediaGrupo = mediaGrupo-1;
        mediaAlumno = sc.nextInt();
        mediaAlumno = mediaAlumno-1;
        System.out.println(grupo[mediaGrupo][mediaAlumno]);
    }

    public static double[] notas() {
        Scanner sc = new Scanner(System.in);
        double alumno, nota1, nota2, nota3;
        double media;
        double[] mediaAlumno = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Las notas del alumno " + (i + 1) + ":");
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();
            media = (nota1 + nota2 + nota3) / 3;
            mediaAlumno[i] = media;
        }
        return mediaAlumno;
    }

    public static double mediaTrimestre(int num, double[][] gru) {
        Scanner sc = new Scanner(System.in);
        double mediaTrimes = 0;
        int trimes;

        System.out.println("¿De que trimestre deseas saber la media?");
        trimes = sc.nextInt();

        for (int i = 0; i < num; i++) {
            mediaTrimes = mediaTrimes + gru[i][trimes];
        }
        return mediaTrimes;

    }
}
