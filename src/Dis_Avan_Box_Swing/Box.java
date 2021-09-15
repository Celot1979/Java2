import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Box {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MarcoBox mi = new MarcoBox();
        mi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi.setVisible(true);

    }

}

class MarcoBox extends JFrame {
    public MarcoBox() {
        setTitle("Disposiones:Box");
        setBounds(700, 400, 200, 200);
        JLabel nUsuario = new JLabel("Nombre");
        JTextField cUsuario = new JTextField(10);
        cUsuario.setMaximumSize(cUsuario.getPreferredSize());// Para que no se redimensione el JTextField
        Box cajaUsuario = Box.createHorizontalBox();
        cajaUsuario.add(cUsuario);

    }
}
