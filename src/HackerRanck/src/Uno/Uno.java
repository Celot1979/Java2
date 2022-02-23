package Uno;

import java.util.Scanner;

import javax.swing.JFrame;

public class Uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
        while(num<3){
            Scanner scan = new Scanner(System.in);
            System.out.println("Introducce un numero: ");
            int a = scan.nextInt();
            System.out.println(a);
            num += 1;
        }

	}

}

