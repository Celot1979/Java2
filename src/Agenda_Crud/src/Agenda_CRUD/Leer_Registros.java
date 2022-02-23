package Agenda_CRUD;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
// Archivo en el que su finalidad es la de mofidicar registros
public class Leer_Registros extends JFrame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setTitle("MODIFICAR REGISTROS");
		setBounds(1250,400,500,600);
		try {
			add(new lamina_Modificar());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Estado_Ventana objeto_escucha = new Estado_Ventana();
		//addWindowListener(objeto_escucha);
		setVisible(true);
	}

}
class lamina_Modificar extends JPanel{
	public  lamina_Modificar() throws SQLException {
		 BBDD.initConnection();
		 id = new JLabel("ID:                                          ");
		 id.setFont(new Font("Arial",Font.BOLD, 16));
		 add(id);
		 cid = new  JTextField (10);
		 add(cid);
		 nombre = new JLabel ("Nombre nuevo registro: ");
		 nombre.setFont(new Font("Arial",Font.BOLD, 16));
		 add(nombre);
		 cnombre = new  JTextField (10);
		 add(cnombre);
		 System.out.println("\n");
		 apellido= new JLabel ("Apellido nuevo registro: ");
		 apellido.setFont(new Font("Arial",Font.BOLD, 16));
		 add(apellido);
		 capellido = new  JTextField (10);
		 add(capellido);
		 
		 
		 movil= new JLabel ("Número móvil:                   ");
		 movil.setFont(new Font("Arial",Font.BOLD, 16));
		 add(movil);
		 cmovil = new  JTextField (10);
		 add(cmovil);
		 
		 fijo= new JLabel ("            Número fijo:                             ");
		 fijo.setFont(new Font("Arial",Font.BOLD, 16));
		 add(fijo);
		 cfijo = new  JTextField (10);
		 add(cfijo);
		 
		 
		 anotacion = new JLabel("      Anotacion");
		 anotacion.setFont(new Font("Arial",Font.BOLD, 16));
		 add(anotacion);
		 canotacion = new JTextArea(5,32);
		 JScrollPane laminaScrollCliente = new JScrollPane(canotacion);
		 canotacion.setLineWrap(true);
		 
		 add(laminaScrollCliente);
		
		//BBDD.leerRegistroEspecifico();
		 DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);
	     final JTable table = new JTable(dtm);
		 add(table);
		
	}
	
	private JTextArea contenido;
	private JLabel id,nombre,apellido,movil,fijo,anotacion,anotacionextra;
	private JTextField cid,cnombre,capellido,cmovil,cfijo,cid_busqueda;
	private JTextArea canotacion;
	private JButton Registro,Leer,Modificar_clase,Borrar,Salir,Documentacion,Licencia,ver_dato;
	private static final Scanner  scanner= new Scanner(System.in);
	String[] columnNames = {"id","nombre","apellido","movil","fijo","anotacion"};
	
	String[][] datos = {{"1", "Daniel", "Gil Martinez", "5665", "4545455", "Hola"}};

			
		
	}
