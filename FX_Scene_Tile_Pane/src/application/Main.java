package application;
	
import javafx.scene.shape.Rectangle;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*Rectangle R1 = new Rectangle(200,200);
			R1.setFill(Color.BLUE);
			Label men1 = new Label ("Cuadrado 1");
			men1.setTextFill(Color.WHITE);
			StackPane cua1 = new StackPane(R1,men1);
			
			
			Rectangle R2 = new Rectangle(200,200);
			R2.setFill(Color.RED);
			
			Rectangle R3 = new Rectangle(200,200);
			R3.setFill(Color.YELLOW);*/
			
			TilePane miStack = new TilePane();

			/*Separación de los componentes en una escena
			miStack.setHgap(20);
			miStack.setAlignment(Pos.TOP_CENTER);
			miStack.setPadding(new Insets(60));*/

			//Separación de los componentes en vertical una escena
		    miStack.setVgap(20);
		    //miStack.setAlignment(Pos.TOP_CENTER);
			miStack.setPadding(new Insets(60));
			
			for(int i =0; i< 13;i ++) {
				Rectangle R = new Rectangle(100,100);
				R.setFill(Color.rgb(125,240,215));
				Label men1 = new Label ("Cuadrado " + i);
				men1.setTextFill(Color.WHITE);
				StackPane cua1 = new StackPane(R,men1);
				miStack.getChildren().add(cua1);
			}
			Scene LaScena = new Scene(miStack,800,600);
			primaryStage.setScene(LaScena);
			//LaScena.setFill(Color.YELLOW);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
