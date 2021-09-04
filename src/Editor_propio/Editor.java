package Editor_Propio;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Editor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Editor de textos -Propio-");
		setBounds(700,200,700,350);
		add(new Lamina());
		setVisible(true);	
	}
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());//Creaci�n de compartimentos
		JPanel superior = new JPanel();//Compartimento superior
		JPanel inferior = new JPanel();//Compartimento inferior
		miAreaTexto = new JTextArea(25,100);//Creaci�n del area de texto
		JScrollPane laminaScroll = new JScrollPane(miAreaTexto);// Creaci�n del Scroll
		miAreaTexto.setLineWrap(true);//Salto de l�nea del Area
		inferior.add(laminaScroll);//a�adir al compartimento inferior
		add(superior,BorderLayout.NORTH);//Ubicaci�n en el JPanel
		add(inferior,BorderLayout.CENTER);//Ubicaci�n en el JPanel
		
	}
	private JTextArea miAreaTexto ;
}