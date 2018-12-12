package graficos;

import java.awt.Toolkit;

import javax.swing.*;

import java.awt.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla / 2, alturaPantalla / 2);
		
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		
		setTitle("marcoCentrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/feliz.png");
		
		setIconImage(miIcono);
		
		//Se puede usar este metodo para hacer lo mismo
		//setLocationRelativeTo(null); 
		
	}
	
}