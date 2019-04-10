package projecte;
import java.io.*;
import java.util.Scanner;


public class Raid1 {
    public static String R1 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    
    public void Info(){
        //Datos para informacion de RAID 1 y Guardado
         
         String bin;             
         for (int i=0 ; i<5;i++){
             System.out.println("Ingrese los datos");
             bin = teclado.next();
             Integer.parseInt(bin);       
             R1[i] = bin; 
             SAVE_RAID_1();
             SAVE_RAID_1_1();
          
                     
         }
    }
    //Guardado
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
}
