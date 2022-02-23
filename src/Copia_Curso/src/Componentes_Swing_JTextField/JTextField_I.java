package Componentes_Swing_JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class JTextField_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto mimarco = new MarcoCuadroTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoCuadroTexto extends JFrame{
	public MarcoCuadroTexto() {
		setBounds(600,300,600,400);
		add(new LaminaCuadroTexto());
		setVisible(true);
	}
}

class LaminaCuadroTexto extends JPanel{
	public LaminaCuadroTexto () {
		cuadroTexto = new JTextField(20);
		add(cuadroTexto);
		
		
		
		JButton boton = new JButton("Obtener texto");
		boton.addActionListener(new obtenerTexto());
		add(boton);
		
		cuadroTexto2 = new JTextField(20);
		add(cuadroTexto2);
		
	}
	
	private class obtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			cuadroTexto2.setText(cuadroTexto.getText());
			
		}
		
	}
	
	JTextField cuadroTexto;
	JTextField cuadroTexto2;
}