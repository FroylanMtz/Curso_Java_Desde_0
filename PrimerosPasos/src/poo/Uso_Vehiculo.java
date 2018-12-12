package poo;

public class Uso_Vehiculo {
	
	public static void main(String args[]) {
		
		Coche micoche1 = new Coche();
		
		micoche1.establece_color("Rojo");
		
		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		
		miFurgoneta1.establece_color("Azul");
		
		miFurgoneta1.configura_asientos("Si");
		
		miFurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(miFurgoneta1.dime_datos_generales() + " " + miFurgoneta1.dimeDatosFurgoneta());
		
		
		
	}
}