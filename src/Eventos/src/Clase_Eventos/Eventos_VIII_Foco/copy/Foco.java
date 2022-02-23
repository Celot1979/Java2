package Clase_Eventos.Eventos_VIII_Foco.copy;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Foco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco  mimarco = new MarcoFoco ();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setBounds(300,300,400,300);
		add(new lamina_Marco_Foco());
	}
}
class lamina_Marco_Foco extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		campoTexto1 = new JTextField();// 2º Creamos los objetos dentro de la lamina
		campoTexto2 = new JTextField();
		
		campoTexto1.setBounds(120,10,150,20); //3º Los ubicamos dentro de la misma
		campoTexto2.setBounds(120,50,150,20);
		
		add(campoTexto1); //4º Añadimos los objetos anteriormente creados a la lamina
		add(campoTexto2);
		
		EventosDeFoco foco = new EventosDeFoco(); // 6º Creamos el objeto foco de la clase EventosDeFoco
		campoTexto1.addFocusListener(foco); // 7º Pasamos la acción a la caja de texto
		
	}
	
	private JTextField campoTexto1, campoTexto2;
	// 1º Creamos las propiedades de la clase JTextField (cuadros de texto) para que sean accesibles desde
	// cualquier parte de la clase.
}

class EventosDeFoco implements FocusListener{
	// 5º Creamos la clase que gestionará las acciones al perder el foco o garnarlo.

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El cuadro a perdido el foco");
		
	}
	
}