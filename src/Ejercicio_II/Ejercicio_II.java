package Ejercicio_II;
/*
 * Enunciado:
 * Debemos de crear por interfaz un programa que almacene por variable la creación 
 * de dos archivos.
 * 
 * En el momento de crearlos debemos pasarles un texto.
 * 
 * A continuación se creará otro archivo que contenga las dos líneas de texto.
 */


import java.awt.Color;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Ejercicio_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
class marco extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public marco() {
		setTitle("Programa Streams");
		setBounds(400,400,600,400);
		add(new lamina());
		setVisible(true);
	}
	
}

class lamina extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public lamina() {
		setLayout(new GridLayout(0,2));
		
		e1 = new JLabel("Nombre del Directorio/Carpeta");
		t1= new JTextField();
		//Abrevia al usuario para elegir la ruta donde quiera guardar el Directorio/Carpeta
		//t1.setText("/Users/danielgil/Desktop/Material acceso/");
		Color a = Color.BLUE;
		t1.setForeground(a);
		
		e2 = new JLabel("Nombre del Archivo Inicial");
		t2= new JTextField();
		//t2.setText("/nombre_Archivo.txt");
		t2.setForeground(a);
		
		e3 = new JLabel("Nombre del Archivo Final");
		t3= new JTextField();
		//t3.setText("/nombre_Archivo.txt");
		t3.setForeground(a);
		
		Etiqueta_Texto_Archivo_1 = new JLabel("Texto para el 1º archivo");
		AreaTexto_1 = new JTextPane();
		
		Etiqueta_Texto_Archivo_2 = new JLabel("Texto para el 2º archivo");
		AreaTexto_2 = new JTextPane();
		AreaTexto_2 .setText(" ");
		
		AreaTexto_Etiqueta =  new JLabel("Area de Texto");
		AreaTexto = new JTextPane();
		
