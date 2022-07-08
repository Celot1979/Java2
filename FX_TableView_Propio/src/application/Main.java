package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
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
			Label lblCabecera = new Label("Lista de Películas");
			Label lblnombre = new Label("Lista de Películas");
			Label lblyear = new Label("Lista de Películas");
			Label lblprecio = new Label("Lista de Películas");
			lblCabecera.setFont(new Font("Arial",20));
			

			
			
			tablaPeliculas = new TableView<Peliculas>();
			// El siguiente paso es para ahcer que la tabla sea editable
			tablaPeliculas.setEditable(true);
			
			TableColumn<Peliculas, String> colTitulo = new TableColumn("Titulo");
			colTitulo.setMinWidth(290);
			colTitulo.setCellValueFactory(new PropertyValueFactory<Peliculas, String>("titulo"));
			/* Método por el cual podremos modificar en la GUI la columna del Titulo.
			 * Para conseguir esto, debemos de combertir la celda del la tabla
			 * en un TextField.
			 * 
			 * Lo conseguimos con una clase que tiene la API y va dentro
			 * de los paréntesis inciales.
			
			 */
			colTitulo.setCellFactory(TextFieldTableCell.forTableColumn());
			 /*
			  * Si no se acompaña de la creación de un me´todo que quede a la escucha, sólo
			  * se modifica a nivel visual.
			  */
			colTitulo.setOnEditCommit(e -> modificaTitulo(e));
			
			
			TableColumn<Peliculas,Integer> colAno = new TableColumn("Año");
			colAno.setMinWidth(290);
			colAno.setCellValueFactory(new PropertyValueFactory<Peliculas, Integer>("year"));
			colAno.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
			colAno.setOnEditCancel(e -> modificarAno(e));
		
			TableColumn<Peliculas,Double> colPrecio = new TableColumn("Precio");
			colPrecio.setMinWidth(290);
			colPrecio.setCellValueFactory(new PropertyValueFactory<Peliculas, Double>("precio"));
			colPrecio.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
			colPrecio.setOnEditCancel(e -> modificarPrecio(e));
			
			
			
			tablaPeliculas.getColumns().addAll(colTitulo,colAno,colPrecio);
			
			tablaPeliculas.setItems(cargaDatos());
			
			
			
			HBox panelSecundario_2 = new HBox(
					Crear_VBox_Vertical_ListView(Crear_Label(Nombre_Peli,"Nombre de la pelicula"),T_nom_pelicula =new TextField()),
					Crear_VBox_Vertical_ListView(Crear_Label(Year,"Año de la pelicula"),T_year =new TextField()),
					Crear_VBox_Vertical_ListView(Crear_Label(Precio,"Precio de la pelicula"),T_precio =new TextField()),
					Crear_Botones(enviar,"ENVIAR",primaryStage),
					Crear_Botones(borrar,"BORRAR",primaryStage)
					);
					
			panelSecundario_2.setPadding(new Insets(10,10,10,10));
			
			VBox panePrincpial = new VBox();
			panePrincpial.setPadding(new Insets(10,10,10,10));
			panePrincpial.getChildren().addAll(lblCabecera,tablaPeliculas);
			//panelSecundario.getChildren().addAll(lblnombre,lblyear,lblprecio );
			
			HBox panelTercero = new HBox();
			panelTercero.getChildren().add(panelSecundario_2);
			VBox paneTotal = new VBox(panePrincpial,panelTercero);
			panePrincpial.setPadding(new Insets(10,10,10,10));
			
			Scene miScene = new Scene(paneTotal);
			primaryStage.setScene(miScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	private void modificarPrecio(CellEditEvent<Peliculas, Double> e) {
		// TODO Auto-generated method stub
		Peliculas p3 = e.getRowValue();
		p3.setPrecio(e.getNewValue());
	}
	// Este método sirve para escuchar los cambios en las columnas del Año
	private void modificarAno(CellEditEvent<Peliculas, Integer> e) {
		// TODO Auto-generated method stub
		Peliculas p3 = e.getRowValue();
		p3.setYear(e.getNewValue());
	}
	// Este método sirve para escuchar los cambios en las columnas del titulo
	private void modificaTitulo(CellEditEvent<Peliculas, String> e) {
		// TODO Auto-generated method stub
		//Alamacena en ese objeto Pelicula el contenido de la fila
		Peliculas p = e.getRowValue();
		p.setTitulo(e.getNewValue());
		
	}
	
	
	public ObservableList<Peliculas> cargaDatos(){
		datos = FXCollections.observableArrayList();
		datos.add(new Peliculas("Heat",1995,29.95));
		datos.add(new Peliculas("Braveheart",1995,50));
		datos.add(new Peliculas("Salvate il soldato Ryan",1998,19.95));
		datos.add(new Peliculas("Gladiator",2000,30.95));
		datos.add(new Peliculas("1917",2019,29.95));
		return datos;
		
	}
	public Label Crear_Label(Label Y, String Titulo) {
		Y =  new Label(Titulo);
		Y.setMinWidth(200);
		Y.setPrefWidth(100);
		Y.setAlignment(Pos.BASELINE_LEFT);
		Y.setFont(new Font("Arial",16));
		return Y;
	}
	
		
	public VBox Crear_VBox_Vertical_ListView(Label L,  TextField T) {
		VBox Vertical = new VBox(L, T);
		Vertical.setPadding(new Insets(8));
		return Vertical;
	}
	public Button Crear_Botones(Button Accion,String Titulo,Stage primaryStage) {
		Accion  = new Button(Titulo);
		Accion .setMinWidth(200);
		Accion .setMaxWidth(400);
		Accion.setMinHeight(80);
		Accion.setMaxHeight(100);
		if (Titulo.equals("ENVIAR")) Accion.setOnAction(e -> agregarPeliculas());
		if(Titulo.equals("BORRAR")) Accion.setOnAction(e ->  borrarPeliculas());
		return Accion;
	}
	
	public void agregarPeliculas() {
		Peliculas nueva = new Peliculas();
		nueva.setTitulo(T_nom_pelicula.getText());
		nueva.setYear(Integer.parseInt(T_year.getText()));
		nueva.setPrecio(Double.parseDouble(T_precio.getText()));
		tablaPeliculas.getItems().add(nueva);
		T_nom_pelicula.clear();
		T_year.clear();
		T_precio.clear();
		
	}
	
	public void borrarPeliculas() {
		borrar_p = tablaPeliculas.getSelectionModel().getSelectedItems();

		for(Peliculas p : borrar_p) {
			datos.remove(p);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	private TextField T_nom_pelicula,T_year,T_precio;
	private Label Titulo, Nombre_Peli,Year,Precio;
	private Button enviar,borrar;
	private TableView<Peliculas> tablaPeliculas;
	private ObservableList<Peliculas> datos,borrar_p;	
	private String pelicula,pepe;
	private int Years;
	private double pre;
	private Peliculas nuevo;
}
