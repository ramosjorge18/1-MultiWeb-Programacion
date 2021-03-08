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
public class Libros extends Item{
    private String autor;
    private int isbn;

    public Libros(String autor, int isbn, String nombre, int numPag, String editorial, int añoPubli, String genero) {
        super(nombre, numPag, editorial, añoPubli, genero);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String toString() {
        return super.toString()+"\nAutor: "+autor+"\tISBN: "+isbn;
    }
    

    
}
