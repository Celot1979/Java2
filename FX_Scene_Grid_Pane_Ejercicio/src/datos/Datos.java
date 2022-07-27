package datos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
public class Datos {
	public Label Crear_Label(Label Y, String Titulo) {
		Y =  new Label(Titulo);
		Y.setMinWidth(200);
		Y.setPrefWidth(100);
		Y.setAlignment(Pos.BASELINE_LEFT);
		/*if(Tipo.equals("Titulo")) {
			fuente=new Font("Monospaced", 26);
			Y.setFont(fuente);
		}else {
			titulos_peque= new Font("Monospaced",18);
			Y.setFont(titulos_peque);
		}*/
		return Y;
	}
	public TextField Crear_TextField(TextField X, String Titulo) {
		X = new TextField();
		X.setMinWidth(200);
		X.setMaxWidth(200);
		X.setPromptText(Titulo);
		return X;
	}
	
	
	public  RadioButton RadioButton(RadioButton R, String Titulo,ToggleGroup g) {
		R =  new RadioButton(Titulo);
		R.setPadding(new Insets(8));
		R.setToggleGroup(g);
		return R;
		
	}
	
	
	
	private ToggleGroup grupo = new ToggleGroup();
    private ToggleGroup grupo2 = new ToggleGroup();
	private  Label nom,telf,dire;
	private  TextField Tnom,Ttelf,Tdire;
	private  Font fuente,titulos_peque;
	private  ToggleGroup G;
	private RadioButton R;
	
}
