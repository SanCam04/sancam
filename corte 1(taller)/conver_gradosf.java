import java.util.Scanner;
public class conver_gradosf {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in); 
        System.out.print("conversion de una temperatura dada en grados Celsius a grados Fahrenheit : ");
        
        
        System.out.print("ingrese los grados Celsius : ");  
        int GradosC= sc.nextInt();
    
        
        int GradosF=((GradosC*9/5)+32);

                
        System.out.print("La conversion a grados Fahrenheit es de = "+GradosF+ " F ");
        

    }
}