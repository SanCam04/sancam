import java.util.Scanner;



public class MOD {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n1 , n2;
       
            System.out.println("ingrese el dividendo: ");
            n1=leer.nextInt();
            System.out.println("ingrese el divisor: ");
            n2=leer.nextInt();

            int cociente = n1/n2;
            int n=cociente*n2;
            int residuo=n1-n;
            System.out.println("el resultado del residuo es "+residuo);

        
                
            }
            
    }

