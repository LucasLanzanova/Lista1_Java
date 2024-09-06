package Lista;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Exercicio08 {
    
    public static void main(String[] args){
        
        double v1, v30;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Valor do relógio de água no dia 1: ");
        v1 = s.nextDouble();
        System.out.print("Valor do relógio de água no dia 30: ");
        v30 = s.nextDouble();
        
        double consumototal = v30 - v1;
        double media = consumototal/30;
        
        System.out.println("Consumo total no mês: " + consumototal + " Litros");
        System.out.println("Média de consumo no mês: " + media + " Litros");
        
        
    }
    
}
