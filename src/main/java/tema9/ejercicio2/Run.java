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
        Faker f = new Faker();
        
        // Introducimos a las personas en el Mapa de datos  
        for (int i = 0; i < 50; i++) {
            Persona p = new Persona();

            p.setNombre(f.name().firstName());
            p.setApellido1(f.name().lastName());
            p.setApellido2(f.name().lastName());
            p.setEdad((byte)( Math.random()*125));
            p.setNumero((long) (Math.random()*99999999));
            
            alum.put(p.getNif(), p);
        }
        
        //Sacamos las claves y mostramos todos las Personas
        key = new LinkedHashSet<>(alum.keySet());
        Iterator<String> punt = key.iterator();
        
        while(punt.hasNext()){
            Persona p = new Persona();
            p=alum.get(punt.next());
            p.datosPersona();
        }
        
    }

}
