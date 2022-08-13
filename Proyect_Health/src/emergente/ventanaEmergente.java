package emergente;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
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
		
		BorderPane miPane =  new BorderPane(miLabel,miBoton,null,null,null);
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
	
	public static void mostrar_negrita(String mensaje_negrita, String Titulo_negrita,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo_negrita);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		
		Font fuente = new Font("Monospaced", 20);
		Label miLabel = new Label();
		miLabel.setText( mensaje_negrita);
		miLabel.setFont(fuente);
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane, ancho,altura);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
	
	public static void mostrar_negrita(String Titulo,String mensaje_negrita, String Titulo_negrita,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo_negrita);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Font Titulo_Etiqueta=new Font("Monospaced", 26);
		Font fuente = new Font("Monospaced", 20);
		Label miLabel2 = new Label();
		miLabel2.setText( Titulo);
		miLabel2.setFont(Titulo_Etiqueta);
		Label miLabel = new Label();
		miLabel.setText( mensaje_negrita);
		miLabel.setFont(fuente);
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		miBoton.setOnAction(e -> miStage.close());
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane, ancho,altura);
		miPane.setTop( miLabel2);
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		miStage.setScene(miScene);
		miStage.showAndWait();
	}
	
	
	
}
	


