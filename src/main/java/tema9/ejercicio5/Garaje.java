
package tema9.ejercicio5;

/**
 *
 * @author pcbox
 */
public class Garaje {
    
    private Coche vehiculo;
    private String averia;
    private int nCoches;
    private boolean ocupado;
    
    
    

    public String getAveria() {
        return averia;
    }

    public Coche getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Coche vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void setAveria(String averia) {
        this.averia = averia;
    }
    
    public boolean aceptaCoche (Coche coche, String averia){
        if(ocupado==false){
            setVehiculo(coche);
            setAveria(averia);
            coche.sumaAverias(Math.random()*300);
            this.ocupado = true;
            if(this.averia.equals("aceite")){
                coche.getMotor().añadeLitros();
            }
        }
        return this.ocupado;   
    }
    public void devuelveCoche(){
        this.ocupado=false;
        this.averia="";
        this.nCoches++;
    }

    @Override
    public String toString() {
        return "Garaje{ nCoches=" + nCoches + ", ocupado=" + ocupado + '}';
    }

    
    
}
