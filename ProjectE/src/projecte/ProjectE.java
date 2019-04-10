package projecte;
import java.util.Scanner;

public class ProjectE {

   
    public static void main(String[] args) {
        //Carga las clases separas para mejorar el orden
        //En otra ocasion cuando ya este la mayoria de las cosas funcionales se agregara un menu a cada RAID
        //Para cumplir con los requirimientos especificados
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
            //System.out.println("4. Reload"); (Pendiente)
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                //Guarda la informacion simulando el RAID 0 (Data Striping)
                R0.Info();
                break;
                
                case 2:
                //Guarda la informacion simulando el RAID 1 (Espejo)
                R1.Info();
                break;
                
                case 3:
                //Guarda la informacion simulando el RAID 5 (Paridad)    
                R5.Info();
                break;
                
                case 4:
                //Pendiente
                break;
                
                case 5:
                //Pendiente
               
                break;
            }
            
        }
    }
    
}
