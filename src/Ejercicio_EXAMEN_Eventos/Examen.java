package Ejercicio_EXAMEN_Eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		m.setVisible(true);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Examen-eventos");
		setBounds(700,400,400,400);
		lamina l = new lamina();
		add(l);
		
		
		
	}
}
class lamina extends JPanel{
	private class EventoFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == t2) {
				while(t1.getText().length() < 1 && bandera == true){
					JOptionPane.showMessageDialog(null, "Debe rellenar el usuario");
					//bandera=false;
					t1.requestFocus();
					break;
					}
			}
			if(e.getSource() == t3) {
				while(t2.getText().length() < 1 && bandera == true){
					JOptionPane.showMessageDialog(null, "Debe rellenar el campo de contrase�a");
					//bandera=false;
					t2.requestFocus();
					break;
					}
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub

			

			
			
		}
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		e1 = new JLabel("Usuario");
		e2 = new JLabel("Password");
		e3 = new JLabel("Email");
		
		e1.setBounds(50, 50, 200, 20);
		e2.setBounds(50, 150, 200, 20);
		e3.setBounds(50, 250, 200, 20);
		
		add(e1);
		add(e2);
		add(e3);
		
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		
		EventoFoco foco = new EventoFoco();
		t1.addFocusListener(foco);
		t2.addFocusListener(foco);
		t3.addFocusListener(foco);
		
		t1 .setBounds(150, 50, 200, 20);
		t2.setBounds(150, 150, 200, 20);
		t3.setBounds(150, 250, 200, 20);
		
		add(t1);
		add(t2);
		add(t3);
		
		
		
		
	}
	
	private JLabel e1,e2,e3;
	private JTextField t1,t2,t3;
	private int arroba = 0;
	private int punto = 0;
	private boolean bandera = true;
}