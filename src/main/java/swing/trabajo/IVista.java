package swing.trabajo;

/**
 *
 * @author J.Ramos
 */
public interface IVista {
    public abstract String getNombre();
    public abstract void setNombre(String nombre);
    
    public abstract String getApellido1();
    public abstract void setApellido1(String apellido1);
    
    public abstract String getApellido2();
    public abstract void setApellido2(String apellido2);
    
    public abstract byte getEdad();
    public abstract void setEdad(byte edad);
    
    public abstract Nif getDni();
    public abstract void setNif(long dni);
    
    public abstract double getSaldo();
    public abstract void setSaldo(double saldo);
    
    public abstract String getDireccion();
    public abstract void setDireccion(String direccion);
    
    public abstract void setControlador(/*Controlador c*/);
    public abstract void mostrar(); // Dice que se visualice la IGU (interfaz grafica Usuario)
    
    
    
    
    
    
    
}
