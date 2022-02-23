package Clasula_Throw;

import javax.swing.JOptionPane;

public class Excepcion_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = JOptionPane.showInputDialog("Introduce mail");
		examinaMail(mail);

	}
	
	
	static void examinaMail(String email) {
		int arroba = 0;
		boolean punto = false;
		String sin = "@";
		char arroba_sin = sin.charAt(0);
		
		String sin_punto = ".";
		char punto_sin = sin_punto.charAt(0);
		if(email.length() <= 3) {
			ArrayIndexOutOfBoundsException mi_Excepcion = new ArrayIndexOutOfBoundsException();
			throw mi_Excepcion;
		}
		
		for(int i = 0; i< email.length(); i++) {
			if(email.charAt(i) ==arroba_sin) {
				arroba ++;
			}
			if(email.charAt(i) == punto_sin) {
				punto=true;
			}
		}
		if(arroba == 1 && punto == true) {
			
			System.out.println(" Es correcto");
		}else {
			System.out.println("Incorrecto");
			
		}
	}

}
