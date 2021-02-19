/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio4;

import com.github.javafaker.Faker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import tema9.ejercicio2.Nif;

/**
 *
 * @author Vespertino
 */
public class Curso {
    
    private String nombreCurso;
    private TreeMap<Integer, Alumno> estudiantes;
    
    
    public Curso(String nombreCurso, int numExpediente){
        Faker f = new Faker();
        
        this.nombreCurso = nombreCurso;
        for(int i=0; i<20;i++){
            Nif dni = new Nif((long) (Math.random()*99999999));
            Alumno x = new Alumno((int)numExpediente, dni, f.name().firstName());
            this.estudiantes.put(numExpediente, x);  
        }
    }
    
    public String toString(){
        LinkedHashSet<Integer> alum;
        alum = new LinkedHashSet<>(this.estudiantes.keySet());
        StringBuilder sb = new StringBuilder();
        
        Iterator <Integer> punt = alum.iterator();
        
        while (punt.hasNext()){
            sb.append(this.estudiantes.get(punt.next().toString()));
            sb.append("\t\t\n");  
        }
        return sb.toString(); 
    }
    
    public Alumno consulta(int numExpediente){
        if(this.estudiantes.containsKey(numExpediente)==false){
            Alumno x = new Alumno();
            return x;
        }else{
            return this.estudiantes.get(numExpediente);
        }
    }
    
    public boolean modificacion(int numExpediente, Alumno x){
        if(this.estudiantes.containsKey(numExpediente)==false){
            return false;
        }else{
            this.estudiantes.remove(numExpediente);
            Alumno nuevo = x;
            this.estudiantes.put(numExpediente, nuevo);
            return true;
        }
    }
    
    
}

