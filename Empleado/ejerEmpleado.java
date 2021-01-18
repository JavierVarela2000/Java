package Empleado;
import java.util.*;
public class ejerEmpleado {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Fecha;
		String nombre;
		String apellido;
		char genero;
		boolean gn=true;
		double salario;
		
		System.out.print("Ingrese el nombre: ");
		nombre=sc.nextLine();
		System.out.print("Ingrese el apellido: ");
		apellido=sc.nextLine();
		System.out.print("Ingrese su genero H para Hombre M para Mujer: ");
		genero=sc.next().charAt(0);
		if(genero=='H') {
			gn=true;
		}
		else if(genero=='M') {
			gn=false;
		}
		sc.nextLine();
		System.out.print("Ingrese su Fecha de nacimiento dd/mm/aaaa: ");
		Fecha=sc.nextLine();
		Fecha fechaNacimiento = new Fecha(Fecha);
		System.out.print("Ingrese su Fecha de ingreso dd/mm/aaaa: ");
		Fecha=sc.nextLine();
		Fecha fechaIngreso = new Fecha(Fecha);
		System.out.print("Ingrese el sueldo: ");
		salario=sc.nextDouble();
		Empleado e1 = new Empleado(nombre,apellido, gn, fechaNacimiento, fechaIngreso, salario);
		e1.visualizarEmpleado();
		System.out.println("Datos del empleado: "+e1);
		

	}

}
