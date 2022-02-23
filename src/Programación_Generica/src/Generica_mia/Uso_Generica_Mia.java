package Generica_mia;

public class Uso_Generica_Mia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generaica_mia<String> miObjeto1 = new Generaica_mia<String>();
		miObjeto1.setObjeto("Dani");
		System.out.println(miObjeto1.getObjeto());
		//2ª Utilización de una clase géneica con un tipo de Objeto inventado- no en la API-
		Generaica_mia <Personas> miObjeto2 = new Generaica_mia<Personas>();
		// Para realizar un setter debemos de crear un objeto que pasarle por parámetro al setter.Si no le pasamos nada
		// sería un resultado null
		Personas ella = new Personas ("Sandra");
		
		// Ahora crearemos el setter
		miObjeto2.setObjeto(ella);
		
		// Ahora veremos que si usamos simplemente el getter para que nos de la información que le hemos introduccido
		
		System.out.println(miObjeto2.getObjeto());
	}

}
class Personas{
	
	public Personas(String nombre) {
		this.nombre = nombre;
	}
	
	//Si no sobreescribimos el método toString, lo que nos devolverá el getter cuando lo instaciemos es: Generica_mia.Personas@1d251891
	
	public String toString() {
		return nombre;
	}

	private String nombre;
}