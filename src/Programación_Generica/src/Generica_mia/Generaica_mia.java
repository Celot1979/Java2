package Generica_mia;

public class Generaica_mia<T> {
	public Generaica_mia() {
		Objeto = null;
	}
	
	public void setObjeto(T nuevoValor) {
		Objeto = nuevoValor;
	}
	
	public T getObjeto() {
		return Objeto;
		
	}
	private T Objeto;

}
