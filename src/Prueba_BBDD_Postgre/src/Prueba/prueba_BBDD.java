package Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class prueba_BBDD {
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		DBManager.initConnection();
		
		int opc;
		do {
			System.out.println("\n1.Ver personas");
			System.out.println("2.Crear personas");
			System.out.println("3.Editar personas");
			System.out.println("4.Borrar personas");
			System.out.println("5.Salir");
			System.out.println("----->");
			opc = scanner.nextInt();
			if(opc == 1) {
				verPersonas();
			}else if (opc ==2) {
				CrearPersonas();
			}
			else if (opc ==3) {
				EditarPersonas();
			}
			else if (opc ==4) {
				BorrarPersonas();
			}else if (opc == 5) {
				Cerrar();
			}
			
		}while(opc !=5);

	}
	private static final Scanner  scanner= new Scanner(System.in);
	
	public static void verPersonas() throws SQLException {
		DBManager.leerRegistros();
	}
	
	public static void CrearPersonas() throws SQLException {
		System.out.println("Ingrese nombre");
	
		scanner.nextLine();
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese Apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Edad");
		
		int edad = scanner.nextInt();
		
		DBManager.insertPersona(nombre, apellido, edad);
		
		JOptionPane.showInternalConfirmDialog(null, "Registro creado con exito");
		
	}
	public static void EditarPersonas() {
		try {
			DBManager.leerRegistros();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido leer");
		}
		
		System.out.println("Ingrese id de la persona que quiera modifiar los datos:");
		long id =scanner.nextLong();
		System.out.println("Ingrese nuevo nombre");
		scanner.nextLine();
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese nuevo Apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese nueva Edad");
		
		int edad = scanner.nextInt();
		
		try {
			DBManager.ModificarDatos(id, nombre, apellido, edad);
			System.out.println("Se ha modificado correctamente");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido modificar");
		}
	}
	
	public static void BorrarPersonas() {
		try {
			DBManager.leerRegistros();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido leer");
		}
		System.out.println("Ingrese id de la persona que quiera eliminar los datos:");
		long id =scanner.nextLong();
		try {
			DBManager.EliminarRegistros(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido eliminar");
		}
		
		
	}
	
	public static void Cerrar() {
		DBManager.CierraConexion();
		System.exit(1);
	}
	
	
	
	
}
