package Temporizador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Temporizador {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class marco extends JFrame{
	public marco() {
		setTitle("Temporizador Digital");
		setBounds(800,400,400,200);
		add(new lamina());
		setVisible(true);
	}
}

class lamina extends JPanel{
	public lamina() {
		setLayout(new BorderLayout());
		JPanel centro = new JPanel();
		centro.setBackground(Color.BLACK);
		campo = new JLabel("00");
		campo.setFont(new Font("Ds-Digital", Font.BOLD, 40));
		campo.setForeground(Color.green);
		campo1 = new JLabel(" : ");
		campo1.setFont(new Font("Ds-Digital", Font.BOLD, 40));
		campo1.setForeground(Color.green);
		campo2 = new JLabel("00");
		campo2.setFont(new Font("Ds-Digital", Font.BOLD, 40));
		campo2.setForeground(Color.green);
		campo3 = new JLabel(" : ");
		campo3.setFont(new Font("Ds-Digital", Font.BOLD, 40));
		campo3.setForeground(Color.green);
		campo4 = new JLabel("00");
		campo4.setFont(new Font("Ds-Digital", Font.BOLD, 40));
		campo4.setForeground(Color.green);
		boton = new JButton("Iniciar");
		boton.setFont(new Font ("Ds-Digital",Font.BOLD,30));
		boton.setForeground(Color.green);
		boton.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.green));
		Runnable s = new segundos(1,59);
		Thread num1 = new Thread(s);
		Runnable m = new minutos(1,59);
		Thread num2 = new Thread(m);
		Runnable h = new minutos(1,59);
		Thread num3 = new Thread(m);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

					num1.start();
					num2.start();
					num3.start();
					

			}
			
		});
		centro.add(campo4);
		centro.add(campo3);
		centro.add(campo2);
		centro.add(campo1);
		centro.add(campo);
		
		centro.add(boton);
		add(centro, BorderLayout.CENTER);
	}
	
	class segundos extends Thread{
		
		public segundos(int contador, int final_contador) {
			this.contador = contador;
			this.final_contador = final_contador;
			
		}
		@Override
		public void run() {
			while(contador != 90) {
				if(contador < final_contador) {
					contador ++;
				}else {
					contador = 0;
					contador++;
					
				}
				
				
				for (int i = 0; i < final_contador; i++) {
					try {
						Thread.sleep(1000);
						//System.out.println(i);
						//String numCadena= String.valueOf(i);
						String cadena = String.format("%02d" , i);
						campo.setText(cadena);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
		int contador,final_contador;
		
	}
	
	
class minutos extends Thread{
		
		
		public minutos(int contador, int final_contador) {
		this.contador = contador;
		this.final_contador = final_contador;
		
	}
		
		
		@Override
		public void run() {
			
			if(contador < final_contador) {
				contador ++;
				
			}
			
			
			for (int i = 1; i < final_contador; i++) {
				try {
					Thread.sleep(60065); 
					//System.out.println(i);
					//String numCadena= String.valueOf(i);
					String cadena2 = String.format("%02d" , i);
					campo2.setText(cadena2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
			
		}
		int contador,final_contador;
		
	}
    class horas extends  Thread{
    	
    	public horas(int contador, int final_contador) {
			this.contador = contador;
			this.final_contador = final_contador;
		}
		public void run() {
			if(contador < final_contador) {
				contador ++;
				
			}
			
			
			for (int i = 1; i < final_contador; i++) {
				try {
					Thread.sleep(60065); 
					//System.out.println(i);
					//String numCadena= String.valueOf(i);
					String cadena3 = String.format("%02d" , i);
					campo4.setText(cadena3);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
    		
    	}
    	int contador,final_contador;
    }
	JButton boton;
	JLabel campo,campo1,campo2,campo3,campo4,campo5;
	
}