package Colecciones_I.Iteradores;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Iteradores {

	public static void main(String[] args) {
		    Cliente cliente1 = new Cliente("Antonio López", "0001", 20000);
	        Cliente cliente2 = new Cliente("Ana Guti", "0002", 13000);
	        Cliente cliente3 = new Cliente("Ángel Martín", "0003", 50000);
	        Cliente cliente4 = new Cliente("Jesús Álvarez", "0004", 30000);
	        Cliente cliente5 = new Cliente("Antonio López", "0001", 20000);
	        Set<Cliente> clientes_del_banco = new HashSet<Cliente>();
	        clientes_del_banco.add(cliente1);
	        clientes_del_banco.add(cliente2);
	        clientes_del_banco.add(cliente3);
	        clientes_del_banco.add(cliente4);
	        clientes_del_banco.add(cliente5);
	        /*for (Cliente cliente : clientes_del_banco) {
				System.out.println("El nombre del cliente " + cliente.getNombre() + " con el nº de cuenta " + cliente.getN_Cuenta() + " con un saldo " + cliente.getSaldo() + " €.");
			}*/
	        // -------------------- 1º Practica -----------------------------------
	        // Uso de iterador para recorrer una colección.
	        /*Iterator<Cliente> it = clientes_del_banco.iterator();
	        while(it.hasNext()) {
	        	String nombreCliente = it.next().getNombre();
	        	System.out.println(nombreCliente);
	        }*/
	        
	        
	     // -------------------- 2º Practica -----------------------------------
	     // Uso de iterador para borrar un elemento de la colección.
	        Iterator<Cliente> it = clientes_del_banco.iterator();
	        while(it.hasNext()) {
	        	String nombreCliente = it.next().getNombre();
	        	
	        	if(nombreCliente.equals("Ana Guti")) it.remove();
	        }
	        
	        
	        
	        
	        
	     // Para recorrer la colección y que nos muestre la información
	        for (Cliente cliente : clientes_del_banco) {
				System.out.println("El nombre del cliente " + cliente.getNombre() 
				+ " con el nº de cuenta " + cliente.getN_Cuenta() + " con un saldo " 
				+ cliente.getSaldo() + " €.");}
	        

}
}

