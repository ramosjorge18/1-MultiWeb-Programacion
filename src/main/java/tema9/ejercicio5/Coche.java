
package tema9.ejercicio5;

/**
 *
 * @author pcbox
 */
public class Coche {
    
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAverias;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioAverias(double precioAverias) {
        this.precioAverias = precioAverias;
    }
    public void sumaAverias(double precioAveria){
        this.precioAverias =  this.precioAverias + precioAveria;
    }

    @Override
    public String toString() {
        return "Coche{" + motor.toString() + ", marca=" + marca + ", modelo=" + modelo + ", precioAverias=" + precioAverias + '}';
    }
    
    
 
    
    
}
