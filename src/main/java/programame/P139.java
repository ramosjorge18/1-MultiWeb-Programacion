/* CubiFinitos */
package programame;

import java.util.HashSet;

public class P139 {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        String dato = sc.nextLine();
        String num;
        HashSet<Integer> lista = new HashSet();
                
        if (dato.equals("0")) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        if (dato.equals("1")){
            System.out.println((dato)+ " -> cubifinito.");
        }
        else {
            System.out.print((dato)+" - ");
            
            while (true){ 
                int nume = numeroCubifinito(dato);
                if(nume==1){
                    System.out.println(nume+" -> cubifinito.");
                    break;
                }else if (lista.contains(nume)){
                    System.out.println(nume+ " -> no cubifinito.");
                    break;
                }else{
                    lista.add(nume);
                    System.out.print(nume+" - ");
                    dato = nume+"";
                }
            }
        }
        
        return true;
    }
    
    public static int numeroCubifinito (String dato){
        char num;
        int numero, suma=0;
        int [] cuboNumeros = new int [dato.length()];
        
        for (int i=0; i<dato.length();i++){
            num = dato.charAt(i);
            numero = num - '0';
            cuboNumeros [i] = (int) Math.pow(numero, 3);
            suma += cuboNumeros[i];
        }
        
        return suma;
    }  
}
