package ScrollPane;

import javax.swing.*;

public class ScrollPane {
    public static void main(String[] args) {
        MarcoTextoArea mimarco = new MarcoTextoArea();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoTextoArea extends JFrame{
    public MarcoTextoArea(){
        setTitle("JTextArea");
		setBounds(600,300,600,400);
		add(new LaminaTextoArea());
		setVisible(true);
    }
}
class LaminaTextoArea() extends JPanel{
    public LaminaTextoArea(){
        texto = new JTextArea(7,25);
        JScrollPane miScroll = new JScrollPane(texto);
        texto.setLineWrap(true);
        add(miScroll);

        boton = new JButton("Dale");
        boton.addActionListener(new ActionListener()){
            @Override
            public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
            String contenido = texto.getText();
			System.out.println(contenido);
			
			
		}
        }

    }
    JTextArea texto;
    JButton boton;
}