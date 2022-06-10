package Accion;

import java.awt.Font;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Accion {
	
	public Accion(String equipo, String jugador, String puntos) {
		super();
		Equipo = equipo;
		Jugador = jugador;
		Puntos = puntos;
	
		if(Equipo.length() == 0 && Jugador.length()==0) {
			miStage = new Stage();
			miStage.initModality(Modality.APPLICATION_MODAL);
			miStage.setTitle("Error - Nombre Equipo y Jugador");
			miStage.setMinWidth(250);
			Label respuesta2 = new Label();
			respuesta2.setText("Falta el nombre del Equipo");
			respuesta2.setAlignment(Pos.CENTER);
			Label respuesta3 = new Label();
			respuesta3.setText("Falta el nombre del Jugador");
			respuesta3.setAlignment(Pos.CENTER);
			
			VBox Vertical_Panel = new VBox(respuesta2,respuesta3);
			Vertical_Panel.setAlignment(Pos.CENTER);
			Vertical_Panel.setPadding(new Insets(20, 20, 20, 20));
			Vertical_Panel.setSpacing(40);
			Scene miScene = new Scene(Vertical_Panel,400,200);
			miStage.setScene(miScene);
			
			miStage.showAndWait();
			
		}else if(Equipo.length() == 0 && Jugador.length() > 0 && Puntos.length()>0) {
			miStage = new Stage();
			miStage.initModality(Modality.APPLICATION_MODAL);
			miStage.setTitle("Error - Nombre Equipo");
			miStage.setMinWidth(250);
			Label respuesta1 = new Label();
			respuesta1.setText("Falta el nombre del equipo");
			
			BorderPane miPane =  new BorderPane();
			Scene miScene = new Scene(miPane,150,50);
			miPane.setTop(respuesta1);
			miStage.setScene(miScene);
			miStage.showAndWait();
		}else {
			miStage = new Stage();
			miStage.initModality(Modality.APPLICATION_MODAL);
			miStage.setTitle("Resultados de la consulta");
			Label respuesta4 = new Label();
			respuesta4.setText(Equipo);
			respuesta4.setAlignment(Pos.CENTER);
			
			Label respuesta5 = new Label();
			respuesta5.setText(Jugador);
			respuesta5.setAlignment(Pos.CENTER);
			
			Label respuesta6 = new Label();
			respuesta6.setText(Puntos);
			respuesta6.setAlignment(Pos.CENTER);
			
			// Label de enunciados
			Label respuesta7 = new Label("El equipo introduccido es:  ");
			respuesta7.setAlignment(Pos.CENTER);
			
			Label respuesta8 = new Label("El nombre del jugador introdudccido es:  ");
			respuesta8.setAlignment(Pos.CENTER);
			
			Label respuesta9 = new Label("Lo puntos realizados son:  ");
			respuesta9.setAlignment(Pos.CENTER);
			
			
			// HBox
			HBox Horizontal_Pane_1= new HBox( respuesta7 ,respuesta4);
			Horizontal_Pane_1.setAlignment(Pos.BOTTOM_LEFT);
			
			HBox Horizontal_Pane_2= new HBox(respuesta8,respuesta5);
			Horizontal_Pane_2.setAlignment(Pos.BOTTOM_LEFT);
			
			HBox Horizontal_Pane_3= new HBox(respuesta9,respuesta6);
			Horizontal_Pane_3.setAlignment(Pos.BOTTOM_LEFT);
			VBox Vertical_Panel = new VBox(Horizontal_Pane_1,Horizontal_Pane_2,Horizontal_Pane_3);
			Vertical_Panel.setPadding(new Insets(20, 20, 20, 20));
			Vertical_Panel.setSpacing(25);
			
			
			Scene miScene = new Scene(Vertical_Panel,400,200);
			miStage.setScene(miScene);
			
			miStage.showAndWait();
		}
		
	
		
			
		
			
		
	}
	
	private String Equipo,Jugador,Puntos;
	private static Stage miStage;
}
