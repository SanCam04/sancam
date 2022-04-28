import java.util.Scanner;



/**
 * MCD
 */
public class MCD {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int n1 , n2;
        boolean MCD = false;
        while(true) {
            System.out.println("ingrese el primer numero: ");
            n1=leer.nextInt();
            System.out.println("ingrese el segundo numero: ");
            n2=leer.nextInt();

            if (n1 > 0 && n2 > 0 && n1 != n2 ){

                if(n1>n2){
                    int aux = n1;
                    n1=n2;
                    n2=aux;

                }
                int i = n1;

                while(!MCD && i>=1){

                    if(n1 % i == 0 && n2 % i == 0){

                       System.out.println("el maximo comun divisor es: "+i);
                       MCD= true;        
                        }
                        else{
                            i--;
                        }

              }    
          {break;}
            
        }
    }                            
  }
}
  
