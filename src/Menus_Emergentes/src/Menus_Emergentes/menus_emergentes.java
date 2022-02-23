package Menus_Emergentes;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;



public class menus_emergentes {

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
        add(new EmergentePanel());
        setVisible(true);
    }
}
class EmergentePanel extends JPanel{
	public  EmergentePanel() {
		JPopupMenu emergente =new JPopupMenu();
		JMenuItem azul = new JMenuItem("Azul");
		azul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.BLUE);
			}
			
		});
		emergente.add(azul);
		
		
		JMenuItem rojo = new JMenuItem("Rojo");
		rojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.RED);
			}
			
		});
		emergente.add(rojo );
		
		
		JMenuItem amarillo = new JMenuItem("Amarillo");
		amarillo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(Color.yellow);
			}
			
		});
		emergente.add(amarillo);
		setComponentPopupMenu(emergente);
		
	}
}