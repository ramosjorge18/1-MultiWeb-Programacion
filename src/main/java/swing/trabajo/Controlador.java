/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

/**
 *
 * @author pcbox
 */
public class Controlador {
    private IVista vista;
    private IModelo modelo;

    public Controlador(IVista vista, IModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void altaCliente(){
        //Llamamos al modelo para guardar los datos del cliente
        vista.getNombre();
        vista.getApellido1();
        vista.getApellido2();
        vista.getEdad();
        vista.getDni();
        vista.getSaldo();
        //Vaciamos los recuadros 
        vista.setNombre("");
        vista.setApellido1("");
        vista.setApellido2("");
        vista.setEdad((byte)0);
        vista.setNif(0);
        vista.setSaldo(0);
    }
    
    public void bajaCliente(){
        //Llamamos al modelo para eliminar los datos del cliente
        
        //Comprobamos que desea eliminar cliente
        
        //Vaciamos los recuadros 
        vista.setNombre("");
        vista.setApellido1("");
        vista.setApellido2("");
        vista.setEdad((byte)0);
        vista.setNif(0);
        vista.setSaldo(0);
    }
    
}
