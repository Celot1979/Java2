package Bot;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Bot.Marco.Informacion_Cliente;





public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class marco extends JFrame {
	/**
	 * Autor: Daniel
	 * Version:1.0.0
	 */
	private static final long serialVersionUID = 1L;
	public marco() {
		
        //Instrucción para que no sepueda redimensionar el JFrame(marco)
        this.setResizable(false);

		setBounds(400,400,400,600);
		//JPanel primaria
		JPanel lamina = new JPanel();
		
		
		//Componentes que formaran parte de la estructura del bot
		  // Área de texto
		contenido = new JTextArea(20,30);
		JScrollPane laminaScrollCliente = new JScrollPane(contenido);
		contenido.setLineWrap(true);
		
		  //Campo de texto
		Texto = new JTextField(30);
		
		
			//Etiqueta
		Icono = new JLabel("DEVIL SHEEP a la escucha .......                     ");
		Icono.setIcon(new ImageIcon("/Users/danielgil/Desktop/Curso_Java/Bot_Unica_Estructura/src/devil.png"));
		Icono.setFont(new Font("Marker Felt", Font.BOLD, 16));

			//Botón
		Enviar = new JButton("Enviar");
		Enviar.setBackground(new Color(255,102,102));
		Enviar.setOpaque(true);
		Enviar.setBorderPainted(false);
		Enviar.setForeground(Color.BLUE);
		Enviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					Hilo_Cliente jola = new Hilo_Cliente();
					jola.start();
				
				
			}
			
		});
		
		lamina.add(Icono);
		lamina.add(laminaScrollCliente);
		lamina.add(Texto);
		lamina.add(Enviar);
		

		//Añadir lámina-principal al Marco
		add(lamina);
		Hilo_Servidor servidor = new Hilo_Servidor();
		servidor.start();
		setVisible(true);
	}
	
class Hilo_Cliente extends Thread{
	public void run() {
		try {
			JLabel mensaje_inicial = new JLabel("Hola");
			Socket Conexion_Cliente = new Socket("192.168.0.7",9970);
			DataOutputStream flujoSalida1= new DataOutputStream ( Conexion_Cliente.getOutputStream());
			flujoSalida1.writeUTF(mensaje_inicial.getText());
			flujoSalida1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
class Hilo_Servidor extends Thread{
	

	public void run() {
		ServerSocket  miServidor = new ServerSocket(9990);
		String mensaje_del_cliente;
		
		while(true) {
			Socket miSocket =  miServidor.accept(); 
			ObjectInputStream flujoDatosEntrada = new ObjectInputStream( miSocket.getInputStream());
			mensaje_del_cliente =  (String) flujoDatosEntrada.readObject();
			contenido.append(mensaje_del_cliente);
			miSocket.close();
	}
		
}	


	private JTextArea contenido;
	private JTextField Texto;
	private JButton Enviar;
	private JLabel Icono,mensaje_inicial;
	@SuppressWarnings("unused")
	private String Contenido_Texto,Opcion;
	
	
	
	
}