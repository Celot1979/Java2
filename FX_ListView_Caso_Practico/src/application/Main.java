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
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------- T E X T F I E L D -------------------------------------------------------------------------------------------------------			
	        // TextField (Existe un método al final que crea el componente)
			nom = Crear_TextField(nom,"Nombre");
			tel = Crear_TextField(tel,"Telefono");
			dire= Crear_TextField(dire,"Dirección");
			
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// ---------------------------------T O G G L E G R O U P   Y   R A D IO B U T T O N -------------------------------------------------------------------------
			
			// Crear los toggles groups
	        ToggleGroup grupo = new ToggleGroup();
	        ToggleGroup grupo2 = new ToggleGroup();
	        
	        //Creamos los RadioButtons (Existe un método al final que crea el componente)
	        peque = Crear_RadioButton(peque,"Pequeña",grupo);
	        mediana = Crear_RadioButton(mediana,"Mediana",grupo);
	        grande = Crear_RadioButton(grande,"Grande",grupo);
	        fina =  Crear_RadioButton(fina,"Fina",grupo2);
	        gruesa= Crear_RadioButton(gruesa,"Gruesa",grupo2);
	        vacio= Crear_RadioButton(vacio,"Extra-Gruesa",grupo2);
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// -------------------------------------------------L I S T V I E W------------------------------------------------------------------------------------------	
	       /*
	        * 1º INICIALIZAMOS 1º EL COMPONENTE ListView(). 
	        * 2º AGREGAMOS LOS ITEMS -INGREDIENTES -.
	        * 3º IMPLEMENTAMOS MÉTODOS QUE NOS PERMITEN:
	        *    A) SELECCIONAR VARIOS ITEMS. 
	        *    B) QUE TENGAN UN TAMAÑO CONCRETO EN LA INTERFAZ GRÁFICA (CON SCROLL ). 
	        *    
	        * 4º IMPORTANTE:
	        *    - EL SIGUIENTE PASO ES IRNOS AL MÉTODO QUE GUARDA LO SELECCIONADO POR EL USUARIO EN UNA ObservableList.
	        *    UNA VEZ REALIZADO, SE RECORRE CON UN BUCLE FOR Y SE GUARDA EN UNA VARIABLE STRING - MÉTODO SE LLAMA ( envioList() -.
	        *    
	        * 5º IREMOS AL MÉTODO QUE DESENCADENA LA ACCIÓN AL PRESIONAR EL BOTÓN.
	        *    - INICIALIZAMOS EL MÉTODO - envioList() - .
	        *    - INCREMENTAMOS EL STRING - mensaje - CON LA SALIDA DEL STRING - menssage - ( String que nos muestra lo seleccionado).
	        * 
	        */
	        Lista_Vi = new ListView<String>();
	       
	        //Añadimos los productos a la lista observable
	        Lista_Vi.getItems().addAll("Peperoni","Queso","Pimiento","Aceitunas","Champiñones","Tomates","Anchoas","Jamón","Piña");
	        
	        // Modo de escoger multiproducto
	        Lista_Vi.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	        
			// Tamaño de la lista en la app
	        Lista_Vi.setPrefHeight(68);
	        Lista_Vi.setPrefWidth(20);
	        
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// --------------------------------------------------- B O T O N E S-----------------------------------------------------------------------------------------
			// Botónes (Existe un método al final que crea el componente)
			Accion = Crear_Botones(Accion,"Enviar", primaryStage); 
			Salir = Crear_Botones(Salir,"Salir", primaryStage); 
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// ----------------------------------------------H B O X   Y   V B O X---------------------------------------------------------------------------------------
			VBox Datos = new VBox (
					Crear_HBOX_Horizontal(20,Crear_Label(Titulo,"PIDE TU PIZZA","Titulo"), nom),
					Crear_HBOX_Horizontal(20, Crear_Label(nombre,"NOMBRE","peque"), nom),
					Crear_HBOX_Horizontal(20, Crear_Label(telefono,"TELFONO","peque"), tel),
					Crear_HBOX_Horizontal(20,  Crear_Label(direccion,"DIRECCIÓN","peque"),dire)
					);
			
			// Creación Pane Botón
			HBox paneBoton = new HBox(20, Accion,Salir);
			paneBoton.setPadding(new Insets(8));
			paneBoton.setAlignment(Pos.BOTTOM_RIGHT);
			

			VBox ingredientes_lista = new VBox(20,Lista_Vi);
			ingredientes_lista.setPadding(new Insets(8));
			
			// Creación de HBox general Horizontal con los tres bloques
			HBox HorizontalCompMasa = new HBox(
					 Crear_VBOX_Vertical(Crear_Label(TituloTama,"TAMAÑO","titulos_peque"),peque,mediana,grande),
					 Crear_VBOX_Vertical(Crear_Label(TituloMasa,"TIPO DE MASA","titulos_peque"),fina,gruesa,vacio),
					 Crear_VBox_Vertical_ListView(Crear_Label(TituloIngre,"INGREDIENTES","titulos_peque"),Lista_Vi )
					);
			
			
			// Creación del VBox( Ordena el conjunto entero dentro de la escena)
			VBox panelVertical = new VBox(8,Datos,HorizontalCompMasa, paneBoton);
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------ CREACIÓN DE ESCENA --------------------------------------------------------------------------
			
			// Creación de la escena
			Scene miScene = new Scene(panelVertical);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			ventanaEmergenteAlerta nuevo = new ventanaEmergenteAlerta(); 
			e.printStackTrace();
		}
	}
	
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------
// ---------------------------------------------- MÉTODOS ---------------------------------------------------------------------------------------
	// Método que está a la escucha y desencadena la acción después de presionar el botón -Enviar -
	public void acciones() {
		mensaje = "Nombre: " + nom.getText().toUpperCase() + "\nTeléfono: " + tel.getText() + "\nDirección: " + dire.getText().toUpperCase() + 
				"\nTamaño de la pizza es: " ;
		String Titulo_Ventana= " Pedido Realizado";
		if(peque.isSelected())mensaje += "PEQUEÑA";
		if(mediana.isSelected()) mensaje += "MEDIANA";
        if(grande.isSelected()) mensaje += "GRANDE";
        mensaje+= "\nEl grosor de la masa es: ";
        if(fina.isSelected())mensaje += "FINA";
		if(gruesa.isSelected()) mensaje += "GRUESA";
		mensaje += "\nLos ingredientes seleccionado son: \n";
		Mostrar_Contenido_ListView();
		mensaje += menssage.toUpperCase();
		ventanaEmergente.mostrar(mensaje, "Datos del pedido !!!");
		//System.out.println(mensaje);
	} 
	/* Método encargado  de:
	 * A). Almacenar la información seleccionada de la - ListView - en una - ObservableList -
	 * B). Realizamos un ciclo for para ir sacando Item por Item.
	 * C). La almacenamos en la Variable menssage.
	 * D). Está variable será sumada en la - variable mensaje (Método acciones)-.
	 */
	public void Mostrar_Contenido_ListView() {
		menssage = "";
		list_Obser = Lista_Vi.getSelectionModel().getSelectedItems();
		for(String i : list_Obser) {
			menssage += i + "\n";
		}
	}
	
	// Método para crear un Label.Se pasa por parámetro - Label,Titulo, fuente personalizada.
	public Label Crear_Label(Label Y, String Titulo, String Tipo) {
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
	// Método para crear un TextField .Se pasa por parámetro un TextField y el titulo que saldrá en la casilla - titulo orientativo-.
	public TextField Crear_TextField(TextField X, String Titulo) {
		X = new TextField();
		X.setMinWidth(200);
		X.setMaxWidth(200);
		X.setPromptText(Titulo);
		return X;
	}
	// Método para crear un RadioButton  .Se pasa por parámetro un RadioButton y el titulo será lo visible para el usuario, Grupo al que pertenecerá .
	public RadioButton Crear_RadioButton(RadioButton P,String Titulo,ToggleGroup grupo) {
		P =  new RadioButton(Titulo);
		P.setPadding(new Insets(8));
		P.setToggleGroup(grupo);
		return P;
	}
	/* Método para crear un  Button. Se pasa por parámetro un Button y el titulo será lo visible para el usuario.
	 * Como nota particular, en esté caso también se le pasa un Stage para que pueda funcionar el método del botón - Salir-.
	 */
	public Button Crear_Botones(Button Accion,String Titulo,Stage primaryStage) {
		Accion  = new Button(Titulo);
		Accion .setMinWidth(80);
		Accion .setMaxWidth(80);
		if (Titulo.equals("Enviar")) Accion.setOnAction(e -> acciones());
		if(Titulo.equals("Salir")) Accion.setOnAction(e -> primaryStage.close());
		return Accion;
	}
	/* Método para crear un HBox. Se pasa por parámetro un número que separará a los componentes.
	 * El titulo al crear internamente un Label - usado el método - Crear_Label - .
	 * Al tener que reflejar los TextField de los datos personales, tenemos que pasarle el un TextField ( creados con el método Crear_TextField).
	 */
	public HBox Crear_HBOX_Horizontal(int num,Label L,TextField T) {
		HBox horizontal = new HBox(num,L,T);
		horizontal.setPadding(new Insets(8));
		return horizontal;
	}
	/* Método para crear un VBox. Se pasa por parámetro:
	 * El titulo al crear internamente un Label - usado el método - Crear_Label - .
	 * También se pasa por parámetro los RadioButton ( creados con el método Crear_RadioButton)
	 */
	public VBox Crear_VBOX_Vertical(Label L,RadioButton U,RadioButton N,RadioButton O) {
		VBox Vertical = new VBox(L,U,N,O);
		Vertical.setPadding(new Insets(8));
		return Vertical;
	}
	/* Método para crear unVBox. Se pasa por parámetro:
	 * 
	 * (Label L,  ListView<String> Lista_Vi)
	 * Esto sucede por que nace la necesidad de pasarle una ListView.
	 */
	public VBox Crear_VBox_Vertical_ListView(Label L,  ListView<String> Lista_Vi) {
		VBox Vertical = new VBox(L, Lista_Vi);
		Vertical.setPadding(new Insets(8));
		return Vertical;
	}
// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
// ----------------------------------------------------------------------------------------------------------------------------------------------------------


	public static void main(String[] args) {
		launch(args);
	}
	private Stage primaryStage;
	private TextField nom,tel,dire;
	private RadioButton peque,mediana,grande,fina,gruesa,vacio;
	private CheckBox peperoni,queso,pimiento,aceitunas,champoñones,tomates,anchoas,jamon,pina;
	private Label Titulo,nombre,telefono,direccion,ingredientes,TituloMasa,TituloTama,TituloIngre,Titulo_Regis,resultado;
	private Font fuente,titulos_peque;
	private ToggleGroup grupo;
	private Button Accion,Salir;
	private  ListView<String> Lista_Vi ;
	ObservableList<String> list_Obser;
	private String variable_List,intento,mensaje, menssage;
}
