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
public class Run {
    public static void main(String[] args) {
        Biblioteca logroño = new Biblioteca("Logroño", 200);
        Libros x1 = new Libros("Jorge", 123456, "Señor de Los Anillos", 200, "Pepe", 2020, "Animacion");
        Libros x2 = new Libros("Jorge", 123456, "Señor de Los Anillos 2", 200, "Pepe", 2020, "Animacion");
        Libros x3 = new Libros("Jorge", 123456, "Harry Potter", 200, "Pepe", 2020, "Magia");
        Libros x4 = new Libros("Jorge", 123456, "Señor de Los Anillos", 200, "Pepe", 2020, "Animacion");
        Revista p1 = new Revista(1, "", "Belen", 10, "Pepe", 2020, "Animacion");
        Revista p2 = new Revista(1, "", "Coches", 10, "Pepe", 2020, "Magia");
        Revista p3 = new Revista(1, "", "Paco El Rey", 10, "Pepe", 2020, "Animacion");
        
        logroño.altaItem(x1);
        logroño.altaItem(x2);
        logroño.altaItem(x3);
        logroño.altaItem(p1);
        logroño.altaItem(p2);
        logroño.altaItem(p3);
        System.out.println(logroño.getNumeroItems());
        logroño.bajaItem(p3);
        System.out.println(logroño.getNumeroItems());
        System.out.println(logroño.listaRevistas());
        System.out.println(logroño.listaLibros());
        System.out.println(logroño.listaItems());
        
        
    }
    
}
