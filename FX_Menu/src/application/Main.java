package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			MenuBar menuBar = new MenuBar();
			Menu menuArchivo = new Menu("Archivo");
			Menu menuEdiccion = new Menu("Edicion");
			
			menuBar.getMenus().addAll(menuArchivo, menuEdiccion);
			
			
			menuItemNuevo = new MenuItem("Nuevo", imagen("src/img/nuevo.png"));
			menuItemGuardar = new MenuItem("Guardar",imagen("src/img/guardar.png"));
			menuItemGuardar_Como = new MenuItem("Guardar Como");
			
			
			menuItemCopiar = new MenuItem("Copiar",imagen("src/img/ver.png"));
			menuItemPegar = new MenuItem("Pegar",imagen("src/img/modi.png"));
			menuItemCortar = new MenuItem("Cortar",imagen("src/img/insertar.jpg"));
			menuItemCortar.setDisable(true);
			
			menuItemNuevo.setOnAction(e -> respuesta(e));
			menuItemGuardar.setOnAction(e -> respuesta(e));
			menuItemGuardar_Como.setOnAction(e -> respuesta(e));
			menuItemCopiar.setOnAction(e -> respuesta(e));
			menuItemPegar.setOnAction(e -> respuesta(e));
			menuItemCortar.setOnAction(e -> respuesta(e));
			
			
			menuArchivo.getItems().addAll(menuItemNuevo,menuItemGuardar,menuItemGuardar_Como);
			menuEdiccion.getItems().addAll(menuItemCopiar,menuItemPegar,menuItemCortar);
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
		System.out.println("Has pulsado el botón" + " " + item.getText());
		
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
		if(item.getText().equals("Guardar como")) menuItemGuardar.setDisable(true);
		
		if(item.getText().equals("Copiar") || item.getText().equals("Pegar")) menuItemCortar.setDisable(false);;
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
	
	private MenuItem menuItemNuevo, menuItemGuardar,menuItemCopiar,menuItemPegar,menuItemCortar,menuItemGuardar_Como;
	private String ruta;
	private InputStream stream;
	private Image img;
	private ImageView iv;
}
