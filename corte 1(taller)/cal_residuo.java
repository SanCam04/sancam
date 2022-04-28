
public class cal_residuo {

    public static void main(String[] args) {

        
        int resultado = calcular(13, 5);
        System.out.println(resultado);  
        

    }
    
    public static int calcular(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        
        int residuo = dividendo - (cociente * divisor);
        
        return residuo;
    }
}