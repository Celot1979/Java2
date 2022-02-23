package Editor_Pro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.StyledEditorKit;



public class Edix_Pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marco m = new marco();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class marco extends JFrame{
	public marco() {
		setTitle("Edix Pro");
		setBounds(700,200,700,350);
		add(new Lamina());
		setVisible(true);	
	}
}
class Lamina extends JPanel{
	public Lamina() {
		
		// Creación del setLayaout
		setLayout(new BorderLayout());
		JPanel superior  = new JPanel();//Lamina superior
		JPanel inferior= new JPanel();//Lamina inferiors
		//-----------------------------------------------------------------------
		//-----------------------------------------------------------------------
		//---------------------------------- MENU -------------------------------
		//-----------------------------------------------------------------------
		//-----------------------------------------------------------------------
		//TextPane ( recepción del contenido del usuario)
		Area_Texto= new JTextPane();//Creation of text area
		add(Area_Texto,BorderLayout.CENTER);//Location in the JPanel
		
		
		// Creación de la Barra -  agregar al frame
		JMenuBar myBar = new JMenuBar();
        superior.add(myBar);
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	GUARDAR ARCHIVO ---------------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------

	    gua= new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/guardar_m.png");
        guardar = new JButton(gua);
        myBar.add(guardar);
        
        JMenu Tipo = new JMenu("Aa");
        myBar.add(Tipo);
        //-----------------------------------------------------------------------
        //Creación de los elementos de sub menú
        //1º
        arial = new JMenuItem("Arial");
        arial.addActionListener(new elegir());
        //2º
        helvetica =new JMenuItem("Helvetica");
        helvetica.addActionListener(new elegir());
        
        //3º
        georgia = new JMenuItem("Georgia");
        georgia.addActionListener(new elegir());
        
        //4º
        gill_sans = new JMenuItem("Gill Sans");
        gill_sans.addActionListener(new elegir());
        
        //5º
        calibri = new JMenuItem("Calibri");
        calibri.addActionListener(new elegir());
        
        //6º
        times = new JMenuItem("Times New Roman");
        times.addActionListener(new elegir());
        //-----------------------------------------------------------------------
        Tipo.add(arial);
        Tipo.add(helvetica);
        Tipo.add(georgia);
        Tipo.add(gill_sans);
        Tipo.add(times);
        
        
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	Tipos de Textos--------------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        Estilo_Texto = new JMenu("Estilo");
        myBar.add(Estilo_Texto);
        
        JMenuItem titulo = new JMenuItem("TITULO");
        titulo.addActionListener(new StyledEditorKit.AlignmentAction("Centro", 1));
        
        titulo.addActionListener(new StyledEditorKit.FontSizeAction("42", 42));
       
        Estilo_Texto.add(titulo);
        
        JMenuItem subtitulo = new JMenuItem("SUBTITULO");
        subtitulo.addActionListener(new StyledEditorKit.FontSizeAction("16", 16));
        subtitulo.addActionListener(new StyledEditorKit.AlignmentAction("Centro", 1));
        Estilo_Texto.add(subtitulo);
        
        JMenuItem parrafo= new JMenuItem("PARRAFO");
        parrafo.addActionListener(new StyledEditorKit.FontSizeAction("12", 12));
        parrafo.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
        Estilo_Texto.add(parrafo);
        
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	BOTONES ESTILO DE TEXTO --------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        // Negrita
        bold = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/B_m.png");
        negrita = new JButton(bold);
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        myBar.add(negrita);
        // Cursiva
        cur = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/cur_m.png");
        cursiva = new JButton(cur);
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        myBar.add(cursiva);
        // Subrayar
        sub = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/sub_m.png");
        subrayar= new JButton(sub);
        subrayar.addActionListener(new StyledEditorKit.UnderlineAction());
        myBar.add(subrayar);
        
        
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	TAMAÑO DE TEXTO ---------------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        
        JMenu Tamano = new JMenu("Tamaño");
        myBar.add(Tamano);
        JMenuItem minima = new JMenuItem("10");
        minima.addActionListener(new StyledEditorKit.FontSizeAction("10", 10));
        JMenuItem siguiente1= new JMenuItem("12");
        siguiente1.addActionListener(new StyledEditorKit.FontSizeAction("12", 12));
        JMenuItem siguiente2= new JMenuItem("14");
        siguiente2.addActionListener(new StyledEditorKit.FontSizeAction("14", 14));
        JMenuItem siguiente3= new JMenuItem("16");
        siguiente3.addActionListener(new StyledEditorKit.FontSizeAction("16", 16));
        JMenuItem siguiente4= new JMenuItem("20");
        siguiente4.addActionListener(new StyledEditorKit.FontSizeAction("20", 20));
        JMenuItem siguiente5= new JMenuItem("36");
        siguiente5.addActionListener(new StyledEditorKit.FontSizeAction("36", 36));
        JMenuItem siguiente6= new JMenuItem("42");
        siguiente6.addActionListener(new StyledEditorKit.FontSizeAction("42", 42));
        JMenuItem siguiente7= new JMenuItem("64");
        siguiente7.addActionListener(new StyledEditorKit.FontSizeAction("64", 64));
        JMenuItem siguiente8= new JMenuItem("72");
        siguiente8.addActionListener(new StyledEditorKit.FontSizeAction("72", 72));
        //Add the sub-elements
        Tamano.add(minima);
        Tamano.add(siguiente1);
        Tamano.add(siguiente2);
        Tamano.add(siguiente3);
        Tamano.add(siguiente4);
        Tamano.add(siguiente5);
        Tamano.add(siguiente6);
        Tamano.add(siguiente7);
        Tamano.add(siguiente8);
        
        
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	ALINEACIONES DE TEXTO----------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        
        
        izq_I = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/izq_m.png");
        izq = new JButton(izq_I);
        izq.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
   
        centro = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/centro_m.png");
        cen= new JButton(centro);
        cen.addActionListener(new StyledEditorKit.AlignmentAction("Centro", 1));
   
        derecho=new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/derecha_m.png");
        der=new JButton(derecho);
        der.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        myBar.add(izq);
        myBar.add(cen);
        myBar.add(der);
        
        
        
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	COLORES DE TEXTO--------------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        co = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/color_m.png");
        color = new JButton(co);
        color.addActionListener(new ActionListener() {
            
			@Override
			/*
			 * Al presionar el botón de Color de tipo, abre una nueva con los posibles colores.
			 */
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Impresion");
				ventana_color();
				
			}
        	
        });
        myBar.add(color);

        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        //-------------------- 	AÑADIR A LA LAMINA --------------------------
        //-----------------------------------------------------------------------
        //-----------------------------------------------------------------------
        // Después de auí no puede existir nada en el constructor
		add(superior, BorderLayout.NORTH);
	} //-----------------------------------------------------------------------
	  //-----------------------------------------------------------------------
	  // Clase que se pone a la escucha para ver que tipografia desea el usuario
	private class elegir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == arial) Area_Texto.setFont(new Font("Arial", Font.PLAIN,14));
			if(e.getSource() == helvetica) Area_Texto.setFont(new Font("Helvetica", Font.PLAIN,14));
			if(e.getSource() == georgia) Area_Texto.setFont(new Font("Georgia", Font.PLAIN,14));
			if(e.getSource() == gill_sans) Area_Texto.setFont(new Font("Gill Sans", Font.PLAIN,14));
			if(e.getSource() == calibri) Area_Texto.setFont(new Font("Calibri", Font.PLAIN,14));
			if(e.getSource() == times) Area_Texto.setFont(new Font("Times New Roman", Font.PLAIN,14));
			
		}
		
	}
	
	
	// Método que devuelve un JFrame con los colores que queramos para la tipograf
	private void ventana_color() {
		frameDos = new JFrame();
		frameDos.setTitle("Colores");
		frameDos.setBounds(1200,250, 450, 90);
		JPanel ventana = new JPanel();
		ventana.setLayout(new BorderLayout());
		JPanel superior_Dos = new JPanel();
		

		 // Cambiar color AZUL a la tipografia
		 azu = new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/azul_m.png");
	     Azul = new JButton(azu);
	     //Azul.setPreferredSize(new Dimension(30, 30));
	     Azul.addActionListener(new StyledEditorKit.ForegroundAction("Azul", Color.BLUE));
	     superior_Dos.add(Azul);
	     Azul.addActionListener(new sin_ventana());//Sentencia abreviada de la clase para cerrar ventana después de usar el color
	     
	     
	     // Cambiar color ROJO a la  tipografia
	     rojos =new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/rojo_m.png");
	     Rojo = new JButton(rojos);
	     //Rojo.setPreferredSize(new Dimension(30, 30));
	     Rojo.addActionListener(new StyledEditorKit.ForegroundAction("Rojo", Color.RED));
	     superior_Dos.add(Rojo);
	     Rojo.addActionListener(new sin_ventana());//Sentencia abreviada de la clase para cerrar ventana después de usar el color
	     
	     // Cambiar color Negro a la  tipografia
	     neg =new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/negro_m.png");
	     Negro = new JButton(neg);
	     Negro.addActionListener(new StyledEditorKit.ForegroundAction("Negro", Color.black));
	     superior_Dos.add(Negro);
	     Negro.addActionListener(new sin_ventana());//Sentencia abreviada de la clase para cerrar ventana después de usar el color
	     
		 ventana.add(superior_Dos);
		 frameDos.add(ventana);
		 frameDos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     frameDos.setVisible(true);
		
	}
	private class sin_ventana implements ActionListener{

		@Override
		//Clase privada para cerrar las ventanas de JFrame
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			frameDos.setVisible(false);
			frameDos.dispose();
			
		}
		
	}
    // Propiedades de guardar el archivo
	private ImageIcon gua;
	private JButton guardar;
	//Propiedad de JTextPane
	private JTextPane Area_Texto;
	//Propiedad de JMenu Tipo
	private JMenuItem arial;
	private JMenuItem helvetica;
	private JMenuItem  georgia;
	private JMenuItem gill_sans;
	private JMenuItem calibri;
	private JMenuItem times;
	
	//propiedades de JButton e imagenes
	private ImageIcon bold;
	private JButton negrita;
	private ImageIcon cur;
	private JButton cursiva;
	private ImageIcon sub;
	private JButton subrayar;
	
	//propiedades de Botones de alineaciones
	private ImageIcon izq_I;
	private JButton izq;
	private ImageIcon centro;
	private JButton cen;
	private ImageIcon derecho;
	private JButton der;
	
	// Propiedades para el Titulo
	private ImageIcon co;
	private JButton color;
	//Propiedades para el cambio de color
	private JFrame frameDos;
	private ImageIcon azu;
	private JButton Azul;
	private ImageIcon rojos;
	private JButton Rojo;
	private ImageIcon neg;
	private JButton Negro;
	//Tipos de texto
	private ImageIcon ti;
	private JButton titulo;
	private JMenu Estilo_Texto;
	
}