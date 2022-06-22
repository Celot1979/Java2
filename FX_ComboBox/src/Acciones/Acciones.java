package Acciones;

import java.util.Objects;

import javafx.scene.control.TextField;

public class Acciones {
	

	public Acciones(String tipo_Operacion) {
		super();
		Tipo_Operacion = tipo_Operacion;
	}
	
	public String getTipo_Operacion() {
		
		return Tipo_Operacion;
	}

	public void setTipo_Operacion(String tipo_Operacion) {
		Tipo_Operacion = tipo_Operacion;
	}
	
	@Override
	public String toString() {
		return Tipo_Operacion;
	}

	
	public String sumar(String a,String b) {
		int uno = Integer.parseInt(a);
		int dos = Integer.parseInt(b);
		sumar = String.valueOf(uno + dos);
		
		return sumar;
		
	}
	public String restar(String a,String b) {
		int uno = Integer.parseInt(a);
		int dos = Integer.parseInt(b);
		restar = String.valueOf(uno - dos);
		
		return restar;
		
	}
	public String multiplicar(String a,String b) {
		int uno = Integer.parseInt(a);
		int dos = Integer.parseInt(b);
		mult = String.valueOf(uno * dos);
		
		return mult;
		
	}
	public String dividir(String a,String b) {
		unod = Integer.parseInt(a);
		dosd =Integer.parseInt(b);
		div = String.valueOf(unod/dosd);
		
		return div;
		
	}
	private String Tipo_Operacion,sumar,restar,mult,div,a,b;
	private TextField campo3;
	private double unod,dosd;
	
	
}
