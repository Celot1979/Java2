package emergente;

import elementos.Elementos;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Ventana_Admin {
	public  void admin(int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		//miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
	
		MenuBar menuBar = new MenuBar();
		
		Menu menuArchivo = new Menu("Archivo");
		Menu menuEdiccion = new Menu("Edicion");
		
		menuBar.getMenus().addAll(menuArchivo, menuEdiccion);
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
		
		BorderPane miPane =  new BorderPane();
		
		miPane.setTop(menuBar);
		Scene miScene = new Scene(miPane,ancho,altura);
		try {
			miScene.getStylesheets().add(getClass().getResource("Estilo_admin.css").toExternalForm());
		} catch (NullPointerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("Falla por el tema del CSS");
		}
		miStage.setScene(miScene);
		
		miStage.show();
	}
	private  void respuesta(ActionEvent e) {
		MenuItem item = (MenuItem) e.getSource();
		System.out.println("Has pulsado el botón" + " " + item.getText());
		
		//if(item.getText().equals("Guardar como")) item.setText("Guardar");
		if(item.getText().equals("Guardar como")) menuItemGuardar.setDisable(true);
		
		if(item.getText().equals("Copiar") || item.getText().equals("Pegar")) menuItemCortar.setDisable(false);;
	}
	private  MenuItem menuItemNuevo, menuItemGuardar,menuItemCopiar,menuItemPegar,menuItemCortar,menuItemGuardar_Como;
	
}
