package modelo_A;

import java.sql.*;

public class EjecutaConsultas {
	
	public EjecutaConsultas() {
		miConexion = new Conexion();
	
	}
	public ResultSet consulta_BBDD(String seccion,String pais) {
		Connection conecta = miConexion.getConexion();
		rs = null;
		
		try {
		if(!seccion.equals("Todas") && pais.equals("Todos")) {
			enviaConsSeccion = conecta.prepareStatement(CONSULTASECCION);
			enviaConsSeccion.setString(1, seccion);
			rs =enviaConsSeccion.executeQuery();
			
			
		}else if(seccion.equals("Todas") && !pais.equals("Todos")) {
			enviaConsPais  = conecta.prepareStatement(CONSULTAPAIS);
			enviaConsPais.setString(1, pais);
			rs =enviaConsPais.executeQuery();
			
			}else {
			
		}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error en la consulta de la BBDD");
		}
		return rs;
		
		
	}
	
	private Conexion miConexion;
	private ResultSet rs;
	private PreparedStatement enviaConsSeccion,  enviaConsPais;
	private final String CONSULTASECCION = "SELECT seccion,nombre,fecha,pais,precio FROM categoria WHERE seccion = ?";
	private final String CONSULTAPAIS = "SELECT seccion,nombre,fecha,pais,precio FROM categoria WHERE pais = ?";

}
