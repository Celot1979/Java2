package Maps;

import java.util.*;



public class Mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Empleado> listaEmpleados = new HashMap<String,Empleado>();
		listaEmpleados.put("100", new Empleado("Juan"));
		listaEmpleados.put("101", new Empleado("Damian"));
		listaEmpleados.put("102", new Empleado("Alfonso"));
		listaEmpleados.put("103", new Empleado("Eduardo"));
		
		//System.out.println(listaEmpleados);
		//Borrar un elemento
		listaEmpleados.remove("100");
		//System.out.println(listaEmpleados);
		
		/*Sobreescribir un valor de un elemento.
		Por ejemplo, en vez de llamar Damian,
		vamos a llamar a ese valor Lucía.		
		*/
		listaEmpleados.put("101",new Empleado("Lucia"));
		//System.out.println(listaEmpleados);
		
		for (Map.Entry<String,Empleado> personaEmpleado: listaEmpleados.entrySet()) {
			String clave = personaEmpleado.getKey();
			Empleado valor = personaEmpleado.getValue();
			
			System.out.println("Clave = " + clave + "  valor = " + valor);
			
		}
		
		
	}

}
class Empleado{
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		salario = 2000;
	}
	
	
	@Override
	public String toString() {
		return "El nombre del empleado es : " + nombre + " , su salario = " + salario ;
	}


	private String nombre;
	private double salario;
}