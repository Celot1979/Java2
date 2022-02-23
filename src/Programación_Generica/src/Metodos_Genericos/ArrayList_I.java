package Metodos_Genericos;

import java.util.GregorianCalendar;
import java.util.*;

public class ArrayList_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleados[] losEmpleados= new Empleados[4];
		losEmpleados[0]=new Empleados("Antonio",2300.5,2005,7,5);
		losEmpleados[1]=new Empleados("Carlos",5000.5,2007,6,5);
		losEmpleados[2]=new Empleados("María",2500.5,2006,11,5);
		losEmpleados[3]=new Empleados("Ana",7000,2009,5,3);*/
		ArrayList <Empleados> losEmpleados = new ArrayList<Empleados>();
		losEmpleados.add(new Empleados("Antonio",2300.5,2005,7,5));
		losEmpleados.add(new Empleados("Carlos",5000.5,2007,6,5));
		losEmpleados.add(new Empleados("María",2500.5,2006,11,5));
		losEmpleados.add(new Empleados("Ana",7000,2009,5,3));
		/*
		 * Si construimos un ArrayList de dos elementos, por ejemplo; sabemos que el ArrayList por defecto viene con 10 elementos.
		 * Esto nos constaría un desperdicio de recursos y un peso al programa innecesario. Para optimizar, usaremos el método trimToSize().
		 * Sintasis:
		 * losEmpleados.trimToSize()
		 */
		
		
		/*
		 * Una de las acciones más frecuentes en un ArrayList es la recolocación de  los elementos. 
		 * Esaremos varios método - que en ´si mismos- ofrecen mucha versatilidad.
		 * 
		 */
		
		//1º Remplazo de elementos
		//losEmpleados.set(1,new Empleados("Vicente",3000.5,2007,6,5));
		
		//2º Saber la posición de un elemento de un ArrayList
		//System.out.println(losEmpleados.get(3).getDatosEmpleado());
		
		
		
		/*
		 * 3º. Habrá veces que por necesidades tanto del programa como de lógica, necesitemos usar un bucle for convencional.
		 
		for(int i =0; i < losEmpleados.size();i++) {
			Empleados e = losEmpleados.get(i);
			System.out.println(e.getDatosEmpleado());
		}
		*/
		
		System.out.println(losEmpleados.size());// Podemos saber el número de elementos que tiene el ArryList
		
		for(Empleados obj: losEmpleados) {
			System.out.println(obj.getDatosEmpleado() + " y un salario de: " + obj.getSueldo());
		}
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