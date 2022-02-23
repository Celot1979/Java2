package Disposiciones_Avanzadas_Box;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Practica_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBox mimarco = new MarcoBox();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}

}
class MarcoBox extends JFrame{
	public MarcoBox() {
		setTitle("Disposiciones avanzadas Box");
		 setBounds(300, 400, 1000, 350);
		 // ------------- 1º Box -----------------------------
		 JLabel uUsuario = new JLabel("Usuario");
		 JTextField cUsuario = new JTextField(10);
		 cUsuario.setMaximumSize(cUsuario.getPreferredSize());
		 Box cajaUsuario = Box.createHorizontalBox();
		 cajaUsuario.add(uUsuario);
		 cajaUsuario.add(Box.createHorizontalStrut(10));
		 cajaUsuario.add(cUsuario);
		 // ------------- 2º Box -----------------------------
		 JLabel uPassword = new JLabel("Contraseña");
		 JTextField cPassword = new JTextField(10);
		 cPassword.setMaximumSize(cPassword.getPreferredSize());
		 Box cajaPassword = Box.createHorizontalBox();
		 cajaPassword.add(uPassword);
		 cajaPassword.add(Box.createHorizontalStrut(10));
		 cajaPassword.add(cPassword);
		// ------------- 3º Box -----------------------------
		 JButton boton1 = new JButton("OK");
		 JButton boton2 = new JButton("Cancelar");
		 Box cajaBotones = Box.createHorizontalBox();
		 cajaBotones.add(boton1);
		 cajaBotones.add(Box.createHorizontalGlue());
		 cajaBotones.add(boton2);
		 
		 // --------------- Caja Vertical --------------------
		 Box cajaVertical = Box.createVerticalBox();
		 cajaVertical.add(cajaUsuario);
		 cajaVertical.add(cajaPassword);
		 cajaVertical.add(cajaBotones);
		 add(cajaVertical);
		 
	}
}