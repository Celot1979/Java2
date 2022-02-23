package Ejercicio_II_Comprobado;

import java.io.IOException;

import javax.swing.JOptionPane;



public class Ejercicio_II_Comprobado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introducce un número"));
		
		try {
			validar(num);
		} catch (NumeroFueraRango e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("No se puede poner letras");
			//e.printStackTrace();
		}

	}
	static void validar(int numero) throws  NumeroFueraRango {
		if(numero > 100 || numero < 0) {
			throw new NumeroFueraRango("El nº está fuera de rango");
		}else {
			System.out.println("Nº Correcto");
		}
		
		
	}

}
class NumeroFueraRango extends IOException{
	public NumeroFueraRango() {
		
	}
	public NumeroFueraRango(String mensaje) {
		super(mensaje);
	}
}