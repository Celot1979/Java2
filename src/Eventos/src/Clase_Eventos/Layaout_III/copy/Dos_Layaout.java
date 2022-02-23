package Clase_Eventos.Layaout_III.copy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Dos_Layaout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En está practica veremos como en muchas 
		 * aplicaciones gráficas es necesario tener más de un JPanel
		 * y varias disposiciones( En esté caso 2).
		 * 
		 * En una 1ª lámiana irá con dos botones en la parte superior
		 * con dos botones.
		 * 2ª Con tres botones en la parte inferior
		 */
		MarcoConLayaout miMarco = new MarcoConLayaout();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}
class MarcoConLayaout extends JFrame{
public MarcoConLayaout () {
	setTitle("Aplicacion Con 2 Disposiciones");
	setBounds(600,350,600,300);
	
	
	PanelconLayaout lamina = new PanelconLayaout();
	PanelconLayaout2 lamina2 = new PanelconLayaout2();
	
	/*El secreto para poder colocar los layouts es pasarle por parámetro del add
	 * la lamina, y después el border norte o sur.
	 * 
	 * OJO::: A pesar de que el primer layout es de tipo Flow, para hacer
	 * que se coloque ambos los pasamos por BOder.
	 */
	
	add(lamina,BorderLayout.SOUTH);
	add(lamina2,BorderLayout.NORTH);
	}
}

class PanelconLayaout  extends JPanel{
public PanelconLayaout() {
	
	setLayout(new BorderLayout());
	add(new JButton("Azul"), BorderLayout.EAST);
	add(new JButton("Morado"), BorderLayout.WEST);
	add(new JButton("Verde"), BorderLayout.CENTER);
	


	}

}

class PanelconLayaout2 extends JPanel{
	public PanelconLayaout2 () {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
	}
}
