package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			MenuBar menuBar = new MenuBar();
			Menu menuArchivo = new Menu("Archivo");
			Menu menuEdiccion = new Menu("Edicion");
			Menu menuOpciones = new Menu("Opciones");
			Menu menuOpciones2 = new Menu("Opciones2");
			
			menuBar.getMenus().addAll(menuArchivo, menuEdiccion,menuOpciones,menuOpciones2);
			
			// ITEMS
			menuItemNuevo = new MenuItem("Nuevo");
			menuItemGuardar = new MenuItem("Guardar");
			menuItemGuardar_Como = new MenuItem("Guardar Como");
			
			
			menuItemCopiar = new MenuItem("Copiar");
			menuItemPegar = new MenuItem("Pegar");
			menuItemCortar = new MenuItem("Cortar");
			menuItemCortar.setDisable(true);
			
			// ITEMS DE CHECKMENUITEM O RADIOMENUITEMS
			menuItemOPCION_1 = new CheckMenuItem("Opcion 1");
			menuItemOPCION_2 = new CheckMenuItem("Opcion 2");
			menuItemOPCION_3 = new CheckMenuItem("Opcion 3");
			menuItemOPCION_4 = new CheckMenuItem("Opcion 4");
			
			ToggleGroup toggleGroup = new ToggleGroup();
			menuItemOPCION_5 = new RadioMenuItem("Opcion 5");
			menuItemOPCION_6 = new RadioMenuItem("Opcion 6");
			menuItemOPCION_7= new RadioMenuItem("Opcion 7");
			menuItemOPCION_8= new RadioMenuItem("Opcion 8");
			
			menuItemOPCION_5.setToggleGroup(toggleGroup);
			menuItemOPCION_6.setToggleGroup(toggleGroup);
			menuItemOPCION_7.setToggleGroup(toggleGroup);
			menuItemOPCION_8.setToggleGroup(toggleGroup);
			// Acciones de los ITEMS
			menuItemNuevo.setOnAction(e -> respuesta(e));
			menuItemGuardar.setOnAction(e -> respuesta(e));
			menuItemGuardar_Como.setOnAction(e -> respuesta(e));
			menuItemCopiar.setOnAction(e -> respuesta(e));
			menuItemPegar.setOnAction(e -> respuesta(e));
			menuItemCortar.setOnAction(e -> respuesta(e));
			
			menuItemOPCION_1.setOnAction(e -> respuesta(e));
			menuItemOPCION_2.setOnAction(e -> respuesta(e));
			menuItemOPCION_3.setOnAction(e -> respuesta(e));
			menuItemOPCION_4.setOnAction(e -> respuesta(e)); 
			
			menuItemOPCION_5.setOnAction(e -> respuesta(e));
			menuItemOPCION_6.setOnAction(e -> respuesta(e));
			menuItemOPCION_7.setOnAction(e -> respuesta(e));
			menuItemOPCION_8.setOnAction(e -> respuesta(e));
			
			//IMPLEMENTAR LOS ITEMS  A LOS MENUS
			menuArchivo.getItems().addAll(menuItemNuevo,menuItemGuardar,menuItemGuardar_Como);
			menuEdiccion.getItems().addAll(menuItemCopiar,menuItemPegar,menuItemCortar);
			menuOpciones.getItems().addAll(menuItemOPCION_1,menuItemOPCION_2,menuItemOPCION_3,menuItemOPCION_4);
			menuOpciones2.getItems().addAll(menuItemOPCION_5,menuItemOPCION_6,menuItemOPCION_7,menuItemOPCION_8);
			// COLOCACIÓN DE LOS COMPONENTES
			BorderPane root = new BorderPane (null,menuBar,null,null,null);
			Scene scene = new Scene(root,900,600);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private void respuesta(ActionEvent e) {
		MenuItem item = (MenuItem) e.getSource();
		
		//System.out.println("Has pulsado el botón" + " " + item.getText());
		
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
		if(item.getText().equals("Guardar como")) menuItemGuardar.setDisable(true);
		
		if(item.getText().equals("Copiar") || item.getText().equals("Pegar")) menuItemCortar.setDisable(false);
		
		/*if(((CheckMenuItem) item).isSelected()== true) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO");
		}else if(((CheckMenuItem) item).isSelected()== false) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta DESACTIVADO");
		}*/
		/*if(((RadioMenuItem ) item).isSelected()== true) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO");
		}else if(((RadioMenuItem ) item).isSelected()== false) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta DESACTIVADO");
		}*/
		
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
	
	private ImageView imagen(String ruta) throws FileNotFoundException {
		stream = new FileInputStream(ruta);
		img = new Image(stream);

		iv = new ImageView();
		iv.setImage(img);
		iv.setFitWidth(20);
		iv.setFitHeight(20);
		
		return iv;
		
	}
	
	private MenuItem menuItemNuevo, menuItemGuardar,menuItemCopiar,menuItemPegar
	,menuItemCortar,menuItemGuardar_Como;
	private CheckMenuItem menuItemOPCION_1,menuItemOPCION_2,menuItemOPCION_3,menuItemOPCION_4;
	private RadioMenuItem menuItemOPCION_5,menuItemOPCION_6,menuItemOPCION_7,menuItemOPCION_8;
	private String ruta;
	private InputStream stream;
	private Image img;
	private ImageView iv;
}
