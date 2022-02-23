package JSpinner;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Spinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("JSpinner- intentandolo solo");
		setBounds(700,200,700,350);
		add(new Lamina());
		setVisible(true);
		
		
		
		
	}
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		texto = new JLabel("Estamos realizando una prueba para ver el efecto del JSpinner");
		texto.setFont(new Font("Bauhaus 93", Font.BOLD,18));
		JPanel inferior = new JPanel();
		JPanel superior = new JPanel();
		
		inferior.add(texto);
		
		//miSpinner = new JSpinner();//Constructor para valores n�mericos
		String lista[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();// Para tener adisposici�n todas las fuentes del equipo
		
		miSpinner = new JSpinner(new SpinnerListModel(lista));
		Dimension d = new Dimension(200,20); // Dar tama�o al Spinner
		miSpinner.setPreferredSize(d);
		
		superior.add(miSpinner);		
		add(inferior, BorderLayout.SOUTH);
		add(superior, BorderLayout.NORTH);
		}
	private JLabel texto;
	private JSpinner miSpinner;
}