package TreeSeet;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparar_No_Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product comparadorPr = new Product();
		TreeSet<Product> ordenaProductos = new TreeSet<Product>(comparadorPr);
		
		Product pr1 = new Product(3,"esta es la descripcion del tercer producto");
		Product pr2 = new Product(2,"Segundo ");
		Product pr3 = new Product(1,"Primero producto");
		
		ordenaProductos.add(pr1);
		ordenaProductos.add(pr2);
		ordenaProductos.add(pr3);
		
		
		for (Product pr : ordenaProductos) {
			System.out.println(pr.getDescripcion());
		}

	}

}
class Product implements Comparator<Product>{

    public Product() {
    	
    }
	public Product(int numeroProducto, String descripcion) {
		this.numeroProducto = numeroProducto;
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return descripcion;
		
	}
	
	
	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub

		int carac1 =o1.getDescripcion().length();
		int carac2 =o2.getDescripcion().length();
		
		if(carac1 < carac2)return -1;
		else if(carac1 > carac2)return 1;
		else return 0;
	}
	
	private int numeroProducto;
	private String descripcion;
	
	
}