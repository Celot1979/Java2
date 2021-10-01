package Serializacion.Serializacion_Objeto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Recuperando {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("/Users/danielgil/Desktop/Serialización/Prueba.dat"));
			Empleado[] entradaObjeto =(Empleado[])flujoEntrada.readObject();
			flujoEntrada.close();
			for(Empleado e : entradaObjeto) {
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

