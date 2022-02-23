package Hilos;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Threads.Pelota;

/* Comenzamos el temario de los hilos. La idea es practicar realizando un programa que tenga programación 
 * concurrente.
 * 
 * Vamos a intentar recrear el movimiento de una bola en línea. Cuando llegue al final dará la vuelta.
 */
public class Proyecto_Hilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Proyecto-Bola");
		setBounds(400,400,800,400);
		add(new lamina());
		setVisible(true);
	}
}

class lamina extends JPanel{
	public lamina() {
		setLayout(new BorderLayout());
		inferior = new JPanel();
		centro = new JPanel();
		mover = new JButton("GO");
		parar = new JButton("STOP");
		
		inferior.add(mover);
		inferior.add(parar);
	    
		
		
		
		add(inferior, BorderLayout.SOUTH);
		add(centro, BorderLayout.CENTER);
		
		
	}
	
	
    //private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
	private JButton mover, parar;
	private JPanel  inferior, centro;
	private Image imagen;
}





