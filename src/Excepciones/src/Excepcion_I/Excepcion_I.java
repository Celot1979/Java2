package Excepcion_I;

import javax.swing.JOptionPane;

public class Excepcion_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  matriz =new int[5]; 
		matriz[0]=1;
		matriz[1]=20;
		matriz[2]=30;
		matriz[3]=40;
		matriz[4]=50;
		
		for(int i =0; i < 5; i++) {
			System.err.println("la posicion que ocupa es: " + i +" de la matriz el número es: " + matriz[i]);
		}
		try{
			String pregunta = JOptionPane.showInputDialog("Nombre");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
	        System.out.println("El nombre del tutor es: " + pregunta + " y su edad: " + edad);
		}catch(Exception e){
			System.out.println("Hubo un error");
		}
		System.out.println("Crees");
		System.out.println("Que");
		System.out.println("Habrá");
		System.out.println("Más");
		System.out.println("Errores");
		
	}

}
