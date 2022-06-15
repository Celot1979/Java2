module FX_TextField_CheckBox_ButtonRadio {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
