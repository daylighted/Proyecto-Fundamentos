package projecte;

import java.util.Scanner;
import java.io.*;


public class Raid0 {
    
    public static String R0 [] = new String [5];
    public Scanner teclado = new Scanner(System.in);
    
    public void Info(){
 
         
       //Contador (Pendiente) para poder seleccionar las posiciones del arreglo y hacer la comparacion
       int K = 0;
       String bin;       
        //Ingreso informacion R0
         for (int i=0 ; i<5;i++){
             System.out.println("Ingrese los datos");
             bin = teclado.next();
             Integer.parseInt(bin);       
             R0[i] = K++ + bin;                     
         }
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
            FileWriter escritor = new FileWriter(archivo);
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
        
        File archivo2 = new File("C:/R0D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo2);
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
        for(int i=0;i<5;i++){
        System.out.println(R0[i]);
        }
     }
    public void SAVE_RAID_0_1(){
         //Metodo guardar para RAID 0
         File archivo = new File("C:/R0D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo);
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
        
        File archivo2 = new File("C:/R0D1.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo2);
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
        for(int i=0;i<5;i++){
        System.out.println(R0[i]);
        }
     }
    //Visualizacion de archivos (se agregara uno a cada Raid mas adelante)
    public void Show(){
        for (int i=0; i<5; i++){
            System.out.println(R0[i]);
        }
     }
}
   

