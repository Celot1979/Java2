package Optimizado_CYR;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class prueba_botones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco m = new Marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class Marco extends JFrame{
	public Marco() {
		setTitle("Tres en Raya");
        setBounds(800,400,300,240);
      
        
        /*principal = new JPanel();
        encuadre= new GridLayout(3,3);
        setLayout(encuadre);*/
        add(new lamina());
        
        
       
        
        setVisible(true);
	}
	 JPanel principal,superior;
     GridLayout encuadre;
    
}
class lamina extends JPanel{
	public lamina() {
		principal = new JPanel();
        encuadre= new GridLayout(3,3);
        setLayout(encuadre);
        Jugador1 uno = new Jugador1();
        Jugador2 dos = new Jugador2();
        oyente insertar = new oyente();
		add(crearBoton(b1,"1",insertar));
		add(crearBoton(b2,"2",insertar));
		add(crearBoton(b3,"3",insertar));
		add(crearBoton(b4,"4",insertar));
		add(crearBoton(b5,"5",insertar));
		add(crearBoton(b6,"6",insertar));
		add(crearBoton(b7,"7",insertar));
		add(crearBoton(b8,"8",insertar));
		add(crearBoton(b9,"9",insertar));
	}
	JPanel principal,superior;
    GridLayout encuadre;
	public Component crearBoton(JButton b1,String nombre,ActionListener oyente) {
		b1 = new JButton(nombre);
		b1.setFont(new Font ("Arial",Font.BOLD,30));
        b1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0,Color.BLUE));
        b1.addActionListener(oyente);
		return b1;
	}
	public class oyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Hola mundo");
		}
		
	}
	
	public class Jugador1{
		public void jugada(JButton op) {
			if(valorDado == 1) {
				op.setText("X");
			}
			valorDado=1;
		}
	}
	public class Jugador2{
		public void jugada2(JButton op) {
			if(valorDado == 2) {
				op.setText("O");
			}
			valorDado=0;
		}
	}
	
	 JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	 public int valorDado;
     public int contadorX;
     public int contadorO;
     public boolean GameOver = false;
     public boolean jugada =false;
     int x, y;
     String Jugador1,Jugador2;
	 
	 
	 
}
