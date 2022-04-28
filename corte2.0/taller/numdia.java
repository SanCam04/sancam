import java.util.Scanner;

/**
 * numdia
 */
public class numdia {

    public static void main(String[] args) {
        

        Scanner dia=new Scanner (System.in);

        int num=0;
        String n= " ";
        //creamos una variable de tipo string para guardar los datos de los dias
        System.out.println("ingrese el numero del dia del 1 al 7: ");
        num=dia.nextInt();
       //usamos la sentencia switch para crear los 7 casos de los dias
        switch (num) {
            case 1: n="dia lunes";
                
                break;
                
            case 2:n="dia martes";
                
            break;
            case 3:n="dia miercoles";
                
            break;
            case 4:n="dia jueves";
                
            break;
            case 5:n="dia viernes";
                
            break;
            case 6:n="dia sabado";
                
            break;
            case 7:n="dia domingo";
                
            break;
    
       
            default:n="numero de dia equivocado";
                break;
        }

        System.out.println(n);

    }
}