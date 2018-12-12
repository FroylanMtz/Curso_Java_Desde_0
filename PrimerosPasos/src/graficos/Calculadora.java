package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}
}


class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500,300,350,400);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
		
		//pack();
		
	}
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		principio = true;
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		//Configura el display de la calculadora
		pantalla.setFont(new Font("Montserrat", Font.BOLD, 30));
		pantalla.setForeground(Color.BLACK);
		pantalla.setBackground(Color.WHITE);
		////////////////////////////////////////////////////////
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);
		
		add(milamina2, BorderLayout.CENTER);
		
		ultimaOperacion = "=";
		
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		
		/////Le agrega estilo/////////////////
		boton.setForeground(Color.WHITE);
		boton.setBackground(new Color(83, 209, 194));
		  
		boton.setFont(new Font("Montserrat", Font.BOLD, 20));
		  
		Border line = new LineBorder(Color.WHITE);
		Border margin = new EmptyBorder(5, 15, 5, 15);
		Border compound = new CompoundBorder(line, margin);
		boton.setBorder(compound);
		///////////////////////////////////////////
		
		//Pone a la escucha a todos los botones
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				
			String entrada = e.getActionCommand();
			
			if(principio) {
				pantalla.setText("");
				principio = false;
			}
			
			pantalla.setText(pantalla.getText() + entrada); 
			
		}
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//Almacena en un string el texto del booton :)
			String operacion = e.getActionCommand();
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion = operacion;
			
			principio = true;
			
		}
		
		public void calcular(double x) {
			
			
			if(ultimaOperacion.equals("+")) {
				resultado += x;
			}
			else if(ultimaOperacion.equals("-")) {
				resultado-=x;
			}
			else if(ultimaOperacion.equals("*")) {
				resultado*=x;
			}
			else if(ultimaOperacion.equals("/")) {
				resultado/=x;
			}
			else if(ultimaOperacion.equals("=")) {
				resultado=x;
			}
			
			
			pantalla.setText(""+resultado);
		}
		
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaOperacion;
}





