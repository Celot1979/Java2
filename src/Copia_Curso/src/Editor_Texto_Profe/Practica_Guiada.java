package Editor_Texto_Profe;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.StyledEditorKit.ItalicAction;




public class Practica_Guiada {

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
		//elemMenu.addActionListener(new GestionaEventos(rotulo, menu, tipoLetra,estilos,tamanos));
	}
	/*public class  GestionaEventos implements ActionListener {
		GestionaEventos(String rotulo, String menu, String tipoLetra,int estilos, int tamanos){
			this.tipoLetra = tipoLetra;
			this.rotulo= rotulo;
			this.estilos= estilos;
			this.tamanos= tamanos;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			letraExistente= miArea.getFont();
			if(rotulo == "Arial" ||rotulo == "Courier" ||rotulo == "Verdana") {
					estilos = letraExistente.getStyle();
					tamanos = letraExistente.getSize();
					}else if(rotulo =="Cursiva" || rotulo == "Negrita") {
						if(letraExistente.getStyle() == 1 || letraExistente.getStyle() == 2)estilos =3;
						tipoLetra =letraExistente.getFontName();
						tamanos = letraExistente.getSize();
						
					}else if (rotulo =="12" || rotulo =="14"|| rotulo =="16") {
						tipoLetra =letraExistente.getFontName();
						estilos = letraExistente.getStyle();
					}
			miArea.setFont(new Font(tipoLetra,estilos,tamanos));
			
		}
		String tipoLetra,rotulo;
		int estilos, tamanos;
	}*/
    JTextPane miArea ;
    JMenu fuente, estilo,tamano;
    Font letraExistente;
}
