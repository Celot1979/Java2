

package ProcedimientosAlmacenados;
import java.sql.*;

public class Ejercicio_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/prueba","postgres","1234");
			CallableStatement miStatement = miConexion.prepareCall("{CALL consultaB()}");
			ResultSet rs = miStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(2) + " " + rs.getString(3) + " " +rs.getString(5) + " " +rs.getString(7));
			}
			rs.close();
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

