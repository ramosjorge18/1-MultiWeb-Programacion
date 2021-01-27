/* Números reversibles */
package programame;

public class P193 {
    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        String dato, numeroReves="", resultado;
        long numero1, numero2, total;
        int reversible;
        int longitud;
        int [] numeros;
        
        dato = sc.nextLine();
        longitud = dato.length();
        if (dato.equals("0")) { // CASO DE SALIDA
            return false;
        }
        
        numero1 = Integer.parseInt(dato);
        numeros = new int [longitud];
        
        if (dato.charAt(longitud-1)=='0'){
            System.out.println("NO");
        }else{
            for(int i=0;i<longitud;i++){
                numeros[i]= dato.charAt(i) - '0';
            }
            for (;longitud>0;longitud--){
                numeroReves += numeros[longitud-1]+"";
            }
            numero2 = Integer.parseInt(numeroReves);
        
            total = numero1+numero2;
        
            resultado = total+"";
            
            for(int i=0;i<resultado.length();i++){
                reversible = resultado.charAt(i)-'0';
                if(reversible%2==0){
                    System.out.println("NO");
                    break;
                }else if (i==resultado.length()-1){
                    System.out.println("SI");
                }
            
            }
        }
        return true;
    }
}