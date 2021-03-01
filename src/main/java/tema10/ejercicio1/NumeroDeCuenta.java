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
public class NumeroDeCuenta {
    private int banco;
    private int sucursal;
    private int digitoControl;
    private long nCuenta;

    public NumeroDeCuenta(int banco, int sucursal, int digitoControl, long nCuenta) {
        setBanco(banco);
        setSucursal(sucursal);
        setDigitoControl(digitoControl);
        setnCuenta(nCuenta);
    }

    @Override
    public String toString() {
        return "NumeroDeCuenta:" + banco + "  " + sucursal + "  " + digitoControl + "  " + nCuenta;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public void setDigitoControl(int digitoControl) {
        this.digitoControl = digitoControl;
    }

    public void setnCuenta(long nCuenta) {
        this.nCuenta = nCuenta;
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getDigitoControl() {
        return digitoControl;
    }

    public long getnCuenta() {
        return nCuenta;
    }
    
    
    
}
