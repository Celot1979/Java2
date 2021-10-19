package Parametros_Comodin;

public class Herencia_Genericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado Empleado15248;
		
		Jefe Sara = new Jefe("Sara", 27,3750);
		Empleado15248 = Sara;*/
		
		Varios_Tipos<Empleado> Empleado15248= new Varios_Tipos<Empleado>();
		Varios_Tipos <Jefe> Sara = new Varios_Tipos<Jefe>();
		//Empleado15248= Sara;
		Varios_Tipos.imprimirTrabajador(Sara);
		

	}

}
