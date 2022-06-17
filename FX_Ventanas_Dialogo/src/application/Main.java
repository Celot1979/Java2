package application;
import emergente.Dialogo;	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setResizable(true);
			primaryStage.setTitle("Pruebas");
			primaryStage.setFullScreen(true);
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			Button miBoton = new Button("Haz click!!!");
			miBoton.setOnAction(e ->  VDialogo());
			root.setCenter(miBoton);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void VDialogo() {
		 Dialogo.mostrar("Esta es nuestra ventana emergente", "Ojo cuidado");
	}
}