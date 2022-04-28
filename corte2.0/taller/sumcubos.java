import java.util.Scanner;

/**
 * sumcuad
 */
public class sumcubos {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el valor n "); 
        int n= sc.nextInt();

        int potencia = 0;

        for ( int i = 1 ; i <= n; i++) {
           potencia += i*i*i; 
           System.out.println(potencia); 
            }
    System.out.println("La suma de los primeros "+n+" números es : "+potencia);        
  }
}  