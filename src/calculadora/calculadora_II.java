package calculadora;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class calculadora_II {
    public static void main(String[] args) {
        Marco mimarco = new Marco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
}
class Marco extends JFrame{
    public Marco(){
        setTitle("Calculadora");
        setBounds(800,300,400,200);
        laminaCaja lamina = new laminaCaja();
        add(lamina,BorderLayout.SOUTH);
        setVisible(true);
    }
}

class laminaCaja extends JPanel{
    public laminaCaja() {
        setLayout(new BorderLayout());
        JButton pantalla =new JButton("0");
        add(pantalla, BorderLayout.NORTH);

        numeracion = new JPanel();
        numeracion.setLayout(new GridLayout(4,4));

        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("x");
        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("-");
        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("+");
        ponerBoton("0");
        ponerBoton(",");
        ponerBoton("=");
        ponerBoton(" ");
        

        add(numeracion, BorderLayout.CENTER);

        


    }
    private void ponerBoton(String textoBoton) {
        JButton boton = new JButton(textoBoton);
        numeracion.add(boton);
    }
    private JPanel numeracion;
}
/*En está lección hemos creado un método privado que será el encargado de ir creando los botones
según el flujo del programa vaya trabajando.
Posteriormente hemos ido definiendo cada botón del método en el Panel principal.

Finalmente hemos pasado la variable objeto local (JPanel numeracion) a varieble ámbito de clase.
Sólo nombramos está variable en el contructor. */