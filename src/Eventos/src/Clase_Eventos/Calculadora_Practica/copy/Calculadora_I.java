package Clase_Eventos.Calculadora_Practica.copy;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}
class Marco extends JFrame{
	public Marco() {
		setTitle("Calculadora");
		setBounds(600,500,400,400);
        lamina lamina1 = new lamina();
        

        
        add(lamina1,BorderLayout.SOUTH);
	}
}

class lamina extends JPanel{
	public lamina() {
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
        numeracion.add(new JButton("',"));
        numeracion.add(new JButton("="));

        add(numeracion, BorderLayout.CENTER);
	}
}