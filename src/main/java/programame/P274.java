/* Semanas */
package programame;

public class P274 {
    static java.util.Scanner sc;
   
    public static void main (String args[]) 
    {
        sc = new java.util.Scanner(System.in);
        int numCasosDePrueba = sc.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            casoDePrueba();
        }
    }

    private static void casoDePrueba(){
        int diasAño, diasSemana, comienzaAño, resultado;
        
        diasAño = sc.nextInt();
        diasSemana = sc.nextInt();
        comienzaAño = sc.nextInt();
        
        if(comienzaAño==1){
            resultado = diasAño/diasSemana;
        }else{
            resultado = ((diasAño)-(diasSemana-(comienzaAño-1)))/diasSemana;
        }
        System.out.println(resultado);
	// Aqui metemos el codigo de cada caso de prueba
    }
    
}
