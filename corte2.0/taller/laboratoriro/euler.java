import java.util.Scanner;

/**
 * euler
 */
public class euler {

       private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  

           System.out.print("Hasta que valor de euler desea hacer el calculo : ");
           int n=sc.nextInt();

           System.out.print("e = " + e (n));
       }
       public static double e(int n) {
           double s =0 ,t;
           for (int i = 0; i < n; i++) {
               t = 1/factorial(i);
               s += t;
           }
           return s;
       }
       public static double factorial(int n) {
           double aux=1;
           for (int i = 2; i <= n; i++) {
               aux *= i;   
           }
           return aux;
       }
    }
