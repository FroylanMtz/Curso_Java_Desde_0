package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
			
		Jefatura jefe_RRHH = new Jefatura("Froylán", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("Maria Martínez", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Antonio Fernández", 30000, 2000, 01, 01);
		
		misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción
		
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() + " tiene un bonus de " + 
		     jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: " + e.dameNombre()  
					+ " Sueldo: " + e.dameSueldo()
					+ " Fecha de Alta: " + e.dameFechaContrato());
			
		}
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		Id = IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	@Override
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	public Empleado(String nom) {
		
		this(nom, 3000, 2000, 01, 01);
		
	}
	
	public String dameNombre() { //GETTER
		
		return nombre + " Id: " + Id;
		
	}
	
	public double dameSueldo() {  //GETTER
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() { //GETTER
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje) { //SETTER
		
		double aumento = sueldo * porcentaje / 100;
		
		sueldo+=aumento;
		
	}
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + IdSiguiente;
		
	}
	
	@Override
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.Id<otroEmpleado.Id) {
			return -1;
		}
		
		if(this.Id>otroEmpleado.Id) {
			return 1;
		}
		
		return 0;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	private int Id;
	private static int IdSiguiente=1;
	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	@Override
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decicion de " + decision;
		
	}
	
	@Override
	public double establece_bonus(double gratificacion) {
		
		double prima = 2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo = b;
		
	}
	
	@Override
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
}













