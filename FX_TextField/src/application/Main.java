package application;
	
import emergente.ventanaEmergente;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Label del equipo
			
			Label lbEquipo = new Label("Nombre del Equipo");
			lbEquipo.setMinWidth(100);
			lbEquipo.setAlignment(Pos.BASELINE_RIGHT);
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

			Label lbPuntos = new Label("Número de puntos");
			lbJugador.setMinWidth(100);
			lbJugador.setAlignment(Pos.BASELINE_RIGHT);
			// TextField
			txtPuntos = new TextField();
			txtPuntos.setMinWidth(200);
			txtPuntos.setMaxWidth(200);
			txtPuntos.setPromptText("Número de puntos");
			
			
			//Botón
			
			Button bAccion = new Button("Dale");
			bAccion.setMinWidth(80);
			bAccion.setMaxWidth(80);
			bAccion.setOnAction(e -> btAccionClic());
			
			
			// Creación Pane Equipo
			
			HBox paneEquipo= new HBox(20,lbEquipo,txtEquipo);
			paneEquipo.setPadding(new Insets(10));
			
			// Creación Pane Jugador
			HBox paneJugador= new HBox(20,lbJugador,txtJugador);
			paneJugador.setPadding(new Insets(10));
			
			// Creación Pane Puntos
			HBox panePuntos= new HBox(20,lbPuntos,txtPuntos);
			panePuntos.setPadding(new Insets(10));
			
			// Creación Pane Botón
			HBox paneBoton = new HBox(20,bAccion);
			paneBoton.setPadding(new Insets(10));
			paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
			
			
			
			// Creación del VBox
			
			VBox panelVertical = new VBox(10,paneEquipo,paneJugador,panePuntos,paneBoton);
			
			// Creación de la escena
			
			Scene miScene = new Scene(panelVertical);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void btAccionClic() {
		// TODO Auto-generated method stub
		String mensaje = "";
		
		if(txtEquipo.getText().length()==0) mensaje +="\nEl nombre del equipo es requerido";
		if(txtJugador.getText().length()==0) mensaje +="\nEl nombre del jugador es requerido";
		if(mensaje.length()==0) {
			mensaje = "El jugador " + txtJugador.getText() + " que juega en " + txtEquipo.getText() +
					" anota " + txtPuntos.getText() + " puntos por partido ";
			ventanaEmergente.mostrar(mensaje, "Datos del jugador");
		}else {
			ventanaEmergente.mostrar(mensaje, "Faltan datos !!!");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	TextField txtEquipo, txtJugador, txtPuntos;
}
