package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;


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
			
			BorderPane miPane = new BorderPane(boton1,boton2, boton3, boton4, boton5);
			BorderPane.setAlignment(boton2,Pos.CENTER);
			BorderPane.setAlignment(boton3,Pos.CENTER);
			BorderPane.setAlignment(boton4,Pos.CENTER);
			BorderPane.setAlignment(boton5,Pos.CENTER);
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
