package projecte;
import java.io.*;
import java.util.Scanner;


public class Raid1 {
    public static String R1 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    //Carga la informacion al arreglo al inicio del programa
    public void Load(){
        int i=0;
        try{
            
            FileInputStream archivo = new FileInputStream("C:/R1D0.txt");
            DataInputStream entrada = new DataInputStream(archivo);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));   
            String strLinea;          
            while ((strLinea = buffer.readLine()) != null && i<5){               
                //se reemplazan todos los espacios vacios del arreglo Tik por los valores leidos del archivo "Ticket"     
                     R1[i] = strLinea;  
                     i++;
                     
            }
            entrada.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        //Se muestran todos los valores que fueron cargados desde el archivo de texto al arreglo
          /*for(int c=0; c<5 ;c++){
        System.out.println(R1[c]);
        System.out.println("Se han cargado los siguientes datos");
       
   }*/
    }
    //Incializa el arreglo
    public void Init(){
        for(int i=0; i<5; i++){
            R1[i] = "";
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
        //Datos para informacion de RAID 1 y Guardado
         
         String bin;             
         for (int i=0 ; i<5;i++){
             if(R1[i].equals("")){
             System.out.println("Ingrese los datos");
             bin = teclado.next();
             Integer.parseInt(bin);       
             R1[i] = bin; 
             SAVE_RAID_1();
             SAVE_RAID_1_1();
          
             }
         }
    }
    //Guardado R1
    public void SAVE_RAID_1(){
        File archivo = new File("C:/R1D0.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R1[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }       
       
    }
    public void SAVE_RAID_1_1(){
        File archivo = new File("C:/R1D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<5; i++){
                impresor.write(R1[i]);
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
            System.out.println(R1[i]);
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
                        System.out.println(R1[0]);
                    break;
                    case 2:
                        System.out.println(R1[1]);
                    break;
                    case 3:
                        System.out.println(R1[2]);
                    break;
                    case 4:
                        System.out.println(R1[3]);
                    break;
                    case 5:
                        System.out.println(R1[4]);
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
                     R1[0] = "";  
                    break;
                    case 2:
                     R1[1] = "";
                    break;
                    case 3:
                     R1[2] = "";
                    break;
                    case 4:
                     R1[3] = ""; 
                    break;
                    case 5:
                     R1[4] = "";   
                    break;
                    case 6:
                     R1[i] = "";   
                    break;
                    case 0:
                        i=5;
                    break;
                }
            }
        }
    }
    public void Fallas(){
        int opcion = 1;
        while (opcion != 0){
            System.out.println("1.Falla D0");
            System.out.println("2.Falla D1");
            System.out.println("3.Reemplazar D0");
            System.out.println("4.Reemplazar D1");
            System.out.println("0.Salir");
            
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    Falla_1();
                break;
                
                case 2:
                    Falla_2();
                break;
                case 3:
                    Reemplazar_D0();
                break;
                case 4:
                    Reemplazar_D1();
                break;
            }
        }
    }
    public void Falla_1(){
        File fichero = new File("C:/R1D0.txt");
        EliminarFichero(fichero);
        System.out.println("Fallo el Disco 0");
}
    public void Falla_2(){
        File fichero = new File("C:/R1D1.txt");
        EliminarFichero(fichero);
        System.out.println("Fallo el Disco 1");

}
    public void Reemplazar_D0(){
    }
    public void Reemplazar_D1(){
    }  
    public static void EliminarFichero(File fichero) {

    if (!fichero.exists()) {
        System.out.println("El archivo data no existe.");
    } else {
        fichero.delete();
        System.out.println("El archivo data fue eliminado.");
    }

}
}
