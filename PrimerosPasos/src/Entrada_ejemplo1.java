import java.util.*;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, porfavor: ");
		
		String nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce edad, porfavor: ");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendras " + (edad+1) + " a�os");
	}

}
