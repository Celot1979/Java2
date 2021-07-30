package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class Calculadora {
    public static void main(String[] args) {
         Marco mimarco = new Marco();
         mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
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

        JPanel numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));
        numeracion.add(new JButton("7"));
        numeracion.add(new JButton("8"));
        numeracion.add(new JButton("9"));
        numeracion.add(new JButton("x"));
        numeracion.add(new JButton("4"));
        numeracion.add(new JButton("5"));
        numeracion.add(new JButton("6"));
        numeracion.add(new JButton("-"));
        numeracion.add(new JButton("1"));
        numeracion.add(new JButton("2"));
        numeracion.add(new JButton("3"));
        numeracion.add(new JButton("+"));
        numeracion.add(new JButton("0"));
        numeracion.add(new JButton(","));
        numeracion.add(new JButton("="));
        numeracion.add(new JButton(" "));

        add(numeracion, BorderLayout.CENTER);

        


    }
}

