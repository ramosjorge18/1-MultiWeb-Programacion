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
public class Cliente {

    private Nif dni;
    private String nombre;
    private String direccion;
    private String localidad;
    private String provincia;
    private int codigoPostal;

    public Cliente(Nif dni, String nombre, String direccion, String localidad, String provincia, int codigoPostal) {
        setDni(dni);
        setNombre(nombre);
        setDireccion(direccion);
        setLocalidad(localidad);
        setProvincia(provincia);
        setCodigoPostal(codigoPostal);
    }

    public Cliente(Nif dni, String nombre, int codigoPostal) {
        this(dni, nombre, " ", " ", " ", codigoPostal);
    }

    public void setDni(Nif dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Nif getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\t Direccion: " + direccion + "\t NIF: " + dni.toString() + "\n" + "Localidad: " + localidad + "\t Provincia: " + provincia + "\t CP: " + codigoPostal;
    }

}
