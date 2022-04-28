import java.util.Scanner;

/**
 * algoBabi
 */
public class algoBabi {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
    try{
        System.out.println("Ingresee el valor a sacar la raiz (ej. 2) ");
        int x= sc.nextInt();
        double e=0.0001;
        souble b=x;
        int conta=0;
        while (Math.abs (b-x/b)>e) {
            conta++;
            b=0.5*(x/b+b);
            }
            System.out.println("la raiz cuadrada de "+x+" es "+b);
            System.out.println("se realizaron "+conta+" iteraciones con una precision de "+e);
        }
    catch(Exception e){
        System.out.println("algo ha salido mal, error: "+e);
        System.out.println("sea cuidadoso con los datos que ingresa"); 
             }

    }
}