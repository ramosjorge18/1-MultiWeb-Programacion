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
public interface IModelo {
    
    public abstract boolean añadeCliente(Cliente a);
    public abstract boolean borraCliente (Cliente a);
    public abstract boolean modificaCliente (Cliente a);
    public abstract Cliente muestraCliente (Nif a);
    public abstract Cliente muestraClienteCod(short cod);
    public abstract boolean valida(boolean confirma);
    public abstract int getCont();
    
    
    
    
    
    
    
}
