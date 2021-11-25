package Colecciones_I.TreeSet;

import java.util.*;
public class TreeSet_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TreeSet<String> ordenaGenta = new TreeSet<String>();
		ordenaGenta.add("Oscar");
		ordenaGenta.add("María");
		ordenaGenta.add("Ana");
		
		for (String string : ordenaGenta) {
			System.out.println(string);
		}*/
		
		TreeSet<Productos> ordenaProductos = new TreeSet<Productos>();
		
		Productos pr1 = new Productos(3,"Tercer producto");
		Productos pr2 = new Productos(2,"Segundo producto");
		Productos pr3 = new Productos(1,"Primero producto");
		
		ordenaProductos.add(pr1);
		ordenaProductos.add(pr2);
		ordenaProductos.add(pr3);
		
		
		for (Productos pr : ordenaProductos) {
			System.out.println(pr.getDescripcion());
		}

	}

}
class Productos implements Comparable<Productos>{

     
	public Productos(int numeroProducto, String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return descripcion;
		
	}
	@Override
	public int compareTo(Productos o) {
		// TODO Auto-generated method stub
		
		return  numeroProducto - o.numeroProducto;
	}
	private int numeroProducto;
	private String descripcion;
	
}
