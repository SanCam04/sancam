import java.util.Scanner;

/**
 * algobabi
 */
public class algobabi {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        try{
               System.out.print("Ingrese el valor a sacar la raiz (ej. 2) ");  
        int x= sc.nextInt();
        //System.out.print("Ingrese la precision (ej.0.0001) ");  
        //float e= sc.nextFloat();
        double e=0.0001;
        double b=x;
        int conta=0;
        while (b-x/b>e){
        conta++;
        b=0.5*(x/b+b);
        }//Finaliza el ciclo while y entrega el resultado:
            System.out.println("La raiz cuadrada de "+x+" es "+b);
                System.out.println("Se realizaron "+conta+" iteraciones con una precision de "+e);
            }
        catch(Exception e){
                System.out.println("Algo ha salido mal, error: "+e);
                System.out.println("Sea cuidadoso con los datos que ingresa");
                 }
    }
}