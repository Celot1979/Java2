package es.pildoras.excepciones;



import java.util.*;
/* En esté ejemplo veremos una excepción no controlada.
 * 
 * Tendremos que usar el error que nos marca la consola, cuando el usuario tecle la edad en letras.
 * En el método estatico que realiza la operación le implementaremos el throws con el error( en este caso InputMismatchException).
 * 
 * A continuación debemos ir donde está llamado el método en cuestión y capturarlo con un try --- catch.
 * 
 * Debemos comprender que es un error  no controlado, por tanto el sistema nunca nos dirá que debemos hacerlo ni dónde debemos hacerlo.
 */

public class EntradaDatos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
		
		if (decision==1){
			try {
				pedirDatos();
			}catch (InputMismatchException e) {
				System.err.println("Has introduccido un dato erróneo");
			}
			
			
	
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}
	
		static void pedirDatos() throws InputMismatchException {			
		
			
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	
			
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");		
		
		entrada.close();
			
		
		
	}
		
		
}

