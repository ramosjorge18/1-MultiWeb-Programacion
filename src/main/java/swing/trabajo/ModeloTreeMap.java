/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.trabajo;

import java.util.TreeMap;

/**
 *
 * @author J.Ramos
 */
public class ModeloTreeMap implements IModelo{
    
    private TreeMap <Integer, Cliente> listaClientes;
    private byte cont=0;

    public ModeloTreeMap() {
        listaClientes = new TreeMap<Integer, Cliente>();
    }
    
    

    @Override
    public boolean añadeCliente(Cliente a) {
        if(listaClientes.containsKey(a.getDni())){
            return false;
        }else{
            listaClientes.put((int) a.getCodigo(), a);
            return true;
        }
    }

    @Override
    public boolean borraCliente(Cliente a) {
        if(listaClientes.containsKey(a.getDni())){
            listaClientes.remove(a.getDni());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean modificaCliente(Cliente a) {
        if(listaClientes.containsKey(a.getDni())){
            listaClientes.replace((int)a.getCodigo(), a);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Cliente muestraCliente(Nif a) {
        if(listaClientes.containsKey(a)){
            return listaClientes.get(a);
        }else{
            return new Cliente();
        }
    }

    @Override
    public Cliente muestraClienteCod(short cod) {
        //Mostrar Cliente haciendo iterator
        return null;
    }

    @Override
    public boolean valida(boolean confirma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCont() {
        return cont;
    }
    
}
