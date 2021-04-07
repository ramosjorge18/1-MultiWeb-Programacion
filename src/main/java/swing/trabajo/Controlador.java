/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

import swing.trabajo.Cliente;

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

    public void altaCliente() {
        // Creamos el Nif y el Cliente sacando los datos de la vista
        cliente = new Cliente(vista.getNombre(), vista.getApellido1(), vista.getApellido2(),
                vista.getDni(), (byte) vista.getEdad(), (float) vista.getSaldo(), vista.getCasado(),
                vista.getFumador(), vista.getComunidadAutonoma(), vista.getSexo(),(byte) (modelo.getCont()+1));
        //Añadimos el Cliente a la BBDD
        modelo.añadeCliente(cliente);
        //Vaciamos los recuadros 
        vista.setNombre("");
        vista.setApellido1("");
        vista.setApellido2("");
        vista.setEdad((byte) 0);
        vista.setNif(0);
        vista.setSaldo(0);
    }

    public void bajaCliente() {
        //Comprobamos que desea eliminar cliente
        //Si es verdadero borraremos el cliente
        if (modelo.valida(vista.getConfirmacion())) {
            modelo.borraCliente(cliente);
        //Si se borra dejamos vacios los cuadros de texto
            vista.setNombre("");
            vista.setApellido1("");
            vista.setApellido2("");
            vista.setEdad((byte) 0);
            vista.setNif(0);
            vista.setSaldo(0);
        }
    }
    
    public void muestraCliente(){
        //Creamos el Cliente con el Dni introducido
        cliente=modelo.muestraCliente(vista.getDni());
        //Sacaremos los datos del cliente a la vista
        vista.setCodigo(cliente.getCodigo());
        vista.setNombre(cliente.getNombre());
        vista.setApellido1(cliente.getApellido1());
        vista.setApellido2(cliente.getApellido2());
        vista.setNif(cliente.getDni().getNif());
        vista.setEdad(cliente.getEdad());
        vista.setSaldo(cliente.getSaldo());
        vista.setCasado(cliente.isCasado());
        vista.setFumador(cliente.isFumador());
        vista.setComunidadAutonoma(cliente.getComunidadAutonoma());
        vista.setSexo(cliente.getSexo());
        
    }
    
    public void muestraClienteCod(){
        //Creamos el Cliente con el Dni introducido
        cliente=modelo.muestraClienteCod(vista.getCodigo());
        //Sacaremos los datos del cliente a la vista
        vista.setCodigo(cliente.getCodigo());
        vista.setNombre(cliente.getNombre());
        vista.setApellido1(cliente.getApellido1());
        vista.setApellido2(cliente.getApellido2());
        vista.setNif(cliente.getDni().getNif());
        vista.setEdad(cliente.getEdad());
        vista.setSaldo(cliente.getSaldo());
        vista.setCasado(cliente.isCasado());
        vista.setFumador(cliente.isFumador());
        vista.setComunidadAutonoma(cliente.getComunidadAutonoma());
        vista.setSexo(cliente.getSexo());
        
    }
    
    public void modificaCliente(){
        
    }

}
