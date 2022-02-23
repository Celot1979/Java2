package Programacion_Generica_Arrays;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class Iteradores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Empleados> iteradores = new ArrayList<Empleados>();
		
		iteradores.add(new Empleados("Antonio",2300.5,2005,7,5));
		iteradores.add(new Empleados("Carlos",5000.5,2007,6,5));
		iteradores.add(new Empleados("María",2500.5,2006,11,5));
		iteradores.add(new Empleados("Ana",7000,2009,5,3));
		
		Iterator<Empleados> IteradorEmpleados = iteradores.iterator();
		while(IteradorEmpleados.hasNext()) System.out.println(IteradorEmpleados.next().getDatosEmpleado());

	}

}
class Empleados{
	public Empleados(String nom, double sue, int agno,int mes,int dia) {
		nombre = nom;
		sueldo = sue;
		calendario = new GregorianCalendar(agno,mes,dia);
		Id =IdSiguiente;
		IdSiguiente++;
	}
	public String getDatosEmpleado() {
		return "El empleado: " + nombre + " tiene el id" + Id;

	}
	public double getSueldo() {
		return sueldo;
		
	}
	public GregorianCalendar getFechaAlta() {
		return calendario;
		
	}
	public void setSubeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje/100;
		sueldo +=aumento;
	}
	public static String getIdSiguiente() {
		return "El Id de siguiente epleado será: " + IdSiguiente;
		
	}
	private final String nombre;
	private double sueldo;
	private GregorianCalendar calendario;
	private int Id;
	private static int IdSiguiente =1;
}