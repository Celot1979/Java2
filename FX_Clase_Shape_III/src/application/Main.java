package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Transparencias
			Group miGrupo = new Group();
			Rectangle r1 = new Rectangle(0,75,350,40);
			r1.setStroke(Color.BLACK);
			r1.setFill(Color.rgb(255, 0, 0, 1.0));
			r1.setStrokeWidth(3);
			//En las líneas diferentes son porque vamos aplicar un degradado
			LinearGradient deg1 = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE.NO_CYCLE,new Stop(0.0,Color.BLUE),new Stop(1.0,Color.RED));
			Rectangle r2 = new Rectangle(50,5,100,200);
			r2.setStroke(Color.BLACK);
			r2.setFill(deg1);
			r2.setStrokeWidth(3);
			
			Rectangle r3 = new Rectangle(200,5,100,200);
			r3.setStroke(Color.BLACK);
			r3.setFill(Color.rgb(200, 200, 200, 0.5));
			r3.setStrokeWidth(3);
			//Final de Transparencias
			
			
		
			
			
			miGrupo.getChildren().addAll(r1,r2,r3);
			Scene miScene = new Scene(miGrupo);
			primaryStage.setScene(miScene);
			primaryStage.setTitle("Figuras/Degradados");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
