package Ejercicio_CheckBox_Personal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Personal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Ejer mimarco = new Marco_Ejer();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Marco_Ejer extends JFrame{
	public Marco_Ejer() {
		setTitle("Ejercicio JCheckBox");
		setBounds(600,300,600,400);
		PanelconLayaout2 lamina = new PanelconLayaout2();
		PanelconLayaout lamina2 = new PanelconLayaout();
		add(lamina,BorderLayout.SOUTH);
		add(lamina2,BorderLayout.NORTH);
		setVisible(true);
	}

	private class PanelconLayaout extends JPanel{
		public PanelconLayaout () {
			setLayout(new FlowLayout());
			texto = new JLabel("Este es el texto");
			add(texto);
		}
	}
	private class PanelconLayaout2 extends JPanel{
		public PanelconLayaout2 () {
			setLayout(new BorderLayout());
			Negrita = new JCheckBox("Negrita");
			Negrita.addActionListener(new accion());
			
			Cursiva = new JCheckBox("Cursiva ");
			Cursiva.addActionListener(new accion());
			
			add(Negrita,BorderLayout.EAST);
			add(Cursiva,BorderLayout.WEST);
			
		}
	}
	
	private class accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(Negrita.isSelected()) {
				fuente = new Font("Serief",Font.BOLD,20);
				texto.setFont(fuente);
			}else if(!Negrita.isSelected()) {
				fuente = new Font("Serief",Font.PLAIN,14);
				texto.setFont(fuente);
			}
			
			
			if(Cursiva.isSelected()) {
				fuente2 = new Font("Arial",Font.ITALIC,20);
				texto.setFont(fuente2);
			}
			
			if(Negrita.isSelected()) {
				if(Cursiva.isSelected()) {
					fuente2 = new Font("Serief",Font.BOLD|Font.ITALIC,44);
					texto.setFont(fuente2);
				}
			}
			
			
		}
		
	}
	JLabel texto;
	JCheckBox Negrita, Cursiva ;
	Font fuente, fuente2;
}

