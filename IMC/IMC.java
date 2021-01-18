package IMC;

public class IMC {
	public IMC(double peso,double altura) {
		setPeso(peso);
		setAltura(altura);
	}
	public double calcularimc() {
		double imc;
		imc=getPeso()/(getAltura()*getAltura());
		return imc;
	}
	public String diagnostico() {
		String resultado="";
		if(calcularimc()<16)
		{
			resultado = "Peso insuficiente muy grave";
		}
	    else if(calcularimc()>16 && calcularimc()<16.99)
	    {
	    	resultado = "Bajo peso severo";
	    }
	    if(calcularimc()>17 && calcularimc()<18.49)
	    {
	    	resultado = "Peso bajo";
	    }
	    if(calcularimc()>18.50 && calcularimc()<24.99)
	    {
	    	resultado = "Peso normal";
	    }
	    if(calcularimc()>25 && calcularimc()<29.99)
	    {
	    	resultado = "Sobrepeso";
	    }
	    if(calcularimc()>30 && calcularimc()<34.99)
	    {
	    	resultado = "Obesidad grado I";
	    }
	    if(calcularimc()>35 && calcularimc()<39.99)
	    {
	    	resultado = "Obesidad grado II";
	    }
	    if(calcularimc()>=40)
	    {
	    	resultado = "Obesidad grado III";
	    }
	    return resultado;

	}
	@Override
	public String toString() {
		return "Peso: "+getPeso()+"\nAltura:"+getAltura()+"\n";
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	double peso;
	double altura;
	

}
