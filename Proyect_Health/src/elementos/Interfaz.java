package elementos;

import controlador.controles;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Interfaz {
	public static  Group imagen(Stage X) {
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// TITULO DE LA APLICACIÓN
		RadialGradient deg2 = new RadialGradient(0.5, 0.5, 0, 1, 1, true, CycleMethod.NO_CYCLE, new Stop(0.0,Color.YELLOW),new Stop(1.0,Color.GREEN));
		Text texto_trabajo = new Text(10,600,"PharmaKrill");
		//Tamaño y tipo de fuente
		texto_trabajo.setFont(new Font("Arial",100));
		//Implementación de la línea de degradado
		texto_trabajo.setFill(deg2);

		//Si se quiere podemos darle un trazo y su grosor
		texto_trabajo.setStroke(Color.BLACK);
		texto_trabajo.setStrokeWidth(0.5);

		DropShadow sombra = new DropShadow ();
		sombra.setRadius(5.0);
		sombra.setOffsetX(3.0);
		sombra.setOffsetY(10.0);
		sombra.setColor(Color.color(0.4, 0.5, 0.5));

		texto_trabajo.setEffect(sombra);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		//LOGOTIPO DE LA APLICACIÓN
		p =new Image("file:/Volumes/NO NAME/JSP/Proyect_Health/src/IMG/Logo_limpio.png");
		pho = new ImageView(p);
		pho .setFitWidth(280);
		pho .setPreserveRatio(true);
		//HBox Imagen.
		VBox Horizontal_Pane_1= new VBox(texto_trabajo,pho);
		Horizontal_Pane_1.setAlignment(Pos.CENTER);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// ETIQUETAS DE TEXTO DE LA INTERFAZ INICIAL
		Lnom = new Label("Nombre");
		Lnom.setMinWidth(200);
		Lnom.setPrefWidth(100);
		Lnom.setAlignment(Pos.CENTER);

		Lpass = new Label("Contraseña");
		Lpass.setMinWidth(200);
		Lpass.setPrefWidth(100);
		Lpass.setAlignment(Pos.CENTER);
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
		// CAJAS DE TEXTO DE TEXTO DE LA INTERFAZ INICIAL
		nom = new TextField();
		nom.setMinWidth(200);
		nom.setMaxWidth(200);
		nom.setPromptText("Nombre");
		nom.setAlignment(Pos.CENTER_LEFT);


		pass= new TextField();
		pass.setMinWidth(200);
		pass.setMaxWidth(200);
		pass.setPromptText("Contraseña");
		pass.setAlignment(Pos.CENTER_LEFT);

		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
		// BOTONES DE LA INTERFAZ

		enviar = botones(enviar,"Enviar", X,nom,pass); 
		enviar.getStyleClass().add("boton-stilo-1");
		salir = botones(salir,"Salir", X,nom,pass); 
		salir.getStyleClass().add("boton-stilo-salir");


		//HBox de EQIQUETAS Y CAJAS DE TEXTO
		HBox Horizontal_Pane_2= new HBox(10,Lnom,nom);
		Horizontal_Pane_2.setAlignment(Pos.CENTER_LEFT);
		Horizontal_Pane_2.setPadding(new Insets(6));

		HBox Horizontal_Pane_3= new HBox(10,Lpass,pass);
		Horizontal_Pane_3.setAlignment(Pos.CENTER_LEFT);
		Horizontal_Pane_3.setPadding(new Insets(6));

		HBox Horizontal_Pane_4= new HBox(10,enviar,salir);
		Horizontal_Pane_4.setAlignment(Pos.CENTER);
		Horizontal_Pane_4.setPadding(new Insets(6));

		VBox Vertical_Datos = new VBox(Horizontal_Pane_1, Horizontal_Pane_2,Horizontal_Pane_3,Horizontal_Pane_4);
		Vertical_Datos.setPadding(new Insets(3));
		//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		g1 = new Group();
		g1.getChildren().addAll(Vertical_Datos);
		return g1;

		}
		public static Button botones(Button Accion,String Titulo,Stage primaryStage,TextField nom,TextField pass) {
		Accion  = new Button(Titulo);
		Accion .setMinWidth(80);
		Accion .setMaxWidth(80);
		Accion.getStyleClass().add("boton-conjunto");
		controles nuevo = new controles();
		if (Titulo.equals("Enviar")) {
		Accion.setOnAction(e -> nuevo.validar_usuarios(nom,pass));

		}
		if(Titulo.equals("Salir")) Accion.setOnAction(e -> primaryStage.close());
		return Accion;
		}

		private static ImageView pho,pho2;
		private static Image p,p2;
		private static Group g1;
		private static TextField nom, pass;
		private static Label Lnom, Lpass;
		private static Button enviar,salir;
		private static Stage primaryStage;
		}

