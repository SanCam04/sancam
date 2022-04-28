import java.util.Scanner;

/**
 * sumpote
 */
public class sumpote {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.prinln("ingrese el valor de la potencia");
        int num=sc.nextInt();   
        Scanner cd=new Scanner(System.in);   
        System.out.println("ingrese hasta que numero se va sumar las potencias");
        int hasta=cd.nextInt();
        int x=1;
           for (int i = 1; i < hasta; i++) {
              x=i+num;
          System.out.println("la suma de las potencias es igual a  X^"+num+ " +  X^"+i+ " es igual a " +x);
       }
    }
}