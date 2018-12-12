package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes mimarco = new MarcoConFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con Fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes miLamina = new LaminaConFuentes();
		
		add(miLamina);
		
		//Establecer el color de todos los elementos
		
		miLamina.setForeground(Color.BLUE);

	}
}

class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g; //Es abstracta y no puede instanciarse
		
		Font mifuente = new Font("Courier", Font.BOLD, 26);
		
		g2.setFont(mifuente);
		
		//g2.setColor(Color.BLUE);
		
		g2.drawString("Froylan", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC, 24) );
		
		//g2.setColor(new Color(20,129,123).brighter());
		
		g2.drawString("Curso de Java", 100, 200);
		
	}
	
}