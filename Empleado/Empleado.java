package Empleado;

public class Empleado {

    private String nombre;

    private String apellido;

    private boolean genero;

    private Fecha fechaNacimiento;

    private Fecha fechaIngreso;

    private double salarioBasico;

    public Empleado(String nombre, String apellido, boolean genero, Fecha fechaNacimiento, Fecha fechaIngreso, double salario) {
    	setNombre(nombre);
    	setApellido(apellido);
    	setGenero(genero);
    	setFechaNacimiento(fechaNacimiento);
    	setFechaIngreso(fechaIngreso);
    	setSalarioBasico(salario);
    }

    public Empleado() {
    }

    

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		if(genero == true)
			return "Femenino";
		else
		    return "Masculino";
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getSalarioBasico() {
		return salarioBasico;
	}

	public void setSalarioBasico(double salarioBasico) {
		if(salarioBasico <0)
			salarioBasico = 0;
		this.salarioBasico = salarioBasico;
	}

	public void visualizarEmpleado() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Genero: "+getGenero());
		System.out.println("Fecha nacimiento: "+getFechaNacimiento());
		System.out.println("Fecha ingreso: "+getFechaIngreso());
		System.out.println("Salario: "+getSalarioBasico());
    }

    public int calcularEdad() {
        Fecha fechaActual = new Fecha();
        fechaActual.fechaHoy();
        Fecha fechaResul = new Fecha();
        fechaResul = fechaNacimiento.diferenciaFechas(fechaActual);
        return fechaResul.getAnio();
    }

    public int calcularAntiguedad() {
    	Fecha fechaActual = new Fecha();
        fechaActual.fechaHoy();
        Fecha fechaResul = new Fecha();
        fechaResul = fechaIngreso.diferenciaFechas(fechaActual);
        return fechaResul.getAnio();
    }

    public double calcularPrestaciones() {
        return calcularAntiguedad()*getSalarioBasico()/12;
    }

    public void cambiarEmpleado(String nombre, String apellido, boolean genero, Fecha fechaNacimiento, Fecha fechaIngreso, double salario) {
    	setNombre(nombre);
    	setApellido(apellido);
    	setGenero(genero);
    	setFechaNacimiento(fechaNacimiento);
    	setFechaIngreso(fechaIngreso);
    	setSalarioBasico(salario);
    }
    
     
    @Override
    public String toString() {
    	return nombre+"\n"+apellido+"\n"+genero+"\n"+fechaNacimiento+"\n"+fechaIngreso+"\n"+salarioBasico;
    }
}