package Ejercicios_Internet;

import java.util.ArrayList;
import java.util.Scanner;

public class Generico_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila<String> prueba = new Pila<String>();
		prueba.addElemento("Hola");
		prueba.addElemento("Que");
		prueba.addElemento("tal");
		prueba.addElemento("estas");
		
		prueba.getInfo();

	}

}
class Pila <E>{
	ArrayList <E> almacena;
	
	
	public Pila(){
		almacena = new ArrayList();
	}
	
	public void addElemento(E uni) {
		almacena.add(uni);
	}
	
	public void removeElemento(E rest) {
		almacena.remove(rest);
	}
	
	public void getInfo() {
		for(E p : almacena) {
			System.out.print("Los elementos son: " + p + " ");
		}
	}
	
}