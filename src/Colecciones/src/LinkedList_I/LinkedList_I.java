package LinkedList_I;
import java.util.*;
public class LinkedList_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estuctura de la creacción de un LinkedList
       LinkedList<String> personas = new LinkedList<String>();
       
       // Método para añadir elementos a la lista
       personas.add("Ana");
       personas.add("David");
       personas.add("Eloy");
       personas.add("Almudena");
       
       
       // Método para saber la cantidad de elementos que tiene la lista
       
       System.out.println(personas.size());
       
       
       // Creación y uso del ListIterator para realizar diferentes 
       // operaciones con la lista enlazada
       
       ListIterator<String> it = personas.listIterator();
       
       // Vamos a agregar una persona con el método add pero perteneciente
       // al iterador. Además lo vamos hacer entre dos elementos que nosotros elijamos
       
       it.next();
       it.add("Julian");
       
       
       // Para imprimir la info de la lista, lo mejor es un bucle for-each
       
       for (String string : personas) {
		System.out.println(string);
	}
	}

}
