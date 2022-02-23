package Clase_Eventos.Eventos_III_Ventana.copy;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEvento mimarco= new MarcoEvento();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		/* Cuando se ejecuta Dispose sirve para que el programa
		 * no se cierre abruptamente, así se pueden ejecutar códigos en las
		 * acciones medias.
		 */
		//1º formula para crear el objeto escucha
		EventoDeVentana objeto_escucha = new EventoDeVentana();
		mimarco.addWindowListener(objeto_escucha);
		
		//2º formula para crear el objeto escucha
		mimarco.addWindowListener(new EventoDeVentana());
		
		/*El objeto que queda a la escucha, en está ocasió
		 * es el propio marc. Se crea la instancia en el propio
		 * parámetro. Aunque también se podría hacer normal
		 */

	}

}

class MarcoEvento extends JFrame{
	public MarcoEvento() {
		setBounds(300,300,600,350);
		setVisible(true);
	}
}

class EventoDeVentana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando Ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana CERRADA");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana minimizada");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana restaurada tras minimizar");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activa- en 2º plano-");
		
	}
	
}