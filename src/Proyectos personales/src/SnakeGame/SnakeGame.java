package SnakeGame;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class SnakeGame extends JFrame{
	int width = 640;
	int height = 480;
	public SnakeGame() {
		setTitle("Snake");
		setSize(width,height);
		// 1º Dimesiones de la ventana
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//La instrucción que a continuación se detalla, es para dejar el Frame 
		//medio de la pantalla.
		this.setLocation(dim.width/2 - width/2, dim.height/2-height/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeGame s = new SnakeGame();

	}
	// 2º Eventos de teclado. Al heredar de la clase KeyAdapter
	// nos permite quedar a la escucha de las teclas.
	public class Teclas extends KeyAdapter{
		public void KeyPressed(KeyEvent e) {
			// 3ºEvalua a cada una de las teclas que presionamos
			// 3º A. Si das al exit o al cierre entra el 1º if
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
			
		}
	}

}
