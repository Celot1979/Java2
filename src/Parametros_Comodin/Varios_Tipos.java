package Parametros_Comodin;

public class Varios_Tipos <T>{
	public Varios_Tipos() {
		primero = null;
	}
	
	public static void imprimirTrabajador(Varios_Tipos<? extends Empleado> E) {
		Empleado primero = E.getPrimero();
		System.out.println(primero);
	}
	
	public void setPrimero(T nuevoValor) {
		primero = nuevoValor;
	}
	
	public T getPrimero() {
		return primero;
	}
    private T primero;
}