package controlador;
import java.sql.*;

import modelo.*;



public class CargarMenus {
	public CargarMenus() {
//		1º Que conecte con la BBDD
		miConexion = new Conexion();
		 
	}
	
	public String ejecutaConsultas() {
//		Ahora tendremos conexión con laBBDD con la siguiente sentencia
		Connection accesoBBDD = miConexion.getConexion();
		
		
//		5º Ahora es donde tenemos que crear un objeto de tipo Productos donde almacenemos los resultados
		Productos  miProducto = null;
//		2º Vamos a realizar las consultas pertinentes
		try {
//		3º Vamos a crear un objeto de Statement para comenzar a crear consultas SQL
			Statement secciones = accesoBBDD.createStatement();
			
			
//		4º Creamos la tabla virtaul para almacenar todas la información de la tabala.
//		Reseñar que según esa confeccionada las instrucción no repetiran campos de la sección
			resSec = secciones.executeQuery("SELECT DISTINCT seccion FROM categoria");
			
			
//      6º Es ahora cuando usamos el objeto producto almacenando gracias al seters la info resSec
			miProducto =  new Productos();
			miProducto.setSeccion(resSec.getString(1));
			resSec.close();
			accesoBBDD.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("No ha ejecutado la sentencia SQL");
		}
		return miProducto.getSeccion();
		
	}
	private Conexion miConexion;
	public ResultSet resSec , resPais;

}
