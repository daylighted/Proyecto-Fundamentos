package projecte;
import java.io.*;
import java.util.Scanner;

public class Raid5 {
    public static String R5 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    //Carga la informacion al arreglo al inicio del programa
    public void Load(){
        int i=0;
        try{
            
            FileInputStream archivo = new FileInputStream("C:/R5D0.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));   
            String strLinea;          
            while ((strLinea = buffer.readLine()) != null && i<5){               
                //se reemplazan todos los espacios vacios del arreglo Tik por los valores leidos del archivo "Ticket"     
                     R5[i] = strLinea;  
                     i++;
                     
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        //Se muestran todos los valores que fueron cargados desde el archivo de texto al arreglo
          /*for(int c=0; c<5 ;c++){
        System.out.println(R0[c]);
        System.out.println("Se han cargado los siguientes datos");
       
   }*/
    }
    //Incializa el arreglo
    public void Init(){
        for(int i=0; i<5; i++){
            R5[i] = "";
        }
    }
    //Menu de R1
    public void Menu(){
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("1.Ingresar Datos");
            System.out.println("2.Menu para Eliminar Datos");
            System.out.println("3.Menu para Mostrar todos los datos");
            System.out.println("4.Menu para visualizar datos");
            System.out.println("5.Refrescar datos del Raid");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                //Guarda la informacion simulando el RAID 0 (Data Striping)
                Info();
                break;
                
                case 2:
                //Envia al menu para eliminar informacion
                Clear();
                break;
                
                case 3:
                //Muestra la informacion del arreglo entero 
                Show();
                break;
                
                case 4:
                //Seleccionar la informacion para visualizarla de manera especifica 1 a 1
                Show2();
                break;
                
                case 5:
                //Carga nuevamente los datos del arreglo
                Load();
                break;
            }
            
        }
    }
    //Ingreso de informacion de RAID0 y su procedimiento
    public void Info(){
        //Datos para informacion de RAID 5 y Guardado
         int K = 0;
         int F = 1;
         String bin;             
         for (int i=0 ; i<5;i++){
             System.out.println("Ingrese los datos");
             bin = teclado.next();
             Integer.parseInt(bin);       
             R5[i] = bin; 
             SAVE_RAID_5();
             SAVE_RAID_5_1();
            /*Condicion por si es Par e Impar (Pendiente)
             if([R5].){
             R5[i] = K + bin;
             SAVE_RAID_5_2
         } else {
             R5[i] = F + bin;
             SAVE_RAID_5_2
             }*/
         }
    }
    //Guardar la informacion
    public void SAVE_RAID_5(){
        File archivo = new File("C:/R5D0.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R5[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }       
       
    }
    public void SAVE_RAID_5_1(){
        File archivo = new File("C:/R5D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R5[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }       
       
    }
    public void SAVE_RAID_5_2(){
        File archivo = new File("C:/R5D2.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo,true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R5[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }       
       
    }
    //Visualizacion de archivos
    public void Show(){
        for (int i=0; i<5; i++){
            System.out.println(R5[i]);
        }
     }
    //Visualizacion de archivos 1 a 1
    public void Show2(){
        int opcion = 1;
        for (int i=0; i<5; i++){
            while (opcion !=0){
                System.out.println("1.Ver Dato 1");
                System.out.println("2.Ver Dato 2");
                System.out.println("3.Ver Dato 3");
                System.out.println("4.Ver Dato 4");
                System.out.println("5.Ver Dato 5");
                System.out.println("0.Salir");
                System.out.println("Seleccione una opcion");
                opcion = teclado.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println(R5[0]);
                    break;
                    case 2:
                        System.out.println(R5[1]);
                    break;
                    case 3:
                        System.out.println(R5[2]);
                    break;
                    case 4:
                        System.out.println(R5[3]);
                    break;
                    case 5:
                        System.out.println(R5[4]);
                    break;
                    case 0:
                        i = 5;
                    break;
                }
            }
            
        }
    }
    //Eliminar informacion del arreglo
    public void Clear(){
        int opcion = 1;
        for (int i=0; i<5; i++){
            while (opcion !=0){
                System.out.println("1.Eliminar Dato 1");
                System.out.println("2.Eliminar Dato 2");
                System.out.println("3.Eliminar Dato 3");
                System.out.println("4.Eliminar Dato 4");
                System.out.println("5.Eliminar Dato 5");
                System.out.println("6.Eliminar todos los Datos");
                System.out.println("0.Salir");
                System.out.println("Selecccione una opcion");
                opcion = teclado.nextInt();
                
                switch (opcion){
                    case 1:
                     R5[0] = "";  
                    break;
                    case 2:
                     R5[1] = "";
                    break;
                    case 3:
                     R5[2] = "";
                    break;
                    case 4:
                     R5[3] = ""; 
                    break;
                    case 5:
                     R5[4] = "";   
                    break;
                    case 6:
                     R5[i] = "";   
                    break;
                    case 0:
                        i=5;
                    break;
                }
            }
        }
    }
}
