package proyecto;

//TODAS LAS LIBRERIAS USADAS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PROYECTO {

    public static void main(String[] args) throws InterruptedException {
        
        
        Scanner sc = new Scanner(System.in);//OBJETO PARA INGRESAR DATOS
        
         int opcion=1; // para que entre al menu

               
         
         //CREACION DE LOS OBJETOS:
         

        // TESTIGO DE LOS INCIDENTES
         Testigo t1;
         t1 = new Testigo();
         
         // INCIDENTES
         Incidentes i;
         i = new Incidentes();
         
         // FECHA DE LOS INCIDENTES
         Fecha f1;
         f1 = new Fecha();
         
         
         
         //ENTRADA DE DATOS DEL TESTIGO
         System.out.println("\t\tINGRESE SUS DATOS.\n");
         
         System.out.print("\tNombre: ");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            t1.setNombre(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         System.out.print("\n\tEdad: ");
         
        try {
            t1.setEdad(Integer.parseInt(br.readLine()));
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         System.out.print("\n\tCedula: ");
         
        try {
            t1.setCedula(Integer.parseInt(br.readLine()));
        } catch (IOException ex) {
            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         // CREACION DEL TESTIGO
         i.setT1(t1);
         
         
         //CREACION DE UN OBJETO PARA OBTENER UN NUMERO ALEATORIO
         Random r = new Random();
         int numrand=30;        
        
            
        do
        {
            //CADA VEZ QUE EL USUARIO VUELVA AL MENU PRINCIPAL SE RESOLVERA ALEATORIAMENTE LOS CASOS
            int random = r.nextInt(numrand);
            
            if(random%4==0)
            {
                i.getS1().resolverCaso();
                i.getS3().resolverCaso();
            }
            else
            {
                i.getS2().resolverCaso();
                i.getS4().resolverCaso();
            }
             
            
            //MENU DE OPCIONES
            System.out.println("\n\nOpciones\n");
            System.out.println("1. NOTIFICAR EMERGENCIA\n");
            System.out.println("2. MOSTRAR EMERGENCIAS\n");
            System.out.println("3. Mostrar Servicios de Emergencia\n");
            System.out.println("4. Mostrar Estado de Casos\n");
            System.out.println("5. Salir\n");
            System.out.println("Elija una opcion : \n");
            
            opcion = sc.nextInt();//ENTRADA DE LA OPCION POR PARTE DEL USUARIO

            
            switch(opcion)
            {
                                                          
                case 1 : 
                {
                    //NOTIFICAR EMERGENCIAS
                    
                    //MENU DE EMERGENCIAS
                    System.out.println("\n\tALERTA ACTIVADA");
                    
                    System.out.println("\t1. AMBULANCIA\n");
                    System.out.println("\t2. POLICIA\n");
                    System.out.println("\t3. BOMBEROS\n");
                    System.out.println("\t4. RESCATE\n");
                    
                    System.out.println("\n Elija la opcion: \n");

                    int em=0;
                    
                try {
                    em = Integer.parseInt(br.readLine()); // ENTRADA DE LA OPCION DEL USUARIO
                } catch (IOException ex) {
                    Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
                    switch(em) // POR CADA OPCION SE PEDIRA UNA DESCRIPCION AL USUARIO
                    {
                        case 1: 
                        {
                            String desc="";
                            String ubi;
                            
                            sc.nextLine();
                       
                             i.getS1().NotificarAsisEM();//SE NOTIFICA AL ASISTENTE
                             
                            System.out.println("\nPara facilitar el trabajo describa brevemente lo sucedido: ");
                            
                        try {
                            desc = br.readLine();//ENTRADA DE LA DESCRIPCION DEL INCIDENTE POR PARTE DEL USUARIO
                        } catch (IOException ex) {
                            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            f1.fechaHoy();
                            
                            
                            ubi = "Ubicacion Actual";
                            
                           
                            //SE ACTIVA LA EMERGENCIA, DEPENDIENDO DE LA OPCION, EL PRIMER PARAMETRO CAMBIA
                            i.ActivarEmergencia(00,desc, f1, ubi);
                            
                          
                            
                            break;
                        }
                        
                        case 2: 
                        {
                            
                            String desc="";
                            String ubi;
                            
                            sc.nextLine();
                   
                            
                             i.getS2().NotificarAsisEM();
                             
                            System.out.println("\nPara facilitar el trabajo describa brevemente lo sucedido: ");
                            
                        try {
                            desc = br.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            f1.fechaHoy();
                            
                            
                            ubi = "Ubicacion Actual";
                            
                           
                            
                            i.ActivarEmergencia(01,desc, f1, ubi);
                            
                       
                           
                            
                            break;
                        }
                        
                        case 3: 
                        {
                            String desc="";
                            String ubi;
                            
                            
                            sc.nextLine();
                            
                            i.getS3().NotificarAsisEM();
                            
                            System.out.println("\nPara facilitar el trabajo describa brevemente lo sucedido: ");
                            
                        try {
                            desc = br.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            f1.fechaHoy();
                            
                            
                            ubi = "Ubicacion Actual";
                            
                            
                            
                            i.ActivarEmergencia(10,desc, f1, ubi);
                            
                            
                            break;
                        }
                        
                        case 4: 
                        {
                            
                            String desc="";
                            String ubi;
                            
                            
                            sc.nextLine();
                           
                            i.getS4().NotificarAsisEM();
                           
                            System.out.println("\nPara facilitar el trabajo describa brevemente lo sucedido: ");
                            
                        try {
                            desc =br.readLine();
                        } catch (IOException ex) {
                            Logger.getLogger(PROYECTO.class.getName()).log(Level.SEVERE, null, ex);
                        }
                            
                            f1.fechaHoy();
                            
                            
                            ubi = "Ubicacion Actual";
                            
                            
                            
                            i.ActivarEmergencia(11,desc, f1, ubi);
                            
                         
                             
                            break;
                        }
                        
                        default : 
                        {

                            break;
                        }
                        
                        
                    }
                    
                                      
                    break;
                }
                
                case 2 : 
                {
                    i.mostrarTodosIncidentes(); // SE MUESTRAN TODOS LOS INCIDENTES DE TODOS LOS SERVICIOS DE EMERGENCIA
                    
                            
                    break;
                }
                
                case 3 : 
                {
                    //SE MUESTRA LA INFORMACION DE LOS SERVICIOS DISPONIBLES 
                    System.out.println("\t\tSERVICIOS DISPONIBLES");
                    
                    System.out.println("\n*************************");
                    
                    System.out.println("Nombre:  "+i.getS1().getNombreServicio());
                    System.out.println("ID: "+i.getS1().getIdentificacionServicio());
                    System.out.println("Numero Telefonico: "+i.getS1().getNumeroTelefono());
                    System.out.println("Numero de incidentes:  "+i.getS1().getNumcasos());
                    
                    System.out.println("\n*************************");
                    
                    System.out.println("Nombre:  "+i.getS2().getNombreServicio());
                    System.out.println("ID: "+i.getS2().getIdentificacionServicio());
                    System.out.println("Numero Telefonico: "+i.getS2().getNumeroTelefono());
                    System.out.println("Numero de incidentes:  "+i.getS2().getNumcasos());
                    
                    System.out.println("\n*************************");
                    
                    System.out.println("Nombre:  "+i.getS3().getNombreServicio());
                    System.out.println("ID: "+i.getS3().getIdentificacionServicio());
                    System.out.println("Numero Telefonico: "+i.getS3().getNumeroTelefono());
                    System.out.println("Numero de incidentes:  "+i.getS3().getNumcasos());
                    
                    
                    System.out.println("\n*************************");
                    
                    System.out.println("Nombre:  "+i.getS4().getNombreServicio());
                    System.out.println("ID: "+i.getS4().getIdentificacionServicio());
                    System.out.println("Numero Telefonico: "+i.getS4().getNumeroTelefono());
                    System.out.println("Numero de incidentes:  "+i.getS4().getNumcasos());
                    
                    break;
                }
                
                case 4 : 
                {
                    //SE MUESTRA EL ESTADO DE LOS INCIDENTES DE LOS SERVICIOS DE EMERGENCIA
                    if(i.getS1().getNumcasos() == 0)
                    {
                        System.out.println("\n\t\t NO HAY INCIDENTES DE "+i.getS1().getNombreServicio());
                    }
                    else
                    {
                        
                        System.out.println("\n\tESTADOS DE LOS INCIDENTES DE  "+i.getS1().getNombreServicio());
                        i.getS1().mostrarEstadoCaso();
                    
                    }
                    
                    if(i.getS2().getNumcasos() == 0)
                    {
                        System.out.println("\n\t\t NO HAY INCIDENTES DE "+i.getS2().getNombreServicio());
                    }
                    else
                    {
                        System.out.println("\n\tESTADOS DE LOS INCIDENTES DE  "+i.getS2().getNombreServicio());
                        i.getS2().mostrarEstadoCaso();
                    
                    }
                    
                    if(i.getS3().getNumcasos() == 0)
                    {
                        
                        System.out.println("\n\t\t NO HAY INCIDENTES DE "+i.getS3().getNombreServicio());
                    }
                    else
                    {
                        System.out.println("\n\tESTADOS DE LOS INCIDENTES DE  "+i.getS3().getNombreServicio());
                        i.getS3().mostrarEstadoCaso();
                    
                    }
                    
                    if(i.getS4().getNumcasos() == 0)
                    {
                        System.out.println("\n\t\t NO HAY INCIDENTES DE "+i.getS4().getNombreServicio());
                    }
                    else
                    {
                        System.out.println("\n\tESTADOS DE LOS INCIDENTES DE  "+i.getS4().getNombreServicio());
                        i.getS4().mostrarEstadoCaso();
                    
                    }
                    
                 
                    
                    
                    break;
                }
                
                case 5 : 
                {
                      // SALIDA DEL PROGRAMA
                  
                    break;
                }
                
                default : 
                {
                    System.out.println("\nOPCION NO VALIDA");
                    break;
                }
                
            }
        
            
        }while(opcion!=5);
    


    }
    
}
