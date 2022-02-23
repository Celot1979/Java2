package Colecciones_II;

public class Libreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro Libro1 = new Libro("Amanecer", "José", 00001);
		Libro Libro2 = new Libro("que", "Ataulfo", 00002);
		
		if(Libro1.equals(Libro2))System.out.println("Son iguales");
		else {
			System.out.println(Libro1.hashCode());
			System.out.println("No son iguales");
		}

	}

}
