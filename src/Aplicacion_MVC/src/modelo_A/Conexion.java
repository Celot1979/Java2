package modelo_A;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	Connection miConexion = null;
	
	public Conexion() {
		
	}
	
	public Connection getConexion() {
		try {
			miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/productos","postgres","1234");
			System.out.println("Conectado a la BBDD");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return miConexion;

	}
}
