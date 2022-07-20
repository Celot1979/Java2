package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/*
 * Veremos como se crean:
 *  a) Submenus.
 *  B) Menús customizados.
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			MenuBar menuBar = new MenuBar();
			Menu menuArchivo = new Menu("Archivo");
			Menu menuEdiccion = new Menu("Edicion");
			Menu menuOpciones = new Menu("Opciones");
			Menu menuOpciones2 = new Menu("Opciones2");
			//Se crea un Menú que pasará a ser el Submenú
			Menu menuOpciones3 = new Menu("Más Opciones");
			
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
			
			
			// ELEMENTOS DEL SUBMENÚS
			menuMasOPCION_1 = new RadioMenuItem("Mas 1");
			menuMasOPCION_2 = new RadioMenuItem("Mas 2");
			menuMasOPCION_3= new RadioMenuItem("Mas 3");
			menuMasOPCION_4= new RadioMenuItem("Mas 4");
			
			menuOpciones3.getItems().addAll(menuMasOPCION_1,menuMasOPCION_2,menuMasOPCION_3,menuMasOPCION_4);
			
			
			// CREACIÓN DE UN ELEMENTO DE CUSTOM MENU
			//En este caso vamosa crear un TextField comocomponente de un submenu
			
			TextField CuadroNombre = new TextField("");
			CuadroNombre.setPromptText("Nombre de usuario");
			CustomMenuItem menuItemNombre = new CustomMenuItem(CuadroNombre);
			menuItemNombre.setHideOnClick(false);
			menuOpciones3.getItems().add(menuItemNombre);
			
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
			/* Ahora vamos hacer que el menú pase a ser submenú
			 * Si nos fijamos en menuOpciones, el último es el menú que hemos creado 
			 *  para que sea submenú
			 */
			menuOpciones.getItems().addAll(menuItemOPCION_1,menuItemOPCION_2,menuItemOPCION_3,menuItemOPCION_4,menuOpciones3);
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
		
		if(item.getText().equals("Guardar como")) menuItemGuardar.setDisable(true);
		
		if(item.getText().equals("Copiar") || item.getText().equals("Pegar")) menuItemCortar.setDisable(false);
		
		if(e.getSource().getClass().getSimpleName().equals("RadioMenuItem")) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO" + " RadioMenuItem ");
		}else if(e.getSource().getClass().getSimpleName().equals("CheckMenuItem")) {
			System.out.println("Has pulsado el botón" + " " + item.getText() + " esta ACTIVADO" + " CheckMenuItem  ");
		}
		
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
	private RadioMenuItem menuItemOPCION_5,menuItemOPCION_6,menuItemOPCION_7,
	menuItemOPCION_8,menuMasOPCION_1,menuMasOPCION_2,menuMasOPCION_3,menuMasOPCION_4;
	private String ruta;
	private InputStream stream;
	private Image img;
	private ImageView iv;
}

