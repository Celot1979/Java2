package Programacion_Generica_Arrays;

import java.util.ArrayList;
import java.util.GregorianCalendar;
/*
 * En está clase veremos el proceso de creación de un array a partir de un ArrayList creado con anterioridad.
 */
public class Convertir_ArrayList_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Empleados> losEmpleados = new ArrayList<Empleados>();
		losEmpleados.add(new Empleados("Antonio",2300.5,2005,7,5));
		losEmpleados.add(new Empleados("Carlos",5000.5,2007,6,5));
		losEmpleados.add(new Empleados("María",2500.5,2006,11,5));
		losEmpleados.add(new Empleados("Daniel",10000,2007,5,3));

		
		/*
		 *  1º Debemos de crear el Array donde queremos que se almacene los elementos del ArrayList.
		 *  Como desconocemos el tamaño del array que vamos a crear, pues en tiempo de ejeccución el ArrayList puede crecer o disminuir, usaremos
		 *  el método size().
		 */
		 Empleados array_nuevo []= new Empleados[losEmpleados.size()];
		 
		 
		 /*
		  * 2º Usaremos el método toArray().Que como hemos visto en la API, es el encargado de copiar el ArrayList y pasarlo al array creado
		  * anteriormente.
		  */
         losEmpleados.toArray(array_nuevo);
         
         
         /*
          *  3º Finalmente si es necesario, lo imprimimos con un bucle for
          
         for(int i = 0; i < array_nuevo.length;i++) {
        	 System.out.println(array_nuevo[i].getDatosEmpleado());
         }*/
         
         
         /*
          * 4º El método .remove() elimina el elemento que se indica en el index que aparece por parámentro.
         
         losEmpleados.remove(0);
        for(Empleados obj : losEmpleados) {
        	System.out.println(obj.getDatosEmpleado());
        } */
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
