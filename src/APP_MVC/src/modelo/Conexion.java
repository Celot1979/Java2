package modelo;

import java.sql.*;

public class Conexion {
//	Las próximas líneas son las relativas para realizar la conexión a la BBDD
	Connection miConexion = null;
	
	public Conexion() {
		
	}
/*
 * 	Realiza un método que haga la conexión. 
 *  Para hacer el trabajo, crea un métoco Connectiony luego ejecuta como siempre la conexión
 */
	public Connection getConexion() {
		try {
			miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/productos","postgres","1234");
			System.out.println("Conectado con éxito");
		} catch (SQLException e) {
			System.out.println("No ha podido conectar");
		}
		return miConexion;
		
	}
}
