package controlador;

import java.awt.event.*;

import vista.*;

// Está clase es para comunicar  CargaMenus con Marco_MVC.
// Porteriormente se cargará los registros de casa sección.
// 3º Vamos a implementar la clase adaptadora windowAdapter
public class ControladorCargaMenus extends WindowAdapter {
//	6º Si en el contructor no realizamos los siguientes pasos, cuando iniciemos lapp no se cargará las secciones en el  JComboBox
	public ControladorCargaMenus(Marco_MVC  miJFrame) {
		this.miJFrame = miJFrame;
	}
	public void windowOpened(WindowEvent e) {

		
		
/*	
 * 4º Instanciamos el objeto CargaMenus e imlmentamos el método.
 * Esto lo hacemos para que cuando se abra la ventana  el ComboBox cargue el registro
 * que tenemos guardardo.
 */

		obj.ejecutaConsultas();
		try {
			
//	5º En esté paso crearemos un while para ir pasando el cursor de un registro a otro.
			
			while(obj.resSec.next()) {
				//miJFrame.secciones.addItem(obj.resSec.getString(1));
				
				miJFrame.secciones.addItem(obj.resSec.getString(1));
			}
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
	
	
	
//	2º Al estar en el mimso paquete, no hace falta encapsular el obj. Simplemente lo construimos.
	CargarMenus obj = new CargarMenus();
//	1º Con el campo encapsulado tenemos acceso a toda la info de la interfaz
	private Marco_MVC  miJFrame;
	

}
