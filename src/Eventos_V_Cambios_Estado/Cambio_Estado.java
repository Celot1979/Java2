package Eventos_V_Cambios_Estado;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class Cambio_Estado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameEventWindow Frame = new FrameEventWindow();
		Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Frame.addWindowStateListener(new WindowEvents());

	}

}
class FrameEventWindow extends JFrame{
	public FrameEventWindow () {
		setBounds(300,300,600,350);
		setVisible(true);
	}
}

class WindowEvents implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("The window has changed state");
		
		System.out.println(e.getNewState());
		
		int l = e.getNewState();
		
		//El condicional se implementa a modo de comprobación
	    if(l == 0) {
	    	System.out.println("Window Rise");
	    }else if (l == 1) {
	    	System.out.println("Minimize the Window");
	    }else if (l == 6) {
	    	System.out.println("Maximize both sides");
	    }else if (l == 0) {
	    	System.out.println("NORMAL");
	    }
	}
	
	
}