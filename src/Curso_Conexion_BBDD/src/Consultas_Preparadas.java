import java.sql.*;

import javax.swing.JOptionPane;

public class Consultas_Preparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection miCon = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/prueba", "postgres", "1234");
//			2. SE INICIALIZA UNA SENTENCIA DE STRING DONDE SE DESCRIBE LA ORDEN DE SQL
			
			String sentencia = "SELECT nombre, precio, pais FROM productos WHERE nombre = ? precio = ? AND pais = ?";
			
			
			
//			3. CREAR UN OBJETO DE TIPO PREPAREDSTATEMNT
			
			
			PreparedStatement miPst = miCon.prepareStatement(sentencia);
			
			
//			4. SE USA EL MÉTODO SETSTRING PARA IMPLEMETAR LOS DATOS DE LA CONSULTA
			miPst.setString(1, "Tubos");
			miPst.setString(2, "50 €");
			miPst.setString(3, "España");
			
			
//			5.SE CREA UN OBJETO TIPO RESULTSET
			
			ResultSet miRs = miPst.executeQuery();
			
			
			
//			6. SE REVISA LA TABLA EN MEMORIA DEL OBJETO MIPST
			
			while(miRs.next()) {
				System.out.println(miRs.getString(3) +  " --> " + miRs.getString(5) +  " --> " + miRs.getString(7));
			}
			
//			7. SE CIERRA CONEXIÓNs		
			miCon.close();
			
		}catch (SQLException e) {
			System.out.println("No se pudo borrar el producto");
		}

	}

}
