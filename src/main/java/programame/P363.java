/* Las Calorias */
package programame;

public class P363{

    static java.util.Scanner sc;

    public static void main(String args[]) {
        sc = new java.util.Scanner(System.in);

        while (casoDePrueba()) {
        }
    }

    private static boolean casoDePrueba() {
        int caloriasEntrenamiento, comidas, caloriasTotal=0, calorias, resultado;
        String caloriasComida;
        caloriasEntrenamiento = sc.nextInt();
        
        if (caloriasEntrenamiento==0) { // CASO DE SALIDA
            return false;
        }
        // Calculamos la entrada y mostramos salida
        comidas =sc.nextInt();
        for (int i=0;i<comidas;i++){
            caloriasComida = sc.next();
            calorias = Integer.parseInt(caloriasComida);
            caloriasTotal += calorias;
        }
        resultado = caloriasTotal/caloriasEntrenamiento;
        if (caloriasTotal%caloriasEntrenamiento!=0){
            System.out.println(resultado+1);
        }else
            System.out.println(resultado);
        
        return true;
    }
}
