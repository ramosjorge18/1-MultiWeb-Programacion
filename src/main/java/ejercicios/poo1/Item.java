/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.poo1;

import java.util.Objects;

/**
 *
 * @author Vespertino
 */
public class Item {
    private String nombre;
    private int numPag;
    private String editorial;
    private int añoPubli;
    private String genero;
    
    
    //Constructor

    public Item(String nombre, int numPag, String editorial, int añoPubli, String genero) {
        setNombre(nombre);
        setNumPag(numPag);
        setEditorial(editorial);
        setFechaPubli(añoPubli);
        setGenero(genero);
    }

    public Item() {
        this("NS", 0, "NS", 0, "NS");
    }
    
    
    //Setters 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getNumPag() {
        return numPag;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\tEditorial: "+editorial+"\tGenero: "+genero+"\tFecha Publicacion: "+añoPubli;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.añoPubli != other.añoPubli) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
