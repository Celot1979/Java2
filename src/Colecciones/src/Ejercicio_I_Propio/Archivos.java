package Ejercicio_I_Propio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Archivos {

	public Archivos(String nombre, String telef, String email) {
		this.nombre = nombre;
		this.telef = telef;
		this.email = email;
	}
	
	
	public void escribir() {
			try {
				BufferedWriter  br=new BufferedWriter (new FileWriter("/Users/danielgil/Desktop/Agenda_/Agenda.txt"));
				br.write(nombre + " " + telef + " " + email);
				br.newLine();
				br.flush();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		
	}
	private String nombre;
	private String telef;
	private String email;

}
