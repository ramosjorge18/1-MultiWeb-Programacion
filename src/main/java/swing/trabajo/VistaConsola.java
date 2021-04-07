package swing.trabajo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import swing.trabajo.Controlador;
import swing.trabajo.IVista;
import swing.trabajo.Nif;

/**
 *
 * @author J.Ramos
 */
public class VistaConsola implements IVista {

    //Variables creacion Cliente
    private short codigo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Nif dni;
    private byte edad;
    private float saldo;
    private boolean casado;
    private boolean fumador;
    private String comunidadAutonoma;
    private String sexo;
    private boolean confirmar;
    //Variable para juntar con el controlador
    private Controlador controlador;

    public VistaConsola() {
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido1() {
        return apellido1;
    }

    @Override
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    @Override
    public String getApellido2() {
        return apellido2;
    }

    @Override
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Override
    public byte getEdad() {
        return edad;
    }

    @Override
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public Nif getDni() {
        return this.dni;
    }

    @Override
    public void setNif(long dni) {
        this.dni = new Nif(dni);
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = (float) saldo;
    }

    @Override
    public boolean getCasado() {
        return casado;
    }

    @Override
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public boolean getFumador() {
        return fumador;
    }

    @Override
    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }

    @Override
    public String getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    @Override
    public void setComunidadAutonoma(String comunidad) {
        this.comunidadAutonoma = comunidad;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public short getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean getConfirmacion() {
        return confirmar;
    }

    @Override
    public void setConfirmacion(boolean confirmacion) {
        this.confirmar = confirmacion;
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = c;
    }

    @Override
    public void mostrar() {
        //Variables utiles en Consola
        String letra;
        byte num;
        boolean salir = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de Clientes");
        do {
            System.out.print("Alta Cliente pulsa 1\nBorrar Cliente pulsa 2\n"
                    + "Consultar Cliente mediante Codigo pulsa 3\nConsultar Cliente por DNI pulsa 4\n"
                    + "Modificar Cliente pulsa 5\nPara salir pulsa 6: \n");
            num = sc.nextByte();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.print("NOMBRE: ");
                    nombre = sc.nextLine();
                    System.out.print("APELLIDO 1: ");
                    apellido1 = sc.nextLine();
                    System.out.print("APELLIDO 2: ");
                    apellido2 = sc.nextLine();
                    System.out.print("DNI: ");
                    dni = new Nif(sc.nextLong());
                    System.out.print("EDAD: ");
                    edad = sc.nextByte();
                    System.out.print("SALDO: ");
                    saldo = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("CASADO (Y/N): ");
                    letra = sc.nextLine();
                    if (letra.charAt(0) == 'y' || letra.charAt(0) == 'Y') {
                        casado = true;
                    } else {
                        casado = false;
                    }
                    System.out.print("FUMADOR (Y/N): ");
                    letra = sc.nextLine();
                    if (letra.charAt(0) == 'y' || letra.charAt(0) == 'Y') {
                        fumador = true;
                    } else {
                        fumador = false;
                    }
                    System.out.print("COMUNIDAD: ");
                    comunidadAutonoma = sc.nextLine();
                    System.out.print("SEXO (M/F/No Binario): ");
                    sexo = sc.nextLine();
                    if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
                        sexo = "Masculino";
                    } else if (sexo.charAt(0) == 'f' || sexo.charAt(0) == 'F') {
                        sexo = "Femenino";
                    } else {
                        sexo = "No Binario";
                    }
                    controlador.altaCliente();
                    break;
                case 3:
                    System.out.print("Introduce Codigo: ");
                    codigo = sc.nextShort();
                    controlador.muestraClienteCod();
                    System.out.println(codigo);
                    System.out.println(nombre);
                    System.out.println(apellido1);
                    System.out.println(apellido2);
                    System.out.println(dni);
                    System.out.println(edad);
                    System.out.println(saldo);
                    System.out.println(casado);
                    System.out.println(fumador);
                    System.out.println(comunidadAutonoma);
                    System.out.println(sexo);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Introduce DNI: ");
                    dni = new Nif(sc.nextLong());
                    controlador.muestraCliente();
                    System.out.println(codigo);
                    System.out.println(nombre);
                    System.out.println(apellido1);
                    System.out.println(apellido2);
                    System.out.println(dni);
                    System.out.println(edad);
                    System.out.println(saldo);
                    System.out.println(casado);
                    System.out.println(fumador);
                    System.out.println(comunidadAutonoma);
                    System.out.println(sexo);
                    System.out.println("");
                    break;
                case 6:
                    salir=false;
            }
        } while (salir);
    }

}
