public class TablaMulti {

    public static void main(String[] args) {
        System.out.println("tabla con ciclo for");
    int table=6;
    int hasta=12;
    int multi=1;
       for(int i = 1; i < hasta ; i++){
           multi=i*table;
           System.out.println(table+"X"+i+"="+multi);
       }
    }
}