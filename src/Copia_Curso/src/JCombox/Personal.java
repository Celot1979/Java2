package JCombox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;





public class Personal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco mimarco = new marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
    public marco() {
    	setTitle("Conversor");
        setBounds(700,200,700,350);
        add(new Lamina());
        setVisible(true);
               
               
               
               
    }
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		texto = new JLabel("Conversor de tipografías");
		texto.setFont(new Font("Courie", Font.PLAIN,24));
		JPanel inferior = new JPanel();
		inferior.add(texto);
		
		//JCombox
		menu = new JComboBox();
		menu.addItem("Apple Chancery");
		menu.addItem("Apple Color Emoji");
		menu.addItem("Al Tarikh");
		menu.addActionListener(new ManejarJCombox());
		JPanel superior = new JPanel();
		superior.add(menu);		
		
		add(inferior,BorderLayout.SOUTH);
		add(superior,BorderLayout.NORTH);
		
	}
	private class ManejarJCombox  implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/*if("Apple Chancery".equals(menu.getSelectedItem())) texto.setFont(new Font("Apple Chancery", Font.PLAIN,24));
			if("Apple Color Emoji".equals(menu.getSelectedItem())) texto.setFont(new Font("Apple Color Emoji", Font.PLAIN,24));
			if("Al Tarikh".equals(menu.getSelectedItem())) texto.setFont(new Font("Al Tarikh", Font.PLAIN,24));*/
			texto.setFont(new Font((String) menu.getSelectedItem(), Font.PLAIN, 30));
			
			
			
		}
		
	}
	private JLabel texto;
	private JComboBox menu;
}