import java.util.Scanner;



public class san {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    


        System.out.print("Sumando Numeros: ");
        
        
        System.out.print("Ingresa el primer numero: ");  
        int a= sc.nextInt();

        System.out.print("Ingresa segundo numero:  ");  
        int b= sc.nextInt();

        int c =  a+b;  
        System.out.println("Total= " +c);
    }
}