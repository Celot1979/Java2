package Colecciones_I.Iteradores;

public class Cliente{
	
	public Cliente(String nombre, String n_Cuenta, double saldo) {
		this.nombre = nombre;
		this.n_Cuenta = n_Cuenta;
		this.saldo = saldo;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n_Cuenta == null) ? 0 : n_Cuenta.hashCode());
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
		Cliente other = (Cliente) obj;
		if (n_Cuenta == null) {
			if (other.n_Cuenta != null)
				return false;
		} else if (!n_Cuenta.equals(other.n_Cuenta))
			return false;
		return true;
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
