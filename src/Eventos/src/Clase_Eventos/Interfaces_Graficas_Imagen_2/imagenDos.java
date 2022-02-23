package Interfaces_Graficas_Imagen_2;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class imagenDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagen marco_imagen = new MarcoImagen();
		marco_imagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoImagen extends JFrame{
	public MarcoImagen() {
		setBounds(300,300,800,450);
		LaminaImagen milamina = new LaminaImagen ();
		add(milamina);
		setVisible(true);
		
		
	}
}

class LaminaImagen extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		File miImagen = new File("/Users/danielgil/Desktop/JAVA/clase/src/Interfaces_Graficas_Imagen/casa.png");
		try {
			imagen = ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Un eerrorr");
		}
		g.drawImage(imagen,50,50, null);
		g.copyArea(50, 50, 128, 128, 350, 250);// Copiar y pgar una imagen
		
		
	}
	private Image imagen;
}