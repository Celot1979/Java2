package application;
	
import emergente.ventanaEmergente;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
/*
 * La siguiente actividad es para introduccirnos los métodos útiles variados que 
 * podemos usar con diferentes componentes.
 * 
 * Aprovechamos el código de la actividad anterior( ChoiceBox) para seguir progresando
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
						equipoEstrellas= new ChoiceBox<Jugadores>();
				
						
						Jugadores Jordan = new Jugadores("Michael","Jordan");
						Jugadores Larry = new Jugadores("Larry","Bird");
						Jugadores Magic = new Jugadores("Magic","Johson");
						Jugadores Abel= new Jugadores("Abel","Abel");
						equipoEstrellas.getItems().addAll(Jordan,Larry,Magic,Abel);
						equipoEstrellas.setValue(Larry);
						equipoEstrellas.show();
						// 1º Vamos a crear un botón.El propósito es darle 
						// diferentes acciones.
						Button elBoton = new Button("Dale");
						elBoton.setOnAction(e -> funcionJuegos());
						
						BorderPane root = new BorderPane(null,equipoEstrellas,null,elBoton,null);
						Scene myScene = new Scene(root,400,400);
						equipoEstrellas.setOnAction(e ->  accionBoton());
						root.setAlignment(elBoton, Pos.CENTER);
						root.setAlignment(equipoEstrellas, Pos.CENTER);
						primaryStage.setScene(myScene);
						primaryStage.show();
					} catch(Exception e) {
						e.printStackTrace();
					}
	}
	public void accionBoton() {
		String mensaje= "has escogido a \n";
		
		mensaje+=equipoEstrellas.getValue();
		ventanaEmergente.mostrar(mensaje,"Tu jugador favorito",400,100);
	}
	
	public void funcionJuegos(){
		
		//equipoEstrellas.getItems().add(new Jugadores("Perez", "Risto"));
		// equipoEstrellas.getItems().remove(0);
		//equipoEstrellas.getItems().clear();
		//System.out.println(equipoEstrellas.getItems().size());
		
		}
	public static void main(String[] args) {
		launch(args);
	}
	ChoiceBox<Jugadores> equipoEstrellas ;
}

class Jugadores{
	
	public Jugadores(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + "    "+ "Apellido: " + apellido + "";
	}

	private String nombre;
	private String apellido;
	
}