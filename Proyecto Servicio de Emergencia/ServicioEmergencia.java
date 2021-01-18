package proyecto;

public class ServicioEmergencia {

    //ATRIBUTOS DEL SERVICIO DE EMERGENCIA
    
    private int IdentificacionServicio;

    private int NumeroTelefono;

    private String NombreServicio;

    private Fecha fechaincidente;
    
    private String Ubicacionincidente;
    
    private String Descripcion;
   
    
    private int tam = 100;
    
    private int numcasos = 0;
    
    private int estadocaso;
    
    private ServicioEmergencia[] casos;
    
    AsistenteEmergencia a1;
    
    AsistenteEmergencia a2;
    
    AsistenteEmergencia a3;
    
    AsistenteEmergencia a4;
    
    //CONSTRUCTORES
    public ServicioEmergencia(int IdentificacionServicio, int NumeroTelefono, String NombreServicio) {
        setIdentificacionServicio(IdentificacionServicio);
        setNumeroTelefono(NumeroTelefono);
        setNombreServicio(NombreServicio);
        
        this.casos = new ServicioEmergencia[tam];
        
        //SE CREAN 4 ASISTENTES, UNO POR CADA SERVICIO
        a1 = new AsistenteEmergencia(0,"Javier", "Ambulancia");
        a2 = new AsistenteEmergencia(1,"Pablo", "Policia");
        a3 = new AsistenteEmergencia(2,"Josue", "Bombero");
        a4 = new AsistenteEmergencia(3,"Sebastian", "Rescate");
        
        
    }

    public ServicioEmergencia() {
        
        IdentificacionServicio = 0000;
        NumeroTelefono = 0;
        NombreServicio="";
        Descripcion = "";
        Ubicacionincidente = "";
        this.casos = new ServicioEmergencia[tam];
        //this.asisemerg = new AsistenteEmergencia[tam];
        a1 = new AsistenteEmergencia(0,"Javier", "Ambulancia");
        a2 = new AsistenteEmergencia(1,"Pablo", "Policia");
        a3 = new AsistenteEmergencia(2,"Josue", "Bombero");
        a4 = new AsistenteEmergencia(3,"Sebastian", "Rescate");
        
        
    }
    
    //GETS Y SETS

    public AsistenteEmergencia getA1() {
        return a1;
    }

    public void setA1(AsistenteEmergencia a1) {
        this.a1 = a1;
    }

    public AsistenteEmergencia getA2() {
        return a2;
    }

    public void setA2(AsistenteEmergencia a2) {
        this.a2 = a2;
    }

    public AsistenteEmergencia getA3() {
        return a3;
    }

    public void setA3(AsistenteEmergencia a3) {
        this.a3 = a3;
    }

    public AsistenteEmergencia getA4() {
        return a4;
    }

    public void setA4(AsistenteEmergencia a4) {
        this.a4 = a4;
    }

    
    
    
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstadocaso() {
        return estadocaso;
    }

    public void setEstadocaso(int estadocaso) {
        this.estadocaso = estadocaso;
    }
    
       
    

    public int getIdentificacionServicio() {
        return IdentificacionServicio;
    }

    public void setIdentificacionServicio(int IdentificacionServicio) {
        this.IdentificacionServicio = IdentificacionServicio;
    }

