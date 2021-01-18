package Cuenta;

class Cuenta {
	private double saldo;
	
    public Cuenta(double saldo) {
    	setSaldo(saldo);
    }
    public double getSaldo(){
        return saldo;
    }
   
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void abonar(double abono){
        saldo += abono;
    }

    public void retirar(double retiro){
        if(retiro <= saldo)
        {
            saldo -=  retiro ;
        }
        else
        {
            System.out.println("\nEl valor de retiro es mayor al saldo bancario");
        }
    }
    @Override
    public String toString(){
    	return ""+getSaldo();
    }
    
    
    

}
