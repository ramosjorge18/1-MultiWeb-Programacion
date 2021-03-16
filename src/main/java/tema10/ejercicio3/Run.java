/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio3;

import tema10.ejercicio3.Enum.*;

/**
 *
 * @author Vespertino
 */
public class Run {
    public static void main(String[] args) {
        
        DiasSemana [] a;
        a= DiasSemana.values();       
        for (DiasSemana diasSemana : a) {
            System.out.println(diasSemana);
            if(diasSemana == DiasSemana.SABADO){
            System.out.println("FIESTA");
            }
        }        
        
        ArtesMarciales x = ArtesMarciales.valueOf("KICKBOXING");
        System.out.println(x);
        
        x= ArtesMarciales.BOXEO;
        System.out.println(x);
        
        switch (x) {
            case BOXEO:
                System.out.println("SOLO PUEDES PEGAR CON LAS MANOS");
                break;
            case JIUJITSU:
                System.out.println("TOCA HACER LLAVES");
                break;
            case MUAYTHAI:
                System.out.println("A LO TAILANDES");
                
        }
                
            
        
        
    }
    
}
