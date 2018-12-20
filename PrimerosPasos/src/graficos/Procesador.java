package graficos;

import java.awt.*;
import javax.swing.*;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuProcesador mimarco = new MenuProcesador();
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador()
	{
		setBounds(500, 300, 550, 400);
		
		LaminaProcesador milamina = new LaminaProcesador();
		
		//this.setJMenuBar( mibarra);
		
		add(milamina);
		
		setVisible(true);
	}
	
}

class LaminaProcesador extends JPanel {
	
	public LaminaProcesador()
	{
		setLayout(new BorderLayout());
		
		JPanel laminaMenu = new JPanel();
		
		JMenuBar mibarra = new JMenuBar();
		
		//---------------------------------------------------
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		//---------------------------------------------------
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem verdana = new JMenuItem("Verdana");
		JMenuItem acme = new JMenuItem("Acme");
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		fuente.add(acme);
		
		//----------------------------------------------------
		
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");

		
		estilo.add(negrita);
		estilo.add(cursiva);

		
		//----------------------------------------------------
		JMenuItem tam_12 = new JMenuItem("12");
		JMenuItem tam_16 = new JMenuItem("16");
		JMenuItem tam_20 = new JMenuItem("20");
		JMenuItem tam_24 = new JMenuItem("24");
		
		tamano.add(tam_12);
		tamano.add(tam_16);
		tamano.add(tam_20);
		tamano.add(tam_24);
		
		//-----------------------------------------------------
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);
		
		laminaMenu.add(mibarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
	}
	
}