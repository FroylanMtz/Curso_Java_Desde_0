package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.time.format.FormatStyle;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor mimarco = new MarcoConColor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Prueba con Colores");
		
		setSize(400,400);
		
		LaminaConColor miLamina = new LaminaConColor();
		
		add(miLamina);
		
		//Establece un color de fondo
		miLamina.setBackground(SystemColor.window);

	}
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g; //Es abstracta y no puede instanciarse
		
		//Dibujo de rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.BLUE);
		
		g2.draw(rectangulo);
		
		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		//Dibujando Elipse
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		//g2.setPaint(Color.BLUE);
		
		Color micolor = new Color(125, 251, 200);
		
		//El metodo darker y bighter hace brillar o escurece el color
		g2.setPaint(micolor.darker());
		
		g2.fill(elipse);
	}
	
}