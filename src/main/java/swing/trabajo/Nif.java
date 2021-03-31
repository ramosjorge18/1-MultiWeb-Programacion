package swing.trabajo;

import java.util.*;

/**
 *
 * @author Vespertino
 */
public class Nif {
    // Atributos Nif
    private long dni;
    private char letraDni;
    
    //Constructores
    public Nif(){ // Defecto
        this.dni = 0;
        this.letraDni=' ';
    }
    
    public Nif(long dni){
        this.dni  =dni;
        letraDni();
    }
    
    private void letraDni(){
        byte resto = (byte) (this.dni%23);
        String letras ="TRWAGMYFPDXBNJZSQVHLCKE";
    
        this.letraDni = letras.charAt(resto);  
    }
    
    public long getNif(){
        return this.dni;
    }
    
    public void setNif(long dni) {
        this.dni = dni;
        letraDni();        
    }
    
    public void leerDNI(){
        Scanner s = new Scanner (System.in);
        System.out.print("DNI:");
        setNif(s.nextLong());        
    }
    
    @Override
    public String toString() { // Metodo mostrar
        String aux;
        aux = getNif() + "-" + this.letraDni+"";
        return aux;                
    }
    
    
}
