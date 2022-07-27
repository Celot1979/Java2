package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import metodos.metodos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import titulo.Titulo;
import datos.Datos;
import emergente.ventanaEmergente;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			GridPane gridpane = new GridPane();
			gridpane.getColumnConstraints().add(new ColumnConstraints(150));
			gridpane.setPadding(new Insets(8));
			//gridpane.setGridLinesVisible(true);
			gridpane.setVgap(8);
//--------------------------------------------------------------------------------------------------------------------------------
			// Titulo
			Label nueva = new Label("PIDE TU PIZZA ");
			Font font= new Font("Monospaced", 25);
			nueva.setFont(font);
			gridpane.add(nueva, 0, 0);
			GridPane.setColumnSpan(nueva, 6);
			//GridPane.ColumnSpan(ti, 6);
			/*GridPane.setRowSpan(ti, 6);
			GridPane.setHgrow(ti, Priority.ALWAYS);
		    GridPane.setVgrow(ti, Priority.ALWAYS);*/
//--------------------------------------------------------------------------------------------------------------------------------			

//--------------------------------------------------------------------------------------------------------------------------------
			// Datos
		    Datos uno = new Datos();
		    
		    Tnom=uno.Crear_TextField(Tnom, "Nombre");
		    Ttelf=uno.Crear_TextField(Ttelf, "Teléfono");
		    Tdire= uno.Crear_TextField(Tdire, "Dirección");
		    //uno.Crear_TextField(Tnom, "Nombre");
		    gridpane.add( uno.Crear_Label(nom, "Nombre"), 0, 2);
		    gridpane.add( uno.Crear_TextField(Tnom, "Nombre"), 1,2);
		    
		    gridpane.add( uno.Crear_Label(telf, "Teléfono"), 0, 3);
		    gridpane.add( Ttelf, 1,3);
		    
		    gridpane.add( uno.Crear_Label(dire, "Dirección"), 0, 4);
		    gridpane.add( Tdire, 1,4);
//--------------------------------------------------------------------------------------------------------------------------------		    
		    
//--------------------------------------------------------------------------------------------------------------------------------
			// RadioButton		    
		    Label nueva2 = new Label("       TAMAÑO ");
		    Label nueva3 = new Label("       MASA ");
		    Label nueva4 = new Label("       INGREDIENTES ");
			Font font2= new Font("Monospaced", 16);
			nueva2.setFont(font2);
			nueva3.setFont(font2);
			nueva4.setFont(font2);
			
		    gridpane.add( nueva2, 0, 6);
		    gridpane.add( nueva3, 1, 6);
		    gridpane.add( nueva4, 3, 6);
		    peque=uno.RadioButton(peque, "PEQUEÑA", grupo);
		    mediana=uno.RadioButton(mediana,"MEDIANA",grupo);
		    grande=uno.RadioButton(grande,"GRANDE",grupo);
		    exfina=uno.RadioButton(exfina, "EXFINA", grupo2);
		    fina=uno.RadioButton(fina,"FINA",grupo2);
		    gruesa=uno.RadioButton(gruesa,"VACIA",grupo2);
		    gridpane.add(peque, 0, 7);
		    gridpane.add(mediana, 0, 8);
		    gridpane.add(grande, 0, 9);
		    
		    gridpane.add( exfina, 1, 7);
		    gridpane.add( fina, 1, 8);
		    gridpane.add( gruesa, 1, 9);
//--------------------------------------------------------------------------------------------------------------------------------		    
//--------------------------------------------------------------------------------------------------------------------------------
			// ListView							    
		    Lista_Vi = new ListView<String>();
		       
	        //Añadimos los productos a la lista observable
	        Lista_Vi.getItems().addAll("Peperoni","Queso","Pimiento","Aceitunas","Champiñones","Tomates","Anchoas","Jamón","Piña");
	        
	        // Modo de escoger multiproducto
	        Lista_Vi.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	        
			// Tamaño de la lista en la app
	        Lista_Vi.setPrefHeight(100);
	        Lista_Vi.setPrefWidth(80);
	        
	        gridpane.add(Lista_Vi, 3, 7);
	        GridPane.setRowSpan(Lista_Vi, 3);
	     
//--------------------------------------------------------------------------------------------------------------------------------		    
//--------------------------------------------------------------------------------------------------------------------------------
	      	//Button
	        
	       
	        Accion = Crear_Botones(Accion,"Enviar", primaryStage); 
			Salir = Crear_Botones(Salir,"Salir", primaryStage); 
	       
			gridpane.add( Accion, 3, 11);
			gridpane.add(Salir, 4, 11);
			Scene scene = new Scene(gridpane, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public void acciones() {
		this.Tnom = Tnom;
		this.Ttelf = Ttelf;
		this.Tdire = Tdire;
		mensaje = "Nombre: " + Tnom.getText().toUpperCase() + "\nTeléfono: " + Ttelf.getText() + "\nDirección: " + Tdire.getText().toUpperCase() + 
				"\nTamaño de la pizza es: " ;
		String Titulo_Ventana= " Pedido Realizado";
		if(peque.isSelected())mensaje += "PEQUEÑA";
		if(mediana.isSelected()) mensaje += "MEDIANA";
        if(grande.isSelected()) mensaje += "GRANDE";
        mensaje+= "\nEl grosor de la masa es: ";
        if(fina.isSelected())mensaje += "FINA";
		if(gruesa.isSelected()) mensaje += "GRUESA";
		mensaje += "\nLos ingredientes seleccionado son: \n";
		//Mostrar_Contenido_ListView();
		list_Obser = Lista_Vi.getSelectionModel().getSelectedItems();
		for(String i : list_Obser) {
			menssage += i + "\n";
		}
		mensaje += menssage.toUpperCase();
		ventanaEmergente.mostrar(mensaje, "Datos del pedido !!!");
		//System.out.println(mensaje);
	} 
	
	public Button Crear_Botones(Button Accion,String Titulo,Stage primaryStage) {
		Accion  = new Button(Titulo);
		Accion .setMinWidth(80);
		Accion .setMaxWidth(80);
		if (Titulo.equals("Enviar")) Accion.setOnAction(e -> acciones());
		if(Titulo.equals("Salir")) Accion.setOnAction(e -> primaryStage.close());
		return Accion;
	}
	Label ti, nom,telf,dire;
	Font fuente,titulos_peque;
	TextField Tnom,Ttelf,Tdire;
	ToggleGroup G;
	private RadioButton peque,mediana,grande,exfina,fina,gruesa,R,p,m,g;
	private ToggleGroup grupo = new ToggleGroup();
    private ToggleGroup grupo2 = new ToggleGroup();
    private  ListView<String> Lista_Vi ;
	private Button Accion,Salir;
	private String variable_List,intento,mensaje, menssage;
	ObservableList<String> list_Obser;
	
}
