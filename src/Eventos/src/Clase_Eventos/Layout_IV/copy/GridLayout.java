package Clase_Eventos.Layout_IV.copy;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridLayout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	
	add(lamina);
	
	}
}

class PanelconLayaout extends JPanel{
	public PanelconLayaout () {
		setLayout( new GridLayout());
		
		JButton miBoton = new JButton("1");
		JButton miBoton2 = new JButton("2");
		JButton miBoton3 = new JButton("3");
		JButton miBoton4 = new JButton("4");
		JButton miBoton5 = new JButton("5");
		
		JButton miBoton6 = new JButton("6");
		JButton miBoton7 = new JButton("7");
		JButton miBoton8= new JButton("8");
		JButton miBoton9 = new JButton("9");
		
		
		add(miBoton);
		add(miBoton2);
		add(miBoton3);
		add(miBoton4);
		add(miBoton5);
		add(miBoton6);
		add(miBoton7);
		add(miBoton8);
		add(miBoton9);
		
		
		
		
	}

	private void setLayout(GridLayout gridLayout) {
		// TODO Auto-generated method stub
		
	}
}