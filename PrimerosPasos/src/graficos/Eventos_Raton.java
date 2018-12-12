package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


class MarcoRaton extends JFrame{
	public MarcoRaton() {
		
		setVisible(true);
		
		setBounds(700, 300, 600, 450);
		
		EventosDeRaton EventoRaton = new EventosDeRaton();
		
		addMouseMotionListener(EventoRaton);
		
	}
}

class EventosDeRaton extends MouseAdapter implements MouseMotionListener{
	
	/*public void mouseClicked(MouseEvent e) {
		
		//System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		
		System.out.println(e.getClickCount());
		
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		}else if(e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}

	}*/
	
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando");
	}
	
	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo");
		
	}
	
	
}