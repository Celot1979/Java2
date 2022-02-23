package vista;

import java.awt.*;

import javax.swing.*;

import controlador.*;
import controlador.ControladorCargaMenus;
public class Marco_MVC extends JFrame {
	
	public Marco_MVC() {
		setTitle("Consulta articulos");
		setBounds(500,300,400,400);
		setLayout (new BorderLayout());
//		---------------------------------------------------------------------
//		Crearemos un JPanel que contendrá los JComboBox. 
//		A su vez el JPanel estará en el BorderLayout.NORTH
		
		JPanel menus = new JPanel();
		menus.setLayout(new FlowLayout());
		secciones = new JComboBox();
		secciones.addItem("Todas");
		paises = new JComboBox();
		paises.addItem("Todos");
		
		menus.add(secciones);
		menus.add(paises);
		add(menus,BorderLayout.NORTH);
//		---------------------------------------------------------------------
//		Creamos el JTextArea y lo introduccimos en el BorderLayout.CENTER
		
		resultados = new JTextArea(4,50);
		add(resultados, BorderLayout.CENTER);
		
//		---------------------------------------------------------------------
//		Creamos JButtony lo introduccimos en el BorderLayout.SOUTH
		boton = new JButton("Buscar");
		add(boton, BorderLayout.SOUTH);
		
		
		addWindowListener(new ControladorCargaMenus(this));
	}
	public JComboBox secciones, paises;
	private JTextArea resultados;
	private JButton boton;
	
}
