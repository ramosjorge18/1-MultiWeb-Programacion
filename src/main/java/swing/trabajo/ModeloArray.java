/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

import swing.trabajo.Nif;
import swing.trabajo.IModelo;
import swing.trabajo.Cliente;

/**
 *
 * @author J.Ramos
 */
public class ModeloArray implements IModelo {

    private Cliente[] listaClientes = new Cliente[100];
    private byte cont = 0;
    private byte num;

    @Override
    public boolean añadeCliente(Cliente a) {
        if (listaClientes.equals(a)) {
                return false;
            } else {
                listaClientes[cont] = a;
                cont++;
                return true;
            }
    }

    @Override
    public boolean borraCliente(Cliente a) {
        for (int i = 0; i < cont; i++) {
            if(listaClientes[i].equals(a)){
                listaClientes[i]=null;
                cont--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modificaCliente(Cliente a) {
        muestraCliente(a.getDni());
        añadeCliente(a);
        return true;
    }

    @Override
    public Cliente muestraCliente(Nif a) {
        for(int i=0; i<cont ; i++){
            if(listaClientes[i].getDni().equals(a)){
                return listaClientes[i];
            }
        }
        return null;
    }
    
    @Override
    public Cliente muestraClienteCod(short cod) {
        for(int i=0; i<cont ; i++){
            if(listaClientes[i].getCodigo()==cod){
                return listaClientes[i];
            }
        }
        return null;
    }

    @Override
    public boolean valida(boolean confirma) {
        //Sacar mensaje de si desea confirmar
        if (confirma) {
            return true;
        } else {
            //Sacaremos un panel de que no se puede añadir
            return false;
        }
    }

    @Override
    public int getCont() {
        return cont;
    }

    
    
    
}
