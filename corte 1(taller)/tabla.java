import java.util.Scanner;
/**
 * tabla
 */
public class tabla {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("digite el numero de la cual se quiere generar la tabla de multiplicar: ");
        
        int numero=scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(numero+"*"+i+"="+(numero * i));


        }

    }
}