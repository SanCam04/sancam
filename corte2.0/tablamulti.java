import util.java.Scanner;

/**
 * tablamulti
 */
public class tablamulti {

    public static void main(String[] args) {
        
        System.out.println("Tabla con ciclo for");
        int table=6;
        int hasta=11;
        int multi=1;
          for (int i = 1; i < hasta; i++) {
            multi=i*table;
              System.out.println(table+"X"+i+" = "+multi);
           }
          whilec(table,hasta);
          dowhilec(table,hasta);
      }
          public static void whilec(int table,int hasta){
              System.out.println("Tabla con ciclo while");
          int conta=1;
          int multi;
              while(conta<hasta){
              multi=conta*table;
              System.out.println(table+"X"+conta+" = "+multi); 
              conta++;
              }
          }
          public static void dowhilec(int table,int hasta){
              System.out.println("Tabla con Do- while");
              int conta=1;
          int multi;
          do{
          multi=conta*table;
              System.out.println(table+"X"+conta+" = "+multi); 
              conta++;
          }while(conta<hasta);
        }
}