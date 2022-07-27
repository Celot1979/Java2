package metodos;

import emergente.ventanaEmergente;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Font;

public class metodos {
	public void acciones(TextField Tnom,TextField Ttelf,TextField Tdire) {
		this.Tnom = Tnom;
		this.Ttelf = Ttelf;
		this.Tdire = Tdire;
		mensaje = "Nombre: " + Tnom.getText().toUpperCase() + "\nTeléfono: " + Ttelf.getText() + "\nDirección: " + Tdire.getText().toUpperCase() + 
				"\nTamaño de la pizza es: " ;
		String Titulo_Ventana= " Pedido Realizado";
		if(peque.isSelected())mensaje += "PEQUEÑA";
		if(mediana.isSelected()) mensaje += "MEDIANA";
        if(grande.isSelected()) mensaje += "GRANDE";
        mensaje+= "\nEl grosor de la masa es: ";
        if(fina.isSelected())mensaje += "FINA";
		if(gruesa.isSelected()) mensaje += "GRUESA";
		mensaje += "\nLos ingredientes seleccionado son: \n";
		//Mostrar_Contenido_ListView();
		list_Obser = Lista_Vi.getSelectionModel().getSelectedItems();
		for(String i : list_Obser) {
			menssage += i + "\n";
		}
		mensaje += menssage.toUpperCase();
		ventanaEmergente.mostrar(mensaje, "Datos del pedido !!!");
		//System.out.println(mensaje);
	} 
	
	Label ti, nom,telf,dire;
	Font fuente,titulos_peque;
	TextField Tnom,Ttelf,Tdire;
	ToggleGroup G;
	private RadioButton peque,mediana,grande,exfina,fina,gruesa,R,p,m,g;
	private ToggleGroup grupo = new ToggleGroup();
    private ToggleGroup grupo2 = new ToggleGroup();
    private  ListView<String> Lista_Vi ;
	private Button Accion,Salir;
	private String variable_List,intento,mensaje, menssage;
	ObservableList<String> list_Obser;

}
