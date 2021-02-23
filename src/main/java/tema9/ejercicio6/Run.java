
package tema9.ejercicio6;

import java.text.DecimalFormat;

/**
 *
 * @author pcbox
 */
public class Run {
    public static void main(String[] args) {
        Asignatura x = new Asignatura(1);
        Asignatura x2 = new Asignatura(2);
        Asignatura x3 = new Asignatura(3);
        Alumno oscar = new Alumno(1, "Oscar Tu Papi");
        Profesor david = new Profesor();
        DecimalFormat f = new DecimalFormat("#.##");
        
        
        oscar.setAsignatura1(x);
        oscar.setAsignatura2(x2);
        oscar.setAsignatura3(x3);
        
        david.ponerNota(oscar);
        System.out.println("La meida de " + oscar.getNombre()+ " es:");
        System.out.println(f.format(david.setMedia(oscar)));
        
        
    }
    
}
