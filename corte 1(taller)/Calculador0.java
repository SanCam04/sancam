package Calculador0;
import java.util.Scanner;


/**
 *
 * @author 204
 */
public class Calculador0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x,y;
        try{
        System.out.println("Digite X");
        x = console.nextInt();
        System.out.println("Digite Y");
        y = console.nextInt();

System.out.println("x= "+x+", y="+y);
      sumar(x,y);
    multiplicar(x,y);
    dividir(x,y);
    potencia(x,y);
    int suma2=fsumar(x,y);
        System.out.println("La suma de "+x+" con "+y+" es "+suma2);
 //Cerrar el Scanner de lectura
 console.close();
    }
catch (Exception erroresprod) {
    System.out.println("Se ha producido un eror al entrar los datos: " + erroresprod);
    System.out.println("Vuelva a ejecutar el programa y sea cuidadoso con los datos que ingrese");
}
    }
   public static void sumar(int x, int y) {
   int suma=x+y;
       System.out.println(x+" + "+y+" = "+suma);
       
   }
  public static void multiplicar(int x,int y){
    //int x=5,y=10,producto;
    int producto=x*y;
        System.out.println("La operacion "+x+" * "+y+" = "+producto);
    }  
  public static void dividir(double x,double y){
    //int x=5,y=10,producto;
    double cociente=x/y;
        System.out.println("La operacion "+x+" / "+y+" = "+cociente);
    } 
  public static void potencia(int x,int y){
    //int x=5,y=10,producto;
    double potencia=Math.pow(x,y);
        System.out.println("La operacion "+x+"^"+y+" = "+potencia);
    } 
  
   public static int fsumar(int x, int y) {
   int suma=x+y;
       return suma;
       
   }
    
}