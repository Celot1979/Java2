package Propia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;
/* IMPORTANTE: Falta por codificar el método y oyente de los botones de símbolos/ operaciones.
 *             Falta por implementar el algoritmo para que sume.
 */

public class Propia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco extends JFrame{
	public Marco() {
		setTitle("CalculadoraX");
		setBounds(800,300,400,200);
		Lamina lamina = new Lamina();
		add(lamina, BorderLayout.SOUTH);
		setVisible(true);
	}
}
class Lamina extends JPanel{
	public Lamina() {
		comienzo = true;
		setLayout(new BorderLayout());
		pantalla = new JButton ("0");
		add(pantalla, BorderLayout.NORTH);
		
		numerico = new JPanel();
		numerico.setLayout(new GridLayout(4,4));
		InsertarNumeros insertar = new InsertarNumeros();
		Operaciones inserOp = new Operaciones();
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBotonOperaciones("+",inserOp);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBotonOperaciones("-",inserOp);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBotonOperaciones("*",inserOp);
		ponerBoton("0",insertar);
		ponerBoton(";",insertar);
		ponerBotonOperaciones("=",inserOp);
		ponerBotonOperaciones("/",inserOp);
		add(numerico, BorderLayout.CENTER);
	}
	//Metodo para insertar los botones númericos
	private void ponerBoton(String texto, InsertarNumeros oyente) {
		JButton boton = new JButton(texto);
		boton.addActionListener(oyente);
		numerico.add(boton);
	}
	
	//Metodo para insertar los botones símbolos
		private void ponerBotonOperaciones(String texto, Operaciones oyente) {
			JButton boton = new JButton(texto);
			boton.addActionListener(oyente);
			numerico.add(boton);
		}
	
	
	
	//Clase interna para poner a la ecucha los botones númericos
	private class InsertarNumeros implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
			if(comienzo) {
				pantalla.setText(entrada);
				comienzo = false;
			}else {
				pantalla.setText(pantalla.getText()+ entrada);
			}
			ultimoValor= Double.parseDouble(pantalla.getText());
		}
	}
	
	
	private class Operaciones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String BotonPulsado = e.getActionCommand();
			if(BotonPulsado.equals("+")) {
				resultado += ultimoValor;
				pantalla.setText("" + resultado);
				ultimaOperacion = "+";
				
			} else if(BotonPulsado.equals("x")) {
				double valor = Double.parseDouble(pantalla.getText());
				if(contador == 0) {
					resultado = valor +1;
					
				}else {
					resultado *= ultimoValor;
				}
				pantalla.setText("" + resultado);
				ultimaOperacion = "*";
				contador+=1;
				
			}else if (BotonPulsado.equals("-")) {
				double valorResta = Double.parseDouble(pantalla.getText());
				if(contadorResta == 0) {
					
				}
				
				
			}
			
			else {
				if(ultimaOperacion.equals("+"))resultado+= ultimoValor;
				if(ultimaOperacion.equals("*")) resultado *= ultimoValor;contador = 0;
				resultado+= ultimoValor;
				pantalla.setText("" + resultado);
				ultimoValor = 0;
				//if(ultimaOperacion.equals("-"))resultado-= ultimoValor;
			}
			
			comienzo =true;
			
			
			
		}
		private String UltimaOperacion;
		private int contador;
		private int contadorResta;
	}
	private JButton pantalla;
	private JPanel numerico;
	private boolean comienzo;
	private String ultimaOperacion ="";
    private double resultado;
    private double ultimoValor;
    private double operador;
    
	
}