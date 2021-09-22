package Ejercicio_II_No_Comprobada;

import javax.swing.JOptionPane;
// El ejercicio lo hemos realizado con excepción propia no comprobada. Hay segunda parte dentro de esté paquete
public class Ejercicio_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introducce un número"));
		
		validar(num);
		
	}
	static void validar(int numero) throws  NumeroFueraRango {
		if(numero > 100 || numero < 0) {
			throw new NumeroFueraRango("El nº está fuera de rango");
		}else {
			System.out.println("Nº Correcto");
		}
	}
	
}
class NumeroFueraRango extends RuntimeException{
	public NumeroFueraRango() {
		
	}
	public NumeroFueraRango(String mensaje) {
		super(mensaje);
	}
}
