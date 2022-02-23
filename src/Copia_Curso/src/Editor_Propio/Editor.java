package Editor_Propio;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;



public class Editor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame_my m = new frame_my();
		m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class frame_my extends JFrame{
	public frame_my() {
		setTitle("Editor de textos");
		setBounds(700,200,700,350);
		add(new Sheet());
		setVisible(true);	
	}
}
class Sheet extends JPanel{
	public Sheet() {
		setLayout(new BorderLayout());//Creation of compartments
		JPanel upper  = new JPanel();//Upper compartment
		JPanel lower = new JPanel();//Lower compartment
		miareatext = new JTextPane();//Creation of text area
		add(miareatext,BorderLayout.CENTER);//Location in the JPanel
		
		
		//Menu creation 
		JMenuBar myBar = new JMenuBar();
		
		//Creation of menu items
		
		JMenu source = new JMenu("Source");
		JMenu style = new JMenu("Style");
		JMenu size = new JMenu("Size");
		
		//We add the elements to the bar
		myBar.add(source);
		myBar.add(style);
		myBar.add(size);
		
		//Sub-elements in the Source element
		JMenuItem arial = new JMenuItem("Arial Black");
		JMenuItem helvetica = new JMenuItem("Helvetica");
		JMenuItem times = new JMenuItem("Times New Roman");
		
		//Add the sub-elements
		source.add(arial);
		source.add(helvetica);
		source.add(times);
		
		//Sub-elements in the Style element
		JMenuItem bold_font = new JMenuItem("Bold font");
		bold_font.addActionListener(new StyledEditorKit.BoldAction());
		JMenuItem italics= new JMenuItem("Italics");
		italics.addActionListener(new StyledEditorKit.ItalicAction());
		JMenuItem mixed = new JMenuItem("Mixed");
				
		// Add the sub-elements
		style.add(bold_font );
		style.add(italics);
		style.add(mixed);
		
		//Sub-elements in the Size element
		JMenuItem minima = new JMenuItem("10");
		JMenuItem siguiente1= new JMenuItem("12");
		JMenuItem siguiente2= new JMenuItem("14");
		JMenuItem siguiente3= new JMenuItem("16");
		JMenuItem siguiente4= new JMenuItem("20");
		
						
		//Add the sub-elements
		size.add(minima);
		size.add(siguiente1);
		size.add(siguiente2);
		size.add(siguiente3);
		size.add(siguiente4);
		
		upper.add(myBar);
		
		//Botones con imagenes
		
		//Alineación a la izq 
		iz =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/izq_m.png");
		izq = new JButton(iz);
		upper.add(izq);
		
		
		//Alineación al centro
		
		cen =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/centro_m.png");
		centro = new JButton(cen);
		upper.add(centro);
		
		//Alineación a la derecha
		der =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/derecha_m.png");
		derecha = new JButton(der);
		upper.add(derecha);
		
		//Botón de negrita
		
		bol =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/B_m.png");
		bold = new JButton(bol);
		upper.add(bold);
		
		//Botón de subrayado
		
		sub =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/sub_m.png");
	    subr= new JButton(sub);
		upper.add(subr);
		
		//Botón de subrayado
		cur =new  ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Editor_Propio/cur_m.png");
		cursiva= new JButton(cur);
		upper.add(cursiva);
		
;		add(upper,BorderLayout.NORTH);//Location in the JPanel
		
	}
	private JTextPane miareatext ;
	private JTextArea area;
	private JButton izq;
	private ImageIcon iz;
	private JButton centro;
	private ImageIcon cen;
	private ImageIcon der;
	private JButton derecha;
	private ImageIcon bol;
	private JButton bold;
	private ImageIcon sub;
	private JButton subr;
	private ImageIcon cur;
	private JButton cursiva;

}