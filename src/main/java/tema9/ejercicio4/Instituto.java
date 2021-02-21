/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio4;

import com.github.javafaker.Faker;

/**
 *
 * @author Vespertino
 */
public class Instituto {
    public static final int NUMEROCURSOS = 10;
    private String nombreInstituto;
    private String direccionInstituto;
    private Curso[] cursos;

    public Instituto() {
        Faker f = new Faker();
        cursos = new Curso[10];
        int num = 1;
        
        this.nombreInstituto = f.name().nameWithMiddle();
        this.direccionInstituto = f.address().streetName();
        
        for(int i=0;i<Math.random()*NUMEROCURSOS;i++){
            
            Curso p = new Curso(num,f.name().title());
            cursos[i]= p;
            num = num+20;
            
        } 
    }
    
    public String consultaAlumno(int numExpediente){
        Alumno x = new Alumno();
        Alumno y;
        String a="";
        for(int i=0; i<this.cursos.length;i++){
            if(this.cursos[i]==null){
                a= "Alumno no encontrado";
            }else{
                y = this.cursos[i].consulta(numExpediente);
                if(!y.equals(x)){
                    a = y.toString();
                    return a;
                }
            }
        }
        return a;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<cursos.length;i++){
            if (cursos [i]==null){
                break;
            }else{
                sb.append(cursos[i].toString());
                sb.append("\n");
            }
        }
        return sb.toString();
        
    }
    
    
}
