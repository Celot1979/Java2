package Agenda_CRUD;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana_Registros extends JFrame implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		setTitle("Registros");
		setBounds(1250,400,400,600);
		add(new lamina_Registro());
		//Estado_Ventana objeto_escucha = new Estado_Ventana();
		//addWindowListener(objeto_escucha);
		setVisible(true);
		
	}
}

@SuppressWarnings("serial")
class lamina_Registro extends JPanel{
	public lamina_Registro() {
		 BBDD.initConnection();
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
		 
		 fijo= new JLabel ("Número fijo:                        ");
		 fijo.setFont(new Font("Arial",Font.BOLD, 16));
		 add(fijo);
		 cfijo = new  JTextField (10);
		 add(cfijo);
		 
		 
		 anotacion = new JLabel("Anotacion");
		 anotacion.setFont(new Font("Arial",Font.BOLD, 16));
		 add(anotacion);
		 canotacion = new JTextArea(15,32);
		 JScrollPane laminaScrollCliente = new JScrollPane(canotacion);
		 canotacion.setLineWrap(true);
		 
		 add(laminaScrollCliente);
		 
		 Registro = new JButton("Registro");
		 add(Registro);
		 Registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int res = JOptionPane.showConfirmDialog( null, "¿Quieres continuar?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if ( res == JOptionPane.NO_OPTION )  JOptionPane.showInputDialog("Hasta pronto: ");
				if (res == JOptionPane.YES_OPTION) {
					 String nom = cnombre.getText();
					 String ape = capellido.getText();
					 String mov = cmovil.getText();
					 String fij = cfijo.getText();
					 String cano = canotacion.getText();
					 BBDD.Crear(nom, ape, mov, fij, cano);
					 JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
				}

			}
			
			 
		 });
		 
		
		 
	}
	private JTextArea contenido;
	private JLabel id,nombre,apellido,movil,fijo,anotacion,anotacionextra;
	private JTextField cid,cnombre,capellido,cmovil,cfijo;
	private JTextArea canotacion;
	private JButton Registro,Leer,Modificar,Borrar,Salir,Documentacion,Licencia;
	private static final Scanner  scanner= new Scanner(System.in);
	
	
}