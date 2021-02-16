/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio2;

/**
 *
 * @author Vespertino
 */
public class Nif {
    // Atributos Nif
    private long dni;
    private char letraDni;
    
    //Constructores
    public Nif(long dni, char letraDni){
        this.dni = dni;
        this.letraDni = letraDni;
    }
    
    public Nif(long dni){
        this.dni=dni;
        letraDni(dni);    
    }
    
    public void letraDni(long dni){
        byte resto = (byte) (dni%23);
        String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
    
        this.letraDni = letras.charAt(resto);  
    }
    
    public String getNif(){
        String nif;
        return nif=this.dni+"-"+this.letraDni;
    }
}
