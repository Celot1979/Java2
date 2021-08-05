package Calculadora_Propia;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class calculadora_propia {
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
        setLayout(new BorderLayout());
        JButton pantalla = new JButton(" 0 ");
        add(pantalla, BorderLayout.NORTH);
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));
        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("x");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("-");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("+");
        ponerBoton("0");
        ponerBoton(",");
        ponerBoton("=");
        ponerBoton(" ");
    }


    private void ponerBoton(String Texto) {
        JButton boton = new JButton(Texto);
        numeracion.add(boton);

    }


    private JPanel numeracion;
}
// no se que coño pasando