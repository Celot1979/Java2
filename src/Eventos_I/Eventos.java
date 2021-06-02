package Eventos_I;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotonesColores mimarco = new MarcoBotonesColores();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotonesColores extends JFrame{
	public MarcoBotonesColores() {
		setTitle("Botones y Eventos");
		setBounds(700,300,500,300);
		LaminaBotonesColores milamina = new LaminaBotonesColores();
		add(milamina);
	}
}

class LaminaBotonesColores extends JPanel implements ActionListener{
	JButton botonAzul = new JButton ("Azul");
	public LaminaBotonesColores() {
		add(botonAzul);
		botonAzul.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setBackground(Color.BLUE);
		
	}
}