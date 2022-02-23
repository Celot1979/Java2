package Excepciones_multiples;

import javax.swing.JOptionPane;



public class Excepciones_Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			division();
		}catch(ArithmeticException e) {
			System.out.println("No sé puede dividir entre 0");
		}catch(NumberFormatException e) {
			System.out.println("Se ha lanzado un error de tipo: " + e.getClass().getName());
		}

	}
    static void division() {
    	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo"));
    	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce divisor"));
    	System.out.println("El resultado es: " + num1/num2);
    }
}
