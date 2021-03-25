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
        ComparaEdad comp = new ComparaEdad();
        ComparaSueldo aaaa = new ComparaSueldo();
        Cliente[] lista = new Cliente[10];
        String nombre;
        String apellido;
        long numero;
        byte años;
        float sueldo;
        for(int i=0; i<10;i++){
            sueldo = (float) (Math.random()*100000);
            años = (byte) (Math.random()*130);
            numero = (long) (Math.random()*10000000);
            nombre = Faker.instance().beer().name();
            apellido = Faker.instance().artist().name();
            Nif a = new Nif(numero);
            Cliente cli = new Cliente(nombre, apellido, a,años ,sueldo) ;
            lista[i]=cli;
        }
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        System.out.println("\n\nOrdenados\n\n");
        Arrays.sort(lista);
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        System.out.println("");
        Arrays.sort(lista,comp);
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        System.out.println("");
        Arrays.sort(lista,aaaa);
        for(int i=0; i<10;i++){
            System.out.println(lista[i]);
        }
        
        
    }
    
}
