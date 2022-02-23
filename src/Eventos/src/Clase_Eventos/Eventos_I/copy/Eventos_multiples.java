package Clase_Eventos.Eventos_I.copy;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos_multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBoton boton = new MarcoBoton();
		boton.setVisible(true);
		boton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBoton extends JFrame{
	public MarcoBoton() {
		setTitle("Botones multiples");
		setBounds(700,400,500,500);
		laminaBotonesMultiples milamina = new laminaBotonesMultiples();
		add(milamina);
	}
}

class laminaBotonesMultiples extends JPanel implements ActionListener{
	//Debemos crear primero los botones que nos piden
	JButton botonVerde = new JButton("Verde");
	JButton botonRojo = new JButton("Rojo");
	JButton botonGris= new JButton("Marrón");
	/*Para añadir a la lamina debemos invocar al constructor de la clase
	 * Es la fórmula para que aparezca en la ventana al iniciar el programa
	 */
	public laminaBotonesMultiples() {
		/*Como estamos dentro del constructor , para añadirlos
		 * solo debemos usar el método add
		 */
		
		add(botonVerde);
		add(botonRojo);
		add(botonGris);
		
		/*Debemos especificar en donde queremos que pase el evento.
		 * En este caso como queremos que el evento ocurra dentro de la lamina
		 * debemos usar la interfaz addActionListener y la palabra reservada this
		 */
		botonVerde.addActionListener(this); 
		botonRojo.addActionListener(this); 
		botonGris.addActionListener(this); 
		/*Según añadimos el metodo, nos saldrá un error.Esto es debido a que no
		 * hemos implementado en la clase la interfaz.
		 * Por tanto demos implementarla en la clase.
		 * Acto seguido, nos saldrá el error de no importación.Posteriormente el de no 
		 * implementar el método que debemos sobrescribir
		 */
	}
	@Override
	//Método que como sabemos es de obligado sobreescribirlo
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*Por obligación debemos crear un objeto que contenga el objeto e y el método
		 * getSource(ientifica quien a realizado la acción). Es decir, que botón está
		 * siendo pulsado
		 */
		
		Object botonPulsado = e.getSource();
		
		/* Una vez creado simplemente debemos usar un condicional
		 */
		if(botonPulsado == botonVerde)setBackground(Color.GREEN);
		else if(botonPulsado == botonRojo)setBackground(Color.RED);
		else if(botonPulsado == botonGris)setBackground(Color.GRAY);
	}
}