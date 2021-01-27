/*Preparando el reloj */
package programame;

import java.text.DecimalFormat;

public class P483 {
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
        String hora1, hora2, campanadas, campanada;
        int numeroCampanadas, numeroCampanada;
        int h1, h2, m1, m2, s1, s2, sTotal, mTotal, hTotal;
        double totalSegundos1, totalSegundos2, resultado, resultado2;
        
        hora1 = sc.next();
        hora2 = sc.next();
        
        String [] divide = hora1.split(":");
        h1 = Integer.parseInt(divide[0]);
        m1 = Integer.parseInt(divide[1]);
        s1 = Integer.parseInt(divide[2]);
        totalSegundos1 = (h1 * 3600) + (m1 * 60) + s1;
        
        divide = hora2.split(":");
        h2 = Integer.parseInt(divide[0]);
        m2 = Integer.parseInt(divide[1]);
        s2 = Integer.parseInt(divide[2]);
        totalSegundos2 = (h2 * 3600) + (m2 * 60) + s2;
        
        if (totalSegundos1>totalSegundos2){
            totalSegundos2 += 24*3600;
        }
        
        resultado = totalSegundos2-totalSegundos1;
        
        campanadas = sc.next();
        campanada = sc.next();
        numeroCampanadas = Integer.parseInt(campanadas);
        numeroCampanada = Integer.parseInt(campanada);
        
        resultado = resultado/(numeroCampanadas-1);
        
        if (numeroCampanada==1){
            resultado2 = totalSegundos1;
        }else{
            resultado2 = totalSegundos1 + (resultado * (numeroCampanada - 1));
        }
        
        
        sTotal = (int) (resultado2 % 60);
        mTotal = (int) (resultado2 / 60) % 60;
        hTotal = (int) (resultado2 /3600) % 24;
        
        
        DecimalFormat df = new DecimalFormat ("00");
        System.out.println(df.format(hTotal)+":"+df.format(mTotal)+":"+df.format(sTotal));  
    }
    
}
