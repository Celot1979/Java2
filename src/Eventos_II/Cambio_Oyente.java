package Eventos_II;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Cambio_Oyente {
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

class laminaBotonesMultiples extends JPanel {
//Debemos crear primero los botones que nos piden
JButton botonVerde = new JButton("Verde");
JButton botonRojo = new JButton("Rojo");
JButton botonGris= new JButton("Gris");

public laminaBotonesMultiples() {
	add(botonVerde);
	add(botonRojo);
	add(botonGris);
	
	// Aqui crearemos las instancias del nuevo oyente.
	ColorDeFondo Verde = new ColorDeFondo(Color.GREEN);
	ColorDeFondo Rojo= new ColorDeFondo(Color.RED);
	ColorDeFondo Gris = new ColorDeFondo(Color.GRAY);
	
	botonVerde.addActionListener(Verde); 
	botonRojo.addActionListener(Rojo); 
	botonGris.addActionListener(Gris); 

}

/*Clase interna.
 * Durante la creación de la modificación hemos tenido que crear
 * una clase Color ( como una clase más).En el 3º paso, hemos
 * implementeado el método de la interfaz, y en él hemso tenido 
 * que udar el método setBackground.
 * 
 * Este método pertene a la clase JPanel, y la clase Color
 * está creada fuera de la clase lamina que es la que hereda de
 * JPanel.
 * 
 * La solución es cortar la clase Color he introduccirla como clase interna 
 * en  la clase lamina. Así podrá heredar los métodos heredados de JPanel.
 */
private class ColorDeFondo implements ActionListener{
	public ColorDeFondo(Color c) {
		colorDeFondo = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		setBackground(colorDeFondo);
		
	}
	private Color colorDeFondo;
	
}

}

