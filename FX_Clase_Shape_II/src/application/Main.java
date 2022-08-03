package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
// Arco en la figura.	
			
			Arc arc = new Arc();
			arc.setCenterX(100.0f);
			arc.setCenterY(100.0f);
			arc.setRadiusX(100.0f);
			arc.setRadiusY(100.0f);
			arc.setStartAngle(0.0f);
			arc.setLength(180.0f);
			
			//Tipo de arco abierto. No tiene línea de base
			arc.setType(ArcType.OPEN);
			//Color del relleno
			arc.setFill(Color.WHITE);
			//Color del contorno
			arc.setStroke(Color.RED);
			
			
// Final del arco

// Inicio del circulo
			
			Circle circle = new Circle();
			circle.setCenterX(200.0f);
			circle.setCenterY(200.0f);
			circle.setRadius(100.0f);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.RED);
			
// Final del circulo
			
// Inicio del CubicCurve
			CubicCurve cubic = new CubicCurve();
			cubic.setStartX(0.0f);
			cubic.setStartY(50.0f);
			cubic.setControlX1(50.0f);
			cubic.setControlY1(0.0f);
			cubic.setControlX2(75.0f);
			cubic.setControlY2(100.0f);
			cubic.setEndX(200.0f);
			cubic.setEndY(50.0f);
			cubic.setFill(Color.WHITE);
			cubic.setStroke(Color.RED);
// Final del CubicCurve
			
// Inicio del Elipse	
			Ellipse ellipse = new Ellipse();
			ellipse.setCenterX(100.0f);
			ellipse.setCenterY(50.0f);
			ellipse.setRadiusX(100.0f);
			ellipse.setRadiusY(25.0f);
			ellipse.setFill(Color.WHITE);
			ellipse.setStroke(Color.RED);
// Final del Elipse
			
// Inicio del PATH	
			
			Path path = new Path();

			MoveTo moveTo = new MoveTo();
			moveTo.setX(0.0f);
			moveTo.setY(0.0f);

			HLineTo hLineTo = new HLineTo();
			hLineTo.setX(70.0f);

			QuadCurveTo quadCurveTo = new QuadCurveTo();
			quadCurveTo.setX(120.0f);
			quadCurveTo.setY(60.0f);
			quadCurveTo.setControlX(100.0f);
			quadCurveTo.setControlY(0.0f);

			LineTo lineTo = new LineTo();
			lineTo.setX(175.0f);
			lineTo.setY(55.0f);

			ArcTo arcTo = new ArcTo();
			arcTo.setX(50.0f);
			arcTo.setY(50.0f);
			arcTo.setRadiusX(50.0f);
			arcTo.setRadiusY(50.0f);

			path.getElements().add(moveTo);
			path.getElements().add(hLineTo);
			path.getElements().add(quadCurveTo);
			path.getElements().add(lineTo);
			path.getElements().add(arcTo);
// Final del PATH	
			
// Inicio del  Polygon
			Polygon polygon = new Polygon();
			polygon.getPoints().addAll(new Double[] { 0.0, 0.0, 20.0, 10.0, 10.0, 20.0 });
// Final del Polygon
			
// Inicio del  Polyline
			Polyline polyline = new Polyline();
			polyline.getPoints().addAll(new Double[] { 0.0, 0.0, 20.0, 10.0, 10.0, 20.0 });
// Final del Polygon
			FlowPane panel = new FlowPane();
			panel.setPadding(new Insets(20));
			panel.setAlignment(Pos.TOP_CENTER);
			panel.getChildren().addAll(arc,circle,cubic,ellipse,path,polygon,polyline);

			Scene scene = new Scene(panel,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
