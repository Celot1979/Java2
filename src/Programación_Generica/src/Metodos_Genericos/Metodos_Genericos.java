package Metodos_Genericos;

import java.util.ArrayList;



public class Metodos_Genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String nombres [] = {"Juan","Pepe", "Sandra" , "Dani"};
       // System.out.println(ExaminarArray.getElementos(nombres));
        
        //Elementos uno = new Elementos("Ana", 33, 1500);
      // System.out.println( uno.getDatos());
       /*Elementos nombre_Empleados []= new Elementos [4];
       nombre_Empleados[0]= new Elementos("ANA", 33, 1500);
       nombre_Empleados[1]= new Elementos("PEPE", 33, 1500);
       nombre_Empleados[2]= new Elementos("JUAN", 33, 1500);
       nombre_Empleados[3]= new Elementos("DAVID", 33, 1500);
       
       System.out.println(ExaminarArray.getElementos(nombre_Empleados));*/
        
        
        
}
}
class ExaminarArray{
	public static <T> String getElementos(T[]elArray) {
		return "El array tiene " + elArray.length + " elementos";
	}
}

class Elementos{
	public Elementos(String Nombre, int edad, int salario) {
		this.Nombre = Nombre;
		this.edad = edad;
		this.salario = salario;
		
	}
	
	public String getDatos() {
		return "El nombre es " + Nombre + " la edad es " + edad + " su salario " + salario;
	}
	
	String Nombre;
	int edad, salario;
}