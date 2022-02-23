import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Insertar {

	public static void main(String[] args) {
		try {
			Connection miCon = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/prueba", "postgres", "1234");
			Statement miSt = miCon.createStatement();
			
			
//			3. CREAR INSTRUCCIÓN DE INSERCCIÓN
			
			String InSQL = "INSERT INTO productos(codigo,nombre,precio) VALUES ('AR45','CAMISA AZUL', '12€')";
			
			
//			4. USAMOS EL MÉTODO EXECUTEUPDATE
			
			miSt.executeUpdate(InSQL);
			
			
//			5. CERRAMOS BBDD Y RESULTSET
			
			JOptionPane.showMessageDialog(null, "INSERTADO CORRECTAMENTE EL REGISTRO");
			miCon.close();
			
		}catch (SQLException e) {
			System.out.println("No se pudo registar el producto");
		}

	}

}
