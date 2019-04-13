package projecte;
import java.util.Scanner;

public class ProjectE {

   
    public static void main(String[] args) {
        //Carga las clases separas para mejorar el orden 
        Raid0 R0 = new Raid0();
        Raid1 R1 = new Raid1();
        Raid5 R5 = new Raid5();
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        
        //Menu
        while (opcion != 0) {
            System.out.println("1.Raid 0");
            System.out.println("2.Raid 1");
            System.out.println("3.Raid 5");            
            System.out.println("0.Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                //Abre el Menu para RAID0 (Data Striping)
                R0.Init();
                R0.Load();
                R0.Menu();
                break;
                
                case 2:
                //Guarda la informacion simulando el RAID 1 (Espejo)
                R1.Init();
                R1.Load();
                R1.Info();
                break;
                
                case 3:
                //Guarda la informacion simulando el RAID 5 (Paridad)
                R1.Init();
                R1.Load();
                R5.Info();
                break;
                             
            }
            
        }
    }
    
}
