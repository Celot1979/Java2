package Clases_Genericas_Vehiculos;

import java.util.Scanner;

public class Generica <T> {
	private String marca;
	private String modelo;
	private int  gasolina;
	
	public Generica() {
		
	}
	
	public void setDatos(String marca,String modelo,int gasolina) {
		this.marca =marca;
		this.modelo = modelo;
		this.gasolina = gasolina;
	}
	
	public void setGasolina(int G) {
		gasolina = gasolina + G;
	}
	
	public void setViajes() {
		Scanner p = new Scanner(System.in);
		System.out.println("¿Vas a viajar?: ");
		int contestacion = p.nextInt();
		if(contestacion == 1) {
			Scanner km = new Scanner(System.in);
			System.out.println("¿Cuántos km tendrá tu viaje?: ");
			int viaje =km.nextInt();
			int total = gasolina - (viaje/100);
			System.out.println("Los litros de gasolina que te quedan son: " + total);
			
		}else {
			System.exit(contestacion);
		}

	}
	
	public String getIfo() {
		return "La marca del vehiculo es: " + marca + " el modelo es: " + modelo + " tiene de gasolina " + gasolina;
		
	}
     
}
