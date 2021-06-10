package Proyecto;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		mimarco .setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco.addWindowListener(new EventoDeVentana());
	}

}

class Marco extends JFrame{
	public Marco() {
		setTitle("Proyecto");
		setBounds(600,200,800,600);
		//Dos primera cifras el lugar donde se va a posicionar la ventana
		//Dos siguientes cifras el tamaño
		
		lamina milamina = new lamina();
		add(milamina);
	}
}

class lamina extends JPanel implements ActionListener{
	public lamina() {
		//Creación de labels
		setLayout(null);
		label1 = new JLabel("Etiqueta 1");
		label1.setBounds(200, 20, 200, 30);
		
		label2 = new JLabel("Etiqueta 2");
		label2.setBounds(200, 60, 200, 30);
		
		add(label1);
		add(label2);
		
		//Creación de cajas de texto
		
		
		texto = new JTextField(10);
		texto.setBounds(280,20,200,30);
		//textos = texto.getText();
		add(texto);
		
		
		texto2 = new JTextField(10);
		texto2.setBounds(280,60,200,30);
		add(texto2);
		
		//Creación de botones 
		
		boton1 = new JButton("Guardar");
		boton1.setBounds(500,20,200,30);
		boton1.addActionListener(this); 
		add(boton1);
		
		
		
		boton2 =  new JButton("Borrar");
		boton2.setBounds(500,60,200,30);
		boton2.addActionListener(this); 
		add(boton2);
		
		
		
		
	}
	/*Se realiza la creación de las propiedades creo que por 2 motivos
	 * 1º PAra la simplificación del código.
	 * 2º Para poder ser usadas en todo el código
	 */
	private JLabel label1,label2;
	private JTextField texto, texto2;
	private JButton boton1, boton2;
	private String textos, textos2;
	private String tx;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object pulsado = e.getSource();
		/*1º Creamos un objeto que nos haga interpretar que acción hacer dependiendo
		 * del botón que toquemos. Para ello usamos un condicional.
		 * 
		 * 2ºPara que lo introduccido por caja sea imprimido
		 * se debe primero crear un String ( que para que sea accesible
		 * en todo el código las iniciamos como propiedades)
		 * 
		 * 3º En los condicionales en el 1º lugar es guardar que lo que vamos a realizar es imprimir
		 * por consola las dos cajas de texto
		 */
		textos = texto.getText();
		textos2 = texto2.getText();
		
		tx = ("");
		
		
		
		
		if(pulsado == boton1) System.err.println(textos +  " "+  textos2);
		else if(pulsado == boton2) {
			texto.setText(tx);
			texto2.setText(tx);
		}
	}
	
	
	public void paintComponent(Graphics g) {
			super.paintComponent(g);
			File miImagen = new File("/Users/danielgil/Desktop/JAVA/clase/src/Proyecto/palevlas.png");
			try {
				imagen = ImageIO.read(miImagen);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("Un eerrorr");
			}
			g.drawImage(imagen,0,50, null);
			
		}
		private Image imagen;
	
}


  /*Vamos a poner en practica lo aprendido en EVENTOS DE VENTNA
   * OJETIVO: El objetivo de esta practica es que cuando recemos la ventana de la app,
   * nos salga por consola un mensaje agradeciendo el trabajo realizado.
   * 
   * 1º Paso. Cambiar en la clase de ejecución el comportamiento de la ventana a la hora de cerrarse
   * Es decir, vamos a cambiar el JFrame.EXIT_ON_CLOSE por JFrame.DISPONSE_ON_CLOSE.
   * 
   * 2º Paso. Crearemos una clase que implemente la clase WindowAdpater (una clase adptadora).
   * En ella están 4 interfaces, pero al usar esta clase no tenemos que cumplimentar todos los 
   * métodos que tienen cada interfaz.
   * 
   * 3º Crearemos el objet- escucha que con el método addWindow añadirá el comportameinto a la ventana
   */
   
class EventoDeVentana extends WindowAdapter{
	public void windowClosed(WindowEvent e) {
		System.out.println("Gracias por trabajar con la app. Te esperamos pronto...");
	}
}
