package Ejercicio_II_Bolsas;

import java.util.LinkedList;

public class Ejercicio_Bolsas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bolsas b1 = new Bolsas();
		b1.aleatorio();
		b1.listar();

	}
	

}
class Bolsas{
	
	
	public Bolsas() {
		
	}
	public void aleatorio() {
		bolsa_azul= new LinkedList<Integer>();
		bolsa_roja= new LinkedList<Integer>();
		numero_aleatorio =  (int) Math.floor(Math.random()*37+1);
		if(bolsa_azul.isEmpty() &&  bolsa_roja.isEmpty()) {
			if(numero_aleatorio <= 18)bolsa_azul.add(numero_aleatorio);
			else if(numero_aleatorio > 18)bolsa_roja.add(numero_aleatorio );
	
		}else {
			if(bolsa_azul.contains(numero_aleatorio)) aleatorio();
			else if(bolsa_roja.contains(numero_aleatorio)) aleatorio();
			
		}
		
	}
	
	public void listar() {
		for (Integer i: bolsa_azul) {
			System.out.println("El número se ha añadido a la bolsa azul " + i);
		}
		for (Integer i: bolsa_roja) {
			System.out.println("El número se ha añadido a la bolsa roja " + i);
		}
	}
	LinkedList<Integer> bolsa_roja;
	LinkedList<Integer> bolsa_azul;
	int numero_aleatorio;
	
}