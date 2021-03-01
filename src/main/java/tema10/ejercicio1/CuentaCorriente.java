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
public class CuentaCorriente {
    Titular dueño;
    NumeroDeCuenta nCuenta;
    double saldo;

    public CuentaCorriente(Titular dueño, NumeroDeCuenta nCuenta, int saldo) {
        setSaldo(saldo);
        setDueño(dueño);
        setnCuenta(nCuenta);
    }

    public CuentaCorriente(Titular dueño, NumeroDeCuenta nCuenta) {
        setSaldo(15.3);
        setDueño(dueño);
        setnCuenta(nCuenta);
    }
    
    

    public void setDueño(Titular dueño) {
        this.dueño = dueño;
    }

    public void setnCuenta(NumeroDeCuenta nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getDueño() {
        return dueño;
    }

    public NumeroDeCuenta getnCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresar(double dinero){
        setSaldo(getSaldo()+dinero);
    }
    
    public void reintegro(double dinero){
        setSaldo(getSaldo()-dinero);
    }
    
    public boolean equals (CuentaCorriente cuenta){
       NumeroDeCuenta a = getnCuenta();
       NumeroDeCuenta b = cuenta.getnCuenta();
       return a.getBanco()==b.getBanco() && a.getSucursal() == b.getSucursal()
               && a.getDigitoControl() == b.getDigitoControl() && a.getnCuenta()==b.getnCuenta();
    }

    @Override
    public String toString() {
        return "Titular: " + dueño + "\n Nº Cuenta" + nCuenta + "\t Saldo" + saldo;
    }
    
    
    
    
}
