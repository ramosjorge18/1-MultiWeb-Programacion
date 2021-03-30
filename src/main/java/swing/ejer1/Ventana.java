/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ejer1;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Vespertino
 */
public class Ventana extends JFrame implements IVentana {
    //Propiedades
    private JLabel lbDato1, lbDato2, lbResultado, lbResultado2, lbOperacion;
    private JTextField txtDato1, txtDato2;
    private JComboBox<String> cboOperacion;
    private DefaultComboBoxModel<String> dcbm;
    private JButton jbtnCalcular, jbtnLimpiar;
    private GridLayout g1;
    private Controlador controlador;

public Ventana(){
    //Instanciar Objetos
    lbDato1 = new JLabel("Primer Dato");
    lbDato2 = new JLabel("Segundo Dato");
    lbResultado = new JLabel("Resultado");
    lbResultado2 = new JLabel("");
    lbOperacion = new JLabel("Operacion");
    txtDato1 = new JTextField();
    txtDato2 = new JTextField();
    dcbm = new DefaultComboBoxModel();
    cboOperacion = new JComboBox(dcbm);
    jbtnCalcular = new JButton("Calcular");
    jbtnLimpiar = new JButton("Limpìar");
    g1 = new GridLayout(5, 2, 5, 5);
    
    //Programar los eventos
    jbtnLimpiar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            txtDato1.setText("");
            txtDato2.setText("");
            lbResultado2.setText("");
        }
    });
    
    jbtnCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            controlador.notificacion();
        }
    });
    
    
    dcbm.addElement("*");
    dcbm.addElement("/");
    dcbm.addElement("-");
    dcbm.addElement("+");
    dcbm.addElement("%");
    
    // Introducir los datos dentro del panel
    getContentPane().setLayout(g1);
    getContentPane().add(lbDato1);
    getContentPane().add(txtDato1);
    getContentPane().add(cboOperacion);
    getContentPane().add(lbOperacion);
    getContentPane().add(lbDato2);
    getContentPane().add(txtDato2);
    getContentPane().add(lbResultado);
    getContentPane().add(lbResultado2);
    getContentPane().add(jbtnCalcular);
    getContentPane().add(jbtnLimpiar);
    
    // Propiedades Ventana
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);
    setTitle("Calculadora");
    
}   

    @Override
    public double getDato1() {
        double aux;
        aux = Double.parseDouble(txtDato1.getText());
        return aux;
    }

    @Override
    public double getDato2() {
        double aux;
        aux = Double.parseDouble(txtDato2.getText());
        return aux;
    }

    @Override
    public String Operacion() {
        String aux = dcbm.getSelectedItem().toString();
        return aux;
    }

    @Override
    public void setResultado(double a) {
        lbResultado2.setText(a+"");
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = c;
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }


    
    
    
    
}
