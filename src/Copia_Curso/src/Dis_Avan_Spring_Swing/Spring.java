package Dis_Avan_Spring_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;




public class Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoSpring m = new marcoSpring();
	    m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public void constant(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

}class marcoSpring extends JFrame{
	public marcoSpring() {
		setTitle("Disposiciones  Avanzadas Spring");
        setBounds(300, 400, 1000, 350);
        add(new SpringLamina());
        setVisible(true);
	}
}

class SpringLamina extends JPanel{
	public SpringLamina() {
		JButton boton1 = new JButton("A");
		JButton boton2 = new JButton("B");
		JButton boton3 = new JButton("C");
		/*
		 *1º es decirle a nuestro contenedor que vamos a tener
		 * una disposición de tipo SpringLayaout
		 * 
		 */
		SpringLayout miLayaout  = new SpringLayout ();
		/*
		 * 2º.Ahora establecemos la disposición con el método setLayout()
		 */
		setLayout(miLayaout);
		add(boton1);
		add(boton2);
		add(boton3);
		
		/*
		 * Construimos el Spring-muelle. Lo más difcil es darle las medidas 
		 * correctas.
		 * 
		 * Spring miMuelle = Spring.constant(arg,arg1,arg2);
		 */
		Spring miMuelle = Spring.constant(arg,arg2,arg,3);
		miMuelle.constant(0,10,100);
		miLayaout.putConstraint(SpringLayout.WEST, boton1, miMuelle, SpringLayout.WEST, this)
	}
}