package Ejercicio_movil;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ejemplo = new Scanner(System.in);
		int numero = ejemplo.nextInt();
        Converter.toBin(numero);
	}

}
class Converter{
	public static int toBin(int x) {
		String binario = " ";
		int numero = x;
		while (numero > 0) { 
			binario = numero % 2 == 0 ? "0" + binario : "1" + binario;
			 numero =  numero / 2;
		}
		
		int resultado = Integer.parseInt(binario); 
		
		
		return resultado;
		
	}
}