    public int getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(int NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getNombreServicio() {
        return NombreServicio;
    }

    public void setNombreServicio(String NombreServicio) {
        this.NombreServicio = NombreServicio;
    }

    public Fecha getFechaincidente() {
        return fechaincidente;
    }

    public void setFechaincidente(Fecha fechaincidente) {
        this.fechaincidente = fechaincidente;
    }

    public String getUbicacionincidente() {
        return Ubicacionincidente;
    }

    public void setUbicacionincidente(String Ubicacionincidente) {
        this.Ubicacionincidente = Ubicacionincidente;
    }

    public int getNumcasos() {
        return numcasos;
    }

    public void setNumcasos(int numcasos) {
        this.numcasos = numcasos;
    }
    
    
    //METODOS 
    
    //METODO QUE AÑADE UN CASO AL ARRAY
    public void anadirCaso(String descripcion, Fecha f, String Ubicacion)
    {
        ServicioEmergencia nuevo = new ServicioEmergencia();
        
        nuevo.setFechaincidente(f);
        nuevo.setDescripcion(descripcion);
        nuevo.setUbicacionincidente(Ubicacion);
        nuevo.setEstadocaso(0);
        
        casos[numcasos] = nuevo;
        
        numcasos++;
        
       
        
    }
    
    //METODO QUE CAMBIA EL ESTADO DE 0(CASO SIN RESOLVER) A 1(RESUELTO) 
    public void resolverCaso() 
    {
        for(int i=0; i<numcasos;i++)
        {
            casos[i].setEstadocaso(1);
        }
    }
     
    //METODO QUE MUESTRA TODOS LOS CASOS
    public void mostrarCasos()
    {
        for(int i=0; i<numcasos;i++)
        {
            System.out.println("\t\nUbicacion del Incidente: "+casos[i].getUbicacionincidente());
            System.out.println("\t\nFecha del Incidente: "+casos[i].getFechaincidente());
            System.out.println("\t\nDescripcion: "+casos[i].getDescripcion());
            
           
                        
        }
               
        
    }
    
    //METODO QUE MUESTRA EL ESTADO DE LOS CASOS
    public void mostrarEstadoCaso()
    {
        for(int i=0; i<numcasos;i++)
        {
             if(casos[i].getEstadocaso()== 0)
            {
                System.out.println("\t\nDescripcion: "+casos[i].getDescripcion());
                System.out.println("\t\nFecha del Incidente: "+casos[i].getFechaincidente());
                
                    if(IdentificacionServicio == 111111)
                    {
                        System.out.println("El Asistente "+a1.getNombre()+" esta en  " +a1.getServicio()+ " y esta llegando a la Ubicacion");
                    }

                    else if(IdentificacionServicio == 222222 )
                    {
                        System.out.println("El Asistente "+a2.getNombre()+" es " +a2.getServicio()+ " y esta llegando a la Ubicacion");
                    }

                    else if(IdentificacionServicio == 333333)
                    {
                        System.out.println("El Asistente "+a3.getNombre()+" es " +a3.getServicio()+ " y esta llegando a la Ubicacion");
                    }

                    else if(IdentificacionServicio == 444444)
                    {
                        System.out.println("El Asistente "+a4.getNombre()+" es de " +a4.getServicio()+ " y esta llegando a la Ubicacion");
                    }

                
                System.out.println("\t\nEstado del Incidente: SIN RESOLVER");
            
            }
            else if(casos[i].getEstadocaso()== 1)
            {
                System.out.println("\t\nDescripcion: "+casos[i].getDescripcion());
                System.out.println("\t\nFecha del Incidente: "+casos[i].getFechaincidente());
                System.out.print("\t\nEstado del Incidente: RESUELTO");
                   if(IdentificacionServicio == 111111)
                    {
                        System.out.println(" por el  Asistente "+a1.getNombre()+" de "+a1.getServicio());
                    }

                    else if(IdentificacionServicio == 222222 )
                    {
                        System.out.println(" por el  Asistente "+a2.getNombre()+" de "+a2.getServicio());
                    }

                    else if(IdentificacionServicio == 333333)
                    {
                        System.out.println(" por el  Asistente "+a3.getNombre()+" de "+a3.getServicio());
                    }

                    else if(IdentificacionServicio == 444444)
                    {
                        System.out.println(" por el  Asistente "+a4.getNombre()+" de "+a4.getServicio());
                    }
                
                
            }
        }
        
    }
    
    
    
    //METODO QUE MUESTRA POR PANTALLA QUE EL ASISTENTE ESTA EN CAMINO
     public void NotificarAsisEM() {
         
         if(IdentificacionServicio == 111111)
         {
             System.out.println("El Asistente "+a1.getNombre()+" es " +a1.getServicio()+ " y ya está en camino");
         }
         
         else if(IdentificacionServicio == 222222 )
         {
             System.out.println("El Asistente "+a2.getNombre()+" es " +a2.getServicio()+ " y ya está en camino");
         }
         
         else if(IdentificacionServicio == 333333)
         {
             System.out.println("El Asistente "+a3.getNombre()+" es " +a3.getServicio()+ " y ya está en camino");
         }
         
         else if(IdentificacionServicio == 444444)
         {
             System.out.println("El Asistente "+a4.getNombre()+" es " +a4.getServicio()+ " y ya está en camino");
         }
         
                
    }

}