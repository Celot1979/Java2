package Parametros_Comodin;

public class Jefe extends Empleado {
	public Jefe(String nombre,int edad,double salario) {
		super(nombre,edad,salario);
	}
	
	double incentivo(int inc) {
		return inc;
	}

}
