package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;




public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try { 
			
			
			Image img =new Image("file:/Volumes/NO NAME/JSP/FX_Clase_Shape_VI_Imagenes/src/img/plantilla proyecto.png");
			ImageView miImagen = new ImageView(img);
			miImagen.setFitWidth(600);
			miImagen.setPreserveRatio(true);
			Group g1 = new Group();
			g1.getChildren().add(miImagen);
			Scene scene = new Scene(g1);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
