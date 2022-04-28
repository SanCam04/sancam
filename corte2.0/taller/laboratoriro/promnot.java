import java.util.Scanner;

/**
 * promnot
 */
public class promnot {

    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        
        
        int hasta;

        System.out.println("ingrese el total de estudiantes ");
        hasta=sc.nextInt();
        System.out.println("el total de estudiantes es de:  "+hasta);
      
        
        for (int i = 0; i < hasta; i++) {
            

            Scanner t=new Scanner(System.in);
            System.out.println("ingrese la nota teorica del estudiante sobre 5");

            int teori=t.nextInt();
            int promedioteo=(teori*60)/5;
            System.out.println("el promedio de la nota teorica es de: "+promedioteo);
            
            Scanner p=new Scanner(System.in);
            System.out.println("ingrese la nota practica del estudiante sobre 5");
            int practica=p.nextInt();
            int promediopra=(practica*40)/5;
            System.out.println("el promedio de la nota practica es de: "+promediopra);

            int tota=promedioteo+promediopra;
            System.out.println("el total del promedio es de: "+tota);

            
            
        }
        
        
    }
}