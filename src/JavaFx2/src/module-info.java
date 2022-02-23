module JavaFx2 {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
