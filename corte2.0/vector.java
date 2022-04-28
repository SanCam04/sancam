
import util.java.Scanner;
/**
 * vector
 */
public class vector {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int vector1[] = new int[3];
        int vector2[] = new int[3];
        System.out.println("Ingrese vector1");
        for (int i = 0; i < 3; i++) {
            System.out.println("vector1["+i+"]");
            vector1[i]=sc.nextInt();
        }
        System.out.println("Ingrese vector2");
        for (int i = 0; i < 3; i++) {
            System.out.println("vector2["+i+"]");
            vector2[i]=sc.nextInt();
        }
      int vector3[]=Suma(vector1,vector2);
       System.out.println("La suma vector1 + vector2 es:");
        for (int i = 0; i < 3; i++) {
            System.out.println(vector3[i]);  
        }
        
      int vector4=Suma_vector(vector1,vector2);
       System.out.println("EL PRODUCTO ESCALA vector1 + vector2 = " + vector4);
     }
    public static int Suma(int a[],int b[])[] {
        int sum[]=new int[3];
        for (int i = 0; i < 3; i++) {
            sum[i]=a[i]+b[i];
        }
        return sum;
    }
    
    public static int Suma_vector(int a[],int b[]) {
        int g=0;
        for (int i = 0; i < 3; i++) {
            g+=a[i]*b[i];
        }
        return g;
    }
}