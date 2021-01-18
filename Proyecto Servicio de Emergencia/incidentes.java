package proyecto;


class Incidentes {
    
    //ATRIBUTOS
    ServicioEmergencia s1;
    
    ServicioEmergencia s2;
    
    ServicioEmergencia s3;
    
    ServicioEmergencia s4;
    
    
    
    Testigo t1;
    
    

    private String Ubicacionincidente;
    
    int numin=0;
    
    
    //CONSTRUCTOR QUE CREA LOS 4 SERVICIOS DISPONIBLES
    public Incidentes()
    {
        //SE CREAN 4 SERVICIOS DE EMERGENCIA 
        s1 = new ServicioEmergencia(111111,911,"Ambulancia");
        s2 = new ServicioEmergencia(222222,101,"Policia");
        s3 = new ServicioEmergencia(333333,700,"Bomberos");
        s4 = new ServicioEmergencia(444444,911,"Rescate");
        
        
        t1 = new Testigo();
    
        
    }

    //GETS Y SETS
    public ServicioEmergencia getS1() {
        return s1;
    }

    public void setS1(ServicioEmergencia s1) {
        this.s1 = s1;
    }

    public ServicioEmergencia getS2() {
        return s2;
    }

    public void setS2(ServicioEmergencia s2) {
        this.s2 = s2;
    }

    public ServicioEmergencia getS3() {
        return s3;
    }

    public void setS3(ServicioEmergencia s3) {
        this.s3 = s3;
    }

    public ServicioEmergencia getS4() {
        return s4;
    }

    public void setS4(ServicioEmergencia s4) {
        this.s4 = s4;
    }

    public Testigo getT1() {
        return t1;
    }

    public void setT1(Testigo t1) {
        this.t1 = t1;
    }
    
    
    
    //METODO QUE ACTIVA LA EMERGENCIA AÑADIENDO UN CASO
    public void ActivarEmergencia(int id, String Descripcion, Fecha fechaincidente, String Ubicacionincidente) {
        
        switch(id)
        {
            case 00:
            {
                s1.anadirCaso(Descripcion, fechaincidente, Ubicacionincidente);
                
                break;
            }
            case 01:
            {
                s2.anadirCaso(Descripcion, fechaincidente, Ubicacionincidente);
                break;
            }
            case 10:
            {
                s3.anadirCaso(Descripcion, fechaincidente, Ubicacionincidente);
                break;
            }
            case 11:
            {
                s4.anadirCaso(Descripcion, fechaincidente, Ubicacionincidente);
                break;
            }
            
            
        }
        
        
        
    }

    
    //SE MUESTRAN TODOS LOS INCIDENTES
    public void mostrarTodosIncidentes()
    {
        System.out.println("");
        
        if(s1.getNumcasos()==0)
        {
            System.out.println("\n\nNO HAY INCIDENTES DE "+s1.getNombreServicio());
        }
        else
        {
            System.out.println("\n\tINCIDENTES DE  "+s1.getNombreServicio());
            s1.mostrarCasos();
            
            System.out.println("\nTESTIGO: "+t1.getNombre());
            
            
        }
        
        if(s2.getNumcasos()==0)
        {
            System.out.println("\n\nNO HAY INCIDENTES DE "+s2.getNombreServicio());
        }
        else
        {
            System.out.println("\n\n\tINCIDENTES DE "+s2.getNombreServicio());
            s2.mostrarCasos();
            System.out.println("\nTESTIGO: "+t1.getNombre());
        }
        
        if(s3.getNumcasos()==0)
        {
            System.out.println("\n\nNO HAY INCIDENTES DE "+s3.getNombreServicio());
        }
        else
        {
            System.out.println("\n\tINCIDENTES DE "+s3.getNombreServicio());
            s3.mostrarCasos();
            System.out.println("\nTESTIGO: "+t1.getNombre());
        }
        
        if(s4.getNumcasos()==0)
        {
            System.out.println("\n\nNO HAY INCIDENTES DE "+s4.getNombreServicio());
        }
        else
        {
            System.out.println("\n\tINCIDENTES DE "+s4.getNombreServicio());
            s4.mostrarCasos();
            System.out.println("\nTESTIGO: "+t1.getNombre());
        }
        
        
    }
    
    
    
}
