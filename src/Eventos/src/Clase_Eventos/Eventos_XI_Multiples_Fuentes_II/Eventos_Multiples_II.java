package Eventos_XI_Multiples_Fuentes_II;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Eventos_Multiples_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBoton mimarco = new MarcoBoton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoBoton extends JFrame{
	public MarcoBoton() {
		
		setBounds(700,400,500,500);
		
		add(new LaminaBoton());
		setVisible(true);
	}
}

class LaminaBoton extends JPanel{

	public LaminaBoton() {
		 EventoColorFondo colorAzul = new  EventoColorFondo("Azul", Color.BLUE);
		 EventoColorFondo colorRojo = new  EventoColorFondo("Rojo", Color.RED);
		 EventoColorFondo colorVerde = new  EventoColorFondo("Verde", Color.GREEN);
		
		add(new JButton(colorAzul));
		add(new JButton(colorRojo));
		add(new JButton(colorVerde));
		
		//1º Paso. Creamos un objeto de tipo InputMap.
		
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl  A");
		
		mapaEntrada.put(teclaAzul, "Fondo azul");
		
		ActionMap mapaAccion = getActionMap();
		
		mapaAccion.put("Fondo Azul", colorAzul);
		
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

