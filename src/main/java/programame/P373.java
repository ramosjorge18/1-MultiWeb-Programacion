/*Cubos Visibles*/
package programame;

public class P373 {
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
        long cubos, resultado;
        
        cubos = sc.nextLong();
        
        if (cubos ==1){
            System.out.println("1");
        }else{
            resultado= (cubos*cubos*cubos-(cubos-2)*(cubos-2)*(cubos-2));
            System.out.println(resultado);
        }
	// Aqui metemos el codigo de cada caso de prueba
    }
    
}
