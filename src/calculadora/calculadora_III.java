package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.*;

public class calculadora_III {
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
}

class Marco extends JFrame{
    public Marco(){
        setTitle("Calculadora");
        setBounds(800,300,400,200);
        laminaCaja lamina = new laminaCaja();
        add(lamina,BorderLayout.SOUTH);
        setVisible(true);
    }
}

class laminaCaja extends JPanel{
    public laminaCaja() {
        setLayout(new BorderLayout());
        JButton pantalla =new JButton("0");
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
        

        add(numeracion, BorderLayout.CENTER);

        


    }
    private void ponerBoton(String textoBoton) {
        JButton boton = new JButton(textoBoton);
        numeracion.add(boton);
    }
    private JPanel numeracion;
}

//1º Creamos una clase que quede a la escucha del evento(botón presionado)
class InsertNumero implements ActionListener{
    
}
