/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programame;

/**
 * CASOS LIMITADOS A UN NUMERO INICIAL
 * La abuela María
 * Es el ejercicio 337 de Acepta el reto
 *
 * @author Charo 
 * @version 18.02.2016
 */
public class Tipo1
{
    static java.util.Scanner entrada;
   
    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba()
    {
	// Aqui metemos el codigo de cada caso de prueba
    }
}
