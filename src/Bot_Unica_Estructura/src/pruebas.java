import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Recogida_Analisis_Informacion_Cliente_En_Servidor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Recogida_Analisis_Info Captacion_Info = new Recogida_Analisis_Info(9990);
			//Solucion_Dudas_Servidor_A_Cliente Contestación_Info = new Solucion_Dudas_Servidor_A_Cliente();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class Recogida_Analisis_Info{
		public Recogida_Analisis_Info(int puerto) throws IOException, ClassNotFoundException {
			ServerSocket Servidor_Escucha = new ServerSocket(puerto);
			String Opcion_Usu, Loguear, n_Pedido, mensaje_del_cliente;
			Informacion_Cliente datos_paquete;
			while(true) {
				Socket miSocket = Servidor_Escucha.accept();
				ObjectInputStream flujoDatosEntrada = new ObjectInputStream( miSocket.getInputStream());
				datos_paquete = (Informacion_Cliente) flujoDatosEntrada.readObject();
				Opcion_Usu = datos_paquete.getOpcion();
				Control = Opcion_Usu;
				Loguear = datos_paquete.getUsuario();
				n_Pedido = datos_paquete.getN_pedido();
				mensaje_del_cliente = datos_paquete.getMensaje();
				System.out.print("\n" + Opcion_Usu + "\n" + Loguear + "\n" + n_Pedido + "\n" + mensaje_del_cliente  + "\n" + "Ha llegado hasta Que el servidor Escuche la elección del cliente");
				
				miSocket.close();
				
				
			}
			
		}
		
		
	}
	
	private String Control;
	private int puerto;
	private String Ip;
}

/*
 * Hilo construido para transmitir la información del cliente al servidor.
 * Es la 1ª transferencia de datos.
 */
/*public class Hilo implements Runnable{

	@SuppressWarnings("unused")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Reconocimeinto reconocer_usuario = new Reconocimeinto("192.168.0.7", 9990);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	class Reconocimeinto{
		public Reconocimeinto(String dire,int puerto) throws UnknownHostException, IOException {
			datos_usuario = new Informacion_Cliente();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			datos_usuario.setUsuario(JOptionPane.showInputDialog("Usuario: "));
			contenido.append("\n " +"\n " + "Bienvenido " + datos_usuario.getUsuario());
			
			datos_usuario.setN_pedido(JOptionPane.showInputDialog("Número del pedido: "));
			contenido.append("\n " + "Su pedido es : " + datos_usuario.getN_pedido());
			datos_usuario.setOpcion(Texto.getText());
			contenido.append("\n " + "La Opción marcada es : " + datos_usuario.getOpcion());
			Texto.setText(" ");
			
			
			
			//Creamos las condiciones para crear el socket
			Socket Envío_Info_Cliente = new Socket(dire ,puerto);
			if(datos_usuario.getOpcion().equals("1")) {
				
			}else if(datos_usuario.getOpcion().equals("2")) {
				datos_usuario.setMensaje("Opción2");
				ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
				flujosSalidaPaquete.writeObject(datos_usuario);
				Texto.setText("Opción1");
				//contenido.append("\n" + "\n" + "Bienvenido: " + datos_usuario.getUsuario() + "\n" + "Has escogido la opción:"+ "\n" + "Información de devoluciones");
				Envío_Info_Cliente.close();
			}else if(datos_usuario.getOpcion().equals("3")) {
				datos_usuario.setMensaje("Opción3");
				ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
				flujosSalidaPaquete.writeObject(datos_usuario);
				Texto.setText(" ");
				//contenido.append("\n" + "\n" + "Bienvenido: " + datos_usuario.getUsuario() + "\n" + "Has escogido la opción:"+ "\n" + "Puntos de recogida");
				Envío_Info_Cliente.close();
			}else if (datos_usuario.getOpcion().equals("4")) {
				datos_usuario.setMensaje(JOptionPane.showInputDialog("Explicanos tú problema"));
				ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
				flujosSalidaPaquete.writeObject(datos_usuario);
				Texto.setText(" ");
				//contenido.append("\n" + "\n"+ "Bienvenido: " + datos_usuario.getUsuario() + "\n" + datos_usuario.getMensaje());
				//contenido.append("\n" + "\n " + datos_usuario.getUsuario() + " : " + "\n" +datos_usuario.getMensaje());
				Envío_Info_Cliente.close();
			}
			
			contenido.append("\n" + "\n " + "Un momento por favor revisando ....");
			System.out.print( "Ha llegado hasta Que el servidor Escuche la elección del cliente");
		}
	
		
		
	}
	private String dire;
	private int puerto;
	
}

class Reconocimeinto{
	public Reconocimeinto(String dire,int puerto) throws UnknownHostException, IOException {
		datos_usuario = new Informacion_Cliente();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datos_usuario.setUsuario(JOptionPane.showInputDialog("Usuario: "));
		contenido.append("\n " +"\n " + "Bienvenido " + datos_usuario.getUsuario());
		
		datos_usuario.setN_pedido(JOptionPane.showInputDialog("Número del pedido: "));
		contenido.append("\n " + "Su pedido es : " + datos_usuario.getN_pedido());
		datos_usuario.setOpcion(Texto.getText());
		contenido.append("\n " + "La Opción marcada es : " + datos_usuario.getOpcion());
		Texto.setText(" ");
		
		
		
		//Creamos las condiciones para crear el socket
		Socket Envío_Info_Cliente = new Socket(dire ,puerto);
		if(datos_usuario.getOpcion().equals("1")) {
			
		}else if(datos_usuario.getOpcion().equals("2")) {
			datos_usuario.setMensaje("Opción2");
			ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
			flujosSalidaPaquete.writeObject(datos_usuario);
			Texto.setText("Opción1");
			//contenido.append("\n" + "\n" + "Bienvenido: " + datos_usuario.getUsuario() + "\n" + "Has escogido la opción:"+ "\n" + "Información de devoluciones");
			Envío_Info_Cliente.close();
		}else if(datos_usuario.getOpcion().equals("3")) {
			datos_usuario.setMensaje("Opción3");
			ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
			flujosSalidaPaquete.writeObject(datos_usuario);
			Texto.setText(" ");
			//contenido.append("\n" + "\n" + "Bienvenido: " + datos_usuario.getUsuario() + "\n" + "Has escogido la opción:"+ "\n" + "Puntos de recogida");
			Envío_Info_Cliente.close();
		}else if (datos_usuario.getOpcion().equals("4")) {
			datos_usuario.setMensaje(JOptionPane.showInputDialog("Explicanos tú problema"));
			ObjectOutputStream flujosSalidaPaquete = new ObjectOutputStream(Envío_Info_Cliente.getOutputStream());
			flujosSalidaPaquete.writeObject(datos_usuario);
			Texto.setText(" ");
			//contenido.append("\n" + "\n"+ "Bienvenido: " + datos_usuario.getUsuario() + "\n" + datos_usuario.getMensaje());
			//contenido.append("\n" + "\n " + datos_usuario.getUsuario() + " : " + "\n" +datos_usuario.getMensaje());
			Envío_Info_Cliente.close();
		}
		
		contenido.append("\n" + "\n " + "Un momento por favor revisando ....");
		System.out.print( "Ha llegado hasta Que el servidor Escuche la elección del cliente");
	}

	
	
}
private String dire;
private int puerto;

}