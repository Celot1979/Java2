package Ejercicio_I;

import javax.swing.JOptionPane;

public class Ejercicio_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programa par = new Programa();
		

	}

}
class Programa{
	public Programa() {
		try {
			int pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introducce el número"));
			if(pregunta % 2 == 0) {
				JOptionPane.showMessageDialog(null,"El Nº " + pregunta + " es Par");
				System.exit(0);
			}else if(pregunta == 0) {
				JOptionPane.showMessageDialog(null,"El Nº " + pregunta + " es 0. No Es una poibilidad");
				System.exit(0);
			}else {
				JOptionPane.showMessageDialog(null,"El Nº " + pregunta + " es Impar");
				System.exit(0);
			}

				
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"“El valor introducido no es numérico. El programa se cerrará”");
			System.exit(0);
		}
		
	}
}