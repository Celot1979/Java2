package Ejercicio_Componentes_II;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  marco m = new marco();
          m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}
class marco extends JFrame{
    public marco() {
                setTitle("Examen-eventos");
                setBounds(700,200,700,350);
                add(new Lamina());
                setVisible(true);
               
               
               
               
    }
}
class Lamina extends JPanel{
    public Lamina() {
                setLayout(new BorderLayout());
                // Label y JTextField
                Texto1 = new JLabel("Nombre");
                Campo1 = new JTextField(20);
                Campo1.addActionListener(new Manejo());
               
                Texto2=new JLabel("Apellidos");
                Campo2 = new JTextField(20);
                Campo2.addActionListener(new Manejo());
                JPanel Superior = new JPanel();
                Superior.add(Texto1);
                Superior.add(Campo1);
                Superior.add(Texto2);
                Superior.add(Campo2);
               
                //TextArea
                JPanel Centro = new JPanel();
                Area = new JTextArea(20,25);
                JScrollPane miScroll = new JScrollPane(Area);
                Area.setLineWrap(true);
                Centro.add(miScroll);
               
                //Botones
                Boton1 =new JButton("Boton1");
                Boton2= new JButton("Boton2");
                Boton1.addActionListener(new Manejo());
                Boton2.addActionListener(new Manejo());
               
                //JCheckBox
                Box1 = new JCheckBox("CheckBox1");
                Box2 = new JCheckBox("CheckBox2");
                Box1.addActionListener(new Manejo());
                Box2.addActionListener(new Manejo());
                JPanel Inferior = new JPanel();
                Inferior.add(Boton1);
                Inferior.add(Boton2);
                Inferior.add(Box1);
                Inferior.add(Box2);
               
                //JRadioButton
                ButtonGroup Grupo1 = new ButtonGroup();
                Radio1 = new JRadioButton("Radio1");
                Radio2 = new JRadioButton("Radio2");
                Radio1 .addActionListener(new Manejo());
                Radio2 .addActionListener(new Manejo());
                Grupo1.add(Radio1);
                Grupo1.add(Radio2);
                Inferior.add(Radio1);
                Inferior.add(Radio2);
               
               
                add(Superior, BorderLayout.NORTH);
                add(Centro,BorderLayout.CENTER);
                add(Inferior,BorderLayout.SOUTH);
               
               
               
    } private class Manejo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(cont == 0) {
				resultado = Campo1.getText() + "" + Campo2.getText()+ "\n";
			}
			
			if(e.getSource() == Boton1) {
				resultado += "Boton 1\n";
			}
			
			if(e.getSource() == Boton2) {
				resultado += "Boton 2\n";
			}
			
			if(Box1.isSelected()) {
				resultado += "JCheckBox1\n";
			}
			if(Box2.isSelected()) {
				resultado += "JCheckBox2\n";
			}
			
			if(Radio1.isSelected()) {
				resultado += "JRadio 1\n";
			}
			if(Radio2.isSelected()) {
				resultado += "JRadio 2\n";
			}
			
			
			
			
			Area.setText(resultado);
			cont++;
			System.out.println(cont);
		}
		
                
               
               
    }
    private JLabel Texto1, Texto2;
    private JTextField Campo1,Campo2;
    private JTextArea Area;
    private JButton Boton1,Boton2;
    private JCheckBox Box1,Box2;
    private JRadioButton Radio1,Radio2;
    private String resultado;
    private int cont = 0;
   
   
   
}