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
public class Run {
    public static void main(String[] args) {
       runSwing();
       
    }

    private static void runSwing() {
        Ventana vistaSwing = new Ventana();
        Modelo modelo = new Modelo();
        Controlador c = new Controlador(vistaSwing, modelo);
        
        vistaSwing.setControlador(c);
        vistaSwing.mostrar();
    }
    
}
