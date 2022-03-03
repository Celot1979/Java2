package modelo_A;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
			
		}catch(Exception e) {
			
		}
		resultadosConsultas = new ResultSet[2];	
		resultadosConsultas[0] = resSec;
		resultadosConsultas[1] = resPaises;
		
		return resultadosConsultas;
	}
	private Conexion miConexion;
	private ResultSet resultadosConsultas [];
}
