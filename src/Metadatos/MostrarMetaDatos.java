package Metadatos;

import java.sql.*;

public class MostrarMetaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostrarInfoBBDD();
		
	}
	
	 static void MostrarInfoBBDD() {
		try {
			
			miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/productos","postgres","1234");
			System.out.println("Conectado a la BBDD");
//			OBTENCIÓN METADATOS
			DatabaseMetaData misDatos = miConexion.getMetaData();
//			Mostrar Info de la BBDD
			System.out.println("Nombre del gestor:  " +  misDatos.getDatabaseProductName());
			System.out.println("Versión del  gestor:  " +  misDatos.getDatabaseProductVersion());
			System.out.println("Nombre del Driver:  " +  misDatos.getDriverName());
			System.out.println("Versión  del Driver:  " +  misDatos.getDriverVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Ha fallado el cierre de conexión");
			}
		}
		

	}
	 private static Connection miConexion;
	 

}
