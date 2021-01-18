package IMC;
import java.util.*;

public class Paciente {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int op=1;
		double peso;
		double altura;
		do {
			System.out.print("Ingrese el peso: ");
			peso=sc.nextDouble();
			System.out.print("Ingrese la altura: ");
			altura=sc.nextDouble();
			IMC paciente=new IMC(peso,altura);
			System.out.println(paciente+"imc: "+paciente.calcularimc()+"\n"+paciente.diagnostico());
			
			
			
			
			System.out.println("Ingrese 1 para continuar \nIngrese 0 para salir");
			op=sc.nextInt();
		}while(op!=0);

	}

}
