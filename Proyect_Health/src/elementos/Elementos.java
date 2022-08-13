package elementos;

import javafx.event.ActionEvent;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Elementos {
	public static MenuBar menu() {
		MenuBar m = new MenuBar();
		Menu menuArchivo = new Menu("Administración");
		Menu menuEdiccion = new Menu("Edicion");
		
		m.getMenus().addAll(menuArchivo, menuEdiccion);
		
		
		menuItemNuevo = new MenuItem("Nuevo");
	    menuItemGuardar = new MenuItem("Guardar");
		menuItemGuardar_Como = new MenuItem("Guardar Como");
		
		
		menuItemCopiar = new MenuItem("Copiar");
		menuItemPegar = new MenuItem("Pegar");
		menuItemCortar = new MenuItem("Cortar");
		menuItemCortar.setDisable(true);
		
		menuItemNuevo.setOnAction(e -> respuesta(e));
		menuItemGuardar.setOnAction(e -> respuesta(e));
		menuItemGuardar_Como.setOnAction(e -> respuesta(e));
		menuItemCopiar.setOnAction(e -> respuesta(e));
		menuItemPegar.setOnAction(e -> respuesta(e));
		menuItemCortar.setOnAction(e -> respuesta(e));
		
		
		menuArchivo.getItems().addAll(menuItemNuevo,menuItemGuardar,menuItemGuardar_Como);
		menuEdiccion.getItems().addAll(menuItemCopiar,menuItemPegar,menuItemCortar);
		return m;
		
	}
	private static void respuesta(ActionEvent e) {
		MenuItem item = (MenuItem) e.getSource();
		
		//System.out.println("Has pulsado el botón" + " " + item.getText());
		
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
		if(item.getText().equals("Guardar como")) {
			System.out.println("Has pulsado el botón" + " " + item.getText());
			//menuItemGuardar.setDisable(true);
		}
		
		if(item.getText().equals("Copiar") || item.getText().equals("Pegar")) menuItemCortar.setDisable(false);
		
		
		/*
		 * Como hemos visto, en una misma visual gráfica no podremos tener 
		 * ambos compoenentes ( Check y RAdio).
		 * 
		 * Para eso tenemos que cambiar las instrucciones del método por está.
		 * 
		 */
		if(e.getSource().getClass().getSimpleName().equals("RadioMenuItem")) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO" + " RadioMenuItem ");
		}else if(e.getSource().getClass().getSimpleName().equals("CheckMenuItem")) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO" + " CheckMenuItem  ");
		}
		/*
		 * La Explicación:
		 * Si e.getSourde es de la clase X - para que nos nso devuelv todo el nombre
		 * 
		 * ejemplo de java.FX.Control.RadioMenuItem- se emplea el método
		 * 
		 * .getSimpleName, que sólo nos envía RadioMenuItem.
		 * 
		 * Así podemos comparar con el equals
		 */
	}
	private static MenuItem menuItemGuardar, menuItemCortar,menuItemCopiar,menuItemNuevo,menuItemGuardar_Como,menuItemPegar;
	private static Stage primaryStage;
	

}
