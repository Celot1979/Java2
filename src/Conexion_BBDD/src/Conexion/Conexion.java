package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
	private static final String user = "postgres";
	private static final String pass = "1234";
	private static String url = "jdbc:postgresql://localhost:5433/agenda2";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1º Crear un objeto de tipo cenexion
		
		try {
			Connection miCom = DriverManager.getConnection(url,user,pass);
			System.out.println("Conexión con ëxito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido conectar");
		}

	}

}
