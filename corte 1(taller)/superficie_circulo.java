import java.util.Scanner;

public class superficie_circulo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    

        System.out.print("superficie de un circulo : ");
        
        
        System.out.print("Ingresa el radio del circulo: ");  
        int a= sc.nextInt();
        double elevado= Math.pow(a,2);
        double c= (3.14*elevado);
        
        System.out.print("total= "+c+ " m^2");

    }


    
}