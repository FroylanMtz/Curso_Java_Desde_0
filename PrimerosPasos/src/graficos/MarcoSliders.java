package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame_Sliders mimarco = new Frame_Sliders();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
}


class Frame_Sliders extends JFrame {
	
	public Frame_Sliders() {
		
		setBounds(550, 300, 550, 400);
		
		Lamina_Sliders milamina = new Lamina_Sliders();
		
		add(milamina);
		
		setVisible(true);
		
	}
	
}

class Lamina_Sliders extends JPanel{
	
	public Lamina_Sliders() {
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la mancha de cuyo nombre");
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8, 50, 12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font(Font.SERIF, Font.ITALIC, 10));
		
		control.addChangeListener(new EventoSlider());
		
		JPanel laminaSlider = new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
		
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			
			
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		}
		
		
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
	
	

}