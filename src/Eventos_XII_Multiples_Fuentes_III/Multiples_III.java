package Eventos_XII_Multiples_Fuentes_III;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;




public class Multiples_III {

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
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");
		KeyStroke teclaVerde = KeyStroke.getKeyStroke("ctrl D");
		
		
		mapaEntrada.put(teclaAzul, "Fondo azul");
		mapaEntrada.put(teclaRojo, "Fondo rojo");
		mapaEntrada.put(teclaVerde, "Fondo verde");
		
		
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("Fondo azul", colorAzul);
		mapaAccion.put("Fondo rojo", colorRojo);
		mapaAccion.put("Fondo verde", colorVerde);
		
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




