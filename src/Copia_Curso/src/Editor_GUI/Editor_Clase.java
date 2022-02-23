package Editor_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontFamilyAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.StyledEditorKit.ItalicAction;



public class Editor_Clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
	     m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame {
    public marco() {
        setTitle("Edix Pro");
        setBounds(700, 200, 700, 350);
        add(new Lamina());
        setVisible(true);
    }
}
class Lamina extends JPanel{
	public Lamina() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		JMenuBar miBarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo =new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		
		Azul = new JButton("Azul");
		configColor("Azul", "Azul");
		Rojo = new JButton("Rojo");
		configColor("Rojo", "Rojo");
		Amarillo = new JButton("Amarillo");
		configColor("Amarillo", "Amarillo");
		//Menu de elementos de fuente
		configMenu("Arial", "fuente","Arial",1,1);
		configMenu("Courier", "fuente","Courier",1,1);
		configMenu("Verdana", "fuente","Verdana",1,1);
		
		//Menu de elementos de estilos
		configMenu("Negrita", "estilo","",Font.BOLD,1);
		configMenu("Cursiva", "estilo","",Font.ITALIC,1);
		
		//Menu de elementos de tamano
		configMenu("12", "tamano","",1,12);
		configMenu("14", "tamano","",1,14);
		configMenu("16", "tamano","",1,16);
		configMenu("18", "tamano","",1,18);
		
		//Menu de elementos de Color
		
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamano);
		miBarra.add(Azul);
		miBarra.add(Rojo);
		miBarra.add(Amarillo);
		
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	public void configMenu(String titulo,String menu,String tipoLetra, int estilos, int tamanos) {
		JMenuItem e = new JMenuItem(titulo);
		if(menu == "fuente") {
			fuente.add(e);
			e.addActionListener(new StyledEditorKit.FontFamilyAction(tipoLetra, tipoLetra));
		}else if(menu == "estilo") {
			estilo.add(e);
			if(estilos == Font.BOLD) e.addActionListener(new StyledEditorKit.BoldAction());
			if(estilos == Font.ITALIC)e.addActionListener(new StyledEditorKit.ItalicAction());
		}else if (menu == "tamano") {
			tamano.add(e);
			e.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", tamanos));
		}
		
	}
	public void configColor(String titulo, String menu){
		if(menu == "Azul") Azul.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));
		if(menu == "Rojo") Rojo.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.RED));
		if(menu == "Amarillo") Amarillo.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.YELLOW));
		
	}
	
	
	JMenu fuente, estilo, tamano;
	JTextPane miArea;
	String titulo, menu, tipoletra;
	int estilos,tamanos;
	JButton Azul,Rojo,Amarillo;
	
	
}
