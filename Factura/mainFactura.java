package Factura;
import java.util.*;

public class mainFactura {

	public static void main(String[] args) {
		String npieza;
        String descripcion;
        int cantidad;
        double precio;
        Scanner sc=new Scanner(System.in);
        System.out.print("Descripcion: ");
        descripcion=sc.nextLine();
        System.out.print("Cantidad: ");
        cantidad=sc.nextInt();
        System.out.print("Numero de pieza: ");
        sc.nextLine();
        npieza=sc.nextLine();
        System.out.print("Precio: ");
        precio=sc.nextDouble();
        if(precio<0){
            precio = 0.0;
        }
        Factura f=new Factura(npieza,descripcion,cantidad,precio);
        
        System.out.println(f+"\nMonto: "+f.obtenerMontoFactura());
        

	}

}
