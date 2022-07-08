package application;

public class Peliculas {
	
	
	
	
	public Peliculas() {
		super();
	}


	public Peliculas(String titulo, int year, double precio) {
		super();
		this.titulo = titulo;
		this.year = year;
		this.precio = precio;
	}
	
	
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	private String titulo;
	private int year;
	private double precio;

}
