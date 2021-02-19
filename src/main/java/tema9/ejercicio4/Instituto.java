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
    
//    public String listadoGeneral(){
//        StringBuilder sb = new StringBuilder();
//        
//    }
    
}
