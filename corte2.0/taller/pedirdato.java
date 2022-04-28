import java.util.Scanner;
/**
 * pedirdato
 */
public class pedirdato {

    public static void main(String[] args) {
        boolean san = true;
        String h = "";
        while(san == true ){
            Scanner sc =new Scanner(System.in);
            int entrada = sc.nextInt();
            if (entrada != 0){
               h += entrada+" ";   
            }
            if (entrada == 0){
                san = false;
            } 
             
        }
        System.out.println(h);
    } 
}
