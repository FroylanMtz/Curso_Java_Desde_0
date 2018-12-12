package graficos;

import java.awt.Frame;
import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500, 300);
		
		//Le das el setSize y el setLocation en un solo metodo
		setBounds(500,300,550,250);
		
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Registro de pacientes");
		
		
	}
	
}