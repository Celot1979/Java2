package application;
	
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Iterator;

import emergente.*;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// TextField (Existe un método al final que crea el componente)
			nom = caja_Texto(nom,"Nombre");
			tel = caja_Texto(tel,"Telefono");
			dire= caja_Texto(dire,"Telefono");
			
			// RadioButton Tamaño
			
			// Crear los toggles groups
	        ToggleGroup grupo = new ToggleGroup();
	        ToggleGroup grupo2 = new ToggleGroup();
	        
	        //Creamos los RadioButtons (Existe un método al final que crea el componente)
	        peque = opcion(peque,"Pequeña",grupo);
	        mediana = opcion(mediana,"Mediana",grupo);
	        grande = opcion(grande,"Grande",grupo);
	        fina =  opcion(fina,"Fina",grupo2);
	        gruesa= opcion(gruesa,"Gruesa",grupo2);
	        
	        // Creamo el ListView
	        ListView <String> miLista = new ListView <String> ();
	        String [] comida = {"Peperoni","Queso","Pimiento","Aceitunas","Champiñones","Tomates","Anchoas","Jamón","Piña"};
			miLista.getItems().addAll(comida);
			
			// Tamaño de la lista en la app
			miLista.setPrefHeight(65);
			miLista.setPrefWidth(20);
			
			// Método de llamada a la acción
			
			
			miLista.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
					// TODO Auto-generated method stub
					
					/*resultado = new Label("");
					//intento = (String) ((ObservableValue<String>)new_val).getValue();
					resultado.setText(new_val);
					ArrayList <String> rastreo = new ArrayList<String>();
					intento = (String) resultado.getText();
					rastreo.add(new_val);
					
				   System.out.println(rastreo.size());*/
					miLista.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
					resultado = new Label("");
					resultado.setText(new_val);
					resultado.setText(new_val);
					resultado.requestFocus();
				}
				
			});
				
			
			// Botónes (Existe un método al final que crea el componente)
			Accion = botones(Accion,"Enviar", primaryStage); 
			Salir = botones(Salir,"Salir", primaryStage); 

			// Creación Pane del titulo
			HBox paneTitulo = new HBox(20, etiqueta(Titulo,"PIDE TU PIZZA","Titulo"));
			paneTitulo.setPadding(new Insets(8));
			// Creación Pane Equipo

			HBox paneNombre = new HBox(20, etiqueta(nombre,"NOMBRE","peque"), nom);
			paneNombre.setPadding(new Insets(8));

			// Creación Pane Jugador
			HBox paneTelf = new HBox(20, etiqueta(telefono,"TELEFONO","peque"), tel);
			paneTelf.setPadding(new Insets(8));

			// Creación Pane Puntos
			HBox paneDire = new HBox(20,  etiqueta(direccion,"Direccion","peque"),dire);
			paneDire.setPadding(new Insets(8));

			// Creación Pane Botón
			HBox paneBoton = new HBox(20, Accion,Salir);
			paneBoton.setPadding(new Insets(8));
			paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
			
			// Creación de HBox y VBox para añadir los RadioButton del tamaño de la pizza.
			VBox VerticalTama = new VBox(etiqueta(TituloTama,"TAMAÑO","titulos_peque"),peque,mediana,grande);
			//HBox HorizontalComp = new HBox(VerticalTama);
			VerticalTama.setPadding(new Insets(8));
			// Creación de HBox y VBox para añadir los RadioButton de la masa  pizza.
			VBox VerticalMasa = new VBox(etiqueta(TituloMasa,"TIPO DE MASA","titulos_peque"), fina,gruesa);
			VerticalMasa.setPadding(new Insets(8));
			// Creación de HBox y VBox para añadir los RadioButton de la masa pizza.
			
			VBox ingredientes_lista = new VBox(20,miLista);
			ingredientes_lista.setPadding(new Insets(8));
			VBox V_Ingredientes = new VBox(etiqueta(TituloIngre,"INGREDIENTES","titulos_peque"),ingredientes_lista);
			V_Ingredientes.setPadding(new Insets(8));
			
			
			// Creación de HBox general Horizontal con los tres bloques
			HBox HorizontalCompMasa = new HBox(VerticalTama,VerticalMasa,V_Ingredientes);
			
			
			// Creación del VBox( Ordena el conjunto entero dentro de la escena)
			VBox panelVertical = new VBox(8,paneTitulo, paneNombre, paneTelf, paneDire,HorizontalCompMasa, paneBoton);

			// Creación de la escena
			Scene miScene = new Scene(panelVertical);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			ventanaEmergenteAlerta nuevo = new ventanaEmergenteAlerta(); 
			e.printStackTrace();
		}
	}
	
	public void acciones() {
		String mensaje = "Nombre: " + nom.getText().toUpperCase() + "\nTeléfono: " + tel.getText() + "\nDirección: " + dire.getText().toUpperCase() + 
				"\nTamaño de la pizza es: " ;
		String Titulo_Ventana= " Pedido Realizado";
		if(peque.isSelected())mensaje += "PEQUEÑA";
		if(mediana.isSelected()) mensaje += "MEDIANA";
        if(grande.isSelected()) mensaje += "GRANDE";
        mensaje+= "\nEl grosor de la masa es: ";
        if(fina.isSelected())mensaje += "FINA";
		if(gruesa.isSelected()) mensaje += "GRUESA";
		mensaje += "\nLos ingredientes seleccionado son: \n";
		intento = resultado.getText();
		
		mensaje+= intento + "\n";

		ventanaEmergente.mostrar(mensaje, "Datos del pedido !!!");
		//System.out.println(mensaje);
	} 
	
	public Label etiqueta(Label Y, String Titulo, String Tipo) {
		Y =  new Label(Titulo);
		Y.setMinWidth(200);
		Y.setPrefWidth(100);
		Y.setAlignment(Pos.BASELINE_LEFT);
		if(Tipo.equals("Titulo")) {
			fuente=new Font("Monospaced", 26);
			Y.setFont(fuente);
		}else {
			titulos_peque= new Font("Monospaced",18);
			Y.setFont(titulos_peque);
		}
		return Y;
	}
	public TextField caja_Texto(TextField X, String Titulo) {
		X = new TextField();
		X.setMinWidth(200);
		X.setMaxWidth(200);
		X.setPromptText(Titulo);
		return X;
	}
	
	public RadioButton opcion(RadioButton P,String Titulo,ToggleGroup grupo) {
		P =  new RadioButton(Titulo);
		P.setPadding(new Insets(8));
		P.setToggleGroup(grupo);
		return P;
	}
	
	public Button botones(Button Accion,String Titulo,Stage primaryStage) {
		Accion  = new Button(Titulo);
		Accion .setMinWidth(80);
		Accion .setMaxWidth(80);
		if (Titulo.equals("Enviar")) Accion.setOnAction(e -> acciones());
		if(Titulo.equals("Salir")) Accion.setOnAction(e -> primaryStage.close());
		return Accion;
	}
	public static void main(String[] args) {
		launch(args);
	}
	private Stage primaryStage;
	private TextField nom,tel,dire;
	private RadioButton peque,mediana,grande,fina,gruesa;
	private CheckBox peperoni,queso,pimiento,aceitunas,champoñones,tomates,anchoas,jamon,pina;
	private Label Titulo,nombre,telefono,direccion,ingredientes,TituloMasa,TituloTama,TituloIngre,Titulo_Regis,resultado;
	private Font fuente,titulos_peque;
	private ToggleGroup grupo;
	private Button Accion,Salir;
	//private String [] comida = {"Peperoni","Queso","Pimiento","Aceitunas","Champiñones","Tomates","Anchoas","Jamón","Piña"};
	//private ListView <String> miLista ;
	private String variable_List,intento;
}


//Creación de los CheckBox Ingredientes

/*peperoni= new CheckBox("Peperoni");
queso = new CheckBox("Queso");
pimiento = new CheckBox("Pimiento");
aceitunas= new CheckBox("Aceitunas");
champoñones= new CheckBox("Champiñones");
tomates= new CheckBox("Tomates");
anchoas= new CheckBox("Anchoas");
jamon= new CheckBox("Jamón");
pina= new CheckBox("Piña");*/


//Dentro método acciones
/*mensaje+= "\nLos ingredientes escogidos son:  ";
if(peperoni.isSelected())mensaje += "Peperoni ";
if(queso.isSelected()) mensaje += "Queso ";
if(pimiento.isSelected()) mensaje += "Pimiento ";
if(aceitunas.isSelected())mensaje += "Aceitunas ";
if(champoñones.isSelected()) mensaje += "Champoñones ";
if(tomates.isSelected()) mensaje += "Tomates ";
if(anchoas.isSelected()) mensaje += "Anchoas ";
if(jamon.isSelected())mensaje += "Jamón ";
if(pina.isSelected()) mensaje += "Piña ";*/