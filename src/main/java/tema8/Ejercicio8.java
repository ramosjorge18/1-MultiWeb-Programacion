/*8. Realiza un programa en Java donde vamos a ir analizando un String para verificar si es
equilibrada o no en símbolos de paréntesis, recorriendo todos sus caracteres desde el inicio
hasta el final. Para ello crea un método que recoja un String y devuelva un lógico. */
package tema8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import misfunciones.IntroducirDatos;

public class Ejercicio8 {
    public static void main(String[] args) {
        String palabras;
        
        palabras=IntroducirDatos.dato("Introduce ecuacion: ");
        System.out.println(parentesis(palabras));
        
        
        
    }
    
    public static boolean parentesis(String frase) {
        int abreParent=0, cierraParent=0;
        char caracter;
        
        for(int i=0;i<frase.length();i++){
            caracter=frase.charAt(i);
            if(caracter=='(')
                abreParent++;
            if(caracter==')')
                cierraParent++;
            if(cierraParent>abreParent){
                return false;
            }    
        }
        return abreParent==cierraParent;
    }
}
