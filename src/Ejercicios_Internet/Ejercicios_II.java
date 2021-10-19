package Ejercicios_Internet;

import java.util.NoSuchElementException;

public class Ejercicios_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaArray<String> nuevo = new PilaArray<String>(5);
		nuevo.añadir("Hola");
		nuevo.añadir("Que");
		nuevo.añadir("Tal");
		nuevo.añadir("Estas");
		nuevo.añadir("Daniel");
		
		nuevo.toString();
	}

}
class PilaArray <E>{
	
	private E[]ArrayGenerico;
	private int contador;
	
	@SuppressWarnings("unchecked")
	public PilaArray(int Capacidad) {
		ArrayGenerico = (E[]) new Object[Capacidad];
		contador =0;
	}
	
	
	public boolean vacia() {
		return contador == 0;
		
	}
	
	public boolean añadir(E elemento) {
		if(contador == ArrayGenerico.length) {
			return false;
		}else {
			ArrayGenerico[contador]=elemento;
			contador ++;
			return true;
		}
	}
	
	private boolean primero() {
		if(vacia()) {
			throw new NoSuchElementException();
		}else {
			contador -= contador;
			return (boolean) ArrayGenerico[contador];
		}
	}
	
	 public String toString() {
		 for(E el : ArrayGenerico) {
			 System.out.println("Los elementos son: " + el);
	       
	    }
		 return ArrayGenerico.toString();
	}
	
}