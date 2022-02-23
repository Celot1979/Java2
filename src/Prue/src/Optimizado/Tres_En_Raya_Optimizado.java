package Optimizado;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Optimizado.marco.roll;



public class Tres_En_Raya_Optimizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Tres en Raya");
		setBounds(800,400,300,240);
		setLayout(new GridLayout(3,3));
		uno = new Jugador1();
		dos = new Jugador2();
		roll r = new roll();
		
	    botones = new JButton[9];
		for (int i = 0; i <9; i++) {
		    botones[i] = new JButton("");
		    botones[i].setFont(new Font ("Arial",Font.BOLD,30));
		    botones[i].setBorder(BorderFactory.createMatteBorder(0, 0, 4, 4, Color.BLUE));
		    add(botones[i]);
		    
		    botones[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(e.getSource() == botones[0]) {
						Thread t = new Thread(r);
					    t.start();
						
					}

				}
		    	
		    });

	}
		
		setVisible(true);

	}
	
	
	
	public class Jugador1{
		public Jugador1() {
			
		}
		
		public void jugada(int num) {
			if (valor == 1) {
				botones[num].setText("X");
				
				System.out.println("Funciono 1");
				valor+=1;
			}
		}
		
	}
	
	public class Jugador2{
		public Jugador2() {
			
		}
		public void jugada(int num) {
			
				if(valor == 2) {
					botones[num].setText("O");
					valor = -2;
					System.out.println("Funciono 2");
				}
		}
		
		
	}
	
	
	class roll implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			if (valor == 1) {
				uno.jugada(0);
				
			}else if (valor == 2) {
				dos.jugada(0);
			}
			
			
			
		}
		
		
	}
	
	private Jugador1 uno;
	private Jugador2 dos;
	JButton[] botones = new JButton[9];
	private int valor=1;
	private boolean Opcion = false;
	private int eleccion;
	private int num_j;
	
		
}

