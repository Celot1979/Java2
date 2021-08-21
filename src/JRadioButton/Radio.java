import javax.swing.JRadioButton;

public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRadioButton mimarco = new MarcoRadioButton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoRadioButton extends JFrame{
	public MarcoRadioButton() {
		setTitle("RadioButton");
		setBounds(600,300,600,400);
		add(new LaminaRadio());
		setVisible(true);
	}
}
class LaminaRadio extends JPanel{
	public LaminaRadio () {
		
		ButtonGroup Grupo1 = new ButtonGroup();//Crea el grupo para unir a los botones dentro de él.

		//Inicializamos los botnes.
		boton1 = new JRadioButton("Masculino");
		boton2 = new JRadioButton("Femenino");
		boton3 = new JRadioButton("Neutro");
		/*Después de todo el proceso de creación del grupo, botones, añadimos los botones al grupo
		 * también añadimos los botones a la lámina, crearemos los objetos para dejarlso a la escucha.
		 * */
		
		boton1.addActionListener(new ManejarRadioButton ());
		boton2.addActionListener(new ManejarRadioButton ());
		boton3.addActionListener(new ManejarRadioButton ());
		
		//Añadimos los botones al grupo
		Grupo1.add(boton1);
		Grupo1.add(boton2);
		Grupo1.add(boton3);
		//Añadimos los botones a la lámina
		add(boton1);
		add(boton2);
		add(boton3);
		
		
	}
	private class ManejarRadioButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// Existe 2 formas de darle un comportamiento al evento seleccionado
			// 1º
			/*if(boton1.isSelected())System.out.println("Has seleccionado masculino");
			if(boton2.isSelected())System.out.println("Has seleccionado femenino");
			if(boton3.isSelected())System.out.println("Has seleccionado neutro");*/
			
			// 2º
			if(e.getSource() == boton1)System.out.println("Has seleccionado Masculino. Segunda forma");
			if(e.getSource() == boton2)System.out.println("Has seleccionado Femenino. Segunda forma");
			if(e.getSource() == boton3)System.out.println("Has seleccionado Neutro. Segunda forma");
			
		}
		
	}
	private JRadioButton boton1,boton2,boton3;
	
}