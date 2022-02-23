package Calculadora_PasoII;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Marco extends JFrame{
    public Marco(){
        setTitle("Calculadora");
        setBounds(800,300,400,200);
        laminaCaja lamina = new laminaCaja();
        add(lamina,BorderLayout.SOUTH);
        setVisible(true);
    }
}
class laminaCaja extends JPanel{
    public laminaCaja() {
    	comienzo = true;
        setLayout(new BorderLayout());
        pantalla =new JButton("0");
        add(pantalla, BorderLayout.NORTH);

        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));
        InsertaNumero insertar = new InsertaNumero();

        ponerBoton("7",insertar);
        ponerBoton("8",insertar);
        ponerBoton("9",insertar);
        ponerBoton("x",insertar);
        ponerBoton("4",insertar);
        ponerBoton("5",insertar);
        ponerBoton("6",insertar);
        ponerBoton("-",insertar);
        ponerBoton("1",insertar);
        ponerBoton("2",insertar);
        ponerBoton("3",insertar);
        ponerBoton("+",insertar);
        ponerBoton("0",insertar);
        ponerBoton(",",insertar);
        ponerBoton("=",insertar);
        ponerBoton(" ",insertar);
        

        add(numeracion, BorderLayout.CENTER);

        


    }
    private void ponerBoton(String textoBoton, InsertaNumero oyente) {
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        numeracion.add(boton);
    }
    
    
    
    private class InsertaNumero implements ActionListener{

    	@Override
    	public void actionPerformed(ActionEvent e) {
    		String entrada = e.getActionCommand();
    		if (comienzo == true) {
    			pantalla.setText(entrada);
    			comienzo = false;
    		}else {
    			pantalla.setText(pantalla.getText() + entrada);
    		}
    	
    		
    	}
    	
    }
    private JPanel numeracion;
    private JButton pantalla;
    private boolean comienzo;    
    
}