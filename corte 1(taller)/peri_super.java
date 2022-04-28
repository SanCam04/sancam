import java.util.Scanner;

public class peri_super {

    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in); 
        System.out.print("perimetro y superficie de un rectangulo : ");
        
        
        System.out.print("ingrese el tamaño de la base en cm : ");  
        int base= sc.nextInt();
    
        System.out.print("ingrese la altura en cm : "); 
        int altura= sc.nextInt();
        int area=base*altura;

        int perimetro=base+base+altura+altura;
                
        System.out.print("el area total del rectangulo es de = "+area+ " cm^2 ");
        System.out.print(" el perimetro total del rectangulo es de: "+perimetro+" cm ");


    }
}
