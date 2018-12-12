import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Froylan";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseña, porfavor");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseña incorrecta");
				
			}
			
		}
		
		System.out.println("Contraseña correcta. Acceso permitido");

	}

}
