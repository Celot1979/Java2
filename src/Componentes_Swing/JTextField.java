package Componentes_Swing;

import javax.swing.*;

public class JTextField {
    public JTextField(int i) {
    }

    public JTextField() {
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCuadroTexto mimarco = new MarcoCuadroTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

    public Object getText() {
        return null;
    }
}

class MarcoCuadroTexto extends JFrame{
	public MarcoCuadroTexto() {
		setBounds(600,300,600,400);
		add(new LaminaCuadroTexto());
		setVisible(true);
	}
}

class LaminaCuadroTexto extends JPanel{
	public LaminaCuadroTexto () {
		cuadroTexto = new JTextField(20);
		add(cuadroTexto);
		
		JButton boton = new JButton("Obtener texto");
		boton.addActionListener(new obtenerTexto());
		add(boton);
		
	}
	
	private class obtenerTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(cuadroTexto.getText());
			
		}
		
	}
	
	JTextField cuadroTexto;
}