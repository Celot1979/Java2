import java.sql.*;

import javax.swing.JOptionPane;

public class Leeccion_1 {

	public static void main(String[] args) {

		try {
//			1. CREAR CONEXIÓN	
			
			
			Connection miCon = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/prueba", "postgres", "1234");
			
			
			
//			2. CREAR STATEMENT
//			Para poder enviar instrucciones a la BBDDD - una vez creeada la conexión- se debe crear un objeto de tipo statement
			
			Statement miSt = miCon.createStatement();
			
			
//			3. CREAR INSTRUCCIÓN SQL
			
			ResultSet miRs = miSt.executeQuery("SELECT * FROM productos");
			
			
//			4. LEER EL RESULTADO DE LA CONSULTA
			
			while(miRs.next()) {
				System.out.println(miRs.getString(1) +  " --> " + miRs.getString(2) +  " --> " + miRs.getString(3) +  " --> " + miRs.getString(4)+  " --> " + miRs.getString(5) +  " --> " + miRs.getString(6) +  " --> " + miRs.getString(7));
			}
			JOptionPane.showMessageDialog(null, "CONEXIÓN A LA BBDD");
			
//			5. CERRAR LA CONEXIÓN Y EL RESULSET
			miRs.close();
			miCon.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se ha podido conectar a la BBDD");
		}
		
		

		
		
		

	}

}
