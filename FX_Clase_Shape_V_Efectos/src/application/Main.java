package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group nuevo = new Group();
			//Crear línea degradado
			LinearGradient deg1 = new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE.NO_CYCLE,new Stop(0.0,Color.YELLOW),new Stop(1.0,Color.GREEN));
			RadialGradient deg2 = new RadialGradient(0.5, 0.5, 0, 1, 1, true, CycleMethod.NO_CYCLE, new Stop(0.0,Color.YELLOW),new Stop(1.0,Color.GREEN));
			Text texto_trabajo = new Text(10,50," TEXTO DE PRUEBA");
			//Tamaño y tipo de fuente
			texto_trabajo.setFont(new Font("Arial",30));
			//Negrita
			texto_trabajo.setStyle("-fx-font-weight: bold");
			
			//Implementación de la línea de degradado
			texto_trabajo.setFill(deg2);
			
			//Si se quiere podemos darle un trazo y su grosor
			texto_trabajo.setStroke(Color.BLACK);
			texto_trabajo.setStrokeWidth(2);
			
			//Implementación de Efectos!!!
			DropShadow sombra = new DropShadow ();
			sombra.setRadius(5.0);
			sombra.setOffsetX(3.0);
			sombra.setOffsetY(10.0);
			sombra.setColor(Color.color(0.4, 0.5, 0.5));
			
			texto_trabajo.setEffect(sombra);
			
			nuevo.getChildren().add(texto_trabajo);
			Scene scene = new Scene(nuevo,400,400);
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
