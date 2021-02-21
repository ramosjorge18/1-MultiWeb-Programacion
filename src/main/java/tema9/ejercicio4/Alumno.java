/*Clase de Alumno*/
package tema9.ejercicio4;

import tema9.ejercicio1.CuentaCorriente;
import tema9.ejercicio2.Nif;

/**
 *
 * @author Vespertino
 */
public class Alumno {
    
    private int numeroExpediente;
    private Nif dni;
    private CuentaCorriente cuentaCorriente;
    private String nombreCompleto;
    private byte edad;
    private String [] nombrePadreYMadre;
    
    
    public Alumno(){
        this.nombreCompleto = "Nombre Apellido1 Apellido2";
        this.dni = new Nif();
        this.cuentaCorriente = new CuentaCorriente(0.0);
        this.numeroExpediente = 0;
        this.nombrePadreYMadre = new String[2];
        this.nombrePadreYMadre[0] ="Padre";
        this.nombrePadreYMadre[1] ="Mama";
    }
    
    public Alumno(int numeroExpediente, Nif dni, CuentaCorriente cuentaCorriente, String nombreCompleto,String nombrePadre, String nombreMadre ){
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cuentaCorriente = cuentaCorriente;
        this.numeroExpediente = numeroExpediente;
        this.nombrePadreYMadre = new String[2];
        this.nombrePadreYMadre[0] =nombrePadre;
        this.nombrePadreYMadre[1] =nombreMadre;
    }
    
    public Alumno(int numeroExpediente, Nif dni, CuentaCorriente cuentaCorriente ){
        this.nombreCompleto = "Nombre Apellido1 Apellido2";
        this.dni = dni;
        this.cuentaCorriente = cuentaCorriente;
        this.numeroExpediente = numeroExpediente;
        this.nombrePadreYMadre = new String[2];
        this.nombrePadreYMadre[0] ="Padre";
        this.nombrePadreYMadre[1] ="Mama";
    }

    public Alumno(int numeroExpediente, Nif dni, String nombreCompleto) {
        this.numeroExpediente = numeroExpediente;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.cuentaCorriente = new CuentaCorriente(0.0);
        this.nombrePadreYMadre = new String[2];
        this.nombrePadreYMadre[0] ="Padre";
        this.nombrePadreYMadre[1] ="Mama";
    }
    
    public Alumno(int numeroExpediente, String nombreCompleto ){
        this.nombreCompleto = nombreCompleto;
        this.dni = new Nif();
        this.cuentaCorriente = new CuentaCorriente(0.0);
        this.numeroExpediente = numeroExpediente;
        this.nombrePadreYMadre = new String[2];
        this.nombrePadreYMadre[0] ="Padre";
        this.nombrePadreYMadre[1] ="Mama";
    }
    
    
    public void setNumeroExpediente(int numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }
    
    public int getNumeroExpediente (){
        return numeroExpediente;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombreCompleto (){
        return nombreCompleto;
    }
    
    public void setDni (Nif dni){
        this.dni = dni;
    }
    
    public Nif getDni (){
        return dni;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }
    
    public void setCuentaCorriente(CuentaCorriente cuentaCorriente){
        this.cuentaCorriente = cuentaCorriente;
    }

    public byte getEdad() {
        return edad;
    }
    
    public void setNombrePadre(String nombrePadre){
        this.nombrePadreYMadre[0] =nombrePadre;
    }
    
    public void setNombreMadre(String nombreMadre){
        this.nombrePadreYMadre[1] =nombreMadre;
    }
    
    public String getNombreMadre(){
        return this.nombrePadreYMadre[1];
    }
    
    public String getNombrePadre(){
        return this.nombrePadreYMadre[0];
    }
    
    public String toString(){
        String aux;
        
        aux = this.nombreCompleto + "\t"+this.dni.toString()+"\t"+this.numeroExpediente;
        return aux;
    }
    
    public boolean equals (Alumno x){
        return this.numeroExpediente==x.numeroExpediente && this.dni == x.dni;
    }    
    
}
