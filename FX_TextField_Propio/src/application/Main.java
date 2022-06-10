package application;
	
import Accion.Accion;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label lbEquipo = new Label("Nombre del Equipo");
			lbEquipo.setMinWidth(100);
			lbEquipo.setAlignment(Pos.BOTTOM_LEFT);
			// TextField
			txtEquipo = new TextField();
			txtEquipo.setMinWidth(200);
			txtEquipo.setMaxWidth(200);
			txtEquipo.setPromptText("Nombre del equipo");
			
			
			// Label del Jugador

			Label lbJugador = new Label("Nombre del Jugador");
			lbJugador.setMinWidth(100);
			lbJugador.setAlignment(Pos.BASELINE_RIGHT);
			// TextField
			txtJugador = new TextField();
			txtJugador.setMinWidth(200);
			txtJugador.setMaxWidth(200);
			txtJugador.setPromptText("Nombre del Jugador");
			
			
			// Label del Jugador

			Label lbPuntos = new Label("Puntos");
			lbJugador.setMinWidth(100);
			lbJugador.setAlignment(Pos.BOTTOM_LEFT);
			// TextField
			txtPuntos = new TextField();
			txtPuntos.setMinWidth(200);
			txtPuntos.setMaxWidth(200);
			txtPuntos.setPromptText("Puntos");
			
			
			//Botón
			
			Button bAccion = new Button("Dale");
			bAccion.setMinWidth(80);
			bAccion.setMaxWidth(80);
			bAccion.setOnAction(e -> btAccionClic());
			
			
			// HBox
			
			HBox Horizontal_Pane_1= new HBox(20,lbEquipo,txtEquipo);
			Horizontal_Pane_1.setAlignment(Pos.CENTER);
			
			HBox Horizontal_Pane_2= new HBox(20,lbJugador,txtJugador);
			Horizontal_Pane_2.setAlignment(Pos.CENTER);
			
			HBox Horizontal_Pane_3= new HBox(20,lbPuntos,txtPuntos);
			Horizontal_Pane_3.setAlignment(Pos.BOTTOM_LEFT);
			
			HBox Horizontal_Pane_4= new HBox(bAccion);
			Horizontal_Pane_4.setAlignment(Pos.CENTER_RIGHT);
			
			
			
			
			// VBox
			
			VBox Vertical_Panel = new VBox(Horizontal_Pane_1,Horizontal_Pane_2,Horizontal_Pane_3,Horizontal_Pane_4);
			
			Vertical_Panel.setAlignment(Pos.CENTER);
			   // Estos dos métodos es para darles una separación de los componentes dentro del Pane vertical
			Vertical_Panel.setPadding(new Insets(20, 20, 20, 20));
			Vertical_Panel.setSpacing(40);
			
			Scene miScene = new Scene(Vertical_Panel);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void btAccionClic() {
		//System.out.println("El equipo es: " + "  " + txtEquipo.getText() + "\n" + "El Jugador es: " + "  " + txtJugador.getText()+ "\n" + "Los puntos son : " + "  " + txtPuntos.getText());
		
		String Equipo = txtEquipo.getText();
		String Jugador = txtJugador.getText();
		String Puntos = txtPuntos.getText();
		Accion nueva = new Accion(Equipo,Jugador,Puntos);
	}
	TextField txtEquipo, txtJugador, txtPuntos;
}
