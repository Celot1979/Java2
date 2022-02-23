package Ejercicio_Linkend_I;

import java.util.*;
import java.util.stream.Stream;

public class Ejercicio_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> paises = new LinkedList <String>();
		LinkedList <String> capitales= new LinkedList <String>();
		
		paises.add("España");
		paises.add("Francia");
		paises.add("Inglaterra");
		paises.add("Italia");
		
		capitales.add("Madrid");
		capitales.add("París");
		capitales.add("Londres");
		capitales.add("Roma");
		
		 ListIterator<String> itPaises = paises.listIterator();
		 ListIterator<String> itCapitales = capitales.listIterator();
		
		while(itCapitales.hasNext()) {
			if(itPaises.hasNext()) itPaises.next();
			itPaises.add(itCapitales.next());
		}
		System.out.println(paises);
		
        itCapitales= capitales.listIterator();
        while(itCapitales.hasNext()) {
        	itCapitales.next();
        	if(itCapitales.hasNext()) {
        		itCapitales.next();
        		itCapitales.remove();
        }
        }
        System.out.println(capitales);
		
	}

}
