import java.util.Scanner;

/**
 * sumpote
 */
public class sumpote {

    public static void main(String[] args) {
        
        
       

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.println("ingrese el valor X ");  
        int X= sc.nextInt();  
        System.out.println("ingrese el valor de la potencia n ");  
        int n= sc.nextInt();  
        System.out.println("ingrese el valor hasta el cual va la suma de las potencias ");  
        int hasta= sc.nextInt();
           int x;
           int i;
           for ( i = 1 ; n < hasta; n++) {
             i=n+1;
             x=n+i;
             
          System.out.println("la suma de las potencias es igual a  "+X+"^"+n+ " +  "+X+"^"+i+" es igual a " +X+"^"+x);
          
       }
    }
}