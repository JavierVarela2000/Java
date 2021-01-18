package Complejo;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		Complejo n1=new Complejo();
		Complejo n2=new Complejo();
		Complejo n3=new Complejo();

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
            	System.out.print("Complejo 1 \ningrese el real: ");
        		n1.setn(sc.nextDouble());
        		System.out.print("ingrese el imaginario: ");
        		n1.seti(sc.nextDouble());
        		System.out.print("Complejo 2 \ningrese el real: ");
        		n2.setn(sc.nextDouble());
        		System.out.print("ingrese el imaginario: ");
        		n2.seti(sc.nextDouble());

            	break;
            case 2:
            	n3=Complejo.suma(n1, n2);
            	System.out.println("La suma es: "+n3.getnumero());
            	break;
            case 3:
            	n3=Complejo.resta(n1, n2);
            	System.out.println("La resta es: "+n3.getnumero());
            	break;
            case 4:
            	n3=Complejo.multiplicacion(n1, n2);
            	System.out.println("La multiplicacion es: "+n3.getnumero());
            	break;
            case 5:
            	n3=Complejo.division(n1, n2);
            	System.out.println("La division es: "+n3.getnumero());
            	break;
            case 6:
            	break;
            default:
            	break;

            }

        }while(opcion!=6); 
	}
}
