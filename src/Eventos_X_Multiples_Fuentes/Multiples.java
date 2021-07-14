package Eventos_X_Multiples_Fuentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFuentes mimarco = new MarcoFuentes();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFuentes extends JFrame{
	public MarcoFuentes() {
		setBounds(600,300,500,350);
		
		add(new LaminaFuentes());
		setVisible(true);
		
	}
}

class LaminaFuentes extends JPanel {
	
	public LaminaFuentes() {
		
		/*JButton botonAzul = new JButton("Azul");
		JButton botonRojo = new JButton("Rojo");
		JButton botonVerde = new JButton("Verde");
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);*/
		
		 EventoColorFondo colorAzul = new  EventoColorFondo("Azul", Color.BLUE);
		 EventoColorFondo colorRojo = new  EventoColorFondo("Rojo", Color.RED);
		 EventoColorFondo colorVerde = new  EventoColorFondo("Verde", Color.GREEN);
		
		add(new JButton(colorAzul));
		add(new JButton(colorRojo));
		add(new JButton(colorVerde));
		
		
	}
	
	private class EventoColorFondo extends AbstractAction{
		public EventoColorFondo(String nombre, Color color_fondo) {
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "Pone la lamina o JPanle de color: " + nombre);
			
			putValue("color_fondo_JPanel", color_fondo);
			
		}


		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Color c = (Color)getValue("color_fondo_JPanel");
			
			setBackground(c);
			
			System.out.println("Nombre" + getValue(Action.NAME) + " .Descripción " + getValue(Action.SHORT_DESCRIPTION));
			
		
	}
		
	}
	
	
}




