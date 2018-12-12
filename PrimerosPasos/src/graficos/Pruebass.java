package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class Pruebass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente: ");
		
		boolean estalafuente = false;
				
		String [] nombreDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombredelafuente: nombreDeFuentes) {
			
			if(nombredelafuente.equals(fuente)) {
				
				estalafuente = true;
				
			}
		}
		
		if(estalafuente) {
			
			System.out.println("Fuente instalada");
			
		}else {
			System.out.println("No esta instalada la fuente");
		}
		
	}
}