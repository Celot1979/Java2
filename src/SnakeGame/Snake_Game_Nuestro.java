package SnakeGame.Snake;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
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
		/* 9º Teniendo creado el punto ó objeto que se verá con snake, queda
		 * instaciar ImagenSnake que es quien dibuja el obajeto en la lámina.
		 * 
		 * Posteriormente se sustituye el objeto Snake por el método starGame.
		 * El motivo es que esté método contiene tanto el objeto snake como apple.
		 * 
		 */
		
		starGame();
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
	 * 11º Una vez creado la propiedad Point apple, vamos a dibujarla en la lámina
	 */
	
	 public void starGame() {
		 apple = new Point(200,200);
		 snake = new Point(width/2,height/2);
		 //15.b. Instaciamos la lista. Posteriormente sumamos una serpiente a la lista.
		 lista = new ArrayList<Point>();
		 lista.add(snake);
		 crearComida();
	 }
	
	
	
	/*
	 * 5º Creamos una clase interna para la parte gráfica.
	 * Será una clase JPanel para pintar el punto
	 */
	class ImagenSnake extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			/* 
			 * 17º. Finalmente para que la serpiente vaya creaciendo, debemos actualizar
			 * el dibuju de la misma. Eso lo haremos con un bucle for.
			 */
			g.setColor(Color.DARK_GRAY);
			g.fillRect(snake.x, snake.y, widthPoint, heightPoint);
			for(int i = 0; i < lista.size();i++) {
				Point point = (Point)lista.get(i);
				g.fillRect(point.x, point.y, widthPoint, heightPoint);
			}
			
			
			
			g.setColor(Color.RED);
			g.fillRect(apple.x, apple.y, widthPoint, heightPoint);
			
			if(gameOver) {
				g.drawString("GAME OVER", 200,300);
				String puntos= String.valueOf(puntuacion);
				g.drawString(puntos, 250, 350);
				g.drawString("PUNTUACIÓN", 100, 350);
			}
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
			}else if(e.getKeyCode()== KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
				if(direccion != KeyEvent.VK_DOWN || direccion != KeyEvent.VK_W) {
					direccion = KeyEvent.VK_UP;
				}
				
			}else if(e.getKeyCode()== KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
				if(direccion != KeyEvent.VK_UP || direccion != KeyEvent.VK_S) {
					direccion = KeyEvent.VK_DOWN;
				}
				
			}else if(e.getKeyCode()== KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
				if(direccion != KeyEvent.VK_RIGHT || direccion != KeyEvent.VK_A) {
					direccion = KeyEvent.VK_LEFT;
				}
			}else if(e.getKeyCode()== KeyEvent.VK_RIGHT|| e.getKeyCode() == KeyEvent.VK_D) {
				if(direccion != KeyEvent.VK_LEFT|| direccion != KeyEvent.VK_D) {
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
	 *  12º En este punto vamos a crear la aleatoridad de la comida.
	 *  
	 *  Luego el método vamos a inicializarlo en el método que dibuja amabas formas.
	 */
	public void crearComida() {
		Random  rnd = new Random();
		apple.x = rnd.nextInt(width);
		if((apple.x%5 )>0) {
			apple.x= apple.x-(apple.x % 5);
		}
		
		if(apple.x < 5 ) {
			apple.x= apple.x + 10;
		}
		apple.y = rnd.nextInt(height);
		if((apple.y%5 )>0) {
			apple.y= apple.y-(apple.y % 5);
		}
		
		if(apple.y < 5 ) {
			apple.y= apple.y + 10;
		}
		
		puntuacion += 10;
		
		System.out.println(puntuacion);
		setLayout(new BorderLayout());
		JPanel superior = new JPanel();
		nivel_cartel = new JLabel("N I V E L : ");
		nivel_cartel_resultado= new JLabel("");
		
		
		espacio1= new JLabel("<|        SNAKE         |>");
		
		
		puntuaciones = new JLabel("P U N T U A C I O N : ");
		puntuacion_cartel= new JLabel("");
		
		superior.add(nivel_cartel);
		superior.add(nivel_cartel_resultado);
		superior.add(espacio1);
		superior.add(puntuaciones);
		superior.add(puntuacion_cartel);
		
		
		add(superior,BorderLayout.NORTH);
		//Marcador de puntos
		int resultado = Integer.valueOf(puntuacion);
		prueba = resultado+"";
		puntuacion_cartel.setText(prueba);
		nivel = "0";
		
		
		////Marcador de nivel
		
			if(puntuacion <30) nivel = "0";
			else if (puntuacion == 30) nivel = "1";
			else if (puntuacion > 100 || puntuacion < 150) nivel = "2";
			else if (puntuacion > 150) nivel = "3";
				
			
			nivel_cartel_resultado.setText(nivel);
			
			/*
			 * 1ºHay que seguir poniendo las condicioneales para ir subiendo el nivel
			 * 
			 * 2º Después crear una variable record. El último resultado se almacena en esa variable.
			 * Una vez que se almacena en esa variable hay que almacenarla en un array, para que leugo podamos compararla con el siguiente resultado..
			 *
			 */

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
					 * Pues tenemos que tener un punto de unión entre un hilo y la otra parte del programa.
					 */
					
					/*
					 *  18.c. En caso que sea gameOver, paramos de desplazar el punto.
					 *  
					 */
					 if(!gameOver) {
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
					 }

					
					actualizar();
					last = java.lang.System.currentTimeMillis();
				}
			}
		}
		public void actualizar() {
			ImagenSnake.repaint();
			
			/*
			 *  16º. En la siguiente línea, vamos a ir cambiando cual es el 1º punto.
			 */
			
			lista.add(0,new Point(snake.x,snake.y));
			lista.remove(lista.size()-1);
			
			
			/*
			 * 18º. Debemos de crear un bucle para que al tocarse la serpiente,  muera.
			 */
			
			  for(int i = 1; i < lista.size();i++) {
				  Point punto = lista.get(i);
				  if(snake.x == punto.x && snake.y == punto.y){
					  gameOver = true;
				  }
				  
			  }
			
			
			/*
			 * 14º. Dentro del método actualizar, crearemos un condicional que será
			 * el responsable de fijar que ocurre cuando ambos colisionan, ó lo que es
			 * lo mismo, cuando la serpiente come la manzana.
			 */
			
			if((snake.x > (apple.x - 10)) && (snake.x < (apple.x + 10)) && (snake.y > (apple.y - 10))  && (snake.y < (apple.y + 10))){
				// 15.c Aquí es donde realmente hacemos que se sume un punto más a la serpiente- haciéndola crecer-.
				lista.add(0,new Point(snake.x,snake.y));
				crearComida();
				
			}
			
			
		}
	}
	

	int width =1920;
	int height =1080;
	//------------------------------------------------------------------------------
	//Creamos esta propiedad para dibujar ambos puntos. 1º La serpiente y luego la manzana
	Point snake;
	Point apple;
	//------------------------------------------------------------------------------
	// 18.bº Creamos la varibale gameOver.
	
	boolean gameOver=false;
	
	
	
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
	long frecuencia = 50;
	
	/*
	 * 15º. Debemos crear una lista como propiedad que vaya creciendo cada vez que se tope
	 * con el punto. De esa forma va creciendo la serpiente.
	 */
	ArrayList<Point> lista = new ArrayList<Point>();
	
	/* 
	 * Puntuación!!!!
	 */
	int puntuacion = -10;

	/*
	 * Nivel
	 */
	
	 String nivel = "";
	 String prueba;
	 
	 /*
	  * Gráficos
	  */
	
	 JLabel puntuaciones, puntuacion_cartel, nivel_cartel,nivel_cartel_resultado,espacio,espacio1,espacio2;
	
}
