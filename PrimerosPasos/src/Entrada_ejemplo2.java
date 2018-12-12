import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre porfavor ");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad porfavor: ");
		
		int edad_usuario = Integer.parseInt(edad);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + edad_usuario + " años");
		

	}

}
