import java.util.Scanner;

/**
 * facto
 */
public class facto {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese el factorial");
        int n = sc.nextInt();
        int fact=1;
               for (int i = 1; i <= n; i++  ){
                fact*=i;
               }
    
    
        System.out.println(n+"!="+fact);
    }
       public static void s() {
           System.out.println("cuantos terminos quiere colocar");
           int z= scan.nextInt();
           int a=1,b=1;
           int c;
           System.out.println("1");
           System.out.println("1");
           for (int i = 0; i < z-2; i++){
               c=a+b;
               System.out.println(s);
               a=b;
               b=c; 
           
       }

    }
}