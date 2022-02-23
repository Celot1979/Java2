package Practica_Interfaz;



public class Uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Aritmeticas a = new Aritmeticas();
       a.suma(3, 4);
       a.resta(10, 5);
       a.multiplicar(2, 5);
       a.dividir(30, 5);
	}

}
class Aritmeticas implements Operaciones{

	@Override
	public void suma(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("La suma es : " + (a+b));
	}

	@Override
	public void resta(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("La resta es : " + (a-b));
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("La resta es : " + (b/a));
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("La resta es : " + (b*a));
		
	}
	
	
}