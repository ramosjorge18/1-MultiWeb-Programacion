/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejercicio1;

/**
 *
 * @author Vespertino
 */
public class CuentaAhorro extends CuentaCorriente{
    private double interes;

    public CuentaAhorro(double interes, Titular dueño, NumeroDeCuenta nCuenta, int saldo) {
        super(dueño, nCuenta, saldo);
        setInteres(interes);
    }

    public CuentaAhorro(double interes, Titular dueño, NumeroDeCuenta nCuenta) {
        super(dueño, nCuenta);
        setInteres(interes);
    }

    public CuentaAhorro(Titular dueño, NumeroDeCuenta nCuenta) {
        super(dueño, nCuenta);
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public void calcularInteres(){
        super.setSaldo(super.getSaldo()*interes);
    }
    
    
}
