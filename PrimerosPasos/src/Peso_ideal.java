import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do{
			genero = JOptionPane.showInputDialog("Introdcue un genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en centimentros"));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			
			pesoideal = altura-110;
			
		}else if(genero.equalsIgnoreCase("M")) {
			
			pesoideal = altura - 120;
			
		}
		
		System.out.println("Tu pero idal ess " + pesoideal + " kg");
		
	}

}
