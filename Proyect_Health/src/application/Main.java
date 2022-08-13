package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import emergente.*;
import elementos.Elementos;
import elementos.Interfaz;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Objeto Menú
			/*Elementos n = new  Elementos();
			Menu = n.menu();*/
			// Objeto Componentes
			Interfaz I = new Interfaz();
			
			//Layaout que contienen los componentes
			/*HBox Menu= new HBox( n.menu());
			Menu.setAlignment(Pos.CENTER);*/
			
			HBox Componentes= new HBox( I.imagen(primaryStage));
			Componentes.setAlignment(Pos.CENTER);
			
			
			//Composición final en vertical de todos los componentes
			VBox Composicion_Vertical= new VBox(Componentes);
			
			//BorderPane root = new BorderPane (I.imagen(),Menu,null,null,null);
			Scene scene = new Scene(Composicion_Vertical,1000,600);
			scene.getStylesheets().add(getClass().getResource("miEstilo.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			ventanaEmergenteAlerta nueva = new ventanaEmergenteAlerta();
			nueva.alerta("Ha ocurrido un error", "Revise el código");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	private Label Nueva;
	private MenuBar Menu;
	private Group g1;
	private static TextField nom, pass;
	private static Label Lnom, Lpass;
	private static Stage primaryStage;
	private static Button enviar,salir;
}
