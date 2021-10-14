package ArrayList.Ejemplo_Programacion_Generica_Sin_ArrayList;

public class MiArrayList {
	//2º Inicializamos un contructor de clase para poder darle un tamaño al Array por parámetro
	// Recordemos que siempre estamos hablando de objetos de la clase Objetos.
    public MiArrayList(int z) {
        datosElemento = new Object[z];
    }
    
    // 3º Creamos un método de tipo getter, que nos devuelva la posición de un elemento en concreto. Dicho elemento será pasado por parámentro
    public Object getObjeto(int i) {
		return datosElemento[i];
    }
    
    //4º Vamos a crear un método que vaya añadiendo los elementos (objetos) al array.Es de tipo void porque no esperamos que devuelva nada.
    
	public void agregaElemento(Object o) {
        datosElemento[i]= o;
        i++;
    	//Debemos de crear un campos de clase que le de valor a la i que le pasamos al array. No es un buvle, por tanto...
    }
    //1º Creamos un campo de clase que nos permitirá agregar en él los objetos (elemento) en el array.
	private Object[] datosElemento;
	private int i =0;

}
