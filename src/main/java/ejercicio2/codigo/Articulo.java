/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.codigo;

/**
 *
 * @author Vespertino
 */
public class Articulo {

    private int codigo;
    private String nombreArticulo;
    private double precioArticulo;

    public Articulo(int codigo, String nombreArticulo, double precioArticulo) {
        setCodigo(codigo);
        setNombreArticulo(nombreArticulo);
        setPrecioArticulo(precioArticulo);
    }

    public Articulo() {
        this(0, "Sin Nombre", 0.0);
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    @Override
    public String toString() {
        return codigo + "\t" + nombreArticulo + "\t" + precioArticulo;
    }

}
