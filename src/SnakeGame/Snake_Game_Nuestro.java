package SnakeGame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Snake_Game_Nuestro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake s = new Snake();
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
	}
	
	
	

}
class Snake extends JFrame{
	public Snake() {
		setTitle ("Juego_Mio_Snake");
		setSize(width,height);
		
		/*
		 * 1º Centramos el Frame en la mitad de la ventana.
		 * Lo conseguimos pasando mediante la herramienta 
		 * Toolkit y sus métodos la medida del Frame.
		 * 
		 *  2º Posteriormente implementamos la localización de la misma
		 * 
		 */
		
		//1º
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		//2º 
		this.setLocation(dim.width/2 -width/2,dim.height/2-height/2 );
		/* 9º Ahora que tenemos creado la propiedad que podemos usar en todas las clases.
		 * puesto que la calse de JPanel es inter, y las propiedades
		 * son manipulables por todas las clases; creamos el objeto Snake.
		 * Este objeto se forma gracias a la lamina Imagen Sanake.
		 */
		
		snake = new Point(width/2,height/2);
		ImagenSnake = new ImagenSnake();
		
		/*Importante: Para poder añadir al Frame el objeto creado en la lámina,
		 *debemos usar el getContentPane. Así es como lo añadimos
		 */
		
		this.getContentPane().add(ImagenSnake);
		//Declaración de estar a la escucha las teclas
		this.addKeyListener(new Teclas());
		setVisible(true);
		
		Momento momento = new Momento();
		Thread trid = new Thread( momento);
		trid.start();
	}
	/*
	 * 5º Creamos una clase interna para la parte gráfica.
	 * Será una clase JPanel para pintar el punto
	 */
	class ImagenSnake extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(snake.x, snake.y, widthPoint, heightPoint);
			
		}
		
		
		
	}
	
	/* 3º Creamos una clase interna a la escucha de un evento en el teclado.
	 * En la primera declaración del if, es para que al pulsar el 
	 * ESC, se cierre el programa.
	 */
	class Teclas implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}else if(e.getKeyCode()== KeyEvent.VK_UP) {
				if(direccion != KeyEvent.VK_DOWN) {
					direccion = KeyEvent.VK_UP;
				}
				
			}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				if(direccion != KeyEvent.VK_UP) {
					direccion = KeyEvent.VK_DOWN;
				}
				
			}else if(e.getKeyCode()== KeyEvent.VK_LEFT) {
				if(direccion != KeyEvent.VK_RIGHT) {
					direccion = KeyEvent.VK_LEFT;
				}
			}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
				if(direccion != KeyEvent.VK_LEFT) {
					direccion = KeyEvent.VK_RIGHT;
				}
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/*
	 * En esta clase interna creamos un hilo para poder darle movilida
	 * al punto.
	 */
	public class Momento extends Thread{
		long last= 0;
		public void run() {
			while(true) {
				if((java.lang.System.currentTimeMillis() - last)> frecuencia) {
					/*En la siguiente instrucción es para saber para donde se está moviendo
					 * Pues tenemos que tener un punto de unión entre un hilo y el otro.
					 */
					if(direccion == KeyEvent.VK_UP) {
						snake.y = snake.y - heightPoint ;
						if(snake.y < 0) {
							snake.y = height- heightPoint;
						}
						
						if(snake.y > height) {
							snake.y = 0;
						}
					}else if (direccion == KeyEvent.VK_DOWN) {
						snake.y = snake.y + heightPoint ;
						if(snake.y < 0) {
							snake.y = height- heightPoint;
						}
						
						if(snake.y > height) {
							snake.y = 0;
						}
					}else if (direccion == KeyEvent.VK_LEFT) {
						snake.x = snake.x - widthPoint ;
						if(snake.x < 0) {
							snake.x = width- widthPoint;
						}
						
						if(snake.x > width) {
							snake.x = 0;
						}
					}else if (direccion == KeyEvent.VK_RIGHT) {
						snake.x = snake.x + widthPoint ;
						if(snake.x < 0) {
							snake.x = width + widthPoint;
						}
						
						if(snake.x > width) {
							snake.x = 0;
						}
					}
					
					
					actualizar();
					last = java.lang.System.currentTimeMillis();
				}
			}
		}
		public void actualizar() {
			ImagenSnake.repaint();
		}
	}

	
	
	
	int width =640;
	int height = 480;
	//------------------------------------------------------------------------------
	//Creamos esta propiedad para poder comenzar a crear el objeto
	Point snake;
	//------------------------------------------------------------------------------
	// 6º Creamos 3 propiedades para darle una localización en el metodo que pinta
	// en el JPanel
	int widthPoint = 10;
	int heightPoint= 10;
	//------------------------------------------------------------------------------
	//------------------------------------------------------------------------------
	// 7º Creamos esta propiedad para poder hacer un objeto que sea dibujable en 
	//Frame. Puesto que la lamina contiene la info, pero aún no sea inicializado
	ImagenSnake ImagenSnake;
	
	/* 10 º. Vamos a declarar una variable de propiedad para acumular
	 * los movimientos que realicemos mediante las teclas.
	 */
	int direccion = KeyEvent.VK_LEFT;
	long frecuencia = 20;
}





