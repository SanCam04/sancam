import java.util.Scanner;
public class costo_viaje {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("solicitud de un viaje a Roma : ");
       
       
        System.out.print("cuantas personas van a viajar : ");  
        int personas= sc.nextInt();
   
        System.out.print("cuantas noches se van a quedar : ");
        int noches= sc.nextInt();
       

        int costoA = personas*875;
       
        int costoB = noches*110;  
        int costoT = costoB+costoA;      
        System.out.println(" el total de pasajeros es de = "+personas);
        System.out.println(" se van a quedar por : "+noches+" noches");
        System.out.println(" el costo total de los boletos de avion es de $"+costoA+" Dolares");
        System.out.println(" el costo total del hotel es de $"+costoB+" Dolares");
        System.out.println(" el costo total del viaje es de $"+costoT+" Dolares");
    
    }

}