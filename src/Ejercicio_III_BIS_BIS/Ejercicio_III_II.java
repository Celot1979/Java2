package Ejercicio_III_BIS_BIS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_III_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Public Accion = new Public();
        Accion.calculo();
       
	}

}

class Public{
	public Public() {
		System.out.println("Comencemos");
		while(contador != 0) {
			Scanner src =new Scanner(System.in);
			System.out.print("Introducce tus números: ");
			usuario = src.nextInt();
			contador = usuario;
			if(usuario != 0) {
				datos.add(usuario);
			}else {
				for(int i = 0; i < datos.size();i++) {
					//System.out.print(" " + i);
				}
			}
		}
	}
	
	public void calculo() {
		Iterator it = datos.iterator();
		while(it.hasNext()) {
			suma = suma + (Integer) it.next();
			media = suma / datos.size();
		}
		System.out.println("El resulado de la suma de los números insertados es: " + suma);
		System.out.println("El resulado de la media es: " + media);
	}
	
	
	ArrayList <Integer> datos = new ArrayList<Integer>();
	int contador = 2 ;
	int usuario,suma,media;
}