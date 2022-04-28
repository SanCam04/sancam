import java.util.Scanner;


public class sumapares {

    public static void main(String[] args) {
        
       Scanner n=new Scanner(System.in);
       System.out.println("coloque un numero solamente par hasta el cual se quiere llegar con la suma");
          
        int hasta=n.nextInt();
        int pares;
        int x1;

            for (int i = 0; i < hasta; i=i+2) {
               pares=i+2;

               System.out.println(" los numeros pares son: "+pares); 
            }

        x1=(hasta/2)*((hasta/2)+1);
        System.out.println("la suma de los pares es de : "+x1);

    
    }
}