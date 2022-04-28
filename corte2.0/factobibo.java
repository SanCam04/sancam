import java.util.Scanner;

public class factobibo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular su factorial");
           int n = sc.nextInt();
           int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
        System.out.println(n+"! ="+fact);
        fibo();
    }
public static void fibo(){
Scanner scan = new Scanner(System.in);
System.out.println("Cuantos terminos quiere de la serie de Fibonacci? ");
  int z = scan.nextInt();
int a=1,b=1;
int c;
System.out.println("1");
System.out.println("1");
    for (int i = 0; i < z-2; i++) {
       c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }

    }
}