package controlador_A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo_A.EjecutaConsultas;
import vista_A.MarcoMVC;

public class ControladorBotonEjecutar implements ActionListener {
	
	public ControladorBotonEjecutar(MarcoMVC miFrame) {
		super();
		this.miFrame = miFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String selecionSeccion = (String)miFrame.getSecciones().getSelectedItem();
		String selecionPais = (String)miFrame.getPaises().getSelectedItem();
		/*miFrame.getResultados().append(obj.consulta_BBDD(selecionSeccion, selecionPais));
		miFrame.getResultados().append("\n");*/
		resultadoConsulta = obj.consulta_BBDD(selecionSeccion, selecionPais);
		try {
			miFrame.getResultados().setText("");
			while(resultadoConsulta.next()) {
				//Forma largar para ir imprmiendo cada resultado
				
				miFrame.getResultados().append(resultadoConsulta.getString(1));
				miFrame.getResultados().append(" , ");
				miFrame.getResultados().append(resultadoConsulta.getString(2));
				miFrame.getResultados().append(" , ");
				miFrame.getResultados().append(resultadoConsulta.getString(3));
				miFrame.getResultados().append(" , ");
				miFrame.getResultados().append(resultadoConsulta.getString(4));
				miFrame.getResultados().append("\n");
				
				//Forma más corta y elegante. No existe tanta repetición del código
				
				
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	private MarcoMVC miFrame;
	private EjecutaConsultas obj = new EjecutaConsultas();
	private ResultSet resultadoConsulta,resultadoConsultaPais ;

}
