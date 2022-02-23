package SnakeGame;

import java.util.ArrayList;

public class Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista uno = new Lista(numeros);
		numeros.add(3);
		numeros.add(4);
		
		for(int x : numeros) {
			System.out.println("Los números son: " + x);
		}
		

	}
	static ArrayList<Integer> numeros = new ArrayList  <Integer>();

}
class Lista{
	public Lista(ArrayList <Integer> numeros) {
		
	}
	
}