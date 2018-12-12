package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado mimarco = new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setVisible(true);
		
		setBounds(300,300,500,350);
		
		CambiaEstado nuevo_estado = new CambiaEstado();
		
		addWindowStateListener(nuevo_estado);
		
	}
}

class CambiaEstado implements WindowStateListener{
	
	public void windowStateChanged(WindowEvent e) {
		
		//System.out.println("La ventana ha cambiado de estado");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana esta a pantalla compelta");
		}else if(e.getNewState() == Frame.NORMAL){
			System.out.println("La ventana est� normal");
		}else if (e.getNewState() == Frame.ICONIFIED) {
			System.out.println("La ventana est� minimizada");
		}
		
	}
}