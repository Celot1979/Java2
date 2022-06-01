package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import emergente.ventanaEmergente;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//-------------------------------------------------------------------------------------------------
//                     TRABAJO CON EL STAGE		
			/*
			 * Con la siguiente sentencia, y pasando por parámetro el false
			 * no estamos dejando que se redimensione el stage.
			 * Por otro lado, si queremos que se redimensiones, pondremos el true.
			 */
			primaryStage.setResizable(true);
			
			/*
			 * Vamos a darle un máximo, minimo de altura 
			 */
			
			//primaryStage.setMaxHeight(1000.0);
			//primaryStage.setMinHeight(200.0);

			/*
			 * Vamos a darle un máximo, minimo de ancho
			 */
			
			//primaryStage.setMinWidth(200.0);
			//primaryStage.setMaxWidth(800.0);
			
			/*
			 * Darle un titulo
			 */
			
			primaryStage.setTitle("Pruebas");
			
			/*
			 * Si queremos que desde el arranque la 
			 * pantalla salga maximizada sería.
			 * *OJO con este método está a pantalla completa, pero
			 * se sigue viendo el dock de Imac/ barra de tareas de Win etc.
			 */
			
			//primaryStage.setMaximized(true);
			
			/*
			 * Para que esté totalmente completa se debe insertar...
			 */
			
			primaryStage.setFullScreen(true);
//-------------------------------------------------------------------------------------------------			
			contador =0;
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
//-------------------------------------------------------------------------------------------------
//                    CREACIÓN DE UN BOTÓN
			/*
			 * 1º Creamos la instacia o el objeto botón.
			 * 2º Debemos posicionarlo en el BorderPane.
			 * Y usaremos el método setCenter.
			 */
			Button miBoton = new Button("Haz click!!!");
			miBoton.setOnAction(e -> VEmergente());
			root.setCenter(miBoton);
			
			// Ahora vamos a realizar un evento con el botón
			// Hemos creado el método clickEnBoton para realizar el evento
			/*
			 * Entre  la instanciad de creación del botón y añadirlo en el BorderPane
			 * encontramos la expresión que hace que el botón tenga un evento
			 * 
			 *  Se usa el método setOnAction. PAra que funcione debemos usar una
			 *  función lambda ( e ->) y a continuación el método que tiene programado
			 *  lo que queremos que haga el botón.
			 * 
			 */
			
//-------------------------------------------------------------------------------------------------			

//-------------------------------------------------------------------------------------------------
//                              CREACIÓN DE UNA ETIQUETA
			/*
			 * 1º Al tener que acceder a la etiqueta desde difrentes puntos del código,
			 * vamos a crear una propiedad al final del código.
			 * 
			 * 
			 * 
			 */
			
			//miTexto.setText("Hiciste click " + contador + " veces");
			//Esta instrucción es para que se imprima por pantalla la 1ª vez que se echa andar a la app
			//root.setTop(miTexto);
			//-------------------------------------------------------------------------------------------------			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/*
	public void clickEnBoton() {
		contador++;
		if(contador ==1)miTexto.setText("Hiciste click " + contador + " vez");
		else miTexto.setText("Hiciste click " + contador + " veces");
	}*/
	public void VEmergente() {
		ventanaEmergente.mostrar("Esta es nuestra ventana emergente", "Ojo cuidado");
	}
	
	private Label miTexto = new Label();
	private int contador;
}
