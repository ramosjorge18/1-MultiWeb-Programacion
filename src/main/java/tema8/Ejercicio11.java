/* 11. Escribir un programa que permita gestionar la base de datos de clientes de una empresa. Los
clientes se guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor
será un array de String con los datos del cliente (nombre, dirección, teléfono, correo,
preferente), donde preferente tendrá el valor true si se trata de un cliente preferente. */
package tema8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import static tema8.Ejercicio11.añadeCliente;

public class Ejercicio11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<String, String[]> clientes = new HashMap();
        String clave;
        int numero;
        do {

            numero = sc.nextByte();

            switch (numero) {
                case 1:
                    clave = sc.nextLine();

                    if (!clientes.containsKey(clave)) {
                        clientes.put(clave, añadeCliente(clientes));
                    }else {
                        System.out.println("Ya esta esa clave");
                    }
                case 2:
                    borraCliente(clientes);
                case 3:
                    muestraYModificaCliente(clientes);

            }
        } while (numero != 7);

    }

    public static String[] añadeCliente(Map cliente) {

        String clave = sc.nextLine();
        String[] datos = new String[5];
        String dato;
        byte f = 0;

        do {
            dato = sc.nextLine();
            datos[f] = dato;
            f++;
        } while (f < datos.length);
        return datos;
    }

    public static void borraCliente(Map clientes) {
        String clave = sc.nextLine();

        if (clientes.containsKey(clave)) {
            clientes.remove(clave);
        } else {
            System.out.println("Ese cliente no existe");
        }
    }
    
    public static void muestraYModificaCliente (Map clientes){
        String clave = sc.nextLine();
        
        if((clientes.containsKey(clave))){
            muestraArray((String[]) clientes.get(clave));
            clientes.remove(clave);
            clientes.put(clave, modificaCliente(clientes, clave));   
        }else{
            System.out.println("Ese cliente no existe");
        }
        
        
        
          
    }
    public static void muestraArray(String [] array) {
        for (int f=0; f<array.length;f++){
            System.out.println(array[f]); 
        }
    }
    
    public static String[] modificaCliente(Map cliente, String clave) {
        String[] datos = new String[5];
        String dato;
        byte f = 0;

        do {
            dato = sc.nextLine();
            datos[f] = dato;
            f++;
        } while (f < datos.length);
        return datos;
    }
}
