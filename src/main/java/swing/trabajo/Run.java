/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

/**
 *
 * @author J.Ramos
 */
public class Run {
    public static void main(String[] args) {
        VistaConsola v = new VistaConsola();
        ModeloArray m = new ModeloArray();
        Controlador c = new Controlador(v, m);
        v.setControlador(c);
        v.mostrar();
    }
}
