/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema9.ejercicio1;

import com.github.javafaker.Faker;


/**
 *
 * @author Vespertino
 */
public class PruebasSucursal {
    public static void main(String[] args) {
        Sucursal a = new Sucursal(1, "doce ligero de Artilleria");
        Faker n = new Faker();
        String nif, usuario;
        int dinero, negativo;
        
        for(int i=0;i<50;i++){
            nif = n.idNumber().invalid()+"";
            dinero = (int) (Math.random()*100000);
            usuario = n.name().firstName()+"";
            
            CuentaCorriente c = new CuentaCorriente(usuario, nif, dinero);
            a.añadeCuenta(c);   
        }
        a.listado();
    }
    
}
