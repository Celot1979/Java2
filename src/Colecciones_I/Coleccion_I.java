package Colecciones_I;
import java.util.*;
public class Coleccion_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cliente cliente1 = new Cliente("Antonio López", "0001", 20000);
        Cliente cliente2 = new Cliente("Ana Guti", "0002", 13000);
        Cliente cliente3 = new Cliente("Ángel Martín", "0003", 50000);
        Cliente cliente4 = new Cliente("Jesús Álvarez", "0004", 30000);
        Set<Cliente> clientes_del_banco = new HashSet<Cliente>();
        clientes_del_banco.add(cliente1);
        clientes_del_banco.add(cliente2);
        clientes_del_banco.add(cliente3);
        clientes_del_banco.add(cliente4);
        for (Cliente cliente : clientes_del_banco) {
			System.out.println("El nombre del cliente " + cliente.getNombre() + " con el nº de cuenta " + cliente.getN_Cuenta() + " con un saldo " + cliente.getSaldo() + " €.");
		}
	}

}
