package Clase_Eventos.Eventos_IX_Foco_II.copy;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



/*
 * En está practica corresponde al 2ª vídeo. 
 * Se trata de saber que coponente está ejecutando la acción.
 * Se usará el método getSource 
 */

public class Foco_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco  mimarco = new MarcoFoco ();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}


}
class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setBounds(300,300,400,300);
		add(new lamina_Marco_Foco());
	}
}
class lamina_Marco_Foco extends JPanel{
	// 2º. Se transforma la clase Eventos de Foco de una clase independiente en una clase interna.
	//Así en la comparación reconoce a campoTexto1 y se puede hacer la comparación. 
	
	private class EventosDeFoco implements FocusListener{
		

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			// 2º Haremos este condicional con el método getSource()
			if(e.getSource() == campoTexto1) {
				System.out.println("El cuadro 1 ha perdido el foco");
			}
			else {
				System.out.println("El cuadro 2 ha perdido el foco");
			}
			
		}
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		campoTexto1 = new JTextField();
		campoTexto2 = new JTextField();
		campoTexto3 = new JTextField();
		
		campoTexto1.setBounds(120,10,150,20); 
		campoTexto2.setBounds(120,50,150,20); 
		campoTexto3.setBounds(120,90,150,20); 
		
		add(campoTexto1); 
		add(campoTexto2);
		add(campoTexto3);
		
		EventosDeFoco foco = new EventosDeFoco(); 
		campoTexto1.addFocusListener(foco); 
		
		//1º Creamos el 2º objeto que está a la escucha del 2º campo de texto y lo añadimos a la lámina
		
		campoTexto2.addFocusListener(foco);
		
		campoTexto3.addFocusListener(foco);
		
		
		// JLabel
		etiq1 = new JLabel("Nombre");
		etiq2 = new JLabel("Contraseña");
		etiq3 = new JLabel("Email");
		
		etiq1.setBounds(40, 10, 150, 20);
		etiq2.setBounds(40, 50, 150, 20);
		etiq3.setBounds(40, 90, 150, 20);
		
		
		add(etiq1);
		add(etiq2);
		add(etiq3);
		
		
		
		
	}
	
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	private JLabel etiq1, etiq2, etiq3;
	
}

