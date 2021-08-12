import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import Componentes_Swing.JTextField;

public class Eventos_JTextField {
    public static void main(String[] args){
        MarcoCuadroEvento mimarco = new MarcoCuadroEvento();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoCuadroEvento extends JFrame{
    public MarcoCuadroEvento(){
        setTitle("Leccción Eventos-JTextField");
		setBounds(600,300,600,400);
		add(new LaminaCuadroTexto());
		setVisible(true);
    }
}

class LaminaCuadroTexto extends JPanel{
    public LaminaCuadroEvento(){
        campo = new JTextField(20);
        Document mi_documento = campo.getDocument();
        mi_documento.addDocumentListener(new EscuchaTexto);

		add(campo);

    }
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Has introduccido texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            // TODO Auto-generated method stub
            
        }

		
		
	}
    JTextField campo;

}