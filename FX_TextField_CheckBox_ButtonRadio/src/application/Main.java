package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import emergente.ventanaEmergente;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label lbTitulo = new Label("PIDE TU PIZZA AHORA");
			lbTitulo.setMinWidth(100);
			lbTitulo.setAlignment(Pos.BASELINE_LEFT);
			Font fuente=new Font("Monospaced", 26);
			Font titulos_peque= new Font("Monospaced",18);
			lbTitulo.setFont(fuente);
			
			Label lbnom = new Label("Nombre");
			lbnom.setPrefWidth(100);
			lbnom.setAlignment(Pos.BASELINE_LEFT);
			// TextField
			nom = new TextField();
			nom.setMinWidth(200);
			nom.setMaxWidth(200);
			nom.setPromptText("Nombre");

			// Label del Jugador

			Label lbtelf = new Label("Número de teléfono");
			lbtelf.setPrefWidth(100);
			lbtelf.setAlignment(Pos.BASELINE_LEFT);
			// TextField
			tel = new TextField();
			tel.setMinWidth(200);
			tel.setMaxWidth(200);
			tel.setPromptText("Num Telf");

			// Label del Jugador

			Label lbDire = new Label("Dirección completa");
			lbDire.setPrefWidth(100);
			lbDire.setAlignment(Pos.BASELINE_LEFT);
			// TextField
			dire = new TextField();
			dire.setMinWidth(200);
			dire.setMaxWidth(200);
			dire.setPromptText("Dirección");
			
			 //Creación de los CheckBox Ingredientes
			Label TituloIngre = new Label("Seleccionar ingredientes");
			TituloIngre.setPrefWidth(100);
			TituloIngre.setAlignment(Pos.BASELINE_RIGHT);
			TituloIngre.setFont(titulos_peque);
			peperoni= new CheckBox("Peperoni");
			queso = new CheckBox("Queso");
			pimiento = new CheckBox("Pimiento");
			aceitunas= new CheckBox("Aceitunas");
			champoñones= new CheckBox("Champiñones");
			tomates= new CheckBox("Tomates");
			anchoas= new CheckBox("Anchoas");
			jamon= new CheckBox("Jamón");
			pina= new CheckBox("Piña");
			
		
			
			
			// RadioButton Tamaño
			//Titulo
			Label TituloTama = new Label("Tamaño");
			TituloTama.setPrefWidth(100);
			TituloTama.setAlignment(Pos.BASELINE_LEFT);
			TituloTama.setFont(titulos_peque);
			// create a toggle group
	        ToggleGroup grupo = new ToggleGroup();
	        //Creamos los tamaños y opciones
	        peque = new RadioButton("Pequeña");
	        mediana = new RadioButton("mediana");
	        grande = new RadioButton("grande");
	        //Añadimos los tamaños al grupo
	        peque.setToggleGroup(grupo);
	        peque.setPadding(new Insets(8));
	        mediana.setToggleGroup(grupo);
	        mediana.setPadding(new Insets(8));
	        grande.setToggleGroup(grupo);
	        grande.setPadding(new Insets(8));

			// RadioButton Masa
			// Titulo
			Label TituloMasa = new Label("Tipo de Masa");
			TituloMasa.setPrefWidth(100);
			TituloMasa.setAlignment(Pos.BASELINE_LEFT);
			TituloMasa.setFont(titulos_peque);
			// create a toggle group
			ToggleGroup grupo2 = new ToggleGroup();
			// Creamos los tamaños y opciones
			fina = new RadioButton("Fina");
			fina.setPadding(new Insets(8));
			gruesa = new RadioButton("Gruesa");
			gruesa.setPadding(new Insets(8));
			// Añadimos los tamaños al grupo
			fina.setToggleGroup(grupo2);
			gruesa.setToggleGroup(grupo2);
			
	        
	        
			// Botón
			Button bAccion = new Button("Enviar");
			bAccion.setMinWidth(80);
			bAccion.setMaxWidth(80);
			bAccion.setOnAction(e -> acciones());
			
			
			
			// Creación Pane del titulo
			HBox paneTitulo = new HBox(20, lbTitulo);
			paneTitulo.setPadding(new Insets(8));
			// Creación Pane Equipo

			HBox paneNombre = new HBox(20, lbnom, nom);
			paneNombre.setPadding(new Insets(8));

			// Creación Pane Jugador
			HBox paneTelf = new HBox(20, lbtelf, tel);
			paneTelf.setPadding(new Insets(8));

			// Creación Pane Puntos
			HBox paneDire = new HBox(20, lbDire, dire);
			paneDire.setPadding(new Insets(8));

			// Creación Pane Botón
			HBox paneBoton = new HBox(20, bAccion);
			paneBoton.setPadding(new Insets(8));
			paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
			
			// Creación de HBox y VBox para añadir los RadioButton del tamaño de la pizza.
			VBox VerticalTama = new VBox(TituloTama,peque,mediana,grande);
			//HBox HorizontalComp = new HBox(VerticalTama);
			VerticalTama.setPadding(new Insets(8));
			// Creación de HBox y VBox para añadir los RadioButton de la masa  pizza.
			VBox VerticalMasa = new VBox(TituloMasa, fina,gruesa);
			VerticalMasa.setPadding(new Insets(8));
			// Creación de HBox y VBox para añadir los RadioButton de la masa pizza.
			
		
			VBox primeros = new VBox(20,peperoni,queso,pimiento);
			VBox segundos = new VBox(20,aceitunas,champoñones,tomates);
			VBox terceros = new VBox(20,anchoas,jamon,pina);
			HBox VerticalIngre = new HBox(20,primeros,segundos,terceros);
			VerticalIngre.setPadding(new Insets(8));
			//VBox V_Ingredienees = new VBox(VerticalIngre);
			// Creación de HBox general Horizontal con los tres bloques
			HBox HorizontalCompMasa = new HBox(VerticalTama,VerticalMasa,VerticalIngre);
			
			
			// Creación del VBox( Ordena el conjunto entero dentro de la escena)
			VBox panelVertical = new VBox(8,paneTitulo, paneNombre, paneTelf, paneDire,HorizontalCompMasa, paneBoton);

			// Creación de la escena
			Scene miScene = new Scene(panelVertical);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void acciones() {
		String mensaje = "Nombre: " + nom.getText() + "\nTeléfono: " + tel.getText() + "\nDirección: " + dire.getText() + 
				"\nTamaño de la pizza es: " ;
		String Titulo_Ventana= " Pedido Realizado";
		if(peque.isSelected())mensaje += "pequeña";
		if(mediana.isSelected()) mensaje += "mediana";
        if(grande.isSelected()) mensaje += "grande";
        mensaje+= "\nEl grosor de la masa es: pequeña: ";
        if(fina.isSelected())mensaje += "fina";
		if(gruesa.isSelected()) mensaje += "gruesa";
		mensaje+= "\nLos ingredientes escogidos son:  ";
		if(peperoni.isSelected())mensaje += "Peperoni ";
		if(queso.isSelected()) mensaje += "Queso ";
        if(pimiento.isSelected()) mensaje += "Pimiento ";
        if(aceitunas.isSelected())mensaje += "Aceitunas ";
		if(champoñones.isSelected()) mensaje += "Champoñones ";
        if(tomates.isSelected()) mensaje += "Tomates ";
        if(anchoas.isSelected()) mensaje += "Anchoas ";
        if(jamon.isSelected())mensaje += "Jamón ";
		if(pina.isSelected()) mensaje += "Piña ";
        
		
		
		
		ventanaEmergente.mostrar(mensaje, "Datos del pedido !!!");
		//System.out.println(mensaje);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	TextField nom,tel,dire;
	RadioButton peque,mediana,grande,fina,gruesa;
	CheckBox peperoni,queso,pimiento,aceitunas,champoñones,tomates,anchoas,jamon,pina;
}
