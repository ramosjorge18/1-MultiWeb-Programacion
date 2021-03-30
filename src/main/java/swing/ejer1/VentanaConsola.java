/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ejer1;

import java.util.Scanner;

/**
 *
 * @author Vespertino
 */
public class VentanaConsola implements IVentana{
    private double dato1, dato2, resultado;
    private String operacion;
    private Controlador controlador;
    
    public VentanaConsola(){
        
        
    }

    @Override
    public double getDato1() {
        return dato1;
    }

    @Override
    public double getDato2() {
        return dato2;
    }

    @Override
    public String Operacion() {
        return operacion;
    }

    @Override
    public void setResultado(double a) {
        System.out.println("El Resultado es : "+a);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = c;
    }

    @Override
    public void mostrar() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dato 1: ");
        dato1 = sc.nextDouble();
        System.out.print("Introduce (*, /, +, -, %):");
        operacion=sc.next();
        System.out.print("Dato 2: ");
        dato2 = sc.nextDouble();
        this.controlador.notificacion(); // Forma de que la Vista avisa al Controlador
    }
    
}
