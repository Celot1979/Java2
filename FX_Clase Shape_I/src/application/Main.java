package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Line;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Group miGrupo = new Group();
			for (int i =0; i < 300; i+= 30) {
				Line Linea_1 = new Line(i,0,i,300);
				Linea_1.setStroke(Color.BLUE);
				
				Line Linea_2 = new Line(0,i,300,i);
				Linea_2.setStroke(Color.RED);
				miGrupo.getChildren().addAll(Linea_1,Linea_2);
			}
			
			
			Scene scene = new Scene(miGrupo,400,400);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
