package Ejercicio_ArrayList;



import java.util.*;

import Ejercicio_ArrayList.Ejercicio.Suma;

/*
 *  En este ejercicio se trata de crear una aplicación que pida introducir números enteros por consola 
 *  y que los vaya almacenando en un ArrayList. Cuando se introduce el número 0, el programa deja de
 *  pedir números e imprime en consola 3 cálculos:
 *  
 *  La suma de los números introducidos
 *  
 *  La media de los números introducidos
 *  
 *  Cuántos números se han introducido que son superiores a la media.
 */
public class Ejercicio_III_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio m = new Ejercicio();
		
	}

}

class Ejercicio{
	public  Ejercicio() {
		//ArrayList<Integer> guardar = new ArrayList<Integer>();
		while(contador !=0) {
			System.out.print("Introduzca el numero: ");
			Scanner c = new Scanner(System.in);
			int num = c.nextInt();
			contador = num;
			if(contador != 0) {
				guardar.add(num);
			}else {
				for(int i =0; i < guardar.size();i++) {
				// ----------------- OPERACIÓN PARA SUMAR LOS NÚMEROS DE UN ARRAY LIST -----------------
					resultado += guardar.get(i);
					// ----------------- OPERACIÓN PARA  LA MEDIA DE LOS NÚMEROS DE UN ARRAY LIST -----------------
					
					media = resultado/ guardar.size();
					
					
				}
				
				// -----------------SOBRE PASA LA MEDIA  -----------------
				
				for ( int j = 0 ; j < guardar.size(); j++) {
					int number = guardar.get(j);
					if(number <= media) {
						System.out.println(number);
						contador_media -=1;
					}else if(number > media) {
						contador_media +=1;
					}
				}
				
				System.out.println("La suma de los elementos del ArrayList es: " + resultado);
				System.out.println("La media de los elementos del ArrayList es: " + media);
				System.out.println("La cantidad de números que son mayores que la media son : " + contador_media);
			}
			
		}
		
		
		// ----------------- OPERACIÓN PARA SUMAR LOS NÚMEROS DE UN ARRAY LIST -----------------
		
		
		
	}

	int contador = 2;
	int resultado,cantidad;
	int contador_media =0;
	double media;
	
	ArrayList<Integer> guardar = new ArrayList<Integer>();
   
	
}

