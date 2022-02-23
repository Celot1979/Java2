package Ejercicio_III_bis;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList <Integer> array = leerDatos();
       
	}
	
	public static  ArrayList <Integer> leerDatos(){
		ArrayList <Integer> datos = new ArrayList<Integer>();
		while(contador !=0) {
			System.out.print("Introduzca el numero: ");
			Scanner c = new Scanner(System.in);
			int num = c.nextInt();
			contador = num;
			if(num != 0) {
				datos.add(num);
			}
		}
		return datos;
		
	}
	
	public void operaciones(ArrayList array,int suma, int media) {
		
	}
	

	static int contador =2;

}
