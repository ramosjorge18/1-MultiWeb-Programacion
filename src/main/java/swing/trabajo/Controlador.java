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
    private Cliente cliente;

    public Controlador(IVista vista, IModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;  
    }
    
    public void altaCliente(){
        // Creamos el Nif y el Cliente sacando los datos de la vista
        Nif a = new Nif(vista.getDni().getNif());
        cliente = new Cliente(vista.getNombre(), vista.getApellido1(), a, (byte)vista.getEdad(), (float) vista.getSaldo());
        
        vista.getApellido2();
        vista.getDni();
        //Comprobamos la confirmación
        
        //Si es true añadimos a la bbdd
        
        //Sino vaciamos
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