		b1 = new JButton("Crear (Directorio-archivos)");
		b1.addActionListener(new ActionListener() {
            /*Pone a la escucha a el botón Crear. La función del mismo es 
            * guardar el nombre de los directorios, carpetas.
			*/
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cod elemento = new Cod();//Sentencia de la clase interna
			}
			
		});
		b2 = new JButton("Borrado de los campos");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Borrado b = new Borrado();
			}
			
		});
		
		b3 = new JButton("Escribir en los archivos");
		b3.addActionListener(new accion());
		b4 = new JButton("Leer archivos");
		b4.addActionListener(new accion_Leer());
		
		
		add(e1);
		add(t1);
		add(e2);
		add(t2);
		add(e3);
		add(t3);
		add(Etiqueta_Texto_Archivo_1);
		add(AreaTexto_1);
		add(Etiqueta_Texto_Archivo_2);
		add(AreaTexto_2);
		add(AreaTexto_Etiqueta);
		add(AreaTexto);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		
		
	}
	private class Cod{
		public Cod() {
			
			direccion = "/Users/danielgil/Desktop/Material acceso/" + t1.getText() + "/";
			archivo_1 =  direccion + t2.getText() + ".txt";
			archivo_2 =  direccion + t3.getText()+ ".txt";
			tercer_archivo = direccion + "3" + ".txt";
			Carpeta = new File (direccion);
			//File.separator + "Users" + File.separator +"danielgil" + File.separator +"Desktop" + File.separator +"Material acceso" + File.separator + t1.getText()
			dire_Carpeta = Carpeta.getAbsolutePath();
			//System.out.println(dire_Carpeta);
			try {
				Carpeta.mkdir();
				//System.out.println("Directorio/Carpeta creado con éxito");
			}catch (Exception e) {
				System.out.println("Error en la creación del directorio");
			}
			
			Archivo_1= new File (archivo_1);
			//File.separator + "Users" + File.separator +"danielgil" + File.separator +"Desktop" + File.separator +"Material acceso" + File.separator + t1.getText()+ File.separator + t2.getText()+ ".txt"
			try {
				Archivo_1.createNewFile();
				//System.out.println("Archivo Uno --> creado con éxito");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en la creación del directorio");
			}
			
			Archivo_2= new File (archivo_2);
			//File.separator + "Users" + File.separator +"danielgil" + File.separator +"Desktop" + File.separator +"Material acceso" + File.separator + t1.getText()+ File.separator + t3.getText()+ ".txt"
			try {
				Archivo_2.createNewFile();
				//System.out.println("Archivo Dos --> creado con éxito");
			} catch (IOException e) {
				System.out.println("Error en la creación del directorio");
			}
			/*
			 * Este método realiza la lectura de ambos archivos. Luego escribirá el contenido de ambos archivos, y los escribirá en un tercer
			 * archivo.
			 * 
			 * Esté último archivo será el que se reproduzca en el Area de texto.
			 */
			
		}
		
		
		
		
	}
	
	public class Borrado{
		public Borrado() {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			AreaTexto.setText("");
			AreaTexto_1.setText("");
			AreaTexto_2.setText("");
		}
	}
	public class Escribir{
		public Escribir(String archivo,JTextPane AreaTexto_1) {
			String texto = AreaTexto_1.getText();
			//System.out.println(texto);
			
			try {
				FileWriter escrito = new FileWriter(archivo,true);
				for(int i = 0; i< texto.length();i++) {
					escrito.write(texto.charAt(i));
				}
				escrito.close();
				//System.out.println("Realizada la acción con exito");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("No se ha podido escribir el texto en el archivo");
				
			}
		}
	}
	
	public class Leer{
		public Leer(String archivo, String archivo_2) {
			try {
				/*FileReader lectura = new FileReader(direccion + archivo);
				
				
				BufferedReader miBufeer = new BufferedReader(lectura);
				
				String linea = "";
			
				while (linea != null) {
					linea = miBufeer.readLine();
					if(linea!=null)AreaTexto.setText(linea);
				}*/
				
                //lectura.close();
				String linea = "";
				String linea_2 = "";
				ArrayList <String> libro = new ArrayList <String>(); 
				ArrayList <String> libro_2 = new ArrayList <String>(); 
				juntas = new ArrayList <String>(); 
				ArrayList libro2 = new ArrayList(); 
				FileReader lectura = new FileReader(archivo);
				BufferedReader miBufeer = new BufferedReader(lectura);

				while (linea != null) {
					linea = miBufeer.readLine();
					if(linea!=null)libro.add(linea);
					
				}
				
				FileReader lectura_2 = new FileReader(archivo_2);
				BufferedReader miBufeer_2 = new BufferedReader(lectura_2);

				while (linea_2 != null) {
					linea_2 = miBufeer_2.readLine();
					if(linea_2!=null)libro.add(linea_2);
				}
				
				juntas.addAll(libro );
				juntas.addAll(libro2);
				StringBuilder sb = new StringBuilder();
				for (String s : juntas){
				    sb.append(s);
				    sb.append("");
				}

				System.out.println(sb.toString());
				String resultado= sb.toString();
				AreaTexto.setText(resultado);
			
				

				/*
				 * Ahora vamos hacer que la información del Array libro pase directamente a un tercer fichero.E intentaremos que lo eche en 
				 * AreaTexto Pane.
				 */
				
				 String ruta = tercer_archivo;
				 File f = new File(ruta);
				 FileWriter fw = new FileWriter(f);
				 PrintWriter escritura = new PrintWriter(fw);
				 for(int i=0;i<juntas.size();i++){
					 escritura.println(juntas.get(i));
				    }
				 escritura.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("No se ha podido leer el archivo!!!!");
			}
		}
	}
	public class leer_Tercero{
		public leer_Tercero() {
			try {
				FileReader Leer_Tercer_archivo = new FileReader( "/Users/danielgil/Desktop/Material acceso/3.txt");
				BufferedReader miBufeer = new BufferedReader(Leer_Tercer_archivo);
				String lectura = "";
				while (lectura!= null) {
					lectura = miBufeer.readLine();
					if(lectura !=null) {
						AreaTexto.setText(lectura);	
					}
				}
				
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//Intefaz de ActionListener para usar el objeto escribir. Podremos escribir el texto del usario en el TXT.
	public class  accion implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Escribir e1 = new Escribir(archivo_1,AreaTexto_1);
			Escribir e2 = new Escribir(archivo_2,AreaTexto_2);
			//System.out.println("Se escribió");
		}
	}
	
	public class accion_Leer implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent l) {
			// TODO Auto-generated method stub
			Leer l1 = new Leer(archivo_1,archivo_2 );
			//leer_Tercero l2 = new leer_Tercero();
			
		}
		
	}
	JLabel e1,e2,e3,AreaTexto_Etiqueta,Etiqueta_Texto_Archivo_1,Etiqueta_Texto_Archivo_2;
	JTextField t1,t2,t3;
	JButton b1, b2, b3,b4;
	JTextPane AreaTexto, AreaTexto_1,AreaTexto_2;
	String dire_Carpeta,direccion,archivo_1,archivo_2, texto_Escribir,texto_Fuc_Esc_2,lectura,str, tercer_archivo ;
	File Carpeta, Archivo_1,Archivo_2;
	Color azul;
	ArrayList <String> juntas = new ArrayList <String>();
	
	
}
