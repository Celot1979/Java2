package Ejercicio_I_Propio;

import java.util.LinkedList;

public class Personas_Lista {
	
	/*public Personas_Lista(String nombre, String telef, String email) {
		this.nombre = nombre;
		this.telef = telef;
		this.email = email;
	}*/
	
	
	public Personas_Lista(String nombre2, String telf2, String email2) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.telef2 = telef2;
		this.email = email;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelef() {
		return telef2;
	}
	public void setTelef(String telef) {
		this.telef2 = telef2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	


	private String nombre,telef2,email;
	
	

}
