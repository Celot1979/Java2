package vista_A;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controlador_A.ControladorCargaMenus;

public class MarcoMVC extends JFrame {
	
	public MarcoMVC() {
		setTitle("Consulta articulos");
		setBounds(500,300,400,400);
		setLayout(new BorderLayout());
		JPanel menus = new JPanel();
		menus.setLayout(new FlowLayout());
		
		secciones = new JComboBox();
		secciones.addItem("Todas");
		
		paises = new JComboBox();
		paises.addItem("Todos");
		menus.add(secciones);
		menus.add(paises);
		add(menus, BorderLayout.NORTH);
		
		resultados = new JTextArea(4,50);
		
		add(menus, BorderLayout.CENTER);
		
		JButton botonAccion = new JButton("Buscar");
		add(botonAccion, BorderLayout.SOUTH);
		addWindowListener(new ControladorCargaMenus(this));
	}
	public JComboBox secciones,paises;
	private JTextArea resultados;

}
