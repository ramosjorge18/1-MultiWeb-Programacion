/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio2;

import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
import tema10.ejercicio4.Nif;

/**
 *
 * @author Vespertino
 */
public class Test {
    public static void main(String[] args) {
        Cliente[] lista = new Cliente[10];
        for(int i=0; i<10;i++){
            Nif a = new Nif(Faker.instance().number().randomNumber());
            Cliente b = new Cliente(Faker.instance().beer().name(), Faker.instance().artist().name(), a);
            lista[i]=b;
        }
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        System.out.println("\n\nOrdenadors\n\n");
        Arrays.sort(lista);
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        
        
    }
    
}
