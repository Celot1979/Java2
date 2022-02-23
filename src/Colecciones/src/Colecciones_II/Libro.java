package Colecciones_II;

import java.util.Objects;

public class Libro {
	
	public Libro(String titulo, String autor, int iSBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
	}
	
	public String getDatos() {
		return "El titulo del libro es : " + titulo + " del autor " + " con número ISBN " + ISBN;
	}
	/*public boolean equals(Object obj) {
		Libro otroLibro = (Libro)obj;
		//Primero debemos comparar si el objeto que estamos pasando por parámetro es un libro
		if(obj instanceof Libro) {
			//Si es un libro entonces comparamos el iSBN
			if(this.ISBN ==otroLibro.ISBN) return true;
			else return false;
		}return false;
		
	}*/
	
	
	
	private String titulo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}



	private String autor;
	private int ISBN;

}
