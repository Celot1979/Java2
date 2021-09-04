package Menu_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;



public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Menú - Componentes - Swing");
		setBounds(700,200,700,350);
		add(new Lamina());
		setVisible(true);	
	}
}
class Lamina extends JPanel{
	public Lamina() {
		
		//Barra elementos
		JMenuBar miBarra = new JMenuBar();
		// Elementos del menú
		JMenu archivo = new JMenu("Archivo");
		JMenu ediccion = new JMenu("Ediccion");
		JMenu herramientas = new JMenu("Herramientas");
		//Añadimos los elementos a la barra
		miBarra.add(archivo);
		miBarra.add(ediccion);
		miBarra.add(herramientas);
		
		//Subelementos del elemento -Archivo-
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar Como");
		/*
		 * Vamos generar una acción con ActonListener, para que cuando se pulse guardar como imprima por consola un texto
		 */
		guardar_como.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Has pulsado guardar como");
				
			}
			
		});
		//Añadir estos subelementos a el elemento guardar
		archivo.add(guardar);
		archivo.add(guardar_como );
		
		
		//Subelementos ediccion
		JMenuItem copiar= new JMenuItem("Copiar");
		JMenuItem pegar= new JMenuItem("Pegar");
		JMenuItem cortar = new JMenuItem("Cortar");

		//Añadir estos subelementos a el elemento guardar
		ediccion.add(copiar);
		ediccion.add(pegar);
		ediccion.add(cortar);
		
		// --- Especial Ateción al Elemento Herramientas-----
		/*
		* El elemento herramientas tiene un JmenuItem como hemos visto con anterioridad.
		* A su vez también tiene un submenú que veremos como abordarlo, por lo pronto para este submenú
		* habrá que crear un JMenu*/
		JMenuItem opciones = new JMenuItem ("Opciones");
		JMenu preferencias = new JMenu("Preferencias");
		//Añadimos ambas al elemento herrameintas
		herramientas.add(opciones);
		//Creamos un separador
		herramientas.addSeparator();
		herramientas.add(preferencias);
		
		
		// Creamos las opciones que irán dentro del submenú -Preferencias-
		JMenuItem ayuda= new JMenuItem("Ayuda");
		JMenuItem generales= new JMenuItem("Generales");
		
		//Añadimos estas opciones a -Preferencias
		
		preferencias.add(ayuda);
		preferencias.add(generales);
		
		
		// Añadimos la barra a la lámina(Jpanel)
		add(miBarra);//Última instrucción que se debe dejar
		
		
		
	}
}