package Excepciones_propias;

import javax.swing.JOptionPane;
/*
 * En este ejemplo crearemos un ejemplo de excepciones propias
 * Debemos de añadir que será sobre un excepción no controlada, por tanto no hará falta que se capture un try catch.
 * 
 * 1º Debemos crear una clase con dos constructores.
 * 
 * 2º Un objeto en la zona que deseamos crear la excepcion de esa clase.
 * 
 * 3º instaciar despues del objeto la palabra clave throw.
 * 
 * 4º En la invocación del método general, implementar la instrucción THROWS más el nombre de la excepción propia.
 * 
 * 5º Si deseamos que la excepción arroje más infomación usaremos el otro constructor.
 */
public class Excep_propias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = JOptionPane.showInputDialog("Introduce mail");
		examinaMail(mail);

	}
	static void examinaMail(String email) throws LongitudMailErronea {
		int arroba = 0;
		boolean punto = false;
		String sin = "@";
		char arroba_sin = sin.charAt(0);
		
		String sin_punto = ".";
		char punto_sin = sin_punto.charAt(0);
		if(email.length() <= 3) {
			//LongitudMailErronea miExcepcion = new LongitudMailErronea();
			LongitudMailErronea miExcepcion = new LongitudMailErronea("Cuidado!!!. Tiene meno o igual a tres caracteres");
			throw miExcepcion;
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
class LongitudMailErronea extends RuntimeException{
	public LongitudMailErronea() {}
	public LongitudMailErronea(String MensajeError) {
		super(MensajeError);
	}
}
