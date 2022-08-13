package controlador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import BBDD.*;
import emergente.Ventana_Admin;
import emergente.ventanaEmergente;
import emergente.ventanaEmergenteAlerta;
import emergente.ventanaEmergenteAlerta.*;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class controles {
	@SuppressWarnings("deprecation")
	public void validar_usuarios(TextField nom, TextField pass) {
		Snom =  nom.getText();
		Spass = pass.getText();
		// Bucles for para saber si hay un espacio en banco
		for (int i = 0; i < Snom.length();i++) {
			if(Character.isSpace(Snom.charAt(i))) {
				contador++;
			}
		}
		
		for (int i = 0; i < Spass.length();i++) {
			if(Character.isSpace(Spass.charAt(i))) {
				contadorP++;
			}
		}
		
		/*
		 *  Validamos que en las variables contador no se hubiera contado ningún espacio en blanco. 
		 *  Si es así, entonces pasamos a validar que tengan una determinada longitud cada campo
		 */
		if(contador > 0 || contadorP > 0) {
			ventanaEmergenteAlerta.alerta("No se permite espacios en blanco", "Error",400,300);
			
			borrar_campos(nom,pass);
		}else if(contador == 0 && contadorP == 0) {
			if (nom.getText().length() == 0 || pass.getText().length() == 0 || nom.getText().length() == 0 && pass.getText().length() == 0) {
				
				ventanaEmergenteAlerta.alerta("Campos no rellenados", "Error",400,300);
				nom.setPromptText("Debe rellenar este campo");
				pass.setPromptText("Debe rellenar este campo");
				
				if(pass.getText().length() < 8 || pass.getText().length() > 8) {
					ventanaEmergenteAlerta.alerta("Contraseña menor de 8 caracteres", "Error",400,300);
					borrar_campos(nom,pass);
					pass.setPromptText("Debe de tener 8 caracteres");
				}
				
			}else {
				Conexion redes = new Conexion();
				redes.initConnection();
				redes.validar(nom,pass);
				if(redes.res()== true) {
					//String mensaje = "El nombre del usuario es " + nom.getText() + " y su contraseña es: " + pass.getText();
					//ventanaEmergente.mostrar("ALOHA", "Datos del pedido !!!");
					//Ventana_Admin.admin(700,400);
					Ventana_Admin admin = new Ventana_Admin();
					admin.admin(700, 400);
				}else {
					ventanaEmergenteAlerta.alerta("Usuario o contraseña no registrados", "Error",400,300);
					
					borrar_campos(nom,pass);
					pass.setPromptText("Debe de tener 8 caracteres");
				}
				
				borrar_campos(nom,pass);
		}
		}

	}

	public void borrar_campos(TextField y,TextField T) {
		if (y.getText().length() > 0 || T.getText().length()>0) {
			y.setText("");
			T.setText(null);
		}
	}
	

	private TextField nom, pass;
	private String Snom, Spass;
	private boolean Bnom,Bpass;
	private int contador, contadorP;
	private int resultado;
	
	
}
