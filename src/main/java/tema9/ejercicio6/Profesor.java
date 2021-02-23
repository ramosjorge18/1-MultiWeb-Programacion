
package tema9.ejercicio6;

import java.text.DecimalFormat;

/**
 *
 * @author pcbox
 */
public class Profesor {
    private String nombreProfesor;
    
    public Profesor(){
        setNombreProfesor("David TheBest");
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }
    
    public void ponerNota(Alumno estudiante){
        Asignatura [] asignaturas;
        asignaturas = estudiante.getAsignaturas();
        
        for(int i=0;i<asignaturas.length;i++){
            asignaturas[i].setNota(Math.random()*10);
        }
    }
    
    public double setMedia(Alumno estudiante){
        Asignatura [] asignaturas;
        double sumaTotal=0.0;
        int cont=0;
        
        asignaturas = estudiante.getAsignaturas();
        
        for(int i=0;i<asignaturas.length;i++){
            sumaTotal = sumaTotal+asignaturas[i].getNota();
            cont++;
        }
        return sumaTotal/cont;  
    }
    

}
