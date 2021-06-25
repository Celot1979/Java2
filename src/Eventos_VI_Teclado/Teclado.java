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
		//System.out.println("Has pulsado una tecla: " + e.getKeyCode());
		
		//if (e.getKeyCode() == 74)System.out.println("Has pulsado la letra J");

		//--------------------------------------------------------------------------------------------------
		/*
		 * También se puede hacer usando los métodos estaticos que trae la API de Java.
		 * Con el teclado de IMAc no funcionan( eso es porque no siempre todos los teclados funcionan).
		 */
		
		//if(e.getKeyCode() == KeyEvent.VK_J) System.out.println("Has pulsado la letra J");
		
		//--------------------------------------------------------------------------------------------------
		/*Esta sentencia tal y coo la vemos, es para que el propio sistema
		 * detecte que tecla estamos presioando
		 */
		System.out.println("Has pulsado la tecla : " + e.getKeyText(e.getKeyCode()));
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