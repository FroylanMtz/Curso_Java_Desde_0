import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Froylan";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa, porfavor");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contraseņa incorrecta");
				
			}
			
		}
		
		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
