/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio2;


import com.github.javafaker.Faker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


/**
 *
 * @author Vespertino
 */
public class Run {

    public static void main(String[] args) {        
        LinkedHashMap<String, Persona> alum = new LinkedHashMap();
        LinkedHashSet<String> key;
        Persona p;        
        Faker f = new Faker();        
        // Introducimos a las personas en el Mapa de datos  
        
        for (int i = 0; i < 50; i++) {            
            p = new Persona();
            p.setNombre(f.name().firstName());
            p.setApellido1(f.name().lastName());
            p.setApellido2(f.name().lastName());
            p.setEdad((byte)( Math.random()*125));
            p.setNumero((long) (Math.random()*99999999));            
            // Introducimos el nif            
            alum.put(p.getNif(), p);
        }
        
        //Sacamos las claves y mostramos todos las Personas
        key = new LinkedHashSet<>(alum.keySet());
        Iterator<String> punt = key.iterator();
        System.out.println("NOMBRE\t\tEDAD\t\tDNI");
        System.out.println("------\t\t----\t\t---");
        while(punt.hasNext()){
            p = new Persona();
            p=alum.get(punt.next());
            System.out.println(p.toString());
        }
        
    }

}
