package proyecto;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    //ATRIBUTOS
    private int dia;

    private int mes;

    private int anio;

    //CONSTRUCTORES
    public Fecha(int dia, int mes, int anio) {
    	setDia(dia);
    	setMes(mes);
    	setAnio(anio);
    }
    
    public Fecha()
    {
        GregorianCalendar gc = new GregorianCalendar();
        this.dia = gc.get(Calendar.DAY_OF_MONTH);
	this.mes = gc.get(Calendar.MONTH)+1;
	this.anio = gc.get(Calendar.YEAR);
    }

    
    //GETS Y SETS
    public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

        //METODOS
	public void fechaHoy() {
		GregorianCalendar gc = new GregorianCalendar();
		dia = gc.get(Calendar.DAY_OF_MONTH);
		mes = gc.get(Calendar.MONTH)+1;
		anio = gc.get(Calendar.YEAR);
    }

    public Fecha diferenciaFechas(Fecha fecha) {
    	Fecha f1 = new Fecha();
        if(dia>fecha.getDia()) {
        	--fecha.mes;
        	fecha.dia+=30;
        }
        if(mes>fecha.mes) {
        	--fecha.anio;
        	fecha.mes+=12;
        }
        f1.dia = fecha.dia - dia;
        f1.mes = fecha.mes - mes;
        f1.anio = fecha.anio - anio;
        return f1;
        
    }
    
    @Override
    public String toString() {
    	return dia+"/"+mes+"/"+anio;
    }

   
}
