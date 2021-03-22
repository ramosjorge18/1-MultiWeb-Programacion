/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio1;

import java.util.LinkedList;

/**
 *
 * @author Vespertino
 */
public class PilaLinked implements Pila{
    
    private LinkedList <Object> datos;
    

    @Override
    public boolean crear() {
        datos = new LinkedList<>();
        return true;
    }

    @Override
    public boolean apilar(Object o) {
        datos.addLast(o);
        return true;
    }

    @Override
    public Object desapilar() {
        Object ret = datos.peekLast();
        datos.pollLast();
        return ret;
    }

    @Override
    public Object cima() {
        Object ret = datos.peekLast();
        return ret;
    }

    @Override
    public boolean vacia() {
        return datos.isEmpty();
    }
    
}
