package Layout_I;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayaout_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConLayaout miMarco = new MarcoConLayaout();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}
class MarcoConLayaout extends JFrame{
	public MarcoConLayaout () {
		setTitle("Disposiciones");
		setBounds(600,350,600,300);
		PanelconLayaout lamina = new PanelconLayaout();
		/*
		//1ª Forma de agregar el FlowLayaout
		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		// 2º Paso. Debemos usar el método setLayout .Realizando esto dos pasos, estaría realizada la acción.
		lamina.setLayout(disposicion);*/
		
		
		// Forma simplificada del mismo
		lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(lamina);
		}
}

class PanelconLayaout  extends JPanel{
	public PanelconLayaout() {
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));
	}
}