module FX_Clase_Shape_VI_Imagenes {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
