/* Codifica ahora la clase Hora12 que funciona de forma similar a la clase Hora,
con la diferencia de que las horas solo pueden tomar un valor entre 1 y 12 de la mañana a la tarde mediante "am" o "pm". 
 */
package tema9.ejercicio7;

/**
 *
 * @author Vespertino
 */
public class Reloj12 extends Reloj{
    
    private boolean pm;
    private byte hora;
    private byte minutos;
    private byte segundos;

    public Reloj12(byte hora, byte minutos, byte segundos) {
        super(hora, minutos, segundos);
        
        valida(getHora(), getMinutos(), getSegundos());
    }
    
    
    @Override
    public String toString() {
        String formato="am";
        if(pm){
            return  hora + ":" + minutos + ":" + segundos+"PM";
        }else{
            return  hora + ":" + minutos + ":" + segundos+"AM";
        } 
    }
    
    public void siguiente (int segundos){
        super.siguiente(segundos);
        valida(getHora(), getMinutos(), getSegundos());  
    }
    
    public void anterior(int segundos){
        super.anterior(segundos);
        valida(getHora(), getMinutos(), getSegundos());
    }
    
    private void valida(byte hora, byte minutos, byte segundos){
        this.minutos=super.getMinutos();
        this.segundos = super.getSegundos();
        if(super.getHora()>12){
            this.hora=(byte) (super.getHora()-12);
            if(this.hora == 12){
                this.pm= false;
            }else{
                this.pm = true;
            }
        }else {
            this.hora=(byte) (super.getHora());
            if(this.hora == 12){
                this.pm= true;
            }else{
                this.pm = false;
            }
            
        }
    } 
}
