package Eventos_XIII_Multiples_Fuentes_IV;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multiples_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);

	}

}

class Marco_Principal extends JFrame{
	public Marco_Principal() {
		setTitle("Multiples Oyetes");
		setBounds(1300,100,300,200);
		add(new LaminaPrincipal());
	}
}

class LaminaPrincipal extends JPanel{
	public LaminaPrincipal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		
		
		//3º Paso. Tenemos que hacer que el botón en cuestión quede a la escucha.
		boton_nuevo.addActionListener(new CreaMarco());
	}
	//2º Paso. Creamo una clase interna que construya que el botón esté a la escucha.
	
	
	private class CreaMarco implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MarcoNuevo miMarco = new MarcoNuevo(boton_cerrar);// Creamos la instancia que haga inicializar la clase antes creada, creando un objeto de ella
			/*
			 * 7º Paso. Incluiremos el botón que queremos que pase por parámentro y realice la acción de la calse privada que está en MarcoNuevo.
			 * Al pasar por parámentro ese botón, ejecutará el método actionPerformed de la clase privada CierraTodos.
			 */
			miMarco.setVisible(true);// Visilizamos el nuevo/ os marcos que se irán creando.
		}
		
	}
	
	
	
	JButton boton_cerrar ;
}
//1º Paso
//Clase encargada de crear la ventana nueva una vez presionado el botón 
class MarcoNuevo extends JFrame{
	public MarcoNuevo(JButton boton) {
		//5ª Paso. HAremos que el botón de cerrar ventanas pase como párametro de este constructor.
		contador++;//IRa sumando una nueva ventana
		setTitle("Ventana " + contador);// Tendrá un titulo adecuado con la ventana que es
		setBounds(50*contador, 50*contador, 350,200);// Posicionaremos la nueva ventana siempre con una relación posicional al multiplicarse con la variable contador
		//8ºPaso. Debemos decir que el botón qeu está pasando por la instancia de MarcoNuevo que está en la clase privada de la lámina quede a la escucha.
		boton.addActionListener(new CierraTodos());
		
	}
	//4º Paso. Aquí es donde veremos como cerrar todas las ventanas( el objetivo de la lección ).
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
		
	}
	//Crearemos una variable  para ir contando las ventanas nuevas e ir posicionándolas en diferentes lugares
	private static int contador = 0;
}