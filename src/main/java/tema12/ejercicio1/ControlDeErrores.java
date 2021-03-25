/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.ejercicio1;

/**
 *
 * @author Vespertino
 */
//public class ControlDeErrores {
//    public static void main(String[] args) {
//        System.out.println(metodo1(5, 1));
//    }
//    
//    public static double metodo1(int dividendo, int divisor){
//        double result=0;
//        try{
//            result = dividendo/divisor;
//        }catch(java.lang.ArithmeticException o){
//            System.out.println("No se puede dividir entre 0");
//            result=-1;
//        }
//        finally{
//            return result;
//        }        
//    }
//    
//}

public class ControlDeErrores {
    class div{
        private int div;
        private int did;
        private double coe;
        private double rest;

        public div(int div, int did) {
            this.div = div;
            this.did = did;
        }
        
        
        
    }
    public static void main(String[] args) {
        System.out.println(metodo1(5, 1));
    }
    
    public static double metodo1(int dividendo, int divisor){
        double result=0;
        try{
            result = dividendo/divisor;
        }catch(java.lang.ArithmeticException o){
            System.out.println("No se puede dividir entre 0");
            result=-1;
        }
        finally{
            return result;
        }        
    }
    
}