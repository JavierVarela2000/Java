package Empleado;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;

    private int mes;

    private int anio;

    public Fecha(int dia, int mes, int anio) {
    	setDia(dia);
    	setMes(mes);
    	setAnio(anio);
    }
    public Fecha(String sFecha) {
    	String sDia=sFecha.substring(0,2);
    	String sMes=sFecha.substring(3,5);
    	String sanio=sFecha.substring(6);
    	dia=Integer.parseInt(sDia);
    	mes=Integer.parseInt(sMes);
    	anio=Integer.parseInt(sanio);
    }

    public Fecha() {
    }

    

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