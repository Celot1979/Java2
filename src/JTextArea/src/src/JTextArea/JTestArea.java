package src.JTextArea;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class JTestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroArea mimarco = new MarcoCuadroArea();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoCuadroArea extends JFrame{
	public MarcoCuadroArea() {
		setTitle("JTextArea");
		setBounds(600,300,600,400);
		add(new LaminaCuadroArea());
		setVisible(true);
	}
}
class LaminaCuadroArea extends JPanel{
	public LaminaCuadroArea() {
		miareaTexto = new JTextArea (7,25);
		JScrollPane laminaScroll = new JScrollPane(miareaTexto );
		miareaTexto.setLineWrap(true);
		
		add(laminaScroll);
		
		boton = new JButton("Imprimir");
		boton.addActionListener(new Escucha());
		add(boton);
		
	}
	
	private class Escucha implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String contenido = miareaTexto.getText();
			System.out.println(contenido);
			
		}
		
	}
	JButton boton;
	JTextArea miareaTexto;
}

