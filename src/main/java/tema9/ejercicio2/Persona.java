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
public class Persona {
    
      // Atributos de la persona
    private byte edad;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Nif nif;
    
    
    //Constructores 
//    //public Persona(Nif nif, String nombre, String apellido1, String apellido2, byte edad, short altura){
//        this.nif=nif;
//        this.nombre=nombre;
//        this.apellido1=apellido1;
//        this.apellido2=apellido2;
//        this.edad=edad;
//    }
//    
//    public Persona(Nif nif, String nombre, String apellido1, String apellido2){
//        this.nif=nif;
//        this.nombre=nombre;
//        this.apellido1=apellido1;
//        this.apellido2=apellido2;
//    }
    
    
    
    //Metodos 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(byte edad){
        this.edad=edad;
    }
    
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }  
    
    public String getNombre(){
        return nombre;
    }
    
    public byte getEdad(){
        return edad;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }
    
    public String getnombreCompleto(){
        return nombre+" "+apellido1+" "+apellido2;
    }
    
    public void datosPersona(){
        System.out.print(getnombreCompleto()+"\t"+"\t");
        System.out.print(getEdad()+"\t"+"\t");
        System.out.println(nif.getNif());
        System.out.println("");
    }
    public String getNif(){
        return nif.getNif();
    }
    
    public void setNumero(long numero){
        this.nif = new Nif(numero);
    }

}

