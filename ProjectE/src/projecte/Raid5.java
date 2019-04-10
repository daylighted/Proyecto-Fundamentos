package projecte;
import java.io.*;
import java.util.Scanner;

public class Raid5 {
    public static String R5 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    
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
}
