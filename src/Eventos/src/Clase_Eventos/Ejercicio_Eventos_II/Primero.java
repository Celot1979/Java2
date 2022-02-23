package Clase_Eventos.Ejercicio_Eventos_II;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mi_marco = new Marco();
		mi_marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mi_marco.addMouseListener(new Evento());
		
		

	}

}
class Marco extends JFrame{
	public Marco() {
		setTitle("Ejercicio sobre evento-Ratón");
		setBounds(700,500,300,250);
		setVisible(true);
		
	}
}

class Evento implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola alumnos de Java - Evento de Ratón");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}