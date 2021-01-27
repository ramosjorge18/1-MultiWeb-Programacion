package programame;

public class P272 {
    static java.util.Scanner entrada;
   
    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        int numCasosDePrueba = entrada.nextInt();

        for (int i = 0; i < numCasosDePrueba; i++) {
            int num = entrada.nextInt();
            base6(num);
            System.out.println("");
        }
    }

    private static void base6(int num)
    {
        int hexa;
        if (num==0){
            System.out.print("0");
        }else if (num==1){
            System.out.print("1");
        }else if (num==2){
            System.out.print("2");
        }else if (num==3){
            System.out.print("3");
        }else if (num==4){
            System.out.print("4");
        }else if (num==5){
            System.out.print("5");
        }else{
            hexa = (num%6);
            base6(num/6);
            System.out.print(hexa);
        }
    }
    
}


