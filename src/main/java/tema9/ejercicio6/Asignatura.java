
package tema9.ejercicio6;

/**
 *
 * @author pcbox
 */
public class Asignatura {
    
    private int identificador;
    private double nota;
    
    public Asignatura(int identificador){
        this.identificador = identificador;
        setNota(5.0);
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(nota<0){
            this.nota=0.0;
        }else if(nota>10){
            this.nota=10.0;
        }else{
            this.nota = nota;
        } 
    }
    
}
