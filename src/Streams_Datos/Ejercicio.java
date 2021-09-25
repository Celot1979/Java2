import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

public class Ejercicio {
    marco m = new marco ();
	m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
class marco extends JFrame{
	public marco() {
		setTitle("Ejercicio Streams");
		setBounds(600,200,800,600);
		add(new Lamina());
		setVisible(true);
	}
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		Escribir = new JButton("Escribir");
		Escribir.addActionListener(new accion());
		Borrar = new JButton("Borrar");
		Borrar.addActionListener(new accion());
		Leer = new JButton("Leer");
		Leer .addActionListener(new accion());
		JPanel bajo = new JPanel();
		bajo.add(Escribir);
		bajo.add(Borrar);
		bajo.add(Leer);
		
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
		add(bajo,BorderLayout.SOUTH);
	}
	public void leyendo_Fichero(){
		try {
			FileReader lectura = new FileReader("/Users/danielgil/Desktop/fichero_escritura.txt");
			BufferedReader miBufeer = new BufferedReader(lectura);
			String linea = "";
			while (linea != null) {
				linea = miBufeer.readLine();
				if(linea!=null) miArea.setText(linea);
			}
			lectura.close();
			System.out.println("\nHa llegado hasta aquí");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("No se ha podido leer el archivo");
		}
	}
	class accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			/*
			 * Escribimos en un fichero el contenido del JTextPane
			 */
			if(e.getSource() == Escribir) {
				texto = miArea.getText();
				try {
					
					FileWriter escribir = new FileWriter("/Users/danielgil/Desktop/fichero_escritura.txt",true);
					for(int i = 0; i< texto.length();i++) {
						escribir.write(texto.charAt(i));
					}
					
					escribir.close();
					System.out.println("Realizada la acción con exito");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					System.out.println("No se ha produccido la acción designada");
				}
			}else if (e.getSource() == Borrar) {
				/*
				 *Borramos del  fichero el contenido del JTextPane
				 */
				miArea.setText("");
				try {
					//Borramos el texto interno del fichero de texto.
					new PrintWriter("/Users/danielgil/Desktop/fichero_escritura.txt").close();
					System.out.println("Realizado el borrado con éxito");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("No se ha borrado el contenido del fichero");
				}
				
			}else if (e.getSource() == Leer){
				leyendo_Fichero();
			}
			
		}
		
	}
	JTextPane miArea;
	JButton Escribir,Borrar,Leer;
	String texto;
	JTextField idea;
}