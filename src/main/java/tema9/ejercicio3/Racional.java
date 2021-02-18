/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio3;

/**
 *
 * @author Vespertino
 */
public class Racional {

    //Atributos
    private int numerador;
    private int denominador;

    //Constructores
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //Metodos
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador(int numerador) {
        return this.denominador;
    }

    public int getDenominador(int denominador) {
        return this.denominador;
    }

    public Racional sumaFracciones(Racional x) {
        int n, d;
        if (this.denominador == x.denominador) {
            n = this.numerador + x.numerador;
            d = this.denominador;
        } else {
            n = (this.numerador * x.denominador) + (this.denominador * x.numerador);
            d = this.denominador * x.denominador;
        }
        Racional rac = new Racional(n, d);
        return rac;
    }
    
    public Racional restaFracciones(Racional x) {
        int n, d;
        if (this.denominador == x.denominador) {
            n = this.numerador - x.numerador;
            d = this.denominador;
        } else {
            n = (this.numerador * x.denominador) - (this.denominador * x.numerador);
            d = this.denominador * x.denominador;
        }
        Racional rac = new Racional(n, d);
        return rac;
    }
    
    public Racional multiplicaFracciones (Racional x){
        int n,d;
        
        n = this.numerador*x.numerador;
        d = this.denominador*x.denominador;
        
        Racional rac = new Racional(n, d);
        return rac;
    }
    
    public Racional divideFracciones (Racional x){
        int n, d;
        
        n = this.numerador*x.denominador;
        d = this.denominador*x.numerador;
        
        Racional rac = new Racional(n, d);
        return rac;        
    }
    
    public Racional copiaFraccion(){
        int n, d;
        n = this.numerador;
        d = this.denominador;
        
        Racional rac = new Racional(n, d);
        return rac;
    }
    
    public double calculaReal(){
        return this.numerador/this.denominador;
    }
    
    public boolean equals(Racional x){
        return this.numerador == x.numerador && this.denominador == x.denominador; 
    }
    
    @Override
    public String toString(){
        String aux;
        aux=this.numerador+"\n------\n"+this.denominador+"";
        return aux;
    }

}
