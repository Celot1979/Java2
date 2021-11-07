package SnakeGame.Tres

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

En Raya;

public class Tres_En_Raya {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class marco extends JFrame {
    public marco(){
        setTitle("Tres en Raya");
		setBounds(800,400,250,180);
		principal = new JPanel();
		cuadrante = new GridLayout(3,3);
		setLayout(cuadrante);
		b1 = new JButton(" ");
		b2 = new JButton(" ");
		b3 = new JButton(" ");
		b4 = new JButton(" ");
		b5 = new JButton(" ");
		b6 = new JButton(" ");
		b7 = new JButton(" ");
		b8 = new JButton(" ");
		b9 = new JButton(" ");
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		
		setVisible(true);
    }
    JPanel principal;
	GridLayout cuadrante;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
}

//Prueba VCS 