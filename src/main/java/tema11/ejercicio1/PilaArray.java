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
public class PilaArray implements Pila {

    private Object[] datos;
    private int tam;

    public PilaArray(int tam) {
        this.tam = tam;
    }

    @Override
    public boolean crear() {
        Integer a = -1;
        this.datos = new Object[tam];
        int f=0;
        for(;f<datos.length;f++){
            datos[f] = a;
        }
        return true;
    }

    @Override
    public boolean apilar(Object o) {
        Integer a = -1;
        for(int f =0;f<datos.length;f++){
            if(datos[f]==a){
                datos[f]=o;
                return true;
            }
        }
        return false;
    }

    @Override
    public Object desapilar() {
        Integer a = -1;
        Object retorna;
        for(int f =datos.length-1;f>-1;f--){
            if(datos[f]!=a){
                retorna=datos[f];
                datos[f]=a;
                return retorna;
            }
        }
        return false;
    }

    @Override
    public Object cima() {
        Integer a = -1;
        Object retorna;
        for(int f =datos.length-1;f>-1;f--){
            if(datos[f]!=a){
                retorna=datos[f];
                return retorna;
            }
        }
        return false;
    }

    @Override
    public boolean vacia() {
        Integer a = -1;
        Object retorna;
        for(int f =datos.length-1;f>-1;f--){
            if(datos[f]!=a){
                
                return false;
            }
        }return true;
    }
    
    public void borra(){
        Integer a = -1;
        this.datos = new Object[tam];
        int f=0;
        for(;f<datos.length;f++){
            datos[f] = a;
        }
    }

}
