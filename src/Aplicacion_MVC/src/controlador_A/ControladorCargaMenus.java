package controlador_A;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;

import vista_A.*;

public class ControladorCargaMenus extends WindowAdapter{
	
	public ControladorCargaMenus(MarcoMVC miJFrame) {
		
		this.miJFrame = miJFrame;
		
	}
	public void windowOpened(WindowEvent e) {
		
		resultadosCombos = new ResultSet[2];
		resultadosCombos=obj.ejecutaConsultas();
		try {
			resultadosCombos[0].previous();
			while(resultadosCombos[0].next()) {
				miJFrame.secciones.addItem(resultadosCombos[0].getString(1));
			}
			
			while(resultadosCombos[1].next()) {
				miJFrame.paises.addItem(resultadosCombos[1].getString(1));
			}
		}catch(Exception e2){
			e2.printStackTrace();
			System.out.println("No se ha podido cargar la info del menú a la ventana");
		}
	}
	
	
	
	CargaMenus obj = new CargaMenus();
	private MarcoMVC miJFrame;
	
	private ResultSet[] resultadosCombos;
}
