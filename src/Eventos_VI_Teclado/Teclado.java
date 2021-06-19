package Eventos_VI_Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEvento mimarco = new MarcoEvento();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mimarco.addKeyListener(new EventoDeTeclado());
		

	}

}
class MarcoEvento extends JFrame{
	/**
	 * Para manejo interno de Java. Digamos que le asigna un identificador al obejo que se construye 
	 * mediante esta clase que tiene relación con -java.io.Serializable-.
	 */
	private static final long serialVersionUID = 1L;

	public MarcoEvento() {
		setBounds(300,300,600,350);
		setVisible(true);
		
	}
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Has pulsado una tecla: " + e.getKeyChar());
		System.out.println("Has pulsado una tecla: " + e.getKeyCode());
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has soltado una tecla");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has tipeado una tecla");
	}
	
}