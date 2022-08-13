package BBDD;
import java.sql.*;

import emergente.Ventana_Admin;
import javafx.scene.control.TextField;
public class Conexion {
	public static void initConnection() {
		try {
			connection= DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion con éxito");
		}catch(Exception e) {
			System.out.println("REVISAR: Conexión sin exito");
		}
	}
	
	public static int validar(TextField nom, TextField cont) {
		
		resultado =0;
		try {
			String usuario = nom.getText();
			String pass = cont.getText();
			String sql ="select * from usuarios where usuario='"+usuario+ "' and pass= '"+pass+"' ";
			
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				resultado =1;
				if(resultado == 1) {
					
				}else {
					System.out.println("No coincide");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
		
	}
	public static boolean res() {
		if(resultado == 1) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	private static final String user = "postgres";
	private static final String pass = "1234";
	private static String url = "jdbc:postgresql://localhost:5433/Farmacia";
    private  static Connection connection;
    private TextField nom,cont;
    private static Long id;
	private static String convertir,nombre,apellido,movil,fijo,anotacion;
	private static String  pstm;
	private static int resultado;
   

}
