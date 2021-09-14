package Barras_herramientas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class Barras {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        marco m = new marco();
        m.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        m.setVisible(true);
    }

}

class marco extends JFrame {
    public marco() {
        setTitle("Barra de Herramientas");
        setBounds(700, 200, 700, 350);
        milamina = new JPanel();
        add(milamina);

        EventoColorFondo colorAzul = new EventoColorFondo("Azul", Color.BLUE,
                new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaAzul.gif"));
        EventoColorFondo colorRojo = new EventoColorFondo("Rojo", Color.RED,
                new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaRoja.gif"));
        EventoColorFondo colorVerde = new EventoColorFondo("Verde", Color.GREEN,
                new ImageIcon("/Users/danielgil/Desktop/Curso_Java/src/Barras_herramientas/BolaVerde.gif"));
        JToolBar barra = new JToolBar();
        barra.add(colorAzul);
        barra.add(colorRojo);
        barra.add(colorVerde);
        add(barra, BorderLayout.NORTH);

    }

    private class EventoColorFondo extends AbstractAction {
        public EventoColorFondo(String nombre, Color color_fondo, Icon icono) {
            putValue(Action.NAME, nombre);
            putValue(Action.SMALL_ICON, icono);
            putValue(Action.SHORT_DESCRIPTION, "Pone la lamina o JPanel de color: " + nombre);
            putValue("color_fondo_JPanel", color_fondo);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Color c = (Color) getValue("color_fondo_JPanel");
            milamina.setBackground(c);
            System.out
                    .println("Nombre" + getValue(Action.NAME) + " .Descripción " + getValue(Action.SHORT_DESCRIPTION));
        }

    }

    JPanel milamina;

}
