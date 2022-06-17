package emergente;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ventanaEmergente {
	public static void mostrar(String mensaje, String Titulo,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,ancho,altura);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
	//Método sobre cargado para tener una ventana Standar,
	// Así no tenemos que pasar en el contructor una medida.
	public static void mostrar(String mensaje, String Titulo) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,800,600);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
}
