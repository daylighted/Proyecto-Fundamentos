package projecte;

import java.util.Scanner;
import java.io.*;


public class Raid0 {
    
    public static String R0 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    //Carga la informacion al arreglo al inicio del programa
    public void Load(){
        int i=0;
        try{
            
            FileInputStream archivo = new FileInputStream("C:/R0DX.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));   
            String strLinea;          
            while ((strLinea = buffer.readLine()) != null && i<5){               
                //se reemplazan todos los espacios vacios del arreglo Tik por los valores leidos del archivo "Ticket"     
                     R0[i] = strLinea;  
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
            R0[i] = "";
        }
    }
    //Menu de R0
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
 
         
       //Contador (Pendiente) para poder seleccionar las posiciones del arreglo y hacer la comparacion
       int K = 0;
       String bin;       
        //Ingreso informacion R0
         for (int i=0 ; i<5;i++){
             if(R0[i].equals("")){
             System.out.println("Ingrese los datos");
             bin = teclado.next();
             Integer.parseInt(bin);       
             R0[i] = K++ + bin;
             
             }             
         }
         SAVE_RAID_0_X();
            /*if(New[K] ?? comparar los valores i dividirlos en 2){
         SAVE_RAID_0;
         }else{
         SAVE_RAID_0_1
         }
             
         */
     }
    //Guardado R0
    public void SAVE_RAID_0(){
         //Metodo guardar para RAID 0
         File archivo = new File("C:/R0D0.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R0[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
             
     }
    public void SAVE_RAID_0_1(){
         //Metodo guardar para RAID 0
         File archivo = new File("C:/R0D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R0[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
             
     }
    public void SAVE_RAID_0_X(){
        File archivo = new File("C:/R0DX.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R0[i]);
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
            System.out.println(R0[i]);
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
                        System.out.println(R0[0]);
                    break;
                    case 2:
                        System.out.println(R0[1]);
                    break;
                    case 3:
                        System.out.println(R0[2]);
                    break;
                    case 4:
                        System.out.println(R0[3]);
                    break;
                    case 5:
                        System.out.println(R0[4]);
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
                     R0[0] = "";  
                    break;
                    case 2:
                     R0[1] = "";
                    break;
                    case 3:
                     R0[2] = "";
                    break;
                    case 4:
                     R0[3] = ""; 
                    break;
                    case 5:
                     R0[4] = "";   
                    break;
                    case 6:
                     R0[i] = "";   
                    break;
                    case 0:
                        i=5;
                    break;
                }
            }
        }
    }
}
   

