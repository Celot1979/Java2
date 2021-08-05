package prueba;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prueba {
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Marco extends JFrame{
    public Marco(){
        setTitle("Calculadora propia");
        setBounds(800,300,400,200);
        lamina_General lamina = new lamina_General();
        add(lamina,BorderLayout.SOUTH);
        setVisible(true);
    }
}
class lamina_General extends JPanel{
    public lamina_General(){
        comienzo = true;
        setLayout(new BorderLayout());
        pantalla = new JButton(" 0 ");
        add(pantalla, BorderLayout.NORTH);
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));
        InsertarNumeros insertar = new InsertarNumeros();
        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("x",insertar);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("-",insertar);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("+",insertar);
        ponerBoton("0",insertar);
        ponerBoton(",",insertar);
        ponerBoton("=",insertar);
        ponerBoton(" ",insertar);
        add(numeracion,BorderLayout.CENTER);
    }
    private void ponerBoton(String textoBoton, InsertarNumeros oyente){
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        numeracion.add(boton);
    }
    private class InsertarNumeros implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String entrada = e.getActionCommand();
            if(comienzo){
                pantalla.setText(entrada);
                comienzo=false;
            }else{
                pantalla.setText(pantalla.getText()+ entrada);

            }

            
        }
        
    }
   
    private JPanel numeracion;
    private JButton pantalla;
    private boolean comienzo;
}

