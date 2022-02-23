package Editor_Propio;
 
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.ItalicAction;
import javax.swing.text.StyledEditorKit.BoldAction;
 
public class Editor_Propio_1 {
	public static void main(String[] args) {
    // TODO Auto-generated method stub
    frame_my m = new frame_my();
    m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
          }
 
}
class frame_my extends JFrame{
	public frame_my() {
		setTitle("Editor de textos -Propio-");
		setBounds(700,200,700,350);
		add(new Sheet());
		setVisible(true);}
}
class Sheet extends JPanel{
	public Sheet() {
		setLayout(new BorderLayout());//Creation of compartments
		JPanel upper  = new JPanel();//Upper compartment
		JPanel lower = new JPanel();//Lower compartment
		
		miareatexto= new JTextPane();//Creation of text area
		add(miareatexto,BorderLayout.CENTER);//Location in the JPanel
		
		
		//Menu creation
		JMenuBar myBar = new JMenuBar();
		//Creation of menu items
		JMenu source = new JMenu();
		source.setIcon(new ImageIcon("C://Users//zata_//OneDrive//Documentos//Nuevo_Java//curso//src//Editor_Propio//fuente.png"));
		JMenu style = new JMenu("Style");
		JMenu size = new JMenu("Size");
		//We add the elements to the bar
		
		myBar.add(source);
		myBar.add(style);
		myBar.add(size);
		//Sub-elements in the Source element
		JMenuItem arial = new JMenuItem("Arial Black");
		arial.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            miareatexto.setFont(new Font("Arial", Font.PLAIN,16));      
                   }
    });
   
		JMenuItem helvetica = new JMenuItem("Helvetica");
		helvetica.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            miareatexto.setFont(new Font("helvetica", Font.PLAIN,16));
                   }
    });
   
   
		JMenuItem times = new JMenuItem("Times New Roman");
		times.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            miareatexto.setFont(new Font("Times New Roman", Font.PLAIN,16));}
    });
  
    
    
		//Add the sub-elements
		source.add(arial);
		source.add(helvetica);
		source.add(times);
		//Sub-elements in the Style element
		bold_font = new JMenuItem("Bold font");
		bold_font.addActionListener(new StyledEditorKit.BoldAction());
  
		italics= new JMenuItem("Italics");
		//new StyledEditorKit.ItalicAction();
        italics.addActionListener(new StyledEditorKit.ItalicAction());
   
        JMenuItem subrayado = new JMenuItem("Subrayado");
        italics.addActionListener(new StyledEditorKit.UnderlineAction());
        // Add the sub-elements
        style.add(bold_font );
        style.add(italics);
        style.add(subrayado);
        //Sub-elements in the Size element
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
        //Add the sub-elements
        size.add(minima);
        size.add(siguiente1);
        size.add(siguiente2);
        size.add(siguiente3);
        size.add(siguiente4);
        upper.add(myBar);
        // Botones de alineación de texto
        izq_I = new ImageIcon("C://Users//zata_//OneDrive//Documentos//Nuevo_Java//curso//src//Editor_Propio//izquierda.png");
        izq = new JButton(izq_I);
        izq.addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
   
        centro = new ImageIcon("C://Users//zata_//OneDrive//Documentos//Nuevo_Java//curso//src//Editor_Propio//centro.png");
        cen= new JButton(centro);
        cen.addActionListener(new StyledEditorKit.AlignmentAction("Centro", 1));
   
        derecho=new ImageIcon("C://Users//zata_//OneDrive//Documentos//Nuevo_Java//curso//src//Editor_Propio//derecha.png");
        der=new JButton(derecho);
        der.addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
        upper.add(izq);
        upper.add(cen);
        upper.add(der);
        add(upper,BorderLayout.NORTH);//Location in the JPanel
}
 
 
         private JTextPane miareatexto ;
         private JTextArea area;
         private ItalicAction opcion;
         private JMenuItem bold_font ;
         private JMenuItem italics;
         private int cont;
         private JButton izq;
         private ImageIcon izq_I;
         private JButton cen;
         private ImageIcon centro;
         private JButton der;
         private ImageIcon derecho;
         private JSpinner Tipo;
}