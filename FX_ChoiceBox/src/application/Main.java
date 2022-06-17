package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import emergente.ventanaEmergente;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
//________________________________________________________________________________________________________________			
			// CREACIÓN COMPONENTE CHOICEBOX DE LA CLASE JUGADORES
			/*
			 * Comenzamos con la contrucción del ChoiceBox
			 * 1º Inicializamos el componente con el 2º constructor.
			 * Necesita un objeto generico que será el de la clase jugador.
			 * 
			 * 2º Añadimos al componente 3 elementos( jugadores).
			 * 
			 * 3º Hacemos que se vea con el método show.
			 */
			
			
			/*
			 * En relación a los constructores exite 2 formas:
			 * 
			 * a) Crear una instancia donde inicialicemos el componente; y porteriormente en una única directriz
			 * ir agregando cada item nuevo:
			 * ChoiceBox<Jugadores> equipoEstrellas = new ChoiceBox<Jugadores>();
			 * 
			 * Sumando objetos de tipo Jugador dentro del método de añadir el item:
			 * equipoEstrellas.getItems().add(new Jugadores("Michael","Jordan"));
			 * 
			 * 
			 * b)Se inicializa el componente como propiedad al final del método start ( accesible desde cualquier punto del código).
			 * Luego sentenciamos dentro del método start el componente:
			 * equipoEstrellas= new ChoiceBox<Jugadores>();
			 * 
			 * b.2) Para ir añadiendo items al ChoiceBox iremos creando cada objeto Jugador por separado.
			 *      Jugadores Jordan = new Jugadores("Michael","Jordan");
					Jugadores Larry = new Jugadores("Larry","Bird");
					Jugadores Magic = new Jugadores("Magic","Johson");
					
			 * AHora vamos agregar estos objetos jugadores como items al ChoiceBox.
			 * equipoEstrellas.getItems().addAll(Jordan,Larry,Magic);
			 * 
			 * Por último, si deseamo que alguno de ellos esté preseleccionado:
			 * equipoEstrellas.setValue(Larry);
			 */
			//ChoiceBox<Jugadores> equipoEstrellas = new ChoiceBox<Jugadores>();
			equipoEstrellas= new ChoiceBox<Jugadores>();
			/*equipoEstrellas.getItems().add(new Jugadores("Michael","Jordan"));
			equipoEstrellas.getItems().add(new Jugadores("Larry","Bird"));
			equipoEstrellas.getItems().add(new Jugadores("Magic","Johson"));*/
			
			Jugadores Jordan = new Jugadores("Michael","Jordan");
			Jugadores Larry = new Jugadores("Larry","Bird");
			Jugadores Magic = new Jugadores("Magic","Johson");
			equipoEstrellas.getItems().addAll(Jordan,Larry,Magic);
			equipoEstrellas.setValue(Larry);
			equipoEstrellas.show();
//________________________________________________________________________________________________________________			
			// CREACIÓN DEL PANE( EN ESTE CASO BORDER PANE) ALOJARÁ EL CHOICEBOX
			BorderPane root = new BorderPane(null,equipoEstrellas,null,null,null);
			Scene myScene = new Scene(root,400,400);
			equipoEstrellas.setOnAction(e ->  accionBoton());
			root.setAlignment(equipoEstrellas, Pos.CENTER);
			primaryStage.setScene(myScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void accionBoton() {
		String mensaje= "has escogido a \n";
		//Usando el metodo getValue nos devulve y suma al String lo que seleccione el usuario.
		mensaje+=equipoEstrellas.getValue();
		ventanaEmergente.mostrar(mensaje,"Tu jugador favorito",400,100);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	ChoiceBox<Jugadores> equipoEstrellas ;
}

// Se crea el Objeto Jugadores porque usamos el contructor con clase génerica de ChoiceBox
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