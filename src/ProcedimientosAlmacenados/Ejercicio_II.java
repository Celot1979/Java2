package ProcedimientosAlmacenados;

/*
 *  En el 2º Ejecicio de esta unidad, pretendemos pasrle una parámetro a la función construida en el gestor de BBDD. Después crearemos 
 *  el código necesario para realizar la consulta desde un programa de Java.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;



public class Ejercicio_II extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_II frame = new Ejercicio_II();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio_II() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		P.Almacenados_I.LaminaImagen laminaImagen = new LaminaImagen();

		getContentPane().add(laminaImagen);

		laminaImagen.setLayout(null);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField1.setBounds(203, 215, 307, 48);
		laminaImagen.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textField2.setColumns(10);
		textField2.setBounds(203, 275, 307, 48);
		laminaImagen.add(textField2);
		
		JButton btnNewButton = new JButton("CONSULTA");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Actualizar(textField1 , textField2);
			}
			
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(203, 341, 307, 48);
		laminaImagen.add(btnNewButton);
	}
	
	public static void Actualizar(JTextField textField1 , JTextField textField2) {
		
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/prueba","postgres","1234");
			CallableStatement miStatement = miConexion.prepareCall("{CALL Actualizar(?,?)}");
			miStatement.setString(1,textField2.getText());
			miStatement.setString(2,textField1.getText());
			miStatement.execute();
			
			JOptionPane.showMessageDialog(null, "Se actualizado con éxito");
			miConexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Error en la actualización");
			e.printStackTrace();
		}
		
	}
}
class LaminaImagen extends JPanel{

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		File miImagen = new File("/Users/danielgil/Desktop/Curso_Java/P.Almacenados/src/IMG/Imagen.png");

		try {

			imagen = ImageIO.read(miImagen);

		} catch (IOException e) {

			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "No se ha cargado la imagen - LaminaImagen - JPanel!","Atención!!", JOptionPane.ERROR_MESSAGE);
		}

		g.drawImage(imagen,0,0, null);

	}

	private Image imagen;

}
