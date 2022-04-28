import java.util.Scanner;
public class teore_pi {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("teorema de pitagoras : ");
       
       
        System.out.print("ingrese el cateto a en cm^2 : ");  
        int a = sc.nextInt();

        System.out.print("ingrese el cateto b en cm^2 : ");  
        int b = sc.nextInt();
   
       
        int c =(a*a)+(b*b);

               
        System.out.print("La hipotenusa es de = "+c+" cm^2");

        
    }
}