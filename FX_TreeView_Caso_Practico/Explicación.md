# Ejercicio práctico de TreeView 
- [Daniel G.M](https://github.com/Celot1979)
## Objetivos del proyecto
El proyecto se realiza para la practica de la contrucción de un componente - TreeView - con Java Fx. Como plus, se ha elegido implementar unos iconos en los Nodos principales.
En la funcionalidad de cada - TreeItem - emergerá una nueva ventana que nos anunciará la pelicula7 género escogido. Además, en la parte inferior de la 1ª ventana podremos ver también el titulo.
* Crear un paquete en la carpeta src para las ventanas emergentes.
* Paquete que contenga las imágenes de los iconos.

<img width="600" alt="Captura de pantalla 2022-06-24 a las 19 05 15" src="https://user-images.githubusercontent.com/67976795/175609312-11a70df2-4361-4ff0-b789-7f0257a93809.png">
<img width="599" alt="Captura de pantalla 2022-06-24 a las 19 05 31" src="https://user-images.githubusercontent.com/67976795/175609327-c384717a-bc60-450e-9b09-4831c2b9a01c.png">

## Explicación de partes del código.
Creamos una raíz que es el nodo principal.
Como podemos comprobar en la interfz no sale
visible la raíz
```java
TreeItem rootItem = new TreeItem("Peliculas");
```java
* Antes de proseguir la creación de los subnodos que colgaran de la raíz principal, crearemos los objetos de imagen.
  Estos serán lo que se implementen en los contructores de los subnodos principales (hijos).
```
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
```java

* Creamos los subnodos principales. Colgaran de la raíz principal.

	TreeItem Peliculas_Belicas = new TreeItem("Peliculas Bélicas",imagen);
  //Añadimos  a Peliculas Bélicas sus hijos
	Peliculas_Belicas.getChildren().add(new TreeItem("Salvar al soldado Ryan"));
	Peliculas_Belicas.getChildren().add(new TreeItem("La chaqueta metálica"));
	Peliculas_Belicas.getChildren().add(new TreeItem("Apocalipse now"));
        TreeItem Peliculas_Familiares = new TreeItem("Peliculas Familiares",imagen2);
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
			
        TreeItem Peliculas_Drama = new TreeItem("Peliculas Drama",imagen5);
        Peliculas_Drama.getChildren().add(new TreeItem("Heat"));
	Peliculas_Drama.getChildren().add(new TreeItem("Bailando con lobos"));
	Peliculas_Drama.getChildren().add(new TreeItem("Gran Torino"));
        //Se añaden a la raíz
       rootItem.getChildren().add(Peliculas_Belicas);
  rootItem.getChildren().addAll(Peliculas_Familiares);
  rootItem.getChildren().add(Peliculas_Drama);

```
* Crearemos el árbol
```java
	TreeView treeView = new TreeView();
	treeView.setRoot(rootItem);
	// Que cuando aparezca la ventana esté contraido
	treeView.setShowRoot(false);

```
* Creamos la eqtiqueta que servirá para hacer visible en la parte inferior de la ventana el titulo de la pelicula escogida.
```java
Label etq = new Label("");

```
* Se implementa la layout que contendrá esté componente. Tiene unas características de ancho y altura modificables.
```java
HBox n = new HBox(etq);
n.setMinWidth(600);
n.setMinHeight(40);
n.setMaxHeight(200);
```
* Desarrollamos el método que está a la escucha y realiza la acción al seleccionar uno de los - TreeItem - 
```java
treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
	            @Override
	            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
	                //System.out.println(((TreeItem) newValue).getValue());
	                String eleccion = (String) ((TreeItem) newValue).getValue();
	                // Creamos objeto de ventana emergente para poder mostrar la información.
	                try {
			       // Esta sentencia llama a la clase del paquete -import emergente.* - Que debemos de creear dentro de SRC del proyecto.
	                	ventanaEmergente nueva = new ventanaEmergente();
	                	nueva.mostrar_negrita(  "La pelicula selecciona es:\n" + eleccion, "Pelicula seleccionada", 600, 400);
	                	 etq.setText(eleccion);
	                	
	                }catch(Exception e) {
			        // Esta sentencia llama a la clase del paquete -import emergente.* - Que debemos de creear dentro de SRC del proyecto.
	                	ventanaEmergenteAlerta alerta = new ventanaEmergenteAlerta();
	                	alerta.alerta("Atención", "Error fatal");
	                }
	               
	            }
	        });			
```
* Terminamos por construir un layout vertical - contendrá el árbol y la layout de la etiqueta.
* Al finalizar, mostramos el contenidos de todo el código.
```java
VBox vbox = new VBox(treeView,n);
Scene scene = new Scene(vbox,600,300);
primaryStage.setScene(scene);
primaryStage.show();
```

## Código 
```java
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

```
### Clases del paquete Emergente
* Estás 2 clases son las encargadas de crear las ventanas emergentes.
* 1º Ventana emergente que informa de la pelicula seleccionada.
* 2º Ventana que en caso que se entre en el catch, nos informe del error que ha sucedido.
```java
ackage emergente;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ventanaEmergente {
	public static void mostrar(String mensaje, String Titulo,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,ancho,altura);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
	//Método sobre cargado para tener una ventana Standar,
	// Así no tenemos que pasar en el contructor una medida.
	public static void mostrar(String mensaje, String Titulo) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,800,600);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
	
	public static void mostrar_negrita(String mensaje_negrita, String Titulo_negrita,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo_negrita);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		
		Font fuente = new Font("Monospaced", 20);
		Label miLabel = new Label();
		miLabel.setText( mensaje_negrita);
		miLabel.setFont(fuente);
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane, ancho,altura);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
}
	



```
```java
package emergente;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ventanaEmergenteAlerta {
	public static void alerta(String mensaje, String Titulo,int ancho,int altura) {
		Stage miStage = new Stage();
		miStage.setMinWidth(ancho);
		miStage.setMinHeight(altura);
		Alert alert = new Alert(Alert.AlertType.ERROR);
	    alert.setHeaderText(null);
	    alert.setTitle(Titulo);
	    alert.setContentText(mensaje);
	    alert.showAndWait();
		
		miStage.showAndWait();
	}
	//Método sobre cargado para tener una ventana Standar,
	// Así no tenemos que pasar en el contructor una medida.
	public static void alerta(String mensaje, String Titulo) {
		Stage miStage = new Stage();
		miStage.initModality(Modality.APPLICATION_MODAL);
		
		miStage.setTitle(Titulo);
		miStage.setMinWidth(700);
		miStage.setMinHeight(300);
		Label miLabel = new Label();
		miLabel.setText(mensaje);
		
		Button miBoton = new Button();
		miBoton.setText("Cerrar");
		
		miBoton.setOnAction(e -> miStage.close());
		
		BorderPane miPane =  new BorderPane();
		Scene miScene = new Scene(miPane,800,600);
		
		miPane.setTop(miLabel);
		miPane.setCenter(miBoton);
		
		miStage.setScene(miScene);
		
		miStage.showAndWait();
	}
}

```
