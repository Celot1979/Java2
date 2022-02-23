package Encriptador_app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Encriptar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta_origen = JOptionPane.showInputDialog("Ingrese ruta");
		String ruta_final = JOptionPane.showInputDialog("Ingrese ruta de entrega");
		lectura_Bytes(ruta_origen );
		escribir(ruta_final);
}
	static void lectura_Bytes(String dire) {
		boolean finalizacion_archivo = false;
		int contador = 0;
		Listado = new ArrayList<Integer>();
		try {
			FileInputStream archivo_contador = new FileInputStream(dire);
			while(finalizacion_archivo == false) {
				int bytes_Archivo =archivo_contador.read();
				if(bytes_Archivo != -1) Listado.add(bytes_Archivo);
				else finalizacion_archivo = true;
		    }
			System.out.println(Listado);
		    JOptionPane.showMessageDialog(null, "Se ha leído y guardado la infomación CORRECTAMENTE!!!!");
					//System.out.println("Se ha leído y guardado la infomación CORRECTAMENTE!!!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se ha encontrado el archivo especificado");
				}
			}
			
	static void escribir(String dire) {
		try {
			FileOutputStream escribir_Archivo = new FileOutputStream(dire);
			Listado.forEach((b) -> {
				try {
					escribir_Archivo.write(b);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
	});
			System.out.println(escribir_Archivo);
			escribir_Archivo.close();
			JOptionPane.showMessageDialog(null, "Se ha escrito y guardado CORRECTAMENTE!!");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("No se ha podido escribir el archivo en BYTES");
				}
				
			}

		    static int array_almacen[];
		    static ArrayList<Integer> Listado;
		    
		}

