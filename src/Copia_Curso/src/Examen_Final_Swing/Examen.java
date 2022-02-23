package Examen_Final_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit;



public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
	    m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame {
    public marco() {
        setTitle("Examen");
        setBounds(700, 200, 700, 350);
        add(new EmergentePanel());
        setVisible(true);
    }
}
class EmergentePanel extends JPanel{
	public  EmergentePanel() {
		setLayout(new BorderLayout());
		JPanel laminaMenu = new JPanel();
		//------------------------- CONSTRUCIÓN DE BARRA MENÚ ------------------------------------------------------------------------
		JMenuBar miBarra = new JMenuBar();
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano= new JMenu("Tamaño");
		// Creación del menu de Fuente
		configuraMenu("Arial", "fuente", "Arial",1,12);
		configuraMenu("Courier", "fuente", "Courier",1,12);
		configuraMenu("Verdana", "fuente", "Verdana",1,12);
		
		// Creación  del menu de Fuente
		configuraMenu("Negrita", "estilo", "",Font.BOLD,12);
		configuraMenu("Cursiva", "estilo", "",Font.ITALIC,12);
		
		// Creación  del menu de Tamaño
		configuraMenu("12", "tamano", "",1,12);
		configuraMenu("14", "tamano", "",1,14);
		configuraMenu("16", "tamano", "",1,16);
		
		
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamano);
		
		
		// Barra de herramientas
		herramienta = new JToolBar(JToolBar.VERTICAL);
	    //Elementos de estilo en la barra de herramientas
	    herramienta( new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/Bold.gif"), "bold", Font.BOLD);
	    herramienta( new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/cursiva.gif"), "italic", Font.ITALIC);
	    
	    //Elementos de colores en la barra de herramientas
	    herramienta( new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaAzul.gif"), "azul", 1);
	    herramienta( new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaRoja.gif"), "roja", 1);
	    herramienta( new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaAmarilla.gif"), "amarilla", 1);
	    
	    //Elementos de alineacion en la barra de herramientas
	    alineacion(new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/izq.png"), "izq",0);
	    alineacion(new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/centro.png"), "cen",1);
	    alineacion(new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/Unknown.png"), "der",2);
		//----------------------------------------------------------------------------------------------------------------------------
		laminaMenu.add(miBarra);
		add(herramienta, BorderLayout.WEST);
		add(laminaMenu, BorderLayout.NORTH);
		miArea = new JTextPane();
		add(miArea, BorderLayout.CENTER);
	}
	public void configuraMenu(String rotulo, String menu, String tipoLetra,int estilos, int tamanos) {
		JMenuItem elemMenu = new JMenuItem(rotulo);
		if(menu == "fuente") {
			fuente.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("Cambio", tipoLetra));
			}
		else if(menu == "estilo") {
			estilo.add(elemMenu);
			if(estilos == Font.BOLD) elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			else if(estilos == Font.ITALIC)elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
		}
		else if(menu == "tamano") {
			tamano.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("Tamano", tamanos));
		}
		
	}
	
	
	private void herramienta(Icon icono,String menu, int estilos) {
		JButton b = new JButton(icono);
		if(menu == "bold") {
			herramienta.add(b);
			if(estilos == Font.BOLD)b.addActionListener(new StyledEditorKit.BoldAction());
			
		}else if(menu == "italic") {
			herramienta.add(b);
			if(estilos == Font.ITALIC)b.addActionListener(new StyledEditorKit.ItalicAction());
		}else if(menu == "azul") {
			herramienta.add(b);
		    b.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));

		}else if(menu == "roja") {
			herramienta.add(b);
			b.addActionListener(new StyledEditorKit.ForegroundAction("roja", Color.RED));
		}else if(menu== "amarilla") {
			herramienta.add(b);
			b.addActionListener(new StyledEditorKit.ForegroundAction("amarilla", Color.yellow));
		}
	}
	
	private void alineacion(Icon icono, String menu, int lado) {
		JButton a = new JButton(icono);
		if(menu == "izq") {
			herramienta.add(a);
			a.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", lado));
		}else if(menu == "cen") {
			herramienta.add(a);
			a.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", lado));
		}else {
			herramienta.add(a);
			a.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", lado));
		}
	}
	
	
	
	
	 JTextPane miArea ;
	 JMenu fuente, estilo,tamano;
	 Font letraExistente;
	 JToolBar herramienta;
	 ImageIcon bold;
	 JButton b;
	}

