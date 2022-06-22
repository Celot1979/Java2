package application;
	
import Acciones.Acciones;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			
			

			etq1 = new Label("Operador 1");
			etq1.setMinWidth(100);
			etq1.setAlignment(Pos.BASELINE_RIGHT);
			// TextField
			campo1 = new TextField();
			campo1.setMinWidth(200);
			campo1.setMaxWidth(200);
			campo1.setPromptText("Operador 1");
			
			
			// Label del Jugador

			etq2 = new Label("Operador 2");
			etq2.setMinWidth(100);
			etq2.setAlignment(Pos.BASELINE_RIGHT);
			// TextField
			campo2 = new TextField();
			campo2.setMinWidth(200);
			campo2.setMaxWidth(200);
			campo2.setPromptText("Operador 2");
			
			
			// Label del Jugador

			etq3 = new Label("Resultado");
			etq3.setMinWidth(100);
			etq3.setAlignment(Pos.BASELINE_RIGHT);
			// TextField
			campo3 = new TextField();
			campo3.setMinWidth(200);
			campo3.setMaxWidth(200);
			campo3.setPromptText("Resultado");
			//campo3.setDisable(true);
			
			
			// ComboBox
			ediccion = new ComboBox<Acciones>();
			primero = new Acciones("Sumar");
			segundo = new Acciones("Restar");
			tercero = new Acciones("Multiplicar");
			cuarto = new Acciones("Dividir");
			ediccion.getItems().addAll(primero,segundo,tercero,cuarto);
			
			// Explicación de esté método en el archivo - Explicación-
			ediccion.getSelectionModel().selectedItemProperty().addListener(( operacion,t,t1) -> {
				try {
					if(t1.getTipo_Operacion().equals("Sumar")) {
						campo3.setText(t1.sumar(campo1.getText(), campo2.getText()));
						System.out.println(operacion.getValue());
						
						
					}else if(t1.getTipo_Operacion().equals("Restar")) {
						campo3.setText(t1.restar(campo1.getText(), campo2.getText()));
						System.out.println(operacion.getValue());
					}else if(t1.getTipo_Operacion().equals("Multiplicar")) {
						campo3.setText(t1.multiplicar(campo1.getText(), campo2.getText()));
						System.out.println(operacion.getValue());
					
					}else if(t1.getTipo_Operacion().equals("Dividir")) {
						campo3.setText(t1.dividir(campo1.getText(), campo2.getText()));
						System.out.println(operacion.getValue());
					
					}
				}catch(Exception e) {
					System.out.print("Cagada");
				}
				
	           
	           
	            
	        });
			
			
			HBox pane_Operador_Uno= new HBox(20,etq1,campo1);
			pane_Operador_Uno.setPadding(new Insets(10));
			
			// Creación Pane Jugador
			HBox pane_Operador_Dos= new HBox(20,etq2,campo2);
			pane_Operador_Dos.setPadding(new Insets(10));
			
			// Creación Pane Puntos
			HBox pane_Resultado= new HBox(20,etq3,campo3);
			pane_Resultado.setPadding(new Insets(10));
			
			
			HBox Combo= new HBox(20,ediccion);
			Combo.setPadding(new Insets(10));
			
			// Creación del VBox
			
			VBox panelVertical = new VBox(10,pane_Operador_Uno,pane_Operador_Dos,pane_Resultado,Combo);
			
			// Creación de la escena
			
			Scene miScene = new Scene(panelVertical);
			miScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(miScene);
			
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void op() {
		
	}
	Label etq1,etq2,etq3;
	TextField campo1,campo2,campo3;
	ComboBox <Acciones > ediccion ;
	Acciones primero,segundo,tercero,cuarto;
	private int uno,dos;
}

