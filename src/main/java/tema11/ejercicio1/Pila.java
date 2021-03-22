/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.ejercicio1;

/**
 *
 * @author Vespertino
 */
public interface Pila {
    
    public abstract boolean crear();
    public abstract boolean apilar(Object o);
    public abstract Object desapilar();
    public abstract Object cima();
    public abstract boolean vacia();
    
}
