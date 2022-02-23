package application;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Primera_aplicacion extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Para que comience el método start
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Button miboton = new Button("Click aqui");
		miboton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Has pulsado el botón");
				
			}
			
		});
		
		StackPane raiz = new StackPane();
		raiz.getChildren().add(miboton);
		Scene miEscena = new Scene(raiz,500,300);
		arg0.setScene(miEscena);
		arg0.show();
		
		
		
	}

}
