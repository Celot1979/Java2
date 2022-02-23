package Clase_Eventos.Eventos_IV_Clases_Adaptadoras.copy;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Adptadoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEvento mimarco = new MarcoEvento();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowListener(new EventosDeVentana());
		

	}

}

class MarcoEvento extends JFrame{
	public MarcoEvento() {
		setBounds(300,300,650,350);
		setVisible(true);
	}
}

class EventosDeVentana extends WindowAdapter{
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Gracias por trabajar en la app.Hsta pronto.");
	}
	
}