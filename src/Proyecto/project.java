package Proyecto;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		mimarco .setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame{
	public Marco() {
		setTitle("Proyecto");
		setBounds(600,200,800,600);
		//Dos primera cifras el lugar donde se va a posicionar la ventana
		//Dos siguientes cifras el tamaño
		
		lamina milamina = new lamina();
		add(milamina);
	}
}

class lamina extends JPanel{
	public lamina() {
		setLayout(null);
		label1 = new JLabel("Etiqueta 1");
		label1.setBounds(10, 20, 200, 30);
		label2 = new JLabel("Etiqueta 2");
		label2.setBounds(10, 60, 200, 30);
		add(label1);
		add(label2);
		
		texto = new JTextField(10);
		texto.setBounds(100,20,200,30);
		add(texto);
		
		
		texto2 = new JTextField(10);
		texto2.setBounds(100,60,200,30);
		add(texto2);
		
		
	}
	private JLabel label1,label2;
	JTextField texto, texto2;
}