package JCheckBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class JCheckBox_Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCheck mimarco = new MarcoCheck();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoCheck extends JFrame{
	public MarcoCheck() {
		setTitle("JCheckBox");
		setBounds(600,300,600,400);
		add(new LaminaCheck());
		setVisible(true);
	}
}
class LaminaCheck extends JPanel{
	public LaminaCheck() {
		setLayout(new BorderLayout());
		texto= new JLabel("Hola Mundo");
		
		texto.setFont(new Font("Courie", Font.PLAIN,24));
		JPanel superior = new JPanel();
		JPanel inferior = new JPanel();
		superior.add(texto);
		
		checkboxNegrita = new JCheckBox("Negrita");
		checkboxCursiva = new JCheckBox("Cursiva");
		
		checkboxNegrita.addActionListener(new ManejarChecks());
		checkboxCursiva.addActionListener(new ManejarChecks());
		inferior.add(checkboxNegrita);
		inferior.add(checkboxCursiva);
		
		add(superior,BorderLayout.NORTH);
		add(inferior,BorderLayout.SOUTH);
		
	}
	private class ManejarChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int negrita_cursiva=0;
			if(checkboxNegrita.isSelected())negrita_cursiva+=Font.BOLD;
			if(checkboxCursiva.isSelected())negrita_cursiva+=Font.ITALIC;
			texto.setFont(new Font("Courie",negrita_cursiva ,24));
			
			
		}
		
	}
	private JCheckBox checkboxNegrita;
	private JCheckBox checkboxCursiva;
	private JLabel texto;
}
