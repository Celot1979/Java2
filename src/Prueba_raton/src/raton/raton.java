package raton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEventoRaton mimarco = new MarcoEventoRaton();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//mimarco.addMouseMotionListener((MouseMotionListener) new EventosDeRaton());
		mimarco.addMouseListener(new MarcoEventoRaton());
	}

}

class MarcoEventoRaton extends JFrame{
	public MarcoEventoRaton() {
		setBounds(300,300,600,350);
		setVisible(true);
	}
}
class EventosDeRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("HAs realizado un evento");
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el botón izq");
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás presionando el botón");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has soltado el botón");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has entrado en la ventana");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has salido en la ventana");
	}
	
}

/*class EventosDeRaton extends MouseAdapter{
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Has realizado un evento");
		System.out.println(e.getX());
	}
}


/*class EventosDeRaton implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Cuando arrastras la ventana
		System.out.println("Estoy arrastrando");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Cuando mueves el puntero del cursor
		System.out.println("Estoy moviedno el cursor");
	}
	
}*/