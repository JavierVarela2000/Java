package Racional;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		Racional n1=new Racional();
		Racional n2=new Racional();
		Racional n3=new Racional();

		do
        {
            System.out.println("	OPCIONES	");
            System.out.println("1. Ingreso de datos ");
            System.out.println("2. Suma ");
            System.out.println("3. Resta ");
            System.out.println("4. Multiplicacion ");
            System.out.println("5. Division ");
            System.out.println("6. Salir");
            System.out.print("Elija una opcion : ");
            
            opcion = sc.nextInt();

            
            switch(opcion) {
            case 1:
        		System.out.print("Racional 1 \ningrese el numerador: ");
        		n1.setNumerador(sc.nextInt());
        		System.out.print("ingrese el denominador: ");
        		n1.setDenominador(sc.nextInt());
        		System.out.print("Racional 2 \ningrese el numerador: ");
        		n2.setNumerador(sc.nextInt());
        		System.out.print("ingrese el denominador: ");
        		n2.setDenominador(sc.nextInt());
        		
            	break;
            case 2:
            	n3=Racional.suma(n1, n2);
            	System.out.println("La suma es: "+n3);
            	break;
            case 3:
            	n3=Racional.resta(n1, n2);
            	System.out.println("La resta es: "+n3);
            	break;
            case 4:
            	n3=Racional.multiplicacion(n1, n2);
            	System.out.println("La multiplicacion es: "+n3);
            	break;
            case 5:
            	n3=Racional.division(n1, n2);
            	System.out.println("La division es: "+n3);
            	break;
            case 6:
            	System.out.println("El programa ha finalizado con exito");
            	break;
            default:
            	System.out.println("Opcion invalida");
            	break;
            }
        }while(opcion!=6);  
	}

}
