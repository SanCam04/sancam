import java.util.Scanner;

public class peri_surf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("superficie y perimetro de un cuadrado : ");
        
        
        System.out.print("ingrese el tamaño total de cada lado del cuadrado en cm : ");  
        int a= sc.nextInt();
        double elevado= Math.pow(a,2);
        System.out.print("ingrese los lados totales del cuadrado : "); 
        int b= sc.nextInt();
        int c=a*b;
                
        System.out.print("el area total del cuadrado es de = "+elevado+ " m^2 ");
        System.out.print(" el perimetro total del cuadrado es de: "+c+" m ");


    }
}