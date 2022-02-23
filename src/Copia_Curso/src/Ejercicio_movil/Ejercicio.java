package Ejercicio_movil;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		Scanner prueba = new Scanner(System.in);
		int calculo = prueba.nextInt();
		
		for(int i = 0; i < 3 ; i++) {
			calculo = calculo - (calculo * 10)/100;
			
		}
		System.out.println(calculo);
		
		

	}

}
/*calculo = calculo-1;
System.out.println(calculo);*/