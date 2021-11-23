package Colecciones_I;

public class Cliente{
	
	public Cliente(String nombre, String n_Cuenta, double saldo) {
		this.nombre = nombre;
		this.n_Cuenta = n_Cuenta;
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getN_Cuenta() {
		return n_Cuenta;
	}
	public void setN_Cuenta(String n_Cuenta) {
		this.n_Cuenta = n_Cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String nombre;
	private String n_Cuenta;
	private double saldo;
}
