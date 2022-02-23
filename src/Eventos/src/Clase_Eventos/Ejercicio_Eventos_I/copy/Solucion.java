package Clase_Eventos.Ejercicio_Eventos_I.copy;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Solucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Frame-Lamina-Eventos_Ejercicios");
		setBounds(700,500,300,300);
		
		Panel lamina = new Panel();
		lamina.addMouseListener(new EventoRaton());
		add(lamina);
		setVisible(true);
	}
}

class Panel extends JPanel{
	public Panel() {
		
	}
}

class EventoRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola alumnos Java - Ejercicio de Eventos Raton");
		
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
