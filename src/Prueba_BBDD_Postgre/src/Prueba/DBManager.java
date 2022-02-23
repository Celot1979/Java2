package Prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {

	private static final String user = "postgres";
	private static final String pass = "1234";
	private static String url = "jdbc:postgresql://localhost:5433/MiBase";
    private  static Connection connection;
	//Inicializa la conexión
	public static void initConnection() {
		try {
			connection= DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion con éxito");
		}catch(Exception e) {
			System.out.println("REVISAR: Conexión sin exito");
		}
	}
	
	//Inserta una persona
	

	public static void insertPersona(String nombre, String apellido, int edad) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement stml = connection.prepareStatement("INSERT INTO persona(nombre, apellido,edad) VALUES(?,?,?)");
		stml.setString(1, nombre);
		stml.setString(2, apellido);
		stml.setInt(3, edad);
		stml.execute();
	}

	
	// Leer los registro
	
	public static  void leerRegistros() throws SQLException {
		PreparedStatement stml = connection.prepareStatement("SELECT * FROM persona order by id");
		ResultSet resultados = stml.executeQuery();
		System.out.println("id| nombre | apellido |       edad");
		while(resultados.next()) {
			long id = resultados.getLong("id");
			String nombre = resultados.getString("nombre");
			String apellido = resultados.getString("apellido");
			int edad = resultados.getInt("edad");
			System.out.println(id + " | " + nombre + " | " + apellido +"\t" + edad);
		}
	}
	// Modificar los registros
	public static void ModificarDatos(long id, String NuevoNom, String NuevoApe, int NuevaEdad) throws SQLException {
		PreparedStatement stml = connection.prepareStatement("UPDATE persona SET nombre = ?, apellido= ?, edad = ? WHERE id =?");
		stml.setString(1,NuevoNom);
		stml.setString(2, NuevoApe);
		stml.setInt(3, NuevaEdad);
		stml.setLong(4, id);
		int row = stml.executeUpdate();
		if(row == 0) {
			System.out.println("No se modificó nada");
		}else {
			System.out.println("Se modificó el registro");
		}
		
	}
	
	
	// Eliminar Registros
	
	public static void EliminarRegistros(long id) throws SQLException {
		PreparedStatement stml = connection.prepareStatement("DELETE FROM PERSONA WHERE ID = ?");
		stml.setLong(1, id);
		int row = stml.executeUpdate();
		if(row == 0) {
			System.out.println("No se borró el registro con id  " + id);
		}else if( row != 0) {
			System.out.println("Se borró correctamente el registro con id: " + id);
		}
	}
	
	public static void CierraConexion() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: No se ha cerrado conexión");
		}
	}
	
	
	
}
