package titulo;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.text.Font;

public class Titulo {
	
	public static Label ti(Label l,String Texto) {
		l = new Label(Texto);
		
		l.setMinWidth(200);
		l.setPrefWidth(100);
		l.setAlignment(Pos.BASELINE_LEFT);
		fuente=new Font("Monospaced", 25);
		l.setFont(fuente);
		return l;
		
	}
	
	
	private static Font fuente;

}
