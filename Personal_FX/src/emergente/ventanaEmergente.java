package emergente;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
public class ventanaEmergente {
	public static void mostrar(String mensaje, String Titulo) {
		Stage miStage = new Stage();
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,150,50);
		miStage.initModality(Modality.APPLICATION_MODAL);
		// Tb sirve Modality.WINDWS_MODAL
		miStage.setTitle(Titulo);
		miStage.setMinWidth(250);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		
		
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
}
