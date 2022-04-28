import java.util.Scanner;
/**
 * funfacperfibo
 */
public class funfacperfibo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
System.out.println("Ingrese el numero para calcular su factorial");
  int n = sc.nextInt();
int fact=factorial(n);
  System.out.println(n+"! ="+fact);
//Calcular la permutacion()
System.out.println("Ingrese r para permutacion con n");
  int r = sc.nextInt();
int pnr=permutacion(n,r);
  System.out.println(n+" P "+r+" = "+pnr);
//Calculo de la combinacion:
int combinac=combinacion(n,r);
  System.out.println(n+" C "+r+" = "+combinac);
//int permutacion(fact);
fibo();
    }
public static int combinacion(int n,int r){
int combi=1;
combi=permutacion(n,r)/factorial(r);
return combi;
}

public static int permutacion(int n,int r){
int permut=1;
permut=factorial(n)/factorial(n-r);
return permut;
}
public static int factorial(int n){
int fact=1;
        for (int i = 1; i <= n; i++) {
            fact*=i;
        }
return fact;
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