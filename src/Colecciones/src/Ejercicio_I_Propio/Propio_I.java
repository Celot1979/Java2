package Ejercicio_I_Propio;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Propio_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedList<String> inicio = new LinkedList<String> ();
		
		//String acciones = JOptionPane.showInputDialog("AGENDA PERSONAL\n1º.Agregar Contacto\n2º.Borrar Contacto\n3º Borrar el último contacto\n4º Borrar el 1º Contacto\n5º Guardar en archivo la agenda");
		int ans = Integer.parseInt( JOptionPane.showInputDialog(null, "AGENDA PERSONAL\n1º.Agregar Contacto\n2º.Borrar Contacto\n3º Borrar el último contacto\n4º Borrar el 1º Contacto\n5º Guardar en archivo la agenda\n6º.Mostrar LinkedList\n7.Salir"));
		//System.out.println(ans);
		
		if(ans == 1) {
		   String nombre2 = JOptionPane.showInputDialog("Introducce el nombre");
		   String telf =  JOptionPane.showInputDialog("Introducce el número");
		   String email = JOptionPane.showInputDialog("Introducce el email");
		   contacto_nuevo(nombre2,telf,email);
		}else if (ans == 7) {
			System.exit(ans);
		}else if (ans == 6) {
			ver_Lista();
		}
	}
    public static void contacto_nuevo(String nombre, String telf2, String email) {
		nombre = nombre;
		telf2 = telf2;
		email = email;
        
		
	    //LinkedList<Personas_Lista>inicio = new LinkedList<Personas_Lista> ();
	    Archivos arc1 = new Archivos(nombre, telf2, email);
	    arc1.escribir();
	    Personas_Lista nuevo = new Personas_Lista(nombre,telf2,email);
	    System.out.println(nuevo.getNombre() + " " + nuevo.getTelef() + " " + nuevo.getEmail());
	    inicio.add(nuevo);

	}
    
    public static void ver_Lista() {
    	Personas_Lista nuevo = new Personas_Lista("Adolfo","1234","email@hotmail.com");
    	inicio.add(nuevo);
    	for(Personas_Lista ver : inicio) {
    		System.out.println(ver.getNombre());
    	}
    }
    private String nombre,email,telf2;
   
    private static LinkedList<Personas_Lista> inicio = new LinkedList<Personas_Lista> ();
    
}
