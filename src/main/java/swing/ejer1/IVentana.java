/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ejer1;

/**
 *
 * @author Vespertino
 */
public interface IVentana {
    public abstract double getDato1();
    public abstract double getDato2();
    public abstract String Operacion();
    public abstract void setResultado(double a);
    // Controlador
    public abstract void setControlador(Controlador c);
    public abstract void mostrar(); // Dice que se visualice la IGU (interfaz grafica Usuario)
}
