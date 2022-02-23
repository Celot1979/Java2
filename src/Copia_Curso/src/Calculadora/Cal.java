package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Marco extends JFrame{
	public Marco() {
		setTitle("Calculadora propia");
        setBounds(800,300,400,200);
        lamina_General lamina = new lamina_General();
        add(lamina,BorderLayout.SOUTH);
        setVisible(true);
	}
}
class lamina_General extends JPanel{
    public lamina_General(){
        comienzo = true;
        setLayout(new BorderLayout());
        pantalla = new JButton(" 0 ");
        add(pantalla, BorderLayout.NORTH);
        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));
        InsertarNumeros insertar = new InsertarNumeros();
        Operacion realizarOperacion = new Operacion();
        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBotonOperaciones("x",realizarOperacion);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBotonOperaciones("-",realizarOperacion);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBotonOperaciones("+",realizarOperacion);
        ponerBoton("0",insertar);
        ponerBoton(",",insertar);
        ponerBotonOperaciones("=",realizarOperacion);
        ponerBotonOperaciones("/",realizarOperacion);
        add(numeracion,BorderLayout.CENTER);
    }
    /* Métodos funcionales dentro de la interfaz de la calculadora*/
    // Funcionalidad botones (no símbolos aritméticos)
    private void ponerBoton(String textoBoton, InsertarNumeros oyente){
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        numeracion.add(boton);
    }
    
    // Funcionalidad de símbolos aritméticos
    
    private void ponerBotonOperaciones(String textoBoton, Operacion oyente){
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        numeracion.add(boton);
    }
    
    /*Clases internas que realizan la escucha de los objetos*/
    // Escucha y gestiona la entrada de los botones (menos símbolos)
    private class InsertarNumeros implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada = e.getActionCommand();
            if(comienzo){
                pantalla.setText(entrada);
                comienzo=false;
            }else{
                pantalla.setText(pantalla.getText()+ entrada);
		}
            
            ultimoValor= Double.parseDouble(pantalla.getText());
 
        }
    }
    // Escucha y gestiona la entrada de los botones de los símbolos
    
    private class Operacion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String operacionPulsada = e.getActionCommand();
			if(operacionPulsada.equals("+")) {
				resultado+= ultimoValor;
				pantalla.setText("" + resultado);
				ultimaOperacion = "+";
			}else if(operacionPulsada.equals("*")) {
				double valor = Double.parseDouble(pantalla.getText());
				if (contador ==0) {
					resultado = valor*1;
				}else {
					resultado+= ultimoValor;
				}
				
				pantalla.setText("" + resultado);
				ultimaOperacion = "*";
				contador+=1;
			}
			
			
			
			
			
			else {
				if(ultimaOperacion.equals("+")) {
					resultado+= ultimoValor;
				}if(ultimaOperacion.equals("*")) {
					resultado*= ultimoValor;
					contador =0;
				}
				
				pantalla.setText("" + resultado);
				ultimoValor = 0;
			}
			
			comienzo = true;

		}
		private String ultimaOperacion;
		private int contador;
    	
    }
    
    
   
    private JPanel numeracion;
    private JButton pantalla;
    private boolean comienzo;
    private String ultimaOperacion ="";
    private double resultado;
    private double ultimoValor;
}