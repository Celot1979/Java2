package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Rectangle rec1 = new Rectangle(400,400);
			rec1.setFill(Color.RED);
			
			Rectangle rec2 = new Rectangle(200,200);
			rec2.setFill(Color.BLUE);
			
			Rectangle rec3 = new Rectangle(100,100);
			rec3.setFill(Color.GREEN);

			StackPane miStack = new StackPane(rec1,rec2,rec3);
			miStack.setAlignment(Pos.TOP_CENTER);
			miStack.setPadding(new Insets(60));
			miStack.setMargin(rec3, new Insets(20));
			Scene LaScena = new Scene(miStack,800,600);
			primaryStage.setScene(LaScena);
			LaScena.setFill(Color.YELLOW);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private MenuBar menuBar;
}
