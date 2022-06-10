package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Button boton1 = new Button("Boton 1");
			Button boton2 = new Button("Boton 2");
			Button boton3 = new Button("Boton 3");
			Button boton4 = new Button("Boton 4");
			Button boton5 = new Button("Boton 5");
			Button boton6 = new Button("Boton 6");
			
			HBox miPane = new HBox(10);
			miPane.getChildren().addAll(boton1,boton2,boton3,boton4,boton5,boton6);
			
			Scene miScece = new Scene(miPane,400,200);
			primaryStage.setScene(miScece);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
