package Tres_Nueva_Logica;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class BotonX extends JButton implements ActionListener {
	 
	public BotonX(String num) {
		super(num);
		setPreferredSize(new Dimension(50, 30));
		addActionListener(this);
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		setText("X");
	}
 
}
public class Prueba extends JFrame {
	 
	
 
	public Prueba() {
 
		botonera = new BotonX[9];
 
		JPanel pnBotones = new JPanel();
		pnBotones.setLayout(new GridLayout(1,9,5,5));
 
		for (int i = 0; i < 9; i++) {
			botonera[i] = new BotonX(Integer.toString(i+1));
			pnBotones.add(botonera[i]);
		}
 
		pnBotones.setBorder(new EmptyBorder(15,15,15,15));
 
		setContentPane(pnBotones);
 
		setTitle("Prueba Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	private BotonX[] botonera;
 
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Prueba();
			}
		});
	}
 
}