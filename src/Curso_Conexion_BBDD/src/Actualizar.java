import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Actualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection miCon = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/prueba", "postgres", "1234");
			Statement miSt = miCon.createStatement();
			
			
//			3. CREAR INSTRUCCIÓN DE ACTUALIZAR
			
			String InSQL = "UPDATE productos SET precio = '70€' WHERE codigo = 'AR45'";
			
			
//			4. USAMOS EL MÉTODO EXECUTEUPDATE
			
			miSt.executeUpdate(InSQL);
			
			
//			5. CERRAMOS BBDD Y RESULTSET
			
			JOptionPane.showMessageDialog(null, "SE HA MODIFICADO EL REGISTRO CON ÉXITO");
			miCon.close();
			
		}catch (SQLException e) {
			System.out.println("No se pudo registar el producto");
		}

	}

}
