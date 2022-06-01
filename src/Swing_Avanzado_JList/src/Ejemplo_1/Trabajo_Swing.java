package Ejemplo_1;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Trabajo_Swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Lista nuevo = new Marco_Lista();
		nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nuevo.setVisible(true);
	}

}
class Marco_Lista extends JFrame{
	
	public Marco_Lista(){
		setTitle("Lista de meses");
		setBounds(500,300,500,300);
		//Creamos un ArryList que contenga la info que queremos mostrar
		String meses [] = {"Enero", "Febrero", "Marzo", "Abril","Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre", "Diciembre"};
		/* 
		 * Con el ArrayList crearemos el constructor del JList. 
		 * Además queremos mostrar una barra de desplazamiento.Para hacer esto
		 * necesitamos decirle a la JList que muestre una cantidad de elementos (los que queramos nosotros)
		 */
		
		listaMeses= new JList<String>(meses);
		listaMeses.setVisibleRowCount(3);
		JScrollPane barraDes = new JScrollPane(listaMeses);
		/*
		 * Ahora, para que el JScrollPAne funcione tenemos que agregarselo a un JPanel.
		 * En este caso se la agregamos a laminalista.
		 */
		laminalista = new JPanel();
		laminalista.add(barraDes);
		/*
		 * En el último trozo de código estamos configurando e introducciendo:
		 * - JPanel.
		 * - JLabel
		 * - BorderLayout
		 */
		laminaLabel = new JPanel();
		rotuloMeses = new JLabel("Mes seleccionado");
		
		laminaLabel.add(rotuloMeses);
		/*
		 * En es te punto pondremos a la escuchar la JList para poder manipular
		 * y que realice la acción.
		 * 
		 */
		listaMeses.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				//Se crea una lista para almacenar lo seleccionado en el JList
				List<String> elementos = listaMeses.getSelectedValuesList();
				
				// Ahora tenemos que crear un objeto de tipo StringBuilding para almacenar uno o varios objetos
				StringBuilder textosSeleccionado = new StringBuilder("Mes seleccionado: ");
				
				// PAra saber lo que ha seleccionado el usuario realizaremos un bucle for each
				for(String elemento : elementos) {
					String mes = elemento;
					textosSeleccionado.append(mes);
					textosSeleccionado.append(" ");
				}
				
				// Ahora agregaremos lo que va saliendo del bucle al JLabel 
				// Que será el que imprima en pantalla lo que el usuario a escogido
				rotuloMeses.setText(textosSeleccionado.toString());
			}
			
		});
		add(laminalista, BorderLayout.NORTH);
		add(laminaLabel, BorderLayout.SOUTH);
	}
	// En la propiedades crearemos un JList con un objeto generico
	// Crearemos los JPanel que sean accesibles desde cualquier punto del programa
	private JList<String>listaMeses;
    private JPanel laminalista, laminaLabel;	
    private JLabel rotuloMeses;
    
}