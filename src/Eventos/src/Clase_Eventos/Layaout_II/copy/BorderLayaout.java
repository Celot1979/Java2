package Clase_Eventos.Layaout_II.copy;

import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class BorderLayaout {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				MarcoConLayaout miMarco = new MarcoConLayaout();
				miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				miMarco.setVisible(true);

			}

		}
	class MarcoConLayaout extends JFrame{
		public MarcoConLayaout () {
			setTitle("Disposiciones");
			setBounds(600,350,600,300);
			PanelconLayaout lamina = new PanelconLayaout();
			add(lamina);
			}
	}

	class PanelconLayaout  extends JPanel{
		public PanelconLayaout() {
			//1º Paso.Declarar la sentencia setLayout.Con el tipo de disposición que deseamos.
			setLayout(new BorderLayout());
			/*
			 * 2º Paso. Debemos usar el 2º constructor de add (clase Container).
			 * En ese constructor indicamos que componenete queremos añadair, y
			 * la localización de éste.
			 */
			add(new JButton("Amarillo"), BorderLayout.NORTH);
			add(new JButton("Rojo"), BorderLayout.SOUTH);
			add(new JButton("Azul"), BorderLayout.EAST);
			add(new JButton("Azul"), BorderLayout.WEST);
			
			add(new JButton("Verde"), BorderLayout.CENTER);
			
		}
	}
	
	
	
	
	