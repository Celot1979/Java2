package application;
	
import emergente.ventanaEmergente;
import emergente.ventanaEmergenteAlerta;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


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
				        ToggleGroup grupo3 = new ToggleGroup();
				        
				        //Creamos los RadioButtons (Existe un método al final que crea el componente)
				        peque = Crear_RadioButton(peque,"Pequeña",grupo);
				        mediana = Crear_RadioButton(mediana,"Mediana",grupo);
				        grande = Crear_RadioButton(grande,"Grande",grupo);
				        fina =  Crear_RadioButton(fina,"Fina",grupo2);
				        gruesa= Crear_RadioButton(gruesa,"Gruesa",grupo2);
				        vacio= Crear_RadioButton(vacio,"Extra-Gruesa",grupo2);
				        
				        Caspian= Crear_RadioButton( Caspian,"THEME CASPIAN",grupo3);
				        Modena= Crear_RadioButton( Modena,"THEME MODERNA",grupo3);
				        
				        grupo3.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

							@Override
							public void changed(ObservableValue<? extends Toggle> arg0, Toggle anterior, Toggle nueva) {
								// TODO Auto-generated method stub
								if( grupo3.getSelectedToggle()!=null) {
									RadioButton aux = (RadioButton) grupo3.getSelectedToggle();
									if(aux.equals(Caspian)) {
										Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
									}else if(aux.equals(Modena)) {
										Application.setUserAgentStylesheet(STYLESHEET_MODENA);
									}
								}
							}
				        	
				        });
			// ----------------------------------------------------------------------------------------------------------------------------------------------------------	
			// ----------------------------------------------------------------------------------------------------------------------------------------------------------
			// -------------------------------------------------L I S T V I E W------------------------------------------------------------------------------------------	
				      
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
						HBox paneBoton = new HBox(20,Caspian,Modena,Accion,Salir);
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
						miScene.getStylesheets().add(getClass().getResource("miEstilo.css").toExternalForm());
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
					
				} 
				
				public void Mostrar_Contenido_ListView() {
					menssage = "";
					list_Obser = Lista_Vi.getSelectionModel().getSelectedItems();
					for(String i : list_Obser) {
						menssage += i + "\n";
					}
				}
				
				
				public Label Crear_Label(Label Y, String Titulo, String Tipo) {
					Y =  new Label(Titulo);
					Y.setMinWidth(200);
					Y.setPrefWidth(100);
					Y.setAlignment(Pos.BASELINE_LEFT);
					//Implementar el estilo personal creado en el CSS
					
					
					Y.getStyleClass().add("mi_Estilo");
					if(Tipo.equals("Titulo")) {
						
						//Se aplica el Estilo de ID
						Y.setId("titulo");
					}else {
						titulos_peque= new Font("Impact",18);
						Y.setFont(titulos_peque);
					}
					return Y;
				}
				
				public TextField Crear_TextField(TextField X, String Titulo) {
					X = new TextField();
					X.setMinWidth(200);
					X.setMaxWidth(200);
					X.setPromptText(Titulo);
					return X;
				}
				
				public RadioButton Crear_RadioButton(RadioButton P,String Titulo,ToggleGroup grupo) {
					P =  new RadioButton(Titulo);
					P.setPadding(new Insets(8));
					P.setToggleGroup(grupo);
					return P;
				}
				
				public Button Crear_Botones(Button Accion,String Titulo,Stage primaryStage) {
					Accion  = new Button(Titulo);
					Accion .setMinWidth(80);
					Accion .setMaxWidth(80);
					if (Titulo.equals("Enviar")) Accion.setOnAction(e -> acciones());
					if(Titulo.equals("Salir")) Accion.setOnAction(e -> primaryStage.close());
					return Accion;
				}
				
				public HBox Crear_HBOX_Horizontal(int num,Label L,TextField T) {
					HBox horizontal = new HBox(num,L,T);
					horizontal.setPadding(new Insets(8));
					return horizontal;
				}
				
				public VBox Crear_VBOX_Vertical(Label L,RadioButton U,RadioButton N,RadioButton O) {
					VBox Vertical = new VBox(L,U,N,O);
					Vertical.setPadding(new Insets(8));
					return Vertical;
				}
				
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
				private RadioButton peque,mediana,grande,fina,gruesa,vacio, Caspian,Modena;
				private CheckBox peperoni,queso,pimiento,aceitunas,champoñones,tomates,anchoas,jamon,pina;
				private Label Titulo,nombre,telefono,direccion,ingredientes,TituloMasa,TituloTama,TituloIngre,Titulo_Regis,resultado;
				private Font fuente,titulos_peque;
				private ToggleGroup grupo;
				private Button Accion,Salir;
				private  ListView<String> Lista_Vi ;
				ObservableList<String> list_Obser;
				private String variable_List,intento,mensaje, menssage;
			}
