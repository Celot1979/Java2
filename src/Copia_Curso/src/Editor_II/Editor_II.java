package Editor_II;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.text.StyledEditorKit;


public class Editor_II {

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
		

		//----------------------------------------------------------------------------------------------------------------------------
		laminaMenu.add(miBarra);
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
	
	
	 JTextPane miArea ;
	 JMenu fuente, estilo,tamano;
	 Font letraExistente;
	}