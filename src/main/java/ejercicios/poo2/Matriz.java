
package ejercicios.poo2;

/**
 *
 * @author Vespertino
 */
public class Matriz {
    private int lineas;
    private int [][] cuadrado;

    public Matriz(int lineas) {
        this.lineas = lineas;
        this.cuadrado= new int[lineas][lineas];
    }

    public void setLineas(int lineas) {
        this.lineas = lineas;
    }

    public int getLineas() {
        return lineas;
    }
    
    public void rellenar(int n){
        byte i = 1;
        for (int f=0; f<cuadrado.length;f++){
            for(int c=0; cuadrado[f]!=null && c<cuadrado[f].length;c++){
                    cuadrado[f][c]= i;
                    i++;
                    if(i==n+1){
                        i=1;
                    }
            }
        }
    }
    
    public void mostrar(){
        for (int f=0; f<cuadrado.length;f++){
            System.out.println("");
            for(int c=0; cuadrado[f]!=null && c<cuadrado[f].length;c++){
                System.out.print(cuadrado[f][c]+" ");
            }
        }
    }
    
    
    
    
    
}
