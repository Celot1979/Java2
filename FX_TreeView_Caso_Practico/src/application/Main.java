package application;
	


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;

import java.io.File;
import java.net.URL;

import emergente.*;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*
			 * Creamos una raíz que es el nodo principal.
			 * Como podemos comprobar en la interfz no sale
			 * visible la raíz
			 */
			TreeItem rootItem = new TreeItem("Peliculas");
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
			/*
			 * Creamos Un objeto Image para pasarlo a la clase Imageview que será mostrada 
			 * en el contructor de los nodos principales. 
			 * 
			 * Tendremos tantas imágenes como nodos queramos que tengan icono
			 */
			Image icon = new Image(getClass().getResourceAsStream("/img/gu_3.png"));
			ImageView imagen = new ImageView(icon);
			
			Image icon2 = new Image(getClass().getResourceAsStream("/img/fam.png"));
			ImageView imagen2 = new ImageView(icon2);
			
			Image icon3 = new Image(getClass().getResourceAsStream("/img/inf.png"));
			ImageView imagen3= new ImageView(icon3);
			
			Image icon4 = new Image(getClass().getResourceAsStream("/img/com.png"));
			ImageView imagen4= new ImageView(icon4);
			
			Image icon5 = new Image(getClass().getResourceAsStream("/img/dra.png"));
			ImageView imagen5= new ImageView(icon4);
			
			/*
			 * Creamos el nodo principal y posteriormente
			 * implementamos los hijos de esté nodo
			 */
			TreeItem Peliculas_Belicas = new TreeItem("Peliculas Bélicas",imagen);
			//Añadimos  a Peliculas Bélicas sus hijos
			Peliculas_Belicas.getChildren().add(new TreeItem("Salvar al soldado Ryan"));
			Peliculas_Belicas.getChildren().add(new TreeItem("La chaqueta metálica"));
			Peliculas_Belicas.getChildren().add(new TreeItem("Apocalipse now"));
			
			
			// Añadimos a la raíz del proyecto el 1º Nodo principal 
			rootItem.getChildren().add(Peliculas_Belicas);
			
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
			TreeItem Peliculas_Familiares = new TreeItem("Peliculas Familiares",imagen2);
			/*
			 * Para poder tener un subdirectorio dentro del directorio
			 * de peliculas familiares, tenemos que tener opciones 
			 * dentro de los submenus.
			 * 
			 * el ejemplo claro sería; de el directorio - Peliculas_Familiares-
			 * se descolgaran dos sub directorios - P.Infantiles,Comedia-.
			 * 
			 * Además de dos opcioens externas de estos 2 subgrupos
			 */
			
			// Subdirectorios desplegables dentro de Peliculas _Familiares
			TreeItem Infantiles = new TreeItem("Peliculas Infantiles",imagen3);
			
			TreeItem Comedia= new TreeItem("Comedia",imagen4);
			
			// Opciones de los subdirectorio Infantiles y Comedia
			Infantiles.getChildren().add(new TreeItem("Fantasia"));
			Infantiles.getChildren().add(new TreeItem("Toy Story"));
			Comedia.getChildren().add(new TreeItem("No me chilles que no te veo"));
			Comedia.getChildren().add(new TreeItem("La vida de Bryan"));
			
			
			Peliculas_Familiares.getChildren().add(Infantiles);
			Peliculas_Familiares.getChildren().add(Comedia);
			Peliculas_Familiares.getChildren().add(new TreeItem("Los visitantes"));
			Peliculas_Familiares.getChildren().add(new TreeItem("E.T"));
			
			
		
			rootItem.getChildren().addAll(Peliculas_Familiares);
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
			TreeItem Peliculas_Drama = new TreeItem("Peliculas Drama",imagen5);

			Peliculas_Drama.getChildren().add(new TreeItem("Heat"));
			Peliculas_Drama.getChildren().add(new TreeItem("Bailando con lobos"));
			Peliculas_Drama.getChildren().add(new TreeItem("Gran Torino"));

			rootItem.getChildren().add(Peliculas_Drama);
			
	
			TreeView treeView = new TreeView();
           
			Label etq = new Label("");
			treeView.setRoot(rootItem);
			
			treeView.setShowRoot(false);
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------	
						/*
						 * En las sigueintes líneas crearemos la consecución del método
						 * que realice la recogida de la info de TreeView y haga la acción que 
						 * consideremos.
						 */
			
			
			
			treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
	            @Override
	            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
	                //System.out.println(((TreeItem) newValue).getValue());
	                String eleccion = (String) ((TreeItem) newValue).getValue();
	                // Creamos objeto de ventana emergente para poder mostrar la información.
	                try {
	                	ventanaEmergente nueva = new ventanaEmergente();
	                	nueva.mostrar_negrita(  "La pelicula selecciona es:\n" + eleccion, "Pelicula seleccionada", 600, 400);
	                	 etq.setText(eleccion);
	                	
	                }catch(Exception e) {
	                	ventanaEmergenteAlerta alerta = new ventanaEmergenteAlerta();
	                	alerta.alerta("Atención", "Error fatal");
	                }
	               
	            }
	        });			
						
//-----------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------
			HBox n = new HBox(etq);
			n.setMinWidth(600);
			n.setMinHeight(40);
			n.setMaxHeight(200);
			VBox vbox = new VBox(treeView,n);
			Scene scene = new Scene(vbox,600,300);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	
	public static void main(String[] args) {
		launch(args);
	}
	  
}
