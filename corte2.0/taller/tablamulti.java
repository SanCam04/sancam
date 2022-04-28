import java.util.Scanner;

/**
 * tablamulti
 */
public class tablamulti {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese el numero para generar la tabla de multiplicar");
        int table=sc.nextInt();
        int hasta=11;
        int multi=1;
          for (int i = 1; i < hasta; i++) {
            multi=i*table;
              System.out.println(table+"X"+i+" = "+multi);
           }
        }
}