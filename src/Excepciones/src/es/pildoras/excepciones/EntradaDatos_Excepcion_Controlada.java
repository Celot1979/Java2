package es.pildoras.excepciones;

import java.io.IOException;
import java.util.Scanner;

/* En este ejemplo veremos como podemos crear una versión del ejercicio anterior, pero forzando al sistema a crear una excepción controlada.
 * Lo primero que debemos hacer es en el método estático que genera el código 
 */

public class EntradaDatos_Excepcion_Controlada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		int decision = entrada.nextInt();
		
		if(decision == 1) {
			try {
				pedirDatos();
			}catch(Exception e) {
				System.out.println("HAs introduccido unos datos incorrectos");
			}
			
		}else {
			System.out.println("Gracias por su participación. Esperamos volver a verle pronto");
			System.exit(0);
		}
		
		entrada.close();
		System.out.println("Hemos terminado");

	}
	static void pedirDatos() throws IOException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre ?");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduce edad, por favor");
		int edad=entrada.nextInt();	
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");		
		entrada.close();
	}

}
