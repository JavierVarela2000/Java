package Racional;

class Racional {

	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;	
	}
	public int getDenominador() {
		
		return denominador;

	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
		if(denominador==0){
			this.denominador=1;
		}
	}
	public String getracional() {
		return numerador+"/"+denominador;
	}
	
	public static Racional suma(Racional n1,Racional n2) {
		Racional resultado=new Racional();
		if(n1.denominador==n2.denominador) {
			resultado.numerador=n1.numerador+n2.numerador;
			resultado.denominador=n1.denominador;
		}
		else {
			resultado.denominador=n1.denominador*n2.denominador;
			resultado.numerador=n1.numerador*n2.denominador+n2.numerador*n1.denominador;
		}
		return resultado;
	}
	
	public static Racional resta(Racional n1,Racional n2) {
		Racional resultado=new Racional();
		if(n1.denominador==n2.denominador) {
			resultado.numerador=n1.numerador-n2.numerador;
			resultado.denominador=n1.denominador;
		}
		else {
			resultado.denominador=n1.denominador*n2.denominador;
			resultado.numerador=n1.numerador*n2.denominador+n2.numerador*n1.denominador;
		}
		
		return resultado;
	}
	public static Racional multiplicacion(Racional n1, Racional n2) {
		Racional resultado=new Racional();
		resultado.numerador=n1.numerador*n2.numerador;
		resultado.denominador=n1.denominador*n2.denominador;
		return resultado;
	}
	
	public static Racional division(Racional n1,Racional n2) {
		Racional resultado=new Racional();
		resultado.numerador=n1.numerador*n2.denominador;
		resultado.denominador=n1.denominador*n2.numerador;
		return resultado;
	}
	@Override
	public String toString() {
		return numerador+"/"+denominador;
	}
	
	private int numerador;
	private int denominador;
}
