/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.codigo;

/**
 *
 * @author Vespertino
 */
public class Test {

    public static void main(String[] args) {
        Articulo x1 = new Articulo(1, "AGUA", 0.80);
        Articulo x2 = new Articulo(1, "AGUA", 0.80);
        Articulo x3 = new Articulo(2, "SAL", 1.80);
        Articulo x4 = new Articulo(3, "VINO", 10.20);
        Articulo x5 = new Articulo(4, "pepe", 0.0);
        Nif a = new Nif(16639231);
        Cliente david = new Cliente(a, "David", "Doce Ligero", "Logroño", "LA Rioja", 26004);

        Factura primera = new Factura(10, david, 21);

        primera.añadirArticulo(x1);
        primera.añadirArticulo(x2);
        primera.añadirArticulo(x3);
        primera.añadirArticulo(x4);
        System.out.println(primera);

    }

}
