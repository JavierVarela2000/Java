package VarelaProgreso2;

import java.util.Scanner;

public class VarelaProgreso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Encuesta ec=new Encuesta();
		int opcion;
		int edad;
		int estado;
		int opinion;
		do
        {
            System.out.println("	OPCIONES	");
            System.out.println("1. Visualizar Promedio total de la encuesta ");
            System.out.println("2. Visualizar el numero total de opiniones recogidas por la encuesta ");
            System.out.println("3. Agregar una opinion a la encuesta ");
            System.out.println("4. Consultar el valor parcial de la encuesta para un sector demográfico ");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion : ");
            
            opcion = sc.nextInt();

            
            switch(opcion) {
            case 1:
            	System.out.println("El promedio es: "+ec.darPromedio());

            	break;
            case 2:
            	System.out.println("El numero total de opiniones es: "+ec.darNumeroTotalOpiniones());
            	break;
            case 3:
            	System.out.print("Ingrese su edad: ");
            	edad=sc.nextInt();
            	while(edad<0) {
            		System.out.println("Edad incorrecta");
            		System.out.print("Ingrese una edad valida: ");
            		edad=sc.nextInt();
            	}
            	System.out.print("Si usted es soltero ingrese 1, Si usted es casado ingrese 2: ");
            	estado=sc.nextInt();
            	while(estado!=1 || estado!=2) {
            		System.out.println("Estado civil invalido");
            		System.out.print("Si usted es soltero ingrese 1, Si usted es casado ingrese 2: ");
            		estado=sc.nextInt();
            	}
            	System.out.print("ingrese su opinion del 1 al 10: ");
            	opinion=sc.nextInt();
            	while(opinion<0 || opinion>10) {
            		System.out.println("Opinion invalida");
                	System.out.print("ingrese su opinion del 1 al 10: ");
                	opinion=sc.nextInt();
            	}
            	if(edad>0 && edad<18) {
            		switch (estado){
            		case 1:
            			ec.agregarOpinionRangoEdadJovenesSoltero(opinion);
            			break;
            		case 2:
            			ec.agregarOpinionRangoEdadJovenesCasado(opinion);
            		break;
            		}
            	}
            	else if(edad>=18 && edad<=55){
            		switch (estado){
            		case 1:
            			ec.agregarOpinionRangoEdadAdultosSoltero(opinion);
            			break;
            		case 2:
            			ec.agregarOpinionRangoEdadAdultosCasado(opinion);
            		break;
            		}
            	}
            	else if(edad>55) {
            		switch (estado){
            		case 1:
            			ec.agregarOpinionRangoEdadMayoresSoltero(opinion);
            			break;
            		case 2:
            			ec.agregarOpinionRangoEdadMayoresCasado(opinion);
            		break;
            		}
            	}
            	break;
            case 4:
            	System.out.println("El promedio de opiniones de los jovenes solteros es: "+ec.darResultadosJovenesSolteros());
            	System.out.println("El promedio de opiniones de los adultos solteros es: "+ec.darResultadosAdultosSolteros());
            	System.out.println("El promedio de opiniones de los mayores solteros es: "+ec.darResultadosMayoresSolteros());
            	System.out.println("El promedio de opiniones de los jovenes casados es: "+ec.darResultadosJovenesCasados());
            	System.out.println("El promedio de opiniones de los adultos casados es: "+ec.darResultadosAdultosCasados());
            	System.out.println("El promedio de opiniones de los mayores casados es: "+ec.darResultadosMayoresCasados());
            	System.out.println("El promedio total es: "+ec.darPromedio());
            	break;
            case 5:
            	System.out.println("El programa ha finalizado");
            	
            	break;
            default:
            	System.out.println("Opcion invalida");
            	break;

            }

        }while(opcion!=5); 

	}
	
	

}
