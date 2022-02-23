package Ejercicio_Lista_Atras;

import java.util.*;

import javax.swing.JOptionPane;

public class Ejercicio_Lista_Atras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaOriginal = new LinkedList <Integer>();
		//ListaFinal = new LinkedList <Integer>();
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos números quieres añadir a la lista: "));
		while(quizas == true) {
			pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introducce el digito: "));
			ListaOriginal.add(pregunta);
			evaluar ++;
			if (evaluar == cantidad) {
				quizas = false;
			}
		}
		
		leer_Lista();
		recorrer_Lista();
		

	}
	public static void leer_Lista() {
		for (Integer it : ListaOriginal) {
			System.out.println(it);
		}
	}
	
	public static void recorrer_Lista() {
		/*
		 * Con este método del Collections.sort creamos un ordean dentro de la lista.
		 * Posteriormente le damos la vuelta con  Collections.reverseOrder()
		 * 
		 * 
		 * */
		Collections.sort(ListaOriginal, Collections.reverseOrder());
		
		for (Integer inte : ListaOriginal) {
			System.out.println("La lista en orden inverso es: " + inte);
		}
	}
	
	
	static LinkedList <Integer> ListaOriginal;
	//static LinkedList <Integer> ListaFinal;
	private static int aux;
	private static int incial;
	private static int end;
	private static int cantidad, pregunta;
	private static int evaluar;
	private static boolean quizas = true;
	

}
