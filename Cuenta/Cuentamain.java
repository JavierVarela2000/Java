package Cuenta;
import java.util.*;
public class Cuentamain {

	public static void main(String[] args) {
		double saldo;
		double abono;
		double retiro;
		int op;
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese el saldo: ");
		saldo=sc.nextDouble();
		Cuenta cuenta=new Cuenta(saldo);
		
		do {
			System.out.println("Saldo: "+cuenta);
			System.out.println("	OPCIONES	");
            System.out.println("1. Agregar saldo ");
            System.out.println("2. Retirar dinero ");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion : ");
            op=sc.nextInt();
            
            switch (op){
            case 1:
            	System.out.print("Abonar: ");
            	abono=sc.nextDouble();
            	cuenta.abonar(abono);
            	break;
            case 2:
            	System.out.print("Retirar: ");
            	retiro=sc.nextDouble();
            	cuenta.retirar(retiro);
            	break;
            case 3:
            	System.out.print("Saliendo");
            	break;
            default:
            	System.out.println("Öpcion invalida");
            	
            }
			
		}while(op!=3);

	}

}
