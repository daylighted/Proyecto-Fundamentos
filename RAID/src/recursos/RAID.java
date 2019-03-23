package recursos;
import java.io.*;
import java.util.Scanner;

public class RAID {
    public String K;
    public static String Temp[] = new String[6];
    public Scanner teclado = new Scanner(System.in);
    //Genera los espacios en blanco en el arreglo para ingresar los datos
     public void X(){
          for(int i =0; i<6; i++){
            Temp[i] = "";
          }

     }   
     //Pide los 6 datos para almacenarlos en el arreglo
     public void Informacion(){
         for(int i=0;i<6;i++){
             if(Temp[i].equals("")){
             System.out.println("Ingrese los datos");
             K = teclado.next(); 
             Temp[i] = K;
             }
         }
     }
     public void Show(){
         //Muestra los datos almacenados en el arreglo
         for (int i=0;i<6;i++){
             System.out.println(Temp[i]);
         }
     }
     public void RAID_0(){
         //Realiza la division de las palabras para luego ser guardadas en un archivo de texto
         for (int i=0 ; i<6;i++){
             
             SAVE_RAID_0();
             
         }
     }
     
     public void RAID_1(){
     }
     
     public void RAID_5(){
     }
     public void SAVE_RAID_0(){
         //Metodo guardar para RAID 0
         File archivo = new File("C:/Users\\eduar\\Documents\\RAIDS\\RAID0Test.txt");
        
        
        try{
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            PrintWriter impresor = new PrintWriter(buffer);
            
            for(int i=0; i<6; i++){
                impresor.write(Temp[i]);
                impresor.println();
            }
            
            impresor.close();
            buffer.close();
        }catch (Exception e){ 
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        for(int i=0;i<6;i++){
        System.out.println(Temp[i]);
        }
     }
     
     public void SAVE_RAID_1(){
     }
     
     public void SAVE_RAID_5(){
     }

}
