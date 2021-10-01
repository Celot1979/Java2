package Serializacion.Serializando_Propio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Seri_Ejemplo_Input {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream EntradaFlujo = new ObjectInputStream(new FileInputStream("/Users/danielgil/Desktop/Serialización/Camion.dat"));
			 try {
				Vehiculo salida = (Vehiculo) EntradaFlujo.readObject();
				System.out.println(salida);
				EntradaFlujo.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}