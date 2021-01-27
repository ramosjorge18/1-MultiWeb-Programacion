/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programame;

/**
 *
 * @author ProfVespertino
 */
/**
 * CASOS ILIMITADOS De nuevo en el bar de Javier Es el ejercicio 108 de Acepta
 * el reto
 *
 * @author Charo
 * @version 30.03.2016
 */
public class Tipo3 {

    static java.util.Scanner entrada;

    public static void main(String args[]) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba());
    }

    private static boolean casoDePrueba() {
        if (!entrada.hasNext()) {
            return false;
        }
        System.out.println("Entrada: " + entrada.next());
        return true;
    }
}
