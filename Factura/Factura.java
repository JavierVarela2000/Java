package Factura;

public class Factura {
	String pieza;
    String descripcion;
    int cantidad;
    double precioarticulo;
    public Factura(String pieza,String descripcion,int cantidad,double precio) {
    	setnumpieza(pieza);
    	setdescripcion(descripcion);
    	setcantidadarticulos(cantidad);
    	setprecioarticulos(precio);
    	
    	
    }

    public String getnumpieza(){
        return pieza;
    }
    public String getdescripcion(){
        return descripcion;
    }
    public int getcantidadarticulos(){
        return cantidad;
    }
    public double getprecioarticulos(){
        return precioarticulo;
    }

    public void setnumpieza(String numeropieza){
    	pieza = numeropieza;
    }
    public void setdescripcion(String descripcion){
    	this.descripcion = descripcion;
    }
    public void setcantidadarticulos(int cantidaddearticulos){
    	cantidad= cantidaddearticulos;
    }
    public void setprecioarticulos(double preciodelarticulo){
        this.precioarticulo=preciodelarticulo;
    }
    
    
    public double obtenerMontoFactura(){
        double factura;
        
        factura = getcantidadarticulos()*getprecioarticulos();
        
        if(factura < 0){
            factura = 0;
        }
        
        return factura;
    }
    @Override
    public String toString() {
    	return "pieza: "+pieza+"\nDescripcion: "+descripcion+"\ncantidad: "+cantidad+"\nPrecio: "+precioarticulo;
    }
}
