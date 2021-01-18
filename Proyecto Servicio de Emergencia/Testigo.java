package proyecto;

public class Testigo {

    
    //ATRIBUTOS
    private String Nombre;

    private int Edad;

    private long Cedula;

    private String Ubicacion;

    
    //CONSTRUCTORES
    public Testigo(String Nombre, int Edad, int Cedula, String Ubicacion) {
        setNombre(Nombre);
        setEdad(Edad);
        setCedula(Cedula);
        setUbicacion(Ubicacion);
    }

    public Testigo()
    {
        Nombre="";
        Edad = 0;
        Cedula = 0;
        Ubicacion ="";
    }
    
    
    
    //GETS Y SETS
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getCedula() {
        return Cedula;
    }

    public void setCedula(long Cedula) {
        this.Cedula = Cedula;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }


}
