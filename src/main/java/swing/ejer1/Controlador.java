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
public class Controlador {
    private IVentana vista;
    private IModelo modelo;

    public Controlador(IVentana vista, IModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void notificacion() {
        double aux=0;
        
        if(vista.Operacion().equals("*")){
            aux = modelo.multiplica(vista.getDato1(), vista.getDato2());
        }else if (vista.Operacion().equals("/")){
            aux = modelo.divide(vista.getDato1(), vista.getDato2());
        }else if (vista.Operacion().equals("-")){
            aux = modelo.resta(vista.getDato1(), vista.getDato2());
        }else if (vista.Operacion().equals("+")){
            aux = modelo.suma(vista.getDato1(), vista.getDato2());
        }else if (vista.Operacion().equals("%")){
            aux = modelo.resto(vista.getDato1(), vista.getDato2());
        }
        vista.setResultado(aux);
    }
    
}
