package JCheckBox_Profe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class CheckBox_Profe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_check mimarco = new Marco_check();
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
class Marco_check extends JFrame{
	public Marco_check() {
		setTitle("Solución ");
		setBounds(700,350,300,250);
		add(new Lamina());
		setVisible(true);
	}
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		texto = new JLabel("Hola mundo");
		texto.setFont(new Font("Courie", Font.PLAIN,24));
		JPanel superior = new JPanel();
		JPanel inferior = new JPanel();
		add(texto,BorderLayout.NORTH);
		JCheckboxNegrita = new JCheckBox("Negrita"); 
		JCheckboxCursiva = new JCheckBox("Cursiva"); 
		
		JCheckboxNegrita.addActionListener(new ManejarChecks());
		JCheckboxCursiva.addActionListener(new ManejarChecks());
		barra = new JSlider();
		superior.add(barra);
		superior.add(texto);
		
		
		
		inferior.add(JCheckboxNegrita);
		inferior.add(JCheckboxCursiva);
		
		add(superior,BorderLayout.NORTH);
		add(inferior, BorderLayout.SOUTH);
	}
	private class ManejarChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int negrita_cursiva = 0;
			if(JCheckboxNegrita.isSelected()) negrita_cursiva += Font.BOLD;
			if(JCheckboxCursiva.isSelected()) negrita_cursiva += Font.ITALIC;
			
			texto.setFont(new Font("Courier", negrita_cursiva,24));
			
		}
		
	}
	private JCheckBox JCheckboxNegrita, JCheckboxCursiva;
	private JLabel texto;
	private JSlider barra;
}
