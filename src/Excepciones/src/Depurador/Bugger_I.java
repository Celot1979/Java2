package Depurador;

import javax.swing.JOptionPane;

public class Bugger_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introducce elementos de la matríz"));
		int num_alet []= new int[elementos];
		for(int i = 0; i < num_alet.length;i++) {
			num_alet[i]= (int) (Math.random()*100);
		}
	
		
		for(int elem :num_alet) {
			System.out.println("Lo elementos son : " + elem);
		}

	}

}
