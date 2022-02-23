package Parametros_Comodin;


public class Empleado{
	public Empleado(String nombre,int edad,double salario) {
		this.nombre=nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public String dameDatos() {
		return "El empelado se llama "+ nombre + ". Tiene " + edad + ". Y su salario es de : " + salario;
	}
	private String nombre;
	private int edad;
	private double salario;
}