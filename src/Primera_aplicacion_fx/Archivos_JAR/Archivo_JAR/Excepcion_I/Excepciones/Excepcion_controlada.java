package Primera_aplicacion_fx.Archivos_JAR.Archivo_JAR.Excepcion_I.Excepciones;

import java.io.IOException;
import java.util.Scanner;

public class Excepcion_controlada{
    public static void main(String[] args){
        System.out.println("�Qu� deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. Salir del programa");
		
		Scanner entrada=new Scanner (System.in);
		
		int decision=entrada.nextInt();
        if (decision==1){
			try {
				pedirDatos();
			}catch (Exception e) {
				System.err.println("Has introduccido un dato erróneo");
			}
			
			
	
		}else{
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();
		
		System.out.println("Hemos terminado");
		
	}

    static void pedirDatos() throws IOException {
        Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();	
			
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os");		
		
		entrada.close();
    }
    }
