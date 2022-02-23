package Bot;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

@SuppressWarnings("unused")
public class Bot_Devil_Ship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco m = new Marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Marco extends JFrame{
	/**
	 * Autor : Daniel
	 */
	private static final long serialVersionUID = 1L;
	public Marco()  {
		this.setResizable(false);

		setBounds(400,400,500,600);
		//JPanel primaria
		JPanel lamina = new JPanel();

		//Componentes que formaran parte de la estructura del bot
		  // Área de texto
		contenido = new JTextArea(20,38);
		
		contenido.append("Hola! Soy Devil Sheep !!!!  " + "\n" +  "\n" + "En qué podemos ayudarte?" + "\n" +  "\n" + " 1. Problemas con el pedido " +  "\n" + " 2. Información de devoluciones " + "\n" + " 3. Puntos de recogida "  + "\n" + " 4. Ninguna de las opciones ");
		
		contenido.append("\n" + "\n " + "Si su problema está entre las opciones: " + "\n " + "Introduzca el número y siga las instrucciones");
		JScrollPane laminaScrollCliente = new JScrollPane(contenido);
		contenido.setLineWrap(true);
		
		  //Campo de texto
		Texto = new JTextField(38);
		
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
				 try {
					Info_Cliente Cliente = new  Info_Cliente("192.168.0.7", 9990);
					
				} catch (InterruptedException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		
		lamina.add(Icono);
		lamina.add(laminaScrollCliente);
		lamina.add(Texto);
		lamina.add(Enviar);
		

		//Añadir lámina-principal al Marco
		add(lamina);
		
		new Thread(new Recepcion_Info_Servidor("192.168.0.7", 9990)).start();
		
	
		
		
		setVisible(true);
	}
class Info_Cliente{
	
	public Info_Cliente(String dire, int puerto) throws InterruptedException, UnknownHostException, IOException {
		this.dire = dire;
		this.puerto = puerto;
		Socket Envío_Info_Cliente = new Socket(dire ,puerto);
		Informacion_Cliente Info_Enviada_Cliente = new Informacion_Cliente();
		Thread.sleep(2000);
		Info_Enviada_Cliente.setUsuario(JOptionPane.showInputDialog("Usuario: "));
		contenido.append("\n " +"\n " + "Bienvenido " + Info_Enviada_Cliente.getUsuario());
		Info_Enviada_Cliente.setN_pedido(JOptionPane.showInputDialog("Número del pedido: "));
		contenido.append("\n " + "Su pedido es : " + Info_Enviada_Cliente.getN_pedido());
		Info_Enviada_Cliente.setOpcion(Texto.getText());
		contenido.append("\n " + "La Opción marcada es : " + Info_Enviada_Cliente.getOpcion());
		Texto.setText(" ");
		
		ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
		flujosSalidaPaquete.writeObject(Info_Enviada_Cliente);
		Texto.setText("");
		contenido.append("\n" + "\n " + "Un momento por favor revisando ....");
		//contenido.append("\n" + "\n" + "Bienvenido: " + datos_usuario.getUsuario() + "\n" + "Has escogido la opción:"+ "\n" + "Información de devoluciones");
		Envío_Info_Cliente.close();
	}
	private String dire;
	private int puerto;
}

class Recepcion_Info_Servidor implements Runnable{
	
	public Recepcion_Info_Servidor(String dire, int puerto) {
		Dire = dire;
		Puerto = puerto;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			String Opcion_Usu, Loguear, n_Pedido, mensaje_del_cliente;
			Informacion_Cliente Info_Enviada_Cliente;
			while(true) {
				ServerSocket  miServidor = new ServerSocket(9990);
				Socket miSocket =  miServidor.accept(); 
				ObjectInputStream flujoDatosEntrada = new ObjectInputStream( miSocket.getInputStream());
				Info_Enviada_Cliente = (Informacion_Cliente) flujoDatosEntrada.readObject();
				Opcion_Usu = Info_Enviada_Cliente.getUsuario();
				Loguear = Info_Enviada_Cliente.getUsuario();
				n_Pedido = Info_Enviada_Cliente.getN_pedido();
				mensaje_del_cliente = Info_Enviada_Cliente.getMensaje();
				
				System.out.print(Opcion_Usu);
				System.out.print("\n" + n_Pedido);
				
				miSocket.close();
				
				
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("\n" +  "Fallo Del sistema");
			}
		
	}
	
	
	private String Dire;
	private int Puerto;
}




class Informacion_Cliente implements Serializable{
    	
    	/**
		 * Version 1.0.0
		 */
		private static final long serialVersionUID = 1L;

		public String getOpcion() {
    			return opcion;
    		}

    		public void setOpcion(String opcion) {
    			this.opcion = opcion;
    		}
    		

    	public String getUsuario() {
    			return usuario;
    		}

    		public void setUsuario(String usuario) {
    			this.usuario = usuario;
    		}

    	public String getN_pedido() {
    			return n_pedido;
    		}

    		public void setN_pedido(String n_pedido) {
    			this.n_pedido = n_pedido;
    		}

    	public String getMensaje() {
    			return mensaje;
    		}

    		public void setMensaje(String mensaje) {
    			this.mensaje = mensaje;
    		}

    	private String opcion,usuario,n_pedido,mensaje;
    		
    	}


	
	private JTextArea contenido;
	private JTextField Texto;
	private JButton Enviar;
	@SuppressWarnings("unused")
	private JLabel Icono,mensaje_inicial;
	@SuppressWarnings("unused")
	private String Contenido_Texto,Opcion;
	private Informacion_Cliente datos_usuario;
	
}