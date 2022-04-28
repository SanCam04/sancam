import java.util.Scanner;
/**
 * factorial
 */
public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in);
 System.out.println("ingrese el numero de su factorial"+sc);
       int n = sc.nextInt();
    int fact=1;
        for (int i =0; i <= n; i++){
            fact*=1;
        }
        System.out.println(n+"! ="+fact);
    }
}