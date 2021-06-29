package Ejercicio_Eventos_I;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Evento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEjercicio mimarco = new MarcoEjercicio ();
		 mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 mimarco.setVisible(true);

	}

}

class MarcoEjercicio extends JFrame{
	public MarcoEjercicio() {
		setBounds(300,300,400,300);
		add(new Lamina_Trabajo());
	}
}

class Lamina_Trabajo extends JPanel{
	private class Eventos_Foco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == Campo2) {
				while(Campo2.getText().length() < 5) {
					Campo2.setText(null);
					Campo2.requestFocus();
					break;
					
				}
			}else if(e.getSource() == Campo3) {
				String Cadena = Campo3.getText();
				String arr = "@";
				String Pun = ".";
				
				for(int i = 0; i < Campo3.getText().length(); i++) {
					if(String.valueOf(Cadena.charAt(i)).equals(arr)){
						arroba++;
					}
					
					if(String.valueOf(Cadena.charAt(i)).equals(Pun)){
						punto++;
					}
				}
				
				while(arroba >= 2 || punto >= 2 ) {
					Campo3.setText(null);
					Campo3.requestFocus();
					break;
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Campo1 = new JTextField();
		Campo2 = new JTextField();
		Campo3 = new JTextField();
		
		Campo1.setBounds(120,10,150,20);
		Campo2.setBounds(120,50,150,20);
		Campo3.setBounds(120,90,150,20);
		
		add(Campo1);
		add(Campo2);
		add(Campo3);
		
		Eventos_Foco foco = new Eventos_Foco();
		Campo1.addFocusListener(foco);
		Campo2.addFocusListener(foco);
		Campo3.addFocusListener(foco);
		
		Etq1 = new JLabel("Nombre");
		Etq2 = new JLabel("Contraseña");
		Etq3 = new JLabel("Email");
		
		Etq1 .setBounds(40,10,150,20);
		Etq2.setBounds(40,50,150,20);
		Etq3.setBounds(40,90,150,20);
		add(Etq1);
		add(Etq2);
		add(Etq3);
	}
	private JTextField Campo1,Campo2,Campo3;
	private JLabel Etq1,Etq2,Etq3;
	private int arroba;
	private int punto;
}