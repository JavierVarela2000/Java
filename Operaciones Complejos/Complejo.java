package Complejo;
class Complejo {
	public Complejo() {
	}
	public Complejo(double n,double i) {
		setn(n);
		seti(i);
	}
	
	public static Complejo suma(Complejo n1,Complejo n2) {
		Complejo resultado=new Complejo(n1.getn()+n2.getn(),n1.geti()+n2.geti());
		return resultado;
	}
	public static Complejo resta(Complejo n1,Complejo n2) {
		Complejo resultado=new Complejo(n1.getn()-n2.getn(),n1.geti()-n2.geti());
		return resultado;
	}
	public static Complejo multiplicacion(Complejo n1,Complejo n2) {
		Complejo resultado=new Complejo();
		resultado.setn(n1.getn()*n2.getn()-n1.geti()*n2.geti());
		resultado.seti(n1.geti()*n2.getn()+n1.getn()*n2.geti());
		return resultado;
	}
	public static Complejo division(Complejo n1,Complejo n2) {
		double denominador=0;
		Complejo resultado=new Complejo();
		denominador=n2.n*n2.n+n2.i*n2.i;
		resultado.setn((n1.getn()*n2.getn()+n1.i*n2.i)/denominador);
		resultado.seti((n1.i*n2.n-n1.n*n2.i)/denominador);
		
		return resultado;
	}
	
	public String getnumero() {
		String r=new String();
		if(i<=0) {
			r= n+""+i+"i";
		}
		else{
			r=n+"+"+i+"i";
		}
		return r;
	}
	public double getn() {
		return n;
	}
	public void setn(double n) {
		this.n = n;
	}
	public double geti() {
		return i;
	}
	public void seti(double i) {
		this.i = i;
	}

	private double n;
	private double i;

}
