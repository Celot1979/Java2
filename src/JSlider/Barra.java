package JSlider;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;




public class Barra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("JSlider");
		setBounds(700,200,700,350);
		add(new Lamina());
		setVisible(true);
		
		
		
		
	}
}

class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		texto = new JLabel("Texto prueba");
		texto.setFont(new Font("calibri", Font.PLAIN,18));
		
		JPanel inferior = new JPanel();
		JPanel superior = new JPanel();
		inferior.add(texto);
	  
		combo = new JComboBox();
		combo.addItem("Bauhaus 93");
		combo.addItem("Century");
		combo.addItem("Cooper");
		combo.addActionListener(new Manejo());
		superior.add(combo);
		
		barra = new JSlider(9,36,24);//Primero va el minimo que deseamos. Después el máximo que deseamos y por último estaría donde queremos que se situe
		barra.setMajorTickSpacing(12);//Asigna las líneas grandes
		barra.setMinorTickSpacing(2);//Asigna las líneas pequeñas
		barra.setPaintTicks(true);//Pinta las líenas que antes hemos creado
		barra.setPaintLabels(true);// Pinta los números del Slider
		barra.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN,barra.getValue()));
			}
			
		});
		superior.add(barra);
		
		add(inferior, BorderLayout.SOUTH);
		add(superior, BorderLayout.NORTH);
		
		
		
		
		
		
		
	}  private class Manejo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String) combo.getSelectedItem(), Font.PLAIN,barra.getValue()));
			
		}
		
	}
	
	
	
	private JLabel texto;
	private JComboBox combo;
	private JSlider barra;
	
	
	
}
