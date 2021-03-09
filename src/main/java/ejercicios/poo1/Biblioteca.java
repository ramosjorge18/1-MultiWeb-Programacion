/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Vespertino
 */
public class Biblioteca {
    private String nombre;
    private String direccion;
    private int numeroItems;
    private int numPlazas;
    private HashMap<String,Item> listaItems;

//    listaPorTema(tematica);

    public Biblioteca(String nombre, int numPlazas) {
        this.nombre = nombre;
        this.numPlazas = numPlazas;
        this.direccion="";
        this.numeroItems=0;
        this.listaItems = new HashMap();
    }

    public int getNumeroItems() {
        return numeroItems;
    }
    
    public boolean altaItem(Item objeto){
        if(!listaItems.containsKey(objeto.getNombre())){
            listaItems.put(objeto.getNombre(), objeto);
            numeroItems++;
            return true;
        }
        return false;
    }
    
    public boolean bajaItem(Item objeto){
        if(listaItems.containsKey(objeto.getNombre())){
            listaItems.remove(objeto.getNombre());
            numeroItems--;
            return true;
        }
        return false;
    }
    
    public String listaItems(){
        StringBuilder sb = new StringBuilder("");
        Set k;
        k = listaItems.keySet();
        Iterator<Item> punt = k.iterator();
        Item prueba;
        
        while(punt.hasNext()){
            prueba = listaItems.get(punt.next());
            sb.append(prueba.toString());
            sb.append("\n"); 
            
        }
        return sb.toString();
    }
    
    public String listaRevistas(){
        StringBuilder sb = new StringBuilder("REVISTAS\n");
        Set k;
        k = listaItems.keySet();
        Iterator<Item> punt = k.iterator();
        Item prueba;
        while(punt.hasNext()){
            prueba = listaItems.get(punt.next());
            if(prueba instanceof Revista){
               sb.append(prueba.toString());
               sb.append("\n"); 
            }
            
        }
        return sb.toString();
    }
    
    public String listaLibros(){
        StringBuilder sb = new StringBuilder("LIBROS\n");
        Set k;
        k = listaItems.keySet();
        Iterator<Item> punt = k.iterator();
        Item prueba;
        while(punt.hasNext()){
            prueba = listaItems.get(punt.next());
            if(prueba instanceof Libros){
               sb.append(prueba.toString());
               sb.append("\n"); 
            }
            
        }
        return sb.toString();
    }
    
    public String listaGenero(String genero){
        StringBuilder sb = new StringBuilder("");
        sb.append(genero);
        sb.append("\n");
        Set k;
        k = listaItems.keySet();
        Iterator<Item> punt = k.iterator();
        Item prueba;
        
        while(punt.hasNext()){
            prueba = listaItems.get(punt.next());
            if(prueba.getGenero().equals(genero)){
                sb.append(prueba.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
