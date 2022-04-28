import java.util.Scanner;
/**
 * prome_not
 */
public class prome_not {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int conta=0;
        float suma=0;
        float x=0;
        while (x!=-1){
            suma+=x;
        System.out.println("ingrese el valor o -1 para finalizar");
x= sc.nextInt();
conta++;

    }
float promedio=suma/(conta-1);
  System.out.println("promedio= " +promedio);
    }
}