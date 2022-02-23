package controlador_A;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo_A.Conexion;
import modelo_A.Productos;

public class CargaMenus {
	
	public CargaMenus() {
		miConexion = new Conexion();
	}
	
	public ResultSet[] ejecutaConsultas() {
		Connection accesoBBDD = miConexion.getConexion();
		ResultSet resSec = null;
		ResultSet resPaises = null;
		
		try {
			Statement secciones = accesoBBDD.createStatement();
			resSec= secciones.executeQuery("SELECT DISTINCT seccion FROM categoria ");
			Statement paises = accesoBBDD.createStatement();
			resPaises = paises.executeQuery("SELECT DISTINCT paises FROM categoria ");
		}catch(Exception e) {
			
		}
		//return miProducto.getSeccion();
		
	}
	private Conexion miConexion;
	private ResultSet resultadosConsultas [];
}
