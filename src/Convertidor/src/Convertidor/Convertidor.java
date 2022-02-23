package Convertidor;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.io.File;
import javax.imageio.ImageIO;



public class Convertidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		picture_Frame m = new picture_Frame();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


}
class picture_Frame extends JFrame{
	public picture_Frame() {
		setTitle("Convertidor de moneda");
		setBounds(800,250,500,300);
		add(new Sheet());
		setVisible(true);
	}
}
class Sheet extends JPanel{
	public Sheet() {
		//----------------------------------------------------------------------------------------------
		//------------------------------- Etiquetas y Cajas de texto -----------------------------------
		//----------------------------------------------------------------------------------------------
		GridLayout experimentLayout = new GridLayout (0,2);
		grill = new JPanel();
		grill.setLayout (experimentLayout);
		grill.add (t1 = new JLabel("Euros: "));
		grill.add (c1  = new JFormattedTextField ());
		grill.add (t2 = new JLabel("Cantidad de Moneda Convertida: "));
		grill.add (c2 = new JTextField(10));
		c2.setEditable(false); 
		setLayout (new BorderLayout());
		
		//----------------------------------------------------------------------------------------------
		//------------------------------- RADIOBUTTON -----------------------------------
		//----------------------------------------------------------------------------------------------
		ButtonGroup Grupo1 = new ButtonGroup();
		dolar=new ImageIcon("/Users/danielgil/Desktop/Curso_Java/Convertidor/src/Convertidor/Imagen/dolar.gif");
		boton1 = new JRadioButton(dolar);
		libra = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/Convertidor/src/Convertidor/Imagen/libra.gif");
		boton2 = new JRadioButton(libra);
		yen = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/Convertidor/src/Convertidor/Imagen/yen.gif");
		boton3 = new JRadioButton(yen);
		franco = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/Convertidor/src/Convertidor/Imagen/franco_suizo.gif");
		boton4 = new JRadioButton(franco);
		
		boton1.addActionListener(new conversor ());
		boton2.addActionListener(new conversor ());
		boton3.addActionListener(new conversor ());
		boton4.addActionListener(new conversor ());
		
		
		JPanel verticalBox = new JPanel ();
		Grupo1.add(boton1);
		Grupo1.add(boton2);
		Grupo1.add(boton3);
		Grupo1.add(boton4);
		
		verticalBox .add(boton1);
		verticalBox .add(boton2);
		verticalBox .add(boton3);
		verticalBox .add(boton4);
        add(grill, BorderLayout.NORTH);
        add(verticalBox , BorderLayout.WEST);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miImagen = new File("/Users/danielgil/Desktop/Curso_Java/Convertidor/src/Convertidor/Imagen/Convertidor.gif");
		try {
			imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Un error");
		}
		g.drawImage(imagen,280,50, null);
		//g.copyArea(50, 50, 128, 128, 350, 250);// Copiar y pgar una imagen
		
		
	}
	private class conversor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()== boton1) {
				try{
					double cD = Double.parseDouble(c1.getText())* 1.17;
					c2.setText(Double.toString(cD));
					
					
					
				}catch (NumberFormatException e1) {
					c1.setText("");
				}
				
			} else if (e.getSource()== boton2) {
				try {
					double cD = Double.parseDouble(c1.getText())* 0.85;
					c2.setText(Double.toString(cD));
				}catch (NumberFormatException e1) {
					c1.setText("");
				}
				
			}else if (e.getSource()== boton3) {
				try {
					double cD = Double.parseDouble(c1.getText())* 128.72;
					int redondeo = (int) Math.round(cD);
					c2.setText(Double.toString(redondeo));
				}catch (NumberFormatException e1) {
					c1.setText("");
				}
				
			}else if (e.getSource() == boton4) {
				try {
					double cD = Double.parseDouble(c1.getText())* 1.08;
					c2.setText(Double.toString(cD));
				}catch (NumberFormatException e1) {
					c1.setText("");
				}
			}
		}
		
	}
	
	
	JLabel t1, t2, t3;
	JTextField  c2;
	JRadioButton boton1,boton2,boton3, boton4;
	private Image imagen;
	JPanel grill;
	JFormattedTextField c1 ;
	ImageIcon dolar, libra, yen, euro,franco;
}