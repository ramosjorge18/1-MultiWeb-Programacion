/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.codigo;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Vespertino
 */
public class Factura {

    private int codigoFactura;
    private Cliente comprador;
    private double iva;
    private TreeMap articulos;
    private double totalFactura;

    public Factura(int codigoFactura, Cliente comprador, double iva) {
        setCodigoFactura(codigoFactura);
        setComprador(comprador);
        setTipoDeIva(iva);
        this.articulos = new TreeMap<Integer, Articulo>();
        this.totalFactura = 0.0;
    }

    public Factura(int codigoFactura, Cliente comprador) {
        this(codigoFactura, comprador, 0.0);
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public void setTipoDeIva(double iva) {
        if (iva < 0) {
            this.iva = 0.0;
        } else if (iva > 1) {
            this.iva = iva / 100;
        }
    }

    public void setArticulos(TreeMap articulos) {
        this.articulos = articulos;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public boolean añadirArticulo(Articulo articulo) {
        Articulo compara;
        Set x = articulos.keySet();
        Iterator punt = x.iterator();
        while (punt.hasNext()) {
            compara = (Articulo) articulos.get(punt.next());
            if (compara == articulo) {
                return false;
            } else if (compara.getCodigo() == articulo.getCodigo()) {
                articulos.put(articulo.getCodigo() + 100, articulo);
                return true;
            }
        }
        articulos.put(articulo.getCodigo(), articulo);
        return true;
    }

    public double calcularTotal() {
        double total = 0.0;
        Articulo art;
        Set x = articulos.keySet();
        Iterator punt = x.iterator();
        while (punt.hasNext()) {
            art = (Articulo) articulos.get(punt.next());
            total = total + art.getPrecioArticulo();
        }
        return total + (total * iva);
    }

    public int numeroDeArticulos() {
        int cont = 0, key;

        Set x = articulos.keySet();
        Iterator punt = x.iterator();
        while (punt.hasNext()) {
            key = (int) punt.next();
            if (key < 100) {
                cont++;
            }
        }
        return cont;
    }

    public boolean eliminaArticulos(Articulo articulo) {
        int codigoArticulo = articulo.getCodigo();
        boolean a = false;

        while (articulos.containsKey(codigoArticulo)) {
            articulos.remove(codigoArticulo);
            codigoArticulo = codigoArticulo + 100;
            a = true;
        }
        return a;
    }

    public String muestraArticulos() {
        int cont = 0, key;
        StringBuilder sb = new StringBuilder("");
        Articulo muestra;

        Set x = articulos.keySet();
        Iterator punt = x.iterator();
        while (punt.hasNext()) {
            key = (int) punt.next();
            if (key < 100) {
                muestra = (Articulo) articulos.get(key);
                sb.append(muestra.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private double calculaIva() {

        return calcularTotal() * iva;
    }

    public String muestraMapa() {
        Articulo muestra;
        StringBuilder sb = new StringBuilder("");
        int key;

        Set x = articulos.keySet();
        Iterator punt = x.iterator();
        while (punt.hasNext()) {
            key = (int) punt.next();
            muestra = (Articulo) articulos.get(key);
            sb.append(muestra.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        DecimalFormat a = new DecimalFormat("######.##");
        return "Factura Número: " + codigoFactura + "\n" + "Datos de cliente \n ------------------\n" + comprador.toString() + "\n\nListado de Articulos\n---------------------------------------------------------------------\n"
                + "Cod\tNombre\tPrecio\n" + muestraArticulos() + "\n" + "Subtotal: " + a.format(calcularTotal() - calculaIva()) + "\n" + "IVA(" + iva + "): " + a.format(calculaIva()) + "\nTotal: " + a.format(calcularTotal());
    }

}
