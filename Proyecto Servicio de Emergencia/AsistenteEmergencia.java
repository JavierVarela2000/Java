package proyecto;

public class AsistenteEmergencia {

    
    //ATRIBUTOS DEL ASISTENTE DE EMERGENCIA
    private int Identificacion;

    private String Nombre;

    private String Servicio;

    
    //CONSTRUCTORES
    public AsistenteEmergencia(int Identificacion, String Nombre, String Servicio) {
        setIdentificacion(Identificacion);
        setNombre(Nombre);
        setServicio(Servicio);
    }
    
    public AsistenteEmergencia()
    {
        Identificacion = 0;
        Nombre = "";
        Servicio= "";
    }
    
    
    // GETS Y SETS
    public int getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

  
}
