/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo1;

/**
 *
 * @author Vespertino
 */
public class Revista extends Item{
    private int numeroRevista;
    private String adjunto;

    public Revista(int numeroRevista, String adjunto, String nombre, int numPag, String editorial, int añoPubli, String genero) {
        super(nombre, numPag, editorial, añoPubli, genero);
        this.numeroRevista = numeroRevista;
        this.adjunto = adjunto;
    }

    @Override
    public String toString() {
        return super.toString()+"\nNumero de Revista: "+numeroRevista+"\tAdjunto: "+adjunto;
    }
    
    
    
}